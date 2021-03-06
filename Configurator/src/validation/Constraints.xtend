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

class Constraints {
	
	// Constraint operator contraint
	def static dispatch boolean constraint(BinaryExpression it) {
		println("mathOperatorConstraint: " + mathOperatorConstraint(it))
		println("andOrOperatorConstraint: " + mathOperatorConstraint(it))
		(andOrOperatorConstraint(it)) || (mathOperatorConstraint(it))
	}
	
	// Parameter can only have either literals or enum values or children
	def static dispatch boolean constraint(Parameter it) {
		println("parameterconstraints")
		(literalValues.empty && !enumValues.empty && paramEnumConstraint && enumCountConstraint && !paramChildrenConstraint) 
		||
		(!literalValues.empty && enumValues.empty && literalTypesConstraint && literalCountConstraint && !paramChildrenConstraint)
		||
		(paramChildrenConstraint && literalValues.empty && enumValues.empty && enum == null)	
	}
	
	def static dispatch boolean constraint(Enum it) {
		println("enumconstraint")
		values.size > 0 && values.forall[x | x.eClass == values.get(0).eClass]
	}
	
	def static dispatch boolean constraint(NamedElement it) {
		println("nameconstraint")
//		name != null && !name.empty
		!(name == null || name.empty)
	}
	
	// Catch all case for dynamic dispatch resolution
	def static dispatch boolean constraint(EObject it) {
		println("default constraint")
		true
	}
	
	///////////////////////////////////////////////////////////////////////////
	// HELPER METHODS
	///////////////////////////////////////////////////////////////////////////
	def static boolean paramEnumConstraint(Parameter it) {
		println("paramenumconstraint")
		enum != null && enumValues.forall[x | enum.values.contains(x)]
	}
	
		// Literal values need to be of the same type.
	def static boolean literalTypesConstraint(Parameter it) {
		println("literaltypesconstraint")
		literalValues.forall[x | x instanceof IntLiteral]
		||
		literalValues.forall[x | x instanceof StringLiteral]
		|| 
		literalValues.forall[x | x instanceof DoubleLiteral]
		||
		literalValues.forall[x | x instanceof BooleanLiteral]
	}
	
	def static boolean literalCountConstraint(Parameter it) {
		println("literalContConstraint")
		(literalValues.size <= maxChosenValues) && (literalValues.size >= minChosenValues)
	}
	
	def static boolean paramChildrenConstraint(Parameter it) {
		println("Paramchildrenconstraint")
		children.size > 0 && children.forall[x | x != it]
	}
	
	def static boolean enumCountConstraint(Parameter it) {
		println("enumcountconstraint")
		(enumValues.size <= maxChosenValues) && (enumValues.size >= minChosenValues)
		// TODO: Change
	}
	
	def static boolean mathOperatorConstraint(BinaryExpression it) {
		println("mathoperatorconstraint")
		(operator.equals(BinaryOperator.NOTEQUALS) || operator.equals(BinaryOperator.EQUALS) || operator.equals(BinaryOperator.GT) || operator.equals(BinaryOperator.GTEQ) || operator.equals(BinaryOperator.LT) || operator.equals(BinaryOperator.LTEQ)) 
		&& 
		(leftOperand instanceof ParameterIdentifier || leftOperand instanceof Value)
		&&
		(it.rightOperand instanceof ParameterIdentifier || it.rightOperand instanceof Value)
	}
	
	def static boolean andOrOperatorConstraint(BinaryExpression it) {
		println("andoroperatorconstraint")
		(operator.equals(BinaryOperator.AND) || operator.equals(BinaryOperator.OR) || operator.equals(BinaryOperator.XOR))
		&&
		(leftOperand instanceof BinaryExpression)
		&&
		(rightOperand instanceof BinaryExpression)
	}
}