/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment;

import de.fraunhofer.ipa.deployment.ImplementationDescriptionStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ImplementationDescriptionStandaloneSetup
    extends ImplementationDescriptionStandaloneSetupGenerated {
  public static void doSetup() {
    new ImplementationDescriptionStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
