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
import Configurator.BinaryConstraint

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MyDslGenerator implements IGenerator {
	
	// Java generator
	// -------------------------------------------------------------------------------------------------------------------------------
	def compileToJava(ConfiguratorModel it) {
		'''
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Container;
	import java.awt.Dimension;
	import java.awt.FlowLayout;
	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	
	import javax.swing.BorderFactory;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	
	public class « name.toFirstUpper » extends JFrame { 
		private static final long serialVersionUID = 1L;
		private JButton submitButton;
		private JLabel TitleLabel;
		« FOR p : parameters »
			« generateJavaLabel(p) »
		« ENDFOR »
		«FOR p : parameters»
			«generateJavaValueClass(p)»
		«ENDFOR»
		
		private void initUI() {
			JPanel panel = new JPanel();
			setPreferredSize(new Dimension(800, 600));
		
			Container contentPane = getContentPane();
			contentPane.setLayout(new BorderLayout());
		
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new FlowLayout());

			contentPane.add(mainPanel, BorderLayout.CENTER);
	
			TitleLabel = new JLabel(«name.toFirstUpper»);
			
			«FOR p : parameters»
				«p.name»Label = new JLabel("«p.name»");
				«FOR c : p.children»
					«c.name»Label = new JLabel("«c.name»");
				«ENDFOR»
			«ENDFOR»
			
			«FOR p : parameters»
				«initJavaValueClass(p)»
			«ENDFOR»
			
			submitButton = new JButton("Submit");
			submitButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//String c = checkConstraints();
					//if(c != null && c.length() == 0) {
						//boolean b = save();
						//JOptionPane.showMessageDialog(null, "Configuration file saved successfully!");
					//} else 
						//JOptionPane.showMessageDialog(null, c);
				}
			});
			getContentPane().add(BorderLayout.NORTH, TitleLabel);
			panel.setLayout(new GridBagLayout());
			panel.setBackground(Color.GREEN);
			getContentPane().add(panel);
			GridBagConstraints left = new GridBagConstraints();
			left.anchor = GridBagConstraints.EAST;
			GridBagConstraints right = new GridBagConstraints();
			right.weightx = 2.0;
			right.fill = GridBagConstraints.HORIZONTAL;
			right.gridwidth = GridBagConstraints.REMAINDER;
			
			«FOR p : parameters»
				panel.add(«p.name»Label, left);
				«IF p.type.eClass.name == "Enum"»
					«val et = p.type as Configurator.Enum»
					«IF p.maxChosenValues == 1»
						panel.add(«getEnumValueJavaType(et.values.get(0))»> «p.name.toFirstUpper»ComboBox, right);
					«ELSE»
						panel.add(«p.name.toFirstUpper»List, right);
					«ENDIF»
				«ELSE»
					panel.add(«p.name.toFirstUpper»TextField, right);
				«ENDIF»
			«ENDFOR»
			panel.add(submitButton, left);
			
			panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
			
			pack();
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			show();
		}
		
		public static void main(String[] args) {
			Main m = new Main();
			m.initUI();
		}
	}
		'''
		// « »
		
//		TitleLabel = new JLabel("ShirtConfigurator");
//		NameLabel = new JLabel("Name");
//		ColorLabel = new JLabel("Color");
//		SizeLabel = new JLabel("Size");
//		PrintLabel = new JLabel("Print");
//		PrintColorLabel = new JLabel("PrintColor");
//		PrintShapeLabel = new JLabel("PrintShape");
//		PrintPlacementLabel = new JLabel("PrintPlacement");
		
//		private void initUI() {
//		JPanel panel = new JPanel();
//
//		setPreferredSize(new Dimension(800, 600));
//		Container contentPane = getContentPane();
//		contentPane.setLayout(new BorderLayout());
//		
//		JPanel mainPanel = new JPanel();
//		mainPanel.setLayout(new FlowLayout());
//
//		contentPane.add(mainPanel, BorderLayout.CENTER);		
		
		

	}
	
	def generateJavaLabel(Parameter it) {
		'''
		private JLabel « name »Label;
		« FOR c : children »
		private JLabel « c.name »Label;
		« ENDFOR »
		'''
	}
	
	def initJavaValueClass(Parameter it) {
		'''
		«IF minChosenValues > 0»
			«IF type.eClass.name == "Enum"»
				«val et = type as Configurator.Enum»
				«IF maxChosenValues == 1»
					«getEnumValueJavaType(et.values.get(0))»[ ] «name»ComboBoxValues = {
					«FOR eval : et.values»
						«getEnumValue(eval, (eval == et.values.get(et.values.size - 1)))»
					«ENDFOR»
					};
					«name»ComboBox = new JComboBox<«getEnumValueJavaType(et.values.get(0))»>(«name»ComboBoxValues);
				«ELSE»
					«getEnumValueJavaType(et.values.get(0))»[ ] «name»ListValues = {
					«FOR eval : et.values»
						«getEnumValue(eval, (eval == et.values.get(et.values.size - 1)))»
					«ENDFOR»
					};
					«name»List = new JList<«getEnumValueJavaType(et.values.get(0))»>(«name»ListValues);
				«ENDIF»
			«ELSE»
				«IF type.eClass.name == "Integer" || type.eClass.name == "Double"»
					private JTextField «name.toFirstUpper»TextField;
				«ELSEIF type.eClass.name == "Stringg"»
					private JTextField «name.toFirstUpper»TextField;
				«ELSEIF type.eClass.name == "Boolean"»
					private JTextField «name.toFirstUpper»TextField;
				«ENDIF»
			«ENDIF»
		«ENDIF»
		
		«IF !children.empty»
			«FOR c : children»
  				«initJavaValueClass(c)» 
  			«ENDFOR»
		«ENDIF»
		'''
	}
	
	def generateJavaValueClass(Parameter it) {
		'''
		«IF minChosenValues > 0»
			«IF type.eClass.name == "Enum"»
				«val et = type as Configurator.Enum»
				«IF maxChosenValues == 1»
					private JComboBox<«getEnumValueJavaType(et.values.get(0))»> «name.toFirstUpper»ComboBox;
				«ELSE»
					private JList<«getEnumValueJavaType(et.values.get(0))»> «name.toFirstUpper»List;
				«ENDIF»
			«ELSE»
				«IF type.eClass.name == "Integer" || type.eClass.name == "Double"»
					private JTextField «name.toFirstUpper»TextField;
				«ELSEIF type.eClass.name == "Stringg"»
					private JTextField «name.toFirstUpper»TextField;
				«ELSEIF type.eClass.name == "Boolean"»
					private JTextField «name.toFirstUpper»TextField;
				«ENDIF»
			«ENDIF»
		«ENDIF»
		
		«IF !children.empty»
			«FOR c : children»
  				«generateJavaValueClass(c)» 
  			«ENDFOR»
		«ENDIF»
		'''
	}
	
	def getEnumValueJavaType(Literal it){
		'''
		«IF it instanceof Configurator.Integer»
			Integer
		«ELSEIF it instanceof Configurator.Double»
			Double
		«ELSEIF it instanceof Configurator.Boolean»
			boolean
		«ELSEIF it instanceof Configurator.Stringg»
			String
		«ENDIF»
		'''
	}
	
	
	// HTML generator
	// -------------------------------------------------------------------------------------------------------------------------------
	
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
					
						«FOR p : parameters»
							«getMandatoryFields(p)»
						«ENDFOR»
						
						if(valid === "") {
							«FOR p : parameters»
								«getConstraints(it)»
							«ENDFOR»
							
						}
						
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
	
	def getMandatoryFields(Parameter it) {
		'''
		«IF minChosenValues > 0»
			«IF type.eClass.name == "Enum"»
				«IF maxChosenValues == 1»
					if($("#«name.toFirstUpper»").jqxComboBox('getSelectedItem') === null) valid += "«name.toFirstUpper» must be selected! \n";
				«ELSEIF maxChosenValues > 1»
					var items«name.toFirstUpper» = $("#«name.toFirstUpper»").jqxListBox('getSelectedItems');
					if(items«name.toFirstUpper».length == 0) valid += "«name.toFirstUpper» must be selected! \n";
				«ENDIF»
			«ELSE»
				if($("#«name.toFirstUpper»").val() === "") valid += "«name.toFirstUpper» must be filled! \n";
			«ENDIF»
		«ENDIF»
«««			Children

		«IF !children.empty»
			«FOR c : children»
  				«getMandatoryFields(c)» 
  			«ENDFOR»
		«ENDIF»
		'''
	}
	
	def getConstraints(ConfiguratorModel it) {
		'''		
		«FOR c : constraints»
			«IF c instanceof BinaryConstraint»
				«val binCon = c as BinaryConstraint»
				if!()
			«ENDIF»
  		«ENDFOR»
		'''
	}
	
	
	
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var m = resource.contents.head as Model
		for(ConfiguratorModel root : m.configuratorModels) {
			fsa.generateFile(root.name + ".html", compileToHtml(root))
			fsa.generateFile(root.name + ".java", compileToJava(root))
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
