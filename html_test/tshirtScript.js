$(document).ready(function(){	
	var $ColourValues = [
	"Red", 
	"Black", 
	"Blue"
	];
	$("#Colour").jqxComboBox({ source: $ColourValues, width: '200px', height: '25px',});
	
	var $SizeValues = [1, 2, 3, 4, 5];
	$("#Size").jqxComboBox({ source: $SizeValues, width: '200px', height: '25px',});
	
	var $PrintColourValues = ["Red", "Black", "Blue"];
	$("#PrintColour").jqxComboBox({ source: $PrintColourValues, width: '200px', height: '25px',});
	
	var $PrintShapeValues = ["Round", "Square", "Triangular"];
	$("#PrintShape").jqxComboBox({ source: $PrintShapeValues, width: '200px', height: '25px',});
	
	var $PrintPlacementValues = ["Front", "Back", "LeftSleeve", "RightSleeve"];
	$("#PrintPlacement").jqxListBox({ source: $PrintPlacementValues, width: '200px', height: '150px', multiple: true});		
	
	function checkConstraints() {		
		var valid = "";
		
		if($("#Title").val() === "") valid += "Title must be filled! \n";
		if($("#Colour").jqxComboBox('getSelectedItem') === null) valid += "Colour must be filled! \n";
		if($("#Size").jqxComboBox('getSelectedItem') === null) valid += "Size must be filled! \n";
		if($("#PrintColour").jqxComboBox('getSelectedItem') === null) valid += "PrintColour must be filled! \n";
		//check lisBoxes!
		
		if(valid === "") {
			if(!($("#Colour").jqxComboBox('getSelectedItem').value != $("#PrintColour").jqxComboBox('getSelectedItem').value)) 
				valid += "Invalid constraint: " + "(Colour != PrintColor) \n";
			if(!((($("#Colour").jqxComboBox('getSelectedItem').value != "Red") || (($("#Colour").jqxComboBox('getSelectedItem').value === "Red") 
				&& ($("#Size").jqxComboBox('getSelectedItem').value > 3))))) 
				valid += "Invalid constraint: " + "((Color != String.RED) || ((Color == String.RED) && (ShirtSize > 3))) \n";
		}
			
		return valid;
	}
	
	function getText() {
		var text = "";
		
		text += "Title: " + $("#Title").val() + " \r\n";
		text += "Colour: " + $("#Colour").jqxComboBox('getSelectedItem').value + " \r\n";
		text += "Size: " + $("#Size").jqxComboBox('getSelectedItem').value + " \r\n";
		text += "Print: " + "\r\n";
		text += "PrintColour: " + $("#PrintColour").jqxComboBox('getSelectedItem').value + " \r\n";
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
			// Chrome allows the link to be clicked
			// without actually adding it to the DOM.
			downloadLink.href = window.webkitURL.createObjectURL(textFileAsBlob);
		}
		else
		{
			// Firefox requires the link to be added to the DOM
			// before it can be clicked.
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