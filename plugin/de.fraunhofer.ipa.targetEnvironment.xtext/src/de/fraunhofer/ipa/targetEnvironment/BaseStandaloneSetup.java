/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BaseStandaloneSetup extends BaseStandaloneSetupGenerated {

	public static void doSetup() {
		new BaseStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}