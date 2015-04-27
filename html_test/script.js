$(document).ready(function(){
	var $ManufacturerValues = ["Dell", "HP", "Lenovo", "Asus", "Acer"];
	var $GraphicsManufacturerValues = ["Nvidia", "AMD"];
	var $GraphicsModelValues = ["Radeon 7000", "Radeon 8000", "Radeon R5", "Radeon R7", "GeForce 550", "GeForce 650", "GeForce 750"];
	
	$("#ManufacturerCB").jqxComboBox({ source: $ManufacturerValues, width: '200px', height: '25px',});
	$("#GraphicsManufacturerCB").jqxComboBox({ source: $GraphicsManufacturerValues, width: '200px', height: '25px',});
	$("#GraphicsModelCB").jqxComboBox({ source: $GraphicsModelValues, width: '200px', height: '25px',});
	
	$('#GraphicsManufacturerCB').bind('select', function (event) {
		var args = event.args;
		var item = $('#GraphicsManufacturerCB').jqxComboBox('getItem', args.index);
		
		if(item.label === 'Nvidia') {
			var items = $('#GraphicsModelCB').jqxComboBox('getItems'); 
			jQuery.each(items, function(index, value){
				if(this.label === "Radeon 7000" || this.label === "Radeon 8000" || this.label === "Radeon R5" || this.label === "Radeon R7"){
					$("#GraphicsModelCB").jqxComboBox('disableItem', this);
				} else {
					$("#GraphicsModelCB").jqxComboBox('enableItem', this);
				}
			});			
			
		} else if(item.label === 'AMD') {				/* I know I'm repeating code here, but this is going to be easier to generate. We can think of sth better later. */
			var items = $('#GraphicsModelCB').jqxComboBox('getItems'); 
			jQuery.each(items, function(index, value){
				if (this.label === "GeForce 550" || this.label === "GeForce 650" || this.label === "GeForce 750") {
					$("#GraphicsModelCB").jqxComboBox('disableItem', this);
				} else {
					$("#GraphicsModelCB").jqxComboBox('enableItem', this);
				}
			});
		}		
    });	
});