package validation

import org.eclipse.emf.ecore.EObject

class Constraints {
	// Catch all case for dynamic dispatch resolution
	def static dispatch boolean constraint(EObject it) {
		true
	}
}