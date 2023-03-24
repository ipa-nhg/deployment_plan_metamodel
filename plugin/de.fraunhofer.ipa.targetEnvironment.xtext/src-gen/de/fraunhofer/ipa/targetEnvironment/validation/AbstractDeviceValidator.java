/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.validation;

import de.fraunhofer.ipa.deployment.validation.UtilValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractDeviceValidator extends UtilValidator {

    @Override
    protected List<EPackage> getEPackages() {
        List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
        result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ipa.fraunhofer.de/Device"));
        result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ipa.fraunhofer.de/Util"));
        return result;
    }
}
