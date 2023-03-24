/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.ide.contentassist.antlr;

import de.fraunhofer.ipa.targetEnvironment.ide.contentassist.antlr.internal.InternalTargetEnvironmentParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class TargetEnvironmentTokenSource extends AbstractIndentationTokenSource {

    public TargetEnvironmentTokenSource(TokenSource delegate) {
        super(delegate);
    }

    @Override
    protected boolean shouldSplitTokenImpl(Token token) {
        // TODO Review assumption
        return token.getType() == InternalTargetEnvironmentParser.RULE_WS;
    }

    @Override
    protected int getBeginTokenType() {
        // TODO Review assumption
        return InternalTargetEnvironmentParser.RULE_INDENT;
    }

    @Override
    protected int getEndTokenType() {
        // TODO Review assumption
        return InternalTargetEnvironmentParser.RULE_DEDENT;
    }

    @Override
    protected boolean shouldEmitPendingEndTokens() {
        return false;
    }
}
