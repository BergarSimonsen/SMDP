package org.xtext.example.mydsl.serializer;

import Configurator.BinaryConstraint;
import Configurator.ConfiguratorModel;
import Configurator.ConfiguratorPackage;
import Configurator.Model;
import Configurator.Parameter;
import Configurator.ParameterIdentifier;
import Configurator.Stringg;
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
			case ConfiguratorPackage.BINARY_CONSTRAINT:
				if(context == grammarAccess.getBinaryConstraintRule() ||
				   context == grammarAccess.getConstraintRule()) {
					sequence_BinaryConstraint(context, (BinaryConstraint) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.BOOLEAN:
				if(context == grammarAccess.getBooleanRule() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Boolean(context, (Configurator.Boolean) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.CONFIGURATOR_MODEL:
				if(context == grammarAccess.getConfiguratorModelRule()) {
					sequence_ConfiguratorModel(context, (ConfiguratorModel) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.DOUBLE:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDoubleRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Double(context, (Configurator.Double) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.ENUM:
				if(context == grammarAccess.getEnumRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Enum(context, (Configurator.Enum) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.INTEGER:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getIntegerRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Integer(context, (Configurator.Integer) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.PARAMETER_IDENTIFIER:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getParameterIdentifierRule()) {
					sequence_ParameterIdentifier(context, (ParameterIdentifier) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.STRINGG:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringgRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Stringg(context, (Stringg) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (leftOperand=Constraint operator=BinaryOperator rightOperand=Constraint)
	 */
	protected void sequence_BinaryConstraint(EObject context, BinaryConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.BINARY_CONSTRAINT__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.BINARY_CONSTRAINT__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.BINARY_CONSTRAINT__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.BINARY_CONSTRAINT__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.BINARY_CONSTRAINT__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.BINARY_CONSTRAINT__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBinaryConstraintAccess().getLeftOperandConstraintParserRuleCall_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBinaryConstraintAccess().getRightOperandConstraintParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Boolean}
	 */
	protected void sequence_Boolean(EObject context, Configurator.Boolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (parameters+=Parameter parameters+=Parameter*)? (constraints+=Constraint constraints+=Constraint*)?)
	 */
	protected void sequence_ConfiguratorModel(EObject context, ConfiguratorModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Double}
	 */
	protected void sequence_Double(EObject context, Configurator.Double semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=Literal values+=Literal*)
	 */
	protected void sequence_Enum(EObject context, Configurator.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Integer}
	 */
	protected void sequence_Integer(EObject context, Configurator.Integer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (configuratorModels+=ConfiguratorModel configuratorModels+=ConfiguratorModel*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameter=[Parameter|ID]
	 */
	protected void sequence_ParameterIdentifier(EObject context, ParameterIdentifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.PARAMETER_IDENTIFIER__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.PARAMETER_IDENTIFIER__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterIdentifierAccess().getParameterParameterIDTerminalRuleCall_0_1(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString minChosenValues=EInt maxChosenValues=EInt type=Type (children+=Parameter children+=Parameter*)?)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Stringg}
	 */
	protected void sequence_Stringg(EObject context, Stringg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
