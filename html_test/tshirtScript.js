$(document).ready(function(){	
	var $ColourValues = ["RED", "BLACK", "BLUE"];
	$("#Colour").jqxComboBox({ source: $ColourValues, width: '200px', height: '25px',});
	
	var $SizeValues = [1, 2, 3, 4, 5];
	$("#Size").jqxComboBox({ source: $SizeValues, width: '200px', height: '25px',});
	
	var $PrintColourValues = ["RED", "BLACK", "BLUE"];
	$("#PrintColour").jqxComboBox({ source: $PrintColourValues, width: '200px', height: '25px',});
	
	var $PrintShapeValues = ["ROUND", "SQUARE", "TRIANGULAR"];
	$("#PrintShape").jqxComboBox({ source: $PrintShapeValues, width: '200px', height: '25px',});	
	
	function checkConstraints() {		
		var valid = "";
		
		if($("#Title").val() === "") valid += "Title must be filled! \n";
		if($("#Colour").jqxComboBox('getSelectedItem') === null) valid += "Colour must be filled! \n";
		if($("#Size").jqxComboBox('getSelectedItem') === null) valid += "Size must be filled! \n";
		if($("#PrintColour").jqxComboBox('getSelectedItem') === null) valid += "PrintColour must be filled! \n";
		
		if(valid === "") {
			if(!($("#Colour").jqxComboBox('getSelectedItem').value != $("#PrintColour").jqxComboBox('getSelectedItem').value)) 
				valid += "Invalid constraint: " + "(Colour != PrintColor) \n";
			if(!((($("#Colour").jqxComboBox('getSelectedItem').value != "RED") || (($("#Colour").jqxComboBox('getSelectedItem').value === "RED") 
				&& ($("#Size").jqxComboBox('getSelectedItem').value > 3))))) 
				valid += "Invalid constraint: " + "((Color != String.RED) || ((Color == String.RED) && (ShirtSize > 3))) \n";
		}
			
		return valid;
	}
	
	function save() {
		alert("Saving!");
	}

	$('#submitButton').click(function(){
		var validationMsg = checkConstraints();
		
		if(validationMsg.length === 0){
			save();
			
		}
		else {
			alert(validationMsg + "\n Please correct the values!");
		}		
	});
});