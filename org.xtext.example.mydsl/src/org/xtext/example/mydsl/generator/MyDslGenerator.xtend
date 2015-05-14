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

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MyDslGenerator implements IGenerator {
	
	def static compileToHtml(ConfiguratorModel it) {
		'''
		<html>
«««			<head>
«««				<link rel="stylesheet" href="jqwidgets-ver3.8.0/jqwidgets/styles/jqx.base.css" type="text/css"/>
«««				<script type="text/javascript" src="jqwidgets-ver3.8.0/scripts/jquery-1.11.1.min.js"></script>
«««				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxcore.js"></script>
«««				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxbuttons.js"></script>
«««				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxscrollbar.js"></script>
«««				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxlistbox.js"></script>
«««				<script type="text/javascript" src="jqwidgets-ver3.8.0/jqwidgets/jqxcombobox.js"></script>
«««				<script type='text/javascript'>
«««					$(document).ready(function(){
«««						«FOR e : enums»
«««							var $«e.name.toFirstUpper»Values = [
«««							«FOR eval : e.values»
«««								«IF eval == e.values.get(e.values.size - 1)»
«««									"«eval»"
«««								«ELSE»
«««									"«eval»",
«««								«ENDIF»
«««							«ENDFOR»
«««							];
«««						«ENDFOR»
«««						
«««						«FOR param : parameters»
«««						 	«IF param.enum != null»
«««								$("#«param.name.toFirstUpper»CB").jqxComboBox({ source: $«param.enum.name.toFirstUpper»Values, width: '200px', height: '25px',});
«««							«ENDIF»
«««						«ENDFOR»
«««						
«««						function checkConstraints() { 
«««							«FOR c : constraints»
«««							«ENDFOR»
«««						};
«««						
«««						«FOR param : parameters»
«««						 	«IF param.enum != null»
«««								$('#«param.name.toFirstUpper»CB').bind('select', function (event) {		
«««									checkConstraints();		
«««								});
«««							«ENDIF»
«««						«ENDFOR»
«««						
«««					});
«««				</script>
«««  			</head>
«««  			<body>
«««  				<h2> «it.name.toFirstUpper» </h2>
«««   				<hr/>
«««   				
«««  				«FOR param : parameters»  				
«««  					<h3>«param.name.toFirstUpper»:</h3>
«««  					«IF param.enum != null»
«««  						<div id='«param.name.toFirstUpper»CB' class='combobox'>
«««						</div>
«««					«ELSEIF param.enum == null && param.children.empty»						
«««						<form>
«««						«FOR n : 1..param.maxChosenValues»
«««							<input type="text"/>
«««						«ENDFOR»
«««						</form>						
«««  					«ENDIF»
«««  				«ENDFOR»	
«««  			</body>
		</html>
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
