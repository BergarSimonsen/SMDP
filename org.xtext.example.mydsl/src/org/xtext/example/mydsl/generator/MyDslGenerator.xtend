/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator

import Configurator.ConfiguratorModel
import Configurator.Model
import Configurator.Parameter
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import Configurator.Literal

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MyDslGenerator implements IGenerator {
	
	def compileToHtml(ConfiguratorModel it) {
		'''
		<html>
			<head>
				<link rel="stylesheet" href="jqwidgets-ver3.8.0/jqwidgets/styles/jqx.base.css" type="text/css"/>
				<script type="text/javascript" src="jqwidgets-ver3.8.0/scripts/jquery-1.11.1.min.js"></script>
				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxcore.js"></script>
				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxbuttons.js"></script>
				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxscrollbar.js"></script>
				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxlistbox.js"></script>
				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxcombobox.js"></script>
				«getJavaScript(it)»
  			</head>
  			<body>
  				<h2> «name.toFirstUpper» </h2>
   				<hr/>
   				
  				«FOR p : parameters»
  					«getParametersHtml(p, 0)» 
  				«ENDFOR»	
  				
  				<br/><br/>
				<button type="button" id='submitButton'>Submit</button>
  			</body>
		</html>
		'''
	}
	
	def getJavaScript(ConfiguratorModel it) {
		'''
		<script type='text/javascript'>
			$(document).ready(function(){
				
				«FOR p : parameters»
  					«getParametersJavaScript(p)» 
  				«ENDFOR»
				
				function checkConstraints() { 
					var valid = "";
						«getConstraints(it)»
					return valid;
				};
				
				function getText() {
					var text = "";
					«FOR p : parameters»
  						«getParametersText(p)» 
  					«ENDFOR»
					return text;
				};				
				
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
	
				function destroyClickedElement(event){
					document.body.removeChild(event.target);
				}	
			});
		</script>
		'''
	}
	
	def getParametersHtml(Parameter it, int level) {
		var header = 3 + level
		if (header > 6) header = 6
		'''
		<h«header»>«name.toFirstUpper»:</h«header»>
		«IF minChosenValues > 0»
			«IF type.eClass.name == "Enum"»
				«IF maxChosenValues == 1»
					<div id='«name.toFirstUpper»' class='combobox'>
					</div>
				«ELSE»
					<div id='«name.toFirstUpper»' class='listbox'>
					</div>
				«ENDIF»
			«ELSE»
				<form>
				«IF type.eClass.name == "Integer" || type.eClass.name == "Double"»
					<input type='number' name='«name.toFirstUpper»' id='«name.toFirstUpper»'/>
				«ELSEIF type.eClass.name == "Stringg"»
					<input type='text' name='«name.toFirstUpper»' id='«name.toFirstUpper»'/>
				«ELSEIF type.eClass.name == "Boolean"»
					<input type='checkbox' name='«name.toFirstUpper»' id='«name.toFirstUpper»'/>
				«ENDIF»
				</form>
			«ENDIF»
		«ENDIF»
		
		«IF !children.empty»
			«FOR c : children»
  				«getParametersHtml(c, level + 1)» 
  			«ENDFOR»
		«ENDIF»
		'''
	}
	
	def getParametersJavaScript(Parameter it) {
			'''
			«IF type instanceof Configurator.Enum»
				«val enumType = type as Configurator.Enum»
				var $«name.toFirstUpper»Values = [
				«FOR eval : enumType.values»	
					«IF eval == enumType.values.get(enumType.values.size - 1)»
						«getEnumValue(eval, true)»
					«ELSE»
						«getEnumValue(eval, false)»
					«ENDIF»							
				«ENDFOR»];
				«IF maxChosenValues == 1»					
					$("#«name.toFirstUpper»").jqxComboBox({ source: $«name.toFirstUpper»Values, width: '200px', height: '25px',});
				«ELSE»
					$("#«name.toFirstUpper»").jqxListBox({ source: $«name.toFirstUpper»Values, width: '200px', height: '150px', multiple: true});
				«ENDIF»
			«ENDIF»
			
			«IF !children.empty»
				«FOR c : children»
  					«getParametersJavaScript(c)» 
  				«ENDFOR»
			«ENDIF»
		'''
	}
	
	def getEnumValue(Literal it, boolean islast){
		'''
		«IF it instanceof Configurator.Integer»
			«val intVal = it as Configurator.Integer»
			«intVal.value» «IF !islast»,«ENDIF»
		«ELSEIF it instanceof Configurator.Double»
			«val doubleVal = it as Configurator.Double»
			«doubleVal.value» «IF !islast»,«ENDIF»
		«ELSEIF it instanceof Configurator.Boolean»
			«val boolVal = it as Configurator.Boolean»
			«boolVal.value» «IF !islast»,«ENDIF»
		«ELSEIF it instanceof Configurator.Stringg»
			«val stringVal = it as Configurator.Stringg»
			"«stringVal.value»" «IF !islast»,«ENDIF»
		«ENDIF»
		'''
	}
	
	def getParametersText(Parameter it) {
		'''
		«IF maxChosenValues > 0»
			«IF type.eClass.name == "Enum"»
				«IF maxChosenValues == 1»
					text += "«name.toFirstUpper»: " + $("#«name.toFirstUpper»").jqxComboBox('getSelectedItem').value + " \r\n";
				«ELSE»
					var items«name.toFirstUpper» = $("#«name.toFirstUpper»").jqxListBox('getSelectedItems');
					text += "«name.toFirstUpper»: ";		
					jQuery.each(items«name.toFirstUpper», function(index, value){
						text += this.value + ", "
					});
					text += " \r\n";
				«ENDIF»			
			«ELSE»
				text += "«name.toFirstUpper»: " + $("#«name.toFirstUpper»").val() + " \r\n";
			«ENDIF»
		«ELSE»
			text += "«name.toFirstUpper»: " + "\r\n";
		«ENDIF»
		
		«IF !children.empty»
			«FOR c : children»
  				«getParametersText(c)» 
  			«ENDFOR»
		«ENDIF»
		'''
	}
	
	def getConstraints(ConfiguratorModel it) {
		'''
		«FOR c : constraints»
			/* constraint */
  		«ENDFOR»
		'''
	}
	
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var m = resource.contents.head as Model
		for(ConfiguratorModel root : m.configuratorModels) {
			fsa.generateFile(root.name + ".html", compileToHtml(root))
		}
	}
	
//	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
////		fsa.generateFile('greetings.txt', 'People to greet: ' + 
////			resource.allContents
////				.filter(typeof(Greeting))
////				.map[name]
////				.join(', '))
//	}
}
