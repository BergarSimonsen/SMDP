package generator;

import Configurator.ConfiguratorModel;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class DslGenerator implements IGenerator {
  public static Object compileToAndroid(final ConfiguratorModel it) {
    return null;
  }
  
  public static Object compileToHtml(final ConfiguratorModel it) {
    return null;
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compileToJava is undefined for the type DslGenerator"
      + "\nThe method compileToDot is undefined for the type DslGenerator"
      + "\nThe method or field ResourcesPlugin is undefined for the type DslGenerator"
      + "\nFile cannot be resolved."
      + "\nworkspace cannot be resolved"
      + "\nroot cannot be resolved"
      + "\ngetProject cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n+ cannot be resolved");
  }
}
