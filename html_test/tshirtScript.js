$(document).ready(function(){	
	var $ColorValues = ["Black", "Blue", "Green", "Red", "White", "Yellow"];
	$("#Color").jqxComboBox({ source: $ColorValues, width: '200px', height: '25px'});
	
	var $SizeValues = [32, 34, 36, 38, 40, 42, 44, 46];
	$("#Size").jqxComboBox({ source: $SizeValues, width: '200px', height: '25px'});
	
	var $PrintColorValues = ["Red", "Green", "Blue"];
	$("#PrintColor").jqxComboBox({ source: $PrintColorValues, width: '200px', height: '25px'});
	
	var $PrintShapeValues = ["Round", "Square", "Triangular"];
	$("#PrintShape").jqxComboBox({ source: $PrintShapeValues, width: '200px', height: '25px'});
	
	var $PrintPlacementValues = ["Front", "Back", "LeftSleeve", "RightSleeve"];
	$("#PrintPlacement").jqxListBox({ source: $PrintPlacementValues, width: '200px', height: '150px', multiple: true});		
	
	function checkConstraints() {		
		var valid = "";
		
		if($("#Color").jqxComboBox('getSelectedItem') === null) valid += "Color must be filled! \n";
		if($("#Size").jqxComboBox('getSelectedItem') === null) valid += "Size must be filled! \n";
		if($("#PrintColor").jqxComboBox('getSelectedItem') === null) valid += "PrintColor must be filled! \n";
		
		var itemsPrintPlacement = $("#PrintPlacement").jqxListBox('getSelectedItems'); 
		if(itemsPrintPlacement.length < 1) valid += "At least 1 value of PrintPlacement must be selected! \n"; 
		if(itemsPrintPlacement.length > 2) valid += "No more than 2 values of PrintPlacement must be selected! \n"; 
		
		if(valid === "") {			
			if(!((($("#Color").jqxComboBox('getSelectedItem').value != "Red") || (($("#Color").jqxComboBox('getSelectedItem').value === "Red") 
				&& ($("#Size").jqxComboBox('getSelectedItem').value > 3))))) 
				valid += "Invalid constraint: " + "((Color != String.Red) || ((Color === String.Red) && (ShirtSize > 3))) \n";
			if(!((($("#Size").jqxComboBox('getSelectedItem').value <= 40) || (($("#Size").jqxComboBox('getSelectedItem').value > 40) 
				&& ($("#VNeck").prop('checked') === false))))) 
				valid += "Invalid constraint: " + "((Size <= 40) || ((Size > 40) && (VNeck === false))) \n";
			if(!($("#Color").jqxComboBox('getSelectedItem').value != $("#PrintColor").jqxComboBox('getSelectedItem').value)) 
				valid += "Invalid constraint: " + "(Colour != PrintColor) \n";
		}
			
		return valid;
	}
	
	function getText() {
		var text = "";
		
		text += "Brand: " + $("#Brand").val() + " \r\n";
		text += "Color: " + $("#Color").jqxComboBox('getSelectedItem').value + " \r\n";
		text += "Size: " + $("#Size").jqxComboBox('getSelectedItem').value + " \r\n";
		text += "VNeck: " + $("#VNeck").prop('checked') + " \r\n"; 
		text += "Print: " + "\r\n";
		text += "PrintColor: " + $("#PrintColor").jqxComboBox('getSelectedItem').value + " \r\n";
		text += "PrintShape: " + $("#PrintShape").jqxComboBox('getSelectedItem').value + " \r\n";
		
		var itemsPrintPlacement = $("#PrintPlacement").jqxListBox('getSelectedItems');
		text += "PrintPlacement: ";		
		jQuery.each(itemsPrintPlacement, function(index, value){
			text += this.value + ", "
		});
		text += " \r\n";
		
		return text;
	}	

	$('#submitButton').click(function(){
		var validationMsg = checkConstraints();
		
		if(validationMsg.length === 0)
			save();
		else
			alert(validationMsg + "\n Please correct the values!");
	});
	
	function save() {
		var textToWrite = getText();
		var textFileAsBlob = new Blob([textToWrite], {type:'text/plain'});
		var fileNameToSaveAs = "config.txt";

		var downloadLink = document.createElement("a");
		downloadLink.download = fileNameToSaveAs;
		downloadLink.innerHTML = "Download File";
		if (window.webkitURL != null) {
			downloadLink.href = window.webkitURL.createObjectURL(textFileAsBlob);
		}
		else
		{
			downloadLink.href = window.URL.createObjectURL(textFileAsBlob);
			downloadLink.onclick = destroyClickedElement;
			downloadLink.style.display = "none";
			document.body.appendChild(downloadLink);
		}

		downloadLink.click();
	}
	
	function destroyClickedElement(event)
	{
		document.body.removeChild(event.target);
	}	
});