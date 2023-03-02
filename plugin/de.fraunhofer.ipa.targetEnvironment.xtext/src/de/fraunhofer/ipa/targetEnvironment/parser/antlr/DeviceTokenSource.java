/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.parser.antlr;

import de.fraunhofer.ipa.targetEnvironment.parser.antlr.internal.InternalDeviceParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class DeviceTokenSource extends AbstractIndentationTokenSource {

	public DeviceTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalDeviceParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalDeviceParser.RULE_INDENT;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalDeviceParser.RULE_DEDENT;
	}

}
