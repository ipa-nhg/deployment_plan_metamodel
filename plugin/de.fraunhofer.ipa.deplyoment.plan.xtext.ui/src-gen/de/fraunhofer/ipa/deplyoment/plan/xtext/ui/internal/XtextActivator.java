/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deplyoment.plan.xtext.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fraunhofer.ipa.deplyoment.ImplementationDescriptionRuntimeModule;
import de.fraunhofer.ipa.deplyoment.PlanRuntimeModule;
import de.fraunhofer.ipa.deplyoment.PlanWithRosmodelRuntimeModule;
import de.fraunhofer.ipa.deplyoment.ui.ImplementationDescriptionUiModule;
import de.fraunhofer.ipa.deplyoment.ui.PlanUiModule;
import de.fraunhofer.ipa.deplyoment.ui.PlanWithRosmodelUiModule;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass.
 */
public class XtextActivator extends AbstractUIPlugin {

    public static final String PLUGIN_ID = "de.fraunhofer.ipa.deplyoment.plan.xtext.ui";
    public static final String DE_FRAUNHOFER_IPA_DEPLYOMENT_PLAN = "de.fraunhofer.ipa.deplyoment.Plan";
    public static final String DE_FRAUNHOFER_IPA_DEPLYOMENT_PLANWITHROSMODEL = "de.fraunhofer.ipa.deplyoment.PlanWithRosmodel";
    public static final String DE_FRAUNHOFER_IPA_DEPLYOMENT_IMPLEMENTATIONDESCRIPTION = "de.fraunhofer.ipa.deplyoment.ImplementationDescription";

    private static final Logger logger = Logger.getLogger(XtextActivator.class);

    private static XtextActivator INSTANCE;

    private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        INSTANCE = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        injectors.clear();
        INSTANCE = null;
        super.stop(context);
    }

    public static XtextActivator getInstance() {
        return INSTANCE;
    }

    public Injector getInjector(String language) {
        synchronized (injectors) {
            Injector injector = injectors.get(language);
            if (injector == null) {
                injectors.put(language, injector = createInjector(language));
            }
            return injector;
        }
    }

    protected Injector createInjector(String language) {
        try {
            com.google.inject.Module runtimeModule = getRuntimeModule(language);
            com.google.inject.Module sharedStateModule = getSharedStateModule();
            com.google.inject.Module uiModule = getUiModule(language);
            com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
            return Guice.createInjector(mergedModule);
        } catch (Exception e) {
            logger.error("Failed to create injector for " + language);
            logger.error(e.getMessage(), e);
            throw new RuntimeException("Failed to create injector for " + language, e);
        }
    }

    protected com.google.inject.Module getRuntimeModule(String grammar) {
        if (DE_FRAUNHOFER_IPA_DEPLYOMENT_PLAN.equals(grammar)) {
            return new PlanRuntimeModule();
        }
        if (DE_FRAUNHOFER_IPA_DEPLYOMENT_PLANWITHROSMODEL.equals(grammar)) {
            return new PlanWithRosmodelRuntimeModule();
        }
        if (DE_FRAUNHOFER_IPA_DEPLYOMENT_IMPLEMENTATIONDESCRIPTION.equals(grammar)) {
            return new ImplementationDescriptionRuntimeModule();
        }
        throw new IllegalArgumentException(grammar);
    }

    protected com.google.inject.Module getUiModule(String grammar) {
        if (DE_FRAUNHOFER_IPA_DEPLYOMENT_PLAN.equals(grammar)) {
            return new PlanUiModule(this);
        }
        if (DE_FRAUNHOFER_IPA_DEPLYOMENT_PLANWITHROSMODEL.equals(grammar)) {
            return new PlanWithRosmodelUiModule(this);
        }
        if (DE_FRAUNHOFER_IPA_DEPLYOMENT_IMPLEMENTATIONDESCRIPTION.equals(grammar)) {
            return new ImplementationDescriptionUiModule(this);
        }
        throw new IllegalArgumentException(grammar);
    }

    protected com.google.inject.Module getSharedStateModule() {
        return new SharedStateModule();
    }


}
