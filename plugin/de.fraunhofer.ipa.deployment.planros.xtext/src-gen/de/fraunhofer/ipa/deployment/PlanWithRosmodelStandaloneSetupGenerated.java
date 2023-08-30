/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class PlanWithRosmodelStandaloneSetupGenerated implements ISetup {

  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    PlanStandaloneSetup.doSetup();

    Injector injector = createInjector();
    register(injector);
    return injector;
  }

  public Injector createInjector() {
    return Guice.createInjector(new PlanWithRosmodelRuntimeModule());
  }

  public void register(Injector injector) {
    IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
    IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);

    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("planros", resourceFactory);
    IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("planros", serviceProvider);
  }
}
