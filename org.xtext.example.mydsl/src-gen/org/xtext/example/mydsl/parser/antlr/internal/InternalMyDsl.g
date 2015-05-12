/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;
 	
    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Model' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getConfiguratorModelsConfiguratorModelParserRuleCall_3_0()); 
	    }
		lv_configuratorModels_3_0=ruleConfiguratorModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"configuratorModels",
        		lv_configuratorModels_3_0, 
        		"ConfiguratorModel");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getConfiguratorModelsConfiguratorModelParserRuleCall_4_1_0()); 
	    }
		lv_configuratorModels_5_0=ruleConfiguratorModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"configuratorModels",
        		lv_configuratorModels_5_0, 
        		"ConfiguratorModel");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	 iv_ruleConstraint=ruleConstraint 
	 { $current=$iv_ruleConstraint.current; } 
	 EOF 
;

// Rule Constraint
ruleConstraint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConstraintAccess().getBinaryConstraintParserRuleCall_0()); 
    }
    this_BinaryConstraint_0=ruleBinaryConstraint
    { 
        $current = $this_BinaryConstraint_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConstraintAccess().getIntegerParserRuleCall_1()); 
    }
    this_Integer_1=ruleInteger
    { 
        $current = $this_Integer_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConstraintAccess().getDoubleParserRuleCall_2()); 
    }
    this_Double_2=ruleDouble
    { 
        $current = $this_Double_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConstraintAccess().getString0ParserRuleCall_3()); 
    }
    this_String0_3=ruleString0
    { 
        $current = $this_String0_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConstraintAccess().getBooleanParserRuleCall_4()); 
    }
    this_Boolean_4=ruleBoolean
    { 
        $current = $this_Boolean_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConstraintAccess().getParameterIdentifierParserRuleCall_5()); 
    }
    this_ParameterIdentifier_5=ruleParameterIdentifier
    { 
        $current = $this_ParameterIdentifier_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getEnumParserRuleCall_0()); 
    }
    this_Enum_0=ruleEnum
    { 
        $current = $this_Enum_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_1()); 
    }
    this_Integer_1=ruleInteger
    { 
        $current = $this_Integer_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getDoubleParserRuleCall_2()); 
    }
    this_Double_2=ruleDouble
    { 
        $current = $this_Double_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); 
    }
    this_String0_3=ruleString0
    { 
        $current = $this_String0_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getBooleanParserRuleCall_4()); 
    }
    this_Boolean_4=ruleBoolean
    { 
        $current = $this_Boolean_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	 iv_ruleLiteral=ruleLiteral 
	 { $current=$iv_ruleLiteral.current; } 
	 EOF 
;

// Rule Literal
ruleLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getLiteralAccess().getIntegerParserRuleCall_0()); 
    }
    this_Integer_0=ruleInteger
    { 
        $current = $this_Integer_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getLiteralAccess().getDoubleParserRuleCall_1()); 
    }
    this_Double_1=ruleDouble
    { 
        $current = $this_Double_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getLiteralAccess().getString0ParserRuleCall_2()); 
    }
    this_String0_2=ruleString0
    { 
        $current = $this_String0_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getLiteralAccess().getBooleanParserRuleCall_3()); 
    }
    this_Boolean_3=ruleBoolean
    { 
        $current = $this_Boolean_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleConfiguratorModel
entryRuleConfiguratorModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConfiguratorModelRule()); }
	 iv_ruleConfiguratorModel=ruleConfiguratorModel 
	 { $current=$iv_ruleConfiguratorModel.current; } 
	 EOF 
;

// Rule ConfiguratorModel
ruleConfiguratorModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConfiguratorModelAccess().getConfiguratorModelAction_0(),
            $current);
    }
)	otherlv_1='ConfiguratorModel' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConfiguratorModelAccess().getConfiguratorModelKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='parameters' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getConfiguratorModelAccess().getParametersKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_2_0()); 
	    }
		lv_parameters_6_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_6_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_3_1_0()); 
	    }
		lv_parameters_8_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_8_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_4_4());
    }
)?(	otherlv_10='constraints' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getConfiguratorModelAccess().getConstraintsKeyword_5_0());
    }
	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 
	    }
		lv_constraints_12_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"constraints",
        		lv_constraints_12_0, 
        		"Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_13=',' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_5_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 
	    }
		lv_constraints_14_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"constraints",
        		lv_constraints_14_0, 
        		"Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_5_4());
    }
)?	otherlv_16='}' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	 iv_ruleParameter=ruleParameter 
	 { $current=$iv_ruleParameter.current; } 
	 EOF 
;

// Rule Parameter
ruleParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Parameter' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_2());
    }
(	otherlv_3='minChosenValues' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getMinChosenValuesKeyword_3_0());
    }
	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getMinChosenValuesEIntParserRuleCall_3_2_0()); 
	    }
		lv_minChosenValues_5_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"minChosenValues",
        		lv_minChosenValues_5_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommaKeyword_4());
    }
(	otherlv_7='maxChosenValues' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getMaxChosenValuesKeyword_5_0());
    }
	otherlv_8=':' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getColonKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getMaxChosenValuesEIntParserRuleCall_5_2_0()); 
	    }
		lv_maxChosenValues_9_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"maxChosenValues",
        		lv_maxChosenValues_9_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getCommaKeyword_6());
    }
	otherlv_11=')' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getRightParenthesisKeyword_7());
    }
	otherlv_12=':' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getColonKeyword_8());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_9_0()); 
	    }
		lv_type_13_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_13_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleEnum
entryRuleEnum returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumRule()); }
	 iv_ruleEnum=ruleEnum 
	 { $current=$iv_ruleEnum.current; } 
	 EOF 
;

// Rule Enum
ruleEnum returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='[' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getLeftSquareBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumAccess().getValuesLiteralParserRuleCall_1_0()); 
	    }
		lv_values_1_0=ruleLiteral		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_1_0, 
        		"Literal");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumAccess().getValuesLiteralParserRuleCall_2_1_0()); 
	    }
		lv_values_3_0=ruleLiteral		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_3_0, 
        		"Literal");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4=']' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleInteger
entryRuleInteger returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	 iv_ruleInteger=ruleInteger 
	 { $current=$iv_ruleInteger.current; } 
	 EOF 
;

// Rule Integer
ruleInteger returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getIntegerAccess().getIntegerAction_0_0(),
            $current);
    }
)	otherlv_1='int' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntKeyword_0_1());
    }
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_1_0()); 
	    }
		lv_value_2_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDouble
entryRuleDouble returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDoubleRule()); }
	 iv_ruleDouble=ruleDouble 
	 { $current=$iv_ruleDouble.current; } 
	 EOF 
;

// Rule Double
ruleDouble returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDoubleAccess().getDoubleAction_0_0(),
            $current);
    }
)	otherlv_1='double' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDoubleAccess().getDoubleKeyword_0_1());
    }
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getDoubleAccess().getValueEDoubleParserRuleCall_1_0()); 
	    }
		lv_value_2_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDoubleRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleString0
entryRuleString0 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getString0Rule()); }
	 iv_ruleString0=ruleString0 
	 { $current=$iv_ruleString0.current; } 
	 EOF 
;

// Rule String0
ruleString0 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getString0Access().getStringAction_0_0(),
            $current);
    }
)	otherlv_1='String' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_0_1());
    }
)
    |(	otherlv_2=' ' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getString0Access().getSpaceKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getString0Access().getValueEStringParserRuleCall_1_1_0()); 
	    }
		lv_value_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getString0Rule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuleBoolean
entryRuleBoolean returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	 iv_ruleBoolean=ruleBoolean 
	 { $current=$iv_ruleBoolean.current; } 
	 EOF 
;

// Rule Boolean
ruleBoolean returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBooleanAccess().getBooleanAction_0_0(),
            $current);
    }
)	otherlv_1='boolean' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getBooleanKeyword_0_1());
    }
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_1_0()); 
	    }
		lv_value_2_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); } 
	 iv_ruleEDouble=ruleEDouble 
	 { $current=$iv_ruleEDouble.current.getText(); }  
	 EOF 
;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
    }
)?(    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
    }
)?
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
    }
    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
    }
((
	kw='E' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
    }

    |
	kw='e' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
    }
)(
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
    }
)?    this_INT_7=RULE_INT    {
		$current.merge(this_INT_7);
    }

    { 
    newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
    }
)?)
    ;





// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); } 
	 iv_ruleEBoolean=ruleEBoolean 
	 { $current=$iv_ruleEBoolean.current.getText(); }  
	 EOF 
;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='true' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
    }

    |
	kw='false' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleBinaryConstraint
entryRuleBinaryConstraint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBinaryConstraintRule()); }
	 iv_ruleBinaryConstraint=ruleBinaryConstraint 
	 { $current=$iv_ruleBinaryConstraint.current; } 
	 EOF 
;

// Rule BinaryConstraint
ruleBinaryConstraint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBinaryConstraintAccess().getLeftParenthesisKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getLeftOperandConstraintParserRuleCall_1_0()); 
	    }
		lv_leftOperand_1_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
	        }
       		set(
       			$current, 
       			"leftOperand",
        		lv_leftOperand_1_0, 
        		"Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 
	    }
		lv_operator_2_0=ruleBinaryOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_2_0, 
        		"BinaryOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getRightOperandConstraintParserRuleCall_3_0()); 
	    }
		lv_rightOperand_3_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
	        }
       		set(
       			$current, 
       			"rightOperand",
        		lv_rightOperand_3_0, 
        		"Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBinaryConstraintAccess().getRightParenthesisKeyword_4());
    }
)
;





// Entry rule entryRuleParameterIdentifier
entryRuleParameterIdentifier returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterIdentifierRule()); }
	 iv_ruleParameterIdentifier=ruleParameterIdentifier 
	 { $current=$iv_ruleParameterIdentifier.current; } 
	 EOF 
;

// Rule ParameterIdentifier
ruleParameterIdentifier returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterIdentifierRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getParameterIdentifierAccess().getParameterParameterCrossReference_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Rule BinaryOperator
ruleBinaryOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='&&' 
	{
        $current = grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='||' 
	{
        $current = grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='!||' 
	{
        $current = grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='==' 
	{
        $current = grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='!=' 
	{
        $current = grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='>' 
	{
        $current = grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='<' 
	{
        $current = grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='>=' 
	{
        $current = grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='<=' 
	{
        $current = grammarAccess.getBinaryOperatorAccess().getLTEQEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorAccess().getLTEQEnumLiteralDeclaration_8()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


