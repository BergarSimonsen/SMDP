package generator

import Configurator.ConfiguratorModel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class DslGenerator implements IGenerator {
	def static compileToAndroid(ConfiguratorModel it) {
		
	}	
	
	def static compileToHtml(ConfiguratorModel it) {
		
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
	}
}

//class ExternalDSLGenerator implements IGenerator {

//	def static compileToJava(FiniteStateMachine it) {
//		var int i = -1
//		''' 
//			package fsm;
//			import java.util.Scanner;
//			
//			class FSM«it.name.toFirstUpper» {
//			
//				«FOR state : it.states»
//					static final int «state.name.toUpperCase» = «i = i + 1»;
//				«ENDFOR»
//				static int current;
//				
//				static final String[] stateNames = { 
//					«FOR state : states»"«state.name»",«ENDFOR»
//				};
//					
//				static final String[] availableInputs = {
//					«FOR state : states»
//						"«FOR t : state.leavingTransitions»<«t.input»>«ENDFOR»",
//					«ENDFOR»
//				};
//					
//				public static void main (String[] args) {
//			
//				@SuppressWarnings(value = { "resource" })
//				Scanner scanner = new Scanner(System.in);
//				current = «initial.name.toUpperCase»;
//				
//				while (true) {
//					System.out.print ("[" + stateNames[current] + "] ");
//					System.out.print ("What is the next event? available: " + availableInputs[current]);
//					System.out.print ("?");
//					String input = scanner.nextLine();
//					
//					switch (current) {
//				
//					«FOR state : states»
//						case «state.name.toUpperCase»:
//							switch (input) {
//							«FOR t : state.leavingTransitions»
//								case "«t.input»":
//									System.out.println ("machine says: «t.output»");
//									current = «t.target.name.toUpperCase»;
//									break;
//							«ENDFOR»
//							}
//							break;
//					«ENDFOR»
//					}
//				}
//				}
//				
//			}
//		'''
//	}
//
//	def static compileToDot(FiniteStateMachine it) {
//		'''
//			digraph "«it.name»" {
//				_init -> «it.initial.name»;
//				«FOR state : states»
//					«FOR t : state.leavingTransitions»
//						"«state.name»" -> "«t.target.name»" [label="«t.input» / «t.output» "];
//					«ENDFOR»
//				«ENDFOR»
//				«it.initial.name» [shape=doublecircle];
//				_init [shape=point];
//			}
//		'''
//
//	}
//
//	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//
//		resource.allContents.toIterable.filter(typeof(FiniteStateMachine)). // FiniteStateMachine.class
//			forEach [ FiniteStateMachine it |
//				val fname = it.name.toFirstUpper
//				// generate Java implementation
//				fsa.generateFile("fsm/" + fname + ".java", it.compileToJava)
//				
//				// generate GraphvizDot representation
//				fsa.generateFile(fname + ".dot", it.compileToDot)
//				
//				// execute graphviz dot to render a PDF file
//				val projectName = resource.URI.segment(1)
//				val project = ResourcesPlugin.workspace.root.getProject(projectName)
//				var path = new File(project.location + "/src-gen/")
//				var cmd = #["dot", "-Tpdf", fname + ".dot", "-o", fname + ".pdf"]
//				Runtime.runtime.exec(cmd, null, path).wait
//			]
//	}
//}