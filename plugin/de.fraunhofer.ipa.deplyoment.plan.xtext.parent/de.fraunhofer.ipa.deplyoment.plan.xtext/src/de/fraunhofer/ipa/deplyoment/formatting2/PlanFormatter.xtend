/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deplyoment.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.deployment.formatting2.UtilFormatter
import de.fraunhofer.ipa.deplyoment.services.PlanGrammarAccess
import deploymentPlan.DeploymentPlan
import deploymentPlan.Plan
import org.eclipse.xtext.formatting2.IFormattableDocument

class PlanFormatter extends UtilFormatter {

    @Inject extension PlanGrammarAccess

    def dispatch void format(Plan plan, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
        plan.plan.format
    }

    def dispatch void format(DeploymentPlan deploymentPlan, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
        deploymentPlan.realize.format
    }

    // TODO: implement for Realization, ImplementationAssignment, ConfigExecutionParameter
}