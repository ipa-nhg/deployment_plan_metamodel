/*
 * generated by Xtext 2.30.0
 */
lexer grammar InternalPlanWithRosmodelLexer;

@header {
package de.fraunhofer.ipa.deployment.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

ExecutionConfiguration : 'executionConfiguration:';

DeploymentPlanWithRos : 'DeploymentPlanWithRos:';

LinuxOpertingSystem : 'LinuxOpertingSystem';

MacOSOpertingSystem : 'MacOSOpertingSystem';

SoftwareComponents : 'softwareComponents:';

TargetRossystem : 'targetRossystem:';

DeploymentPlan : 'DeploymentPlan:';

AttributeKind : 'AttributeKind';

SelectionKind : 'SelectionKind';

RefNodeParam : 'refNodeParam:';

StartCommand : 'startCommand:';

Description : 'description:';

RefSysParam : 'refSysParam:';

RuntimeType : 'runtimeType:';

MaximumKind : 'MaximumKind';

MinimumKind : 'MinimumKind';

Assignment : 'assignment:';

ExecutedBy : 'executedBy:';

Middleware : 'middleware:';

Properties : 'properties:';

Os_version : 'os_version';

Processor : 'Processor';

RangeKind : 'RangeKind';

Container : 'container';

DeployTo : 'deployTo:';

Resource : 'resource:';

Ethernet : 'Ethernet';

Version : 'version:';

Os_name : 'os_name';

Rolling : 'rolling';

Debian : 'debian';

Humble : 'humble';

Noetic : 'noetic';

Ubuntu : 'ubuntu';

Value : 'value:';

Arm64 : 'arm64';

Focal : 'focal';

From : 'from:';

Jammy : 'jammy';

Kind : 'kind:';

Name : 'name:';

Type : 'type:';

Wlan : 'Wlan';

Usb : 'Usb';

To : 'to:';

X86 : 'x86';

HyphenMinus : '-';

Colon : ':';

fragment RULE_DIGIT : '0'..'9';

RULE_DOUBLE : (RULE_DIGIT*|'-' RULE_DIGIT*) ('.' RULE_DECINT*|('.' RULE_DIGIT*)? ('E'|'e') ('-'|'+')? RULE_DIGIT*);

RULE_DECINT : ('0'|'1'..'9' RULE_DIGIT*|'-' '0'..'9' RULE_DIGIT*);

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))*;

fragment RULE_INDENT : ;

fragment RULE_DEDENT : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
