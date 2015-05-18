package validation

import Configurator.BinaryExpression
import Configurator.BinaryOperator
import Configurator.BooleanLiteral
import Configurator.DoubleLiteral
import Configurator.Enum
import Configurator.IntLiteral
import Configurator.NamedElement
import Configurator.Parameter
import Configurator.ParameterIdentifier
import Configurator.StringLiteral
import Configurator.Value
import org.eclipse.emf.ecore.EObject
import javax.security.auth.login.Configuration
import Configurator.BinaryConstraint
import Configurator.Literal
import Configurator.Stringg

class Constraints {
	
	// Ensure that correct operators are used for constraints
	def static dispatch boolean constraint(BinaryConstraint it) {
		println("mathOperatorConstraint: " + mathOperatorConstraint(it))
		println("andOrOperatorConstraint: " + mathOperatorConstraint(it))
		(andOrOperatorConstraint(it)) || (mathOperatorConstraint(it))
	}
	
	// Enum can't be empty && all values in enum must have same type.
	def static dispatch boolean constraint(Enum it) {
		println("enumconstraint")
		values.size > 0 && values.forall[x | x.eClass == values.get(0).eClass]
	}
	
	// Name must not be empty
	def static dispatch boolean constraint(NamedElement it) {
		println("nameconstraint")
		name != null && !name.empty
	}
	
	// If parameter's type is enum, then enumCountConstraint should be met
	def static dispatch boolean constraint(Parameter it) {
		println("parameterConstraint " + name)
		((type instanceof Enum && enumCountConstraint) || !(type instanceof Enum)) && (maxChosenValues >= minChosenValues)
	}
	
	// Catch all case for dynamic dispatch resolution
	def static dispatch boolean constraint(EObject it) {
		println("default constraint")
		true
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	// 		HELPER METHODS
	/////////////////////////////////////////////////////////////////////////////////
	
	// &&, || and XOR can only be used on binary constraints 
	def static boolean andOrOperatorConstraint(BinaryConstraint it) {
		println("andoroperatorconstraint")
		(operator.equals(BinaryOperator.AND) || operator.equals(BinaryOperator.OR) || operator.equals(BinaryOperator.XOR))
		&&
		(leftOperand instanceof BinaryConstraint)
		&&
		(rightOperand instanceof BinaryConstraint)
	}
	
	// Math operators can only be used on values and parameters.
	// Literal values can only appear on the right side of the constraint
	def static boolean mathOperatorConstraint(BinaryConstraint it) {
		println("mathoperatorconstraint")
		(operator.equals(BinaryOperator.NOTEQUALS) || operator.equals(BinaryOperator.EQUALS) || operator.equals(BinaryOperator.GT) || operator.equals(BinaryOperator.GTEQ) || operator.equals(BinaryOperator.LT) || operator.equals(BinaryOperator.LTEQ)) 
		&& 
		(leftOperand instanceof ParameterIdentifier && (rightOperand instanceof Literal || rightOperand instanceof ParameterIdentifier))
	}
	
	// parameter.minChosenValues <= parameter.enum.values.size <= parameter.maxChosenValues
	def static boolean enumCountConstraint(Parameter it) {
		println("enumcountconstraint " + name)
		val enumType = type as Enum
		(enumType.values.size >= maxChosenValues) && (enumType.values.size >= minChosenValues)
	}
}