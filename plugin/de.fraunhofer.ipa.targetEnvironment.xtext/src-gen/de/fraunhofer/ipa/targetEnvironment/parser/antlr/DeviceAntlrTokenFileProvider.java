/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DeviceAntlrTokenFileProvider implements IAntlrTokenFileProvider {

    @Override
    public InputStream getAntlrTokenFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResourceAsStream("de/fraunhofer/ipa/targetEnvironment/parser/antlr/internal/InternalDeviceParser.tokens");
    }
}
