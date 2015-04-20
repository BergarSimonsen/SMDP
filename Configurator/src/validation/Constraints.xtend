package validation

import Configurator.BinaryConstraint
import Configurator.BinaryOperator
import Configurator.BooleanLiteral
import Configurator.DoubleLiteral
import Configurator.IntLiteral
import Configurator.Literal
import Configurator.Parameter
import Configurator.ParameterIdentifier
import Configurator.StringLiteral
import Configurator.UnaryConstraint
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
		(literalValues == null && enumValue != null && enumCountConstraint) 
		||
		(literalValues != null && enumValue == null && literalTypesConstraint && literalCountConstraint) 
	}
	
	def static boolean literalCountConstraint(Parameter it) {
		(literalValues.size <= maxChosenValues) && (literalValues.size >= minChosenValues)
	}
	
	def static boolean enumCountConstraint(Parameter it) {
		(enumValue.size <= maxChosenValues) && (enumValue.size >= minChosenValues)
	}
	
	// Literal values need to be of the same type.
	def static boolean literalTypesConstraint(Parameter it) {
		literalValues.forall[x | x instanceof IntLiteral]
		||
		literalValues.forall[x | x instanceof StringLiteral]
		|| 
		literalValues.forall[x | x instanceof DoubleLiteral]
		||
		literalValues.forall[x | x instanceof BooleanLiteral]
	}
	
//	def static boolean enumTypeConstraint(Parameter it) {
//		enumValue.forall[]
//		
//	}
	
	// Unary constraint can only contains binary constraint	
	def static dispatch boolean constraint(UnaryConstraint it) {
		operand instanceof BinaryConstraint
	}
	
	// Catch all case for dynamic dispatch resolution
	def static dispatch boolean constraint(EObject it) {
		true
	}
}