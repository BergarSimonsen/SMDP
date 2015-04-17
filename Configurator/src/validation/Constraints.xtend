package validation

import Configurator.BinaryConstraint
import org.eclipse.emf.ecore.EObject
import Configurator.BinaryOperator
import Configurator.ParameterIdentifier
import Configurator.Literal
import java.util.function.UnaryOperator
import Configurator.UnaryConstraint

class Constraints {
	
	
	def static dispatch boolean constraint(BinaryConstraint it) {
		println(andOrOperatorConstraint(it))
		(andOrOperatorConstraint(it)) || (mathOperatorConstraint(it))
	}
	
	def static boolean mathOperatorConstraint(BinaryConstraint it) {
		(operator.equals(BinaryOperator.NOTEQUALS) || operator.equals(BinaryOperator.EQUALS) || operator.equals(BinaryOperator.GT) || operator.equals(BinaryOperator.GTEQ) || operator.equals(BinaryOperator.LT) || operator.equals(BinaryOperator.LTEQ)) 
		&& 
		(leftOperand.class == ParameterIdentifier || leftOperand.class == Literal)
		&&
		(rightOperand.class == ParameterIdentifier || rightOperand.class == Literal)
	}
	
	def static boolean andOrOperatorConstraint(BinaryConstraint it) {
		println("!!!")
		println((it.leftOperand.getClass().equals(BinaryConstraint) || it.leftOperand.getClass().equals(UnaryConstraint)) && (rightOperand.getClass().equals(BinaryConstraint) || rightOperand.getClass().equals(UnaryConstraint)))
		
		(operator.equals(BinaryOperator.AND) || operator.equals(BinaryOperator.OR) || operator.equals(BinaryOperator.XOR))
		&&
		(leftOperand.getClass().equals(BinaryConstraint) || leftOperand.getClass().equals(UnaryConstraint))
		&&
		(rightOperand.getClass().equals(BinaryConstraint) || rightOperand.getClass().equals(UnaryConstraint))
	}
	
	// Catch all case for dynamic dispatch resolution
	def static dispatch boolean constraint(EObject it) {
		true
	}
}