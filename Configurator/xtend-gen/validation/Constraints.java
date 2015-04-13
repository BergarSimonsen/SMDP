package validation;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class Constraints {
  protected static boolean _constraint(final EObject it) {
    return true;
  }
  
  public static boolean constraint(final EObject it) {
    return _constraint(it);
  }
}
