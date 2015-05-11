package org.xtext.example.mydsl.serializer;

import Configurator.BinaryExpression;
import Configurator.BooleanLiteral;
import Configurator.ConfiguratorModel;
import Configurator.ConfiguratorPackage;
import Configurator.Constraint;
import Configurator.DoubleLiteral;
import Configurator.IntLiteral;
import Configurator.Parameter;
import Configurator.ParameterIdentifier;
import Configurator.StringLiteral;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ConfiguratorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConfiguratorPackage.BINARY_EXPRESSION:
				if(context == grammarAccess.getBinaryExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BinaryExpression(context, (BinaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.CONFIGURATOR_MODEL:
				if(context == grammarAccess.getConfiguratorModelRule()) {
					sequence_ConfiguratorModel(context, (ConfiguratorModel) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.DOUBLE_LITERAL:
				if(context == grammarAccess.getDoubleLiteralRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_DoubleLiteral(context, (DoubleLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.ENUM:
				if(context == grammarAccess.getEnumRule()) {
					sequence_Enum(context, (Configurator.Enum) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.INT_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIntLiteralRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntLiteral(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.PARAMETER:
				if(context == grammarAccess.getParameter2Rule()) {
					sequence_Parameter2(context, (Parameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameter3Rule()) {
					sequence_Parameter3(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.PARAMETER_IDENTIFIER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getParameterIdentifierRule()) {
					sequence_ParameterIdentifier(context, (ParameterIdentifier) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.STRING_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (leftOperand=Expression operator=BinaryOperator rightOperand=Expression)
	 */
	protected void sequence_BinaryExpression(EObject context, BinaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.BINARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.BINARY_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getLeftOperandExpressionParserRuleCall_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getRightOperandExpressionParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value?='value'?)
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (enums+=Enum enums+=Enum*)? 
	 *         ((parameters+=Parameter2 | parameters+=Parameter3) (parameters+=Parameter2 | parameters+=Parameter3)*)? 
	 *         (constraints+=Constraint constraints+=Constraint*)?
	 *     )
	 */
	protected void sequence_ConfiguratorModel(EObject context, ConfiguratorModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=BinaryExpression then=BinaryExpression)
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.CONSTRAINT__IF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.CONSTRAINT__IF));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.CONSTRAINT__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.CONSTRAINT__THEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintAccess().getIfBinaryExpressionParserRuleCall_1_1_0(), semanticObject.getIf());
		feeder.accept(grammarAccess.getConstraintAccess().getThenBinaryExpressionParserRuleCall_2_1_0(), semanticObject.getThen());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=EDouble?)
	 */
	protected void sequence_DoubleLiteral(EObject context, DoubleLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString values+=Value values+=Value*)
	 */
	protected void sequence_Enum(EObject context, Configurator.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=EInt?)
	 */
	protected void sequence_IntLiteral(EObject context, IntLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString maxChosenValues=EInt minChosenValues=EInt enum=[Enum|EString]?)
	 */
	protected void sequence_Parameter2(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString children+=[Parameter|EString] children+=[Parameter|EString]*)
	 */
	protected void sequence_Parameter3(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameter=[Parameter|EString]
	 */
	protected void sequence_ParameterIdentifier(EObject context, ParameterIdentifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.PARAMETER_IDENTIFIER__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.PARAMETER_IDENTIFIER__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterIdentifierAccess().getParameterParameterEStringParserRuleCall_1_0_1(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=EString?)
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
