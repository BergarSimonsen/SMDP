package org.xtext.example.mydsl.serializer;

import Configurator.BinaryConstraint;
import Configurator.ConfiguratorModel;
import Configurator.ConfiguratorPackage;
import Configurator.ParamCategory;
import Configurator.Parameter;
import Configurator.ParameterIdentifier;
import Configurator.SimpleType;
import Configurator.UnaryConstraint;
import Configurator.Value;
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
			case ConfiguratorPackage.CONFIGURATOR_MODEL:
				if(context == grammarAccess.getConfiguratorModelRule()) {
					sequence_ConfiguratorModel(context, (ConfiguratorModel) semanticObject); 
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
			case ConfiguratorPackage.PARAM_CATEGORY:
				if(context == grammarAccess.getParamCategoryRule()) {
					sequence_ParamCategory(context, (ParamCategory) semanticObject); 
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
			case ConfiguratorPackage.SIMPLE_TYPE:
				if(context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_SimpleType(context, (SimpleType) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.UNARY_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getUnaryConstraintRule()) {
					sequence_UnaryConstraint(context, (UnaryConstraint) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackage.VALUE:
				if(context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (operator=BinaryOperator? leftOperand=Constraint rightOperand=Constraint)
	 */
	protected void sequence_BinaryConstraint(EObject context, BinaryConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         Name=EString? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         (constraints+=Constraint constraints+=Constraint*)? 
	 *         (categories+=ParamCategory categories+=ParamCategory*)?
	 *     )
	 */
	protected void sequence_ConfiguratorModel(EObject context, ConfiguratorModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=Value values+=Value*)
	 */
	protected void sequence_Enum(EObject context, Configurator.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Name=EString? params+=Parameter params+=Parameter*)
	 */
	protected void sequence_ParamCategory(EObject context, ParamCategory semanticObject) {
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
		feeder.accept(grammarAccess.getParameterIdentifierAccess().getParameterParameterEStringParserRuleCall_3_0_1(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (required?='required'? Name=EString? maxChosenValues=EInt? paramType=Type)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Name=TypeName?)
	 */
	protected void sequence_SimpleType(EObject context, SimpleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=UnaryOperator? operand=Constraint)
	 */
	protected void sequence_UnaryConstraint(EObject context, UnaryConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackage.Literals.VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackage.Literals.VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
}
