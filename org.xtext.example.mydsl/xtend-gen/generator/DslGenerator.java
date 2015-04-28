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
  }
}
