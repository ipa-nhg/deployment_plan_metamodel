/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * Represents a generated, default implementation of superclass {@link UtilProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them
 * with a more concrete subtype.
 */
public abstract class AbstractImplementationDescriptionProposalProvider extends UtilProposalProvider {

    public void completeImplementationDescriptionSet_Implementations(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeImplementationDescription_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeImplementationDescription_IncludeSoftwareComponents(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeSoftwareComponent_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeSoftwareComponent_Repository(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeSoftwareComponent_ExecutionRequirement(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeRepository_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeRepository_Url(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeRepository_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeviceRequirement_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeviceRequirement_Parameter(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeSoftwareConfigurationRequirement_Parameter(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeHWSWParemeter_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeHWSWParemeter_Kind(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeHWSWParemeter_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeHWSWParemeter_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeSoftwareExecutionParemeter_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeSoftwareExecutionParemeter_Kind(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeSoftwareExecutionParemeter_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeSoftwareExecutionParemeter_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }

    public void complete_ImplementationDescriptionSet(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_ImplementationDescription(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_ExecutionRequirement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_SoftwareComponent(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_Repository(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_RepositoryType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_GitRepositoryType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_DeviceRequirement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_SoftwareConfigurationRequirement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_ExecutionParameter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_HWSWParemeter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_SoftwareExecutionParemeter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
}
