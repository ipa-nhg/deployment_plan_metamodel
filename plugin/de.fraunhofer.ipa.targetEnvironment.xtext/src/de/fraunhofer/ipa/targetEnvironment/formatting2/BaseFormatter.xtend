/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.targetEnvironment.services.BaseGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class BaseFormatter extends AbstractFormatter2 {
	
	@Inject extension BaseGrammarAccess
	
	override format(Object obj, IFormattableDocument document) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}