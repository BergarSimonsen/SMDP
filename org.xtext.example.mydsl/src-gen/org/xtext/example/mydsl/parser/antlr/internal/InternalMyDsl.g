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
    	return "ConfiguratorModel";	
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
((
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameter2ParserRuleCall_4_2_0_0()); 
	    }
		lv_parameters_6_0=ruleParameter2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_6_0, 
        		"Parameter2");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameter3ParserRuleCall_4_2_1_0()); 
	    }
		lv_parameters_7_0=ruleParameter3		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_7_0, 
        		"Parameter3");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_4_3_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameter2ParserRuleCall_4_3_1_0_0()); 
	    }
		lv_parameters_9_0=ruleParameter2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_9_0, 
        		"Parameter2");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameter3ParserRuleCall_4_3_1_1_0()); 
	    }
		lv_parameters_10_0=ruleParameter3		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_10_0, 
        		"Parameter3");
	        afterParserOrEnumRuleCall();
	    }

)
)))*	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_4_4());
    }
)?(	otherlv_12='constraints' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getConfiguratorModelAccess().getConstraintsKeyword_5_0());
    }
	otherlv_13='{' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 
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
)(	otherlv_15=',' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_5_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 
	    }
		lv_constraints_16_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"constraints",
        		lv_constraints_16_0, 
        		"Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_5_4());
    }
)?(	otherlv_18='enums' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getConfiguratorModelAccess().getEnumsKeyword_6_0());
    }
	otherlv_19='{' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getEnumsEnumParserRuleCall_6_2_0()); 
	    }
		lv_enums_20_0=ruleEnum		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"enums",
        		lv_enums_20_0, 
        		"Enum");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_21=',' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_6_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getEnumsEnumParserRuleCall_6_3_1_0()); 
	    }
		lv_enums_22_0=ruleEnum		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
	        }
       		add(
       			$current, 
       			"enums",
        		lv_enums_22_0, 
        		"Enum");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_23='}' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_6_4());
    }
)?	otherlv_24='}' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current; } 
	 EOF 
;

// Rule Value
ruleValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getValueAccess().getIntLiteralParserRuleCall_0()); 
    }
    this_IntLiteral_0=ruleIntLiteral
    { 
        $current = $this_IntLiteral_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_1()); 
    }
    this_DoubleLiteral_1=ruleDoubleLiteral
    { 
        $current = $this_DoubleLiteral_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_2()); 
    }
    this_StringLiteral_2=ruleStringLiteral
    { 
        $current = $this_StringLiteral_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_3()); 
    }
    this_BooleanLiteral_3=ruleBooleanLiteral
    { 
        $current = $this_BooleanLiteral_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_0()); 
    }
    this_BinaryExpression_0=ruleBinaryExpression
    { 
        $current = $this_BinaryExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getIntLiteralParserRuleCall_1()); 
    }
    this_IntLiteral_1=ruleIntLiteral
    { 
        $current = $this_IntLiteral_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getDoubleLiteralParserRuleCall_2()); 
    }
    this_DoubleLiteral_2=ruleDoubleLiteral
    { 
        $current = $this_DoubleLiteral_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_3()); 
    }
    this_StringLiteral_3=ruleStringLiteral
    { 
        $current = $this_StringLiteral_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getBooleanLiteralParserRuleCall_4()); 
    }
    this_BooleanLiteral_4=ruleBooleanLiteral
    { 
        $current = $this_BooleanLiteral_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getParameterIdentifierParserRuleCall_5()); 
    }
    this_ParameterIdentifier_5=ruleParameterIdentifier
    { 
        $current = $this_ParameterIdentifier_5.current; 
        afterParserOrEnumRuleCall();
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





// Entry rule entryRuleParameter2
entryRuleParameter2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameter2Rule()); }
	 iv_ruleParameter2=ruleParameter2 
	 { $current=$iv_ruleParameter2.current; } 
	 EOF 
;

// Rule Parameter2
ruleParameter2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getParameter2Access().getParameterAction_0(),
            $current);
    }
)	otherlv_1='Parameter' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getParameter2Access().getParameterKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameter2Access().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameter2Rule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getParameter2Access().getLeftParenthesisKeyword_3());
    }
(	otherlv_4='maxChosenValues' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getParameter2Access().getMaxChosenValuesKeyword_4_0());
    }
	otherlv_5=':' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getParameter2Access().getColonKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameter2Access().getMaxChosenValuesEIntParserRuleCall_4_2_0()); 
	    }
		lv_maxChosenValues_6_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameter2Rule());
	        }
       		set(
       			$current, 
       			"maxChosenValues",
        		lv_maxChosenValues_6_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getParameter2Access().getCommaKeyword_5());
    }
(	otherlv_8='minChosenValues' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getParameter2Access().getMinChosenValuesKeyword_6_0());
    }
	otherlv_9=':' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getParameter2Access().getColonKeyword_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameter2Access().getMinChosenValuesEIntParserRuleCall_6_2_0()); 
	    }
		lv_minChosenValues_10_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameter2Rule());
	        }
       		set(
       			$current, 
       			"minChosenValues",
        		lv_minChosenValues_10_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_11=',' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getParameter2Access().getCommaKeyword_7());
    }
(	otherlv_12='enum' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getParameter2Access().getEnumKeyword_8_0());
    }
	otherlv_13=':' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getParameter2Access().getColonKeyword_8_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameter2Rule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getParameter2Access().getEnumEnumCrossReference_8_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_15=')' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getParameter2Access().getRightParenthesisKeyword_9());
    }
)
;





// Entry rule entryRuleParameter3
entryRuleParameter3 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameter3Rule()); }
	 iv_ruleParameter3=ruleParameter3 
	 { $current=$iv_ruleParameter3.current; } 
	 EOF 
;

// Rule Parameter3
ruleParameter3 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getParameter3Access().getParameterAction_0(),
            $current);
    }
)	otherlv_1='Parameter' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getParameter3Access().getParameterKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameter3Access().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameter3Rule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getParameter3Access().getLeftParenthesisKeyword_3());
    }
(	otherlv_4='children' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getParameter3Access().getChildrenKeyword_4_0());
    }
	otherlv_5=':' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getParameter3Access().getColonKeyword_4_1());
    }
	otherlv_6='[' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getParameter3Access().getLeftSquareBracketKeyword_4_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameter3Rule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getParameter3Access().getChildrenParameterCrossReference_4_3_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getParameter3Access().getCommaKeyword_4_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameter3Rule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getParameter3Access().getChildrenParameterCrossReference_4_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_10=']' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getParameter3Access().getRightSquareBracketKeyword_4_5());
    }
)	otherlv_11=')' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getParameter3Access().getRightParenthesisKeyword_5());
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
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConstraintAccess().getConstraintAction_0(),
            $current);
    }
)(	otherlv_1='if' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getIfKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstraintAccess().getIfBinaryExpressionParserRuleCall_1_1_0()); 
	    }
		lv_if_2_0=ruleBinaryExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstraintRule());
	        }
       		set(
       			$current, 
       			"if",
        		lv_if_2_0, 
        		"BinaryExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_3='then' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getThenKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstraintAccess().getThenBinaryExpressionParserRuleCall_2_1_0()); 
	    }
		lv_then_4_0=ruleBinaryExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstraintRule());
	        }
       		set(
       			$current, 
       			"then",
        		lv_then_4_0, 
        		"BinaryExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)))
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
(	otherlv_0='Enum' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_3_0()); 
	    }
		lv_values_3_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_3_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_4_1_0()); 
	    }
		lv_values_5_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_5_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getSemicolonKeyword_5());
    }
)
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





// Entry rule entryRuleIntLiteral
entryRuleIntLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntLiteralRule()); }
	 iv_ruleIntLiteral=ruleIntLiteral 
	 { $current=$iv_ruleIntLiteral.current; } 
	 EOF 
;

// Rule IntLiteral
ruleIntLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getIntLiteralAccess().getValueEIntParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleDoubleLiteral
entryRuleDoubleLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDoubleLiteralRule()); }
	 iv_ruleDoubleLiteral=ruleDoubleLiteral 
	 { $current=$iv_ruleDoubleLiteral.current; } 
	 EOF 
;

// Rule DoubleLiteral
ruleDoubleLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDoubleLiteralAccess().getDoubleLiteralAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDoubleLiteralAccess().getValueEDoubleParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDoubleLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleStringLiteral
entryRuleStringLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringLiteralRule()); }
	 iv_ruleStringLiteral=ruleStringLiteral 
	 { $current=$iv_ruleStringLiteral.current; } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStringLiteralAccess().getValueEStringParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStringLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	 iv_ruleBooleanLiteral=ruleBooleanLiteral 
	 { $current=$iv_ruleBooleanLiteral.current; } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
            $current);
    }
)(
(
		lv_value_1_0=	'value' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueValueKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanLiteralRule());
	        }
       		setWithLastConsumed($current, "value", true, "value");
	    }

)
)?)
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







// Entry rule entryRuleBinaryExpression
entryRuleBinaryExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBinaryExpressionRule()); }
	 iv_ruleBinaryExpression=ruleBinaryExpression 
	 { $current=$iv_ruleBinaryExpression.current; } 
	 EOF 
;

// Rule BinaryExpression
ruleBinaryExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftOperandExpressionParserRuleCall_1_0()); 
	    }
		lv_leftOperand_1_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
	        }
       		set(
       			$current, 
       			"leftOperand",
        		lv_leftOperand_1_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 
	    }
		lv_operator_2_0=ruleBinaryOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
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
	        newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightOperandExpressionParserRuleCall_3_0()); 
	    }
		lv_rightOperand_3_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
	        }
       		set(
       			$current, 
       			"rightOperand",
        		lv_rightOperand_3_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4());
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
(	otherlv_0='ParameterIdentifier' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParameterIdentifierAccess().getParameterIdentifierKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getParameterIdentifierAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='parameter' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getParameterIdentifierAccess().getParameterKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterIdentifierRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getParameterIdentifierAccess().getParameterParameterCrossReference_3_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getParameterIdentifierAccess().getRightCurlyBracketKeyword_4());
    }
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


