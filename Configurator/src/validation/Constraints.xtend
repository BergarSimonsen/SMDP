package validation

import Configurator.BinaryConstraint
import Configurator.BinaryOperator
import Configurator.Literal
import Configurator.Parameter
import Configurator.ParameterIdentifier
import Configurator.UnaryConstraint
import Configurator.impl.BinaryConstraintImpl
import org.eclipse.emf.ecore.EObject

class Constraints {
	
	// Constraint operator contraint
	def static dispatch boolean constraint(BinaryConstraint it) {
//		println(mathOperatorConstraint(it))
		(andOrOperatorConstraint(it)) || (mathOperatorConstraint(it))
	}
	
	def static boolean mathOperatorConstraint(BinaryConstraint it) {
		(operator.equals(BinaryOperator.NOTEQUALS) || operator.equals(BinaryOperator.EQUALS) || operator.equals(BinaryOperator.GT) || operator.equals(BinaryOperator.GTEQ) || operator.equals(BinaryOperator.LT) || operator.equals(BinaryOperator.LTEQ)) 
		&& 
		(leftOperand instanceof ParameterIdentifier || leftOperand instanceof Literal)
		&&
		(it.rightOperand instanceof ParameterIdentifier || it.rightOperand instanceof Literal)
	}
	
	def static boolean andOrOperatorConstraint(BinaryConstraint it) {
		(operator.equals(BinaryOperator.AND) || operator.equals(BinaryOperator.OR) || operator.equals(BinaryOperator.XOR))
		&&
		(leftOperand instanceof BinaryConstraint || leftOperand instanceof UnaryConstraint)
		&&
		(rightOperand instanceof BinaryConstraint || rightOperand instanceof UnaryConstraint)
	}
	
	// Parameter can only have either literal or enum value
	def static dispatch boolean constraint(Parameter it) {
		(literalValue == null && enumValue != null) 
		||
		(literalValue != null && enumValue == null) 
	}

	// Unary constraint can only containa binary constraint	
	def static dispatch boolean constraint(UnaryConstraint it) {
		operand instanceof BinaryConstraint
	}
	
	// Catch all case for dynamic dispatch resolution
	def static dispatch boolean constraint(EObject it) {
		true
	}
}