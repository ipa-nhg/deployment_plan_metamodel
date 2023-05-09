/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fraunhofer.ipa.deployment.ide.contentassist.antlr.internal.InternalImplementationDescriptionParser;
import de.fraunhofer.ipa.deployment.services.ImplementationDescriptionGrammarAccess;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ImplementationDescriptionParser extends AbstractContentAssistParser {

    @Singleton
    public static final class NameMappings {

        private final Map<AbstractElement, String> mappings;

        @Inject
        public NameMappings(ImplementationDescriptionGrammarAccess grammarAccess) {
            ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
            init(builder, grammarAccess);
            this.mappings = builder.build();
        }

        public String getRuleName(AbstractElement element) {
            return mappings.get(element);
        }

        private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ImplementationDescriptionGrammarAccess grammarAccess) {
            builder.put(grammarAccess.getExecutionRequirementAccess().getAlternatives(), "rule__ExecutionRequirement__Alternatives");
            builder.put(grammarAccess.getExecutionParameterAccess().getAlternatives(), "rule__ExecutionParameter__Alternatives");
            builder.put(grammarAccess.getAbstractPropertyAccess().getAlternatives(), "rule__AbstractProperty__Alternatives");
            builder.put(grammarAccess.getPropertyKindAccess().getAlternatives(), "rule__PropertyKind__Alternatives");
            builder.put(grammarAccess.getPropertyValueAccess().getAlternatives(), "rule__PropertyValue__Alternatives");
            builder.put(grammarAccess.getOpertingSystemResouceTypeAccess().getAlternatives(), "rule__OpertingSystemResouceType__Alternatives");
            builder.put(grammarAccess.getAbstractCommunicationTypeAccess().getAlternatives(), "rule__AbstractCommunicationType__Alternatives");
            builder.put(grammarAccess.getNetworkCommunicationTypeAccess().getAlternatives(), "rule__NetworkCommunicationType__Alternatives");
            builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
            builder.put(grammarAccess.getProcessorArchitectureTypeAccess().getAlternatives(), "rule__ProcessorArchitectureType__Alternatives");
            builder.put(grammarAccess.getLinuxDistributionAccess().getAlternatives(), "rule__LinuxDistribution__Alternatives");
            builder.put(grammarAccess.getUbuntuVersionAccess().getAlternatives(), "rule__UbuntuVersion__Alternatives");
            builder.put(grammarAccess.getImplementationDescriptionAccess().getGroup(), "rule__ImplementationDescription__Group__0");
            builder.put(grammarAccess.getSoftwareComponentAccess().getGroup(), "rule__SoftwareComponent__Group__0");
            builder.put(grammarAccess.getSoftwareComponentAccess().getGroup_9(), "rule__SoftwareComponent__Group_9__0");
            builder.put(grammarAccess.getRepositoryAccess().getGroup(), "rule__Repository__Group__0");
            builder.put(grammarAccess.getGitRepositoryTypeAccess().getGroup(), "rule__GitRepositoryType__Group__0");
            builder.put(grammarAccess.getDeviceRequirementAccess().getGroup(), "rule__DeviceRequirement__Group__0");
            builder.put(grammarAccess.getDeviceRequirementAccess().getGroup_5(), "rule__DeviceRequirement__Group_5__0");
            builder.put(grammarAccess.getSoftwareConfigurationRequirementAccess().getGroup(), "rule__SoftwareConfigurationRequirement__Group__0");
            builder.put(grammarAccess.getHWSWParemeterAccess().getGroup(), "rule__HWSWParemeter__Group__0");
            builder.put(grammarAccess.getHWSWParemeterAccess().getGroup_7(), "rule__HWSWParemeter__Group_7__0");
            builder.put(grammarAccess.getHWSWParemeterAccess().getGroup_8(), "rule__HWSWParemeter__Group_8__0");
            builder.put(grammarAccess.getHWSWParemeterAccess().getGroup_8_4(), "rule__HWSWParemeter__Group_8_4__0");
            builder.put(grammarAccess.getSoftwareExecutionParemeterAccess().getGroup(), "rule__SoftwareExecutionParemeter__Group__0");
            builder.put(grammarAccess.getSoftwareExecutionParemeterAccess().getGroup_7(), "rule__SoftwareExecutionParemeter__Group_7__0");
            builder.put(grammarAccess.getSoftwareExecutionParemeterAccess().getGroup_8(), "rule__SoftwareExecutionParemeter__Group_8__0");
            builder.put(grammarAccess.getSoftwareExecutionParemeterAccess().getGroup_8_4(), "rule__SoftwareExecutionParemeter__Group_8_4__0");
            builder.put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
            builder.put(grammarAccess.getResourceAccess().getGroup_5(), "rule__Resource__Group_5__0");
            builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
            builder.put(grammarAccess.getPropertyAccess().getGroup_6(), "rule__Property__Group_6__0");
            builder.put(grammarAccess.getPropertyAccess().getGroup_7(), "rule__Property__Group_7__0");
            builder.put(grammarAccess.getPropertyAccess().getGroup_7_4(), "rule__Property__Group_7_4__0");
            builder.put(grammarAccess.getPropertyAttributeAccess().getGroup(), "rule__PropertyAttribute__Group__0");
            builder.put(grammarAccess.getPropertyAttributeAccess().getGroup_6(), "rule__PropertyAttribute__Group_6__0");
            builder.put(grammarAccess.getPropertyAttributeAccess().getGroup_7(), "rule__PropertyAttribute__Group_7__0");
            builder.put(grammarAccess.getPropertyMaximunAccess().getGroup(), "rule__PropertyMaximun__Group__0");
            builder.put(grammarAccess.getPropertyMaximunAccess().getGroup_6(), "rule__PropertyMaximun__Group_6__0");
            builder.put(grammarAccess.getPropertyMaximunAccess().getGroup_7(), "rule__PropertyMaximun__Group_7__0");
            builder.put(grammarAccess.getPropertyMinimumAccess().getGroup(), "rule__PropertyMinimum__Group__0");
            builder.put(grammarAccess.getPropertyMinimumAccess().getGroup_6(), "rule__PropertyMinimum__Group_6__0");
            builder.put(grammarAccess.getPropertyMinimumAccess().getGroup_7(), "rule__PropertyMinimum__Group_7__0");
            builder.put(grammarAccess.getPropertySelectionAccess().getGroup(), "rule__PropertySelection__Group__0");
            builder.put(grammarAccess.getPropertySelectionAccess().getGroup_6(), "rule__PropertySelection__Group_6__0");
            builder.put(grammarAccess.getPropertySelectionAccess().getGroup_7(), "rule__PropertySelection__Group_7__0");
            builder.put(grammarAccess.getPropertySelectionAccess().getGroup_7_4(), "rule__PropertySelection__Group_7_4__0");
            builder.put(grammarAccess.getPropertyRangeAccess().getGroup(), "rule__PropertyRange__Group__0");
            builder.put(grammarAccess.getPropertyRangeAccess().getGroup_6(), "rule__PropertyRange__Group_6__0");
            builder.put(grammarAccess.getPropertyRangeAccess().getGroup_7(), "rule__PropertyRange__Group_7__0");
            builder.put(grammarAccess.getPropertyValueListAccess().getGroup(), "rule__PropertyValueList__Group__0");
            builder.put(grammarAccess.getPropertyValueListAccess().getGroup_3(), "rule__PropertyValueList__Group_3__0");
            builder.put(grammarAccess.getResourceTypeAccess().getGroup(), "rule__ResourceType__Group__0");
            builder.put(grammarAccess.getProcessorResouceTypeAccess().getGroup(), "rule__ProcessorResouceType__Group__0");
            builder.put(grammarAccess.getLinuxOpertingSystemAccess().getGroup(), "rule__LinuxOpertingSystem__Group__0");
            builder.put(grammarAccess.getMacOSOpertingSystemAccess().getGroup(), "rule__MacOSOpertingSystem__Group__0");
            builder.put(grammarAccess.getCommunicationTypeAccess().getGroup(), "rule__CommunicationType__Group__0");
            builder.put(grammarAccess.getEthernetCommunicationTypeAccess().getGroup(), "rule__EthernetCommunicationType__Group__0");
            builder.put(grammarAccess.getWlanCommunicationTypeAccess().getGroup(), "rule__WlanCommunicationType__Group__0");
            builder.put(grammarAccess.getUsbCommunicationTypeAccess().getGroup(), "rule__UsbCommunicationType__Group__0");
            builder.put(grammarAccess.getAttributeKindAccess().getGroup(), "rule__AttributeKind__Group__0");
            builder.put(grammarAccess.getMaximumKindAccess().getGroup(), "rule__MaximumKind__Group__0");
            builder.put(grammarAccess.getMinimumKindAccess().getGroup(), "rule__MinimumKind__Group__0");
            builder.put(grammarAccess.getSelectionKindAccess().getGroup(), "rule__SelectionKind__Group__0");
            builder.put(grammarAccess.getRangeKindAccess().getGroup(), "rule__RangeKind__Group__0");
            builder.put(grammarAccess.getLinuxDistributionValueAccess().getGroup(), "rule__LinuxDistributionValue__Group__0");
            builder.put(grammarAccess.getUbuntuVersionValueAccess().getGroup(), "rule__UbuntuVersionValue__Group__0");
            builder.put(grammarAccess.getImplementationDescriptionAccess().getNameAssignment_3(), "rule__ImplementationDescription__NameAssignment_3");
            builder.put(grammarAccess.getImplementationDescriptionAccess().getIncludeSoftwareComponentsAssignment_6(), "rule__ImplementationDescription__IncludeSoftwareComponentsAssignment_6");
            builder.put(grammarAccess.getSoftwareComponentAccess().getNameAssignment_3(), "rule__SoftwareComponent__NameAssignment_3");
            builder.put(grammarAccess.getSoftwareComponentAccess().getRepositoryAssignment_7(), "rule__SoftwareComponent__RepositoryAssignment_7");
            builder.put(grammarAccess.getSoftwareComponentAccess().getExecutionRequirementAssignment_9_2(), "rule__SoftwareComponent__ExecutionRequirementAssignment_9_2");
            builder.put(grammarAccess.getRepositoryAccess().getTypeAssignment_1(), "rule__Repository__TypeAssignment_1");
            builder.put(grammarAccess.getRepositoryAccess().getUrlAssignment_3(), "rule__Repository__UrlAssignment_3");
            builder.put(grammarAccess.getRepositoryAccess().getVersionAssignment_5(), "rule__Repository__VersionAssignment_5");
            builder.put(grammarAccess.getDeviceRequirementAccess().getTypeAssignment_4(), "rule__DeviceRequirement__TypeAssignment_4");
            builder.put(grammarAccess.getDeviceRequirementAccess().getParameterAssignment_5_3(), "rule__DeviceRequirement__ParameterAssignment_5_3");
            builder.put(grammarAccess.getSoftwareConfigurationRequirementAccess().getParameterAssignment_2(), "rule__SoftwareConfigurationRequirement__ParameterAssignment_2");
            builder.put(grammarAccess.getHWSWParemeterAccess().getNameAssignment_3(), "rule__HWSWParemeter__NameAssignment_3");
            builder.put(grammarAccess.getHWSWParemeterAccess().getKindAssignment_6(), "rule__HWSWParemeter__KindAssignment_6");
            builder.put(grammarAccess.getHWSWParemeterAccess().getDescriptionAssignment_7_1(), "rule__HWSWParemeter__DescriptionAssignment_7_1");
            builder.put(grammarAccess.getHWSWParemeterAccess().getValueAssignment_8_3(), "rule__HWSWParemeter__ValueAssignment_8_3");
            builder.put(grammarAccess.getHWSWParemeterAccess().getValueAssignment_8_4_1(), "rule__HWSWParemeter__ValueAssignment_8_4_1");
            builder.put(grammarAccess.getSoftwareExecutionParemeterAccess().getNameAssignment_3(), "rule__SoftwareExecutionParemeter__NameAssignment_3");
            builder.put(grammarAccess.getSoftwareExecutionParemeterAccess().getKindAssignment_6(), "rule__SoftwareExecutionParemeter__KindAssignment_6");
            builder.put(grammarAccess.getSoftwareExecutionParemeterAccess().getDescriptionAssignment_7_1(), "rule__SoftwareExecutionParemeter__DescriptionAssignment_7_1");
            builder.put(grammarAccess.getSoftwareExecutionParemeterAccess().getValueAssignment_8_3(), "rule__SoftwareExecutionParemeter__ValueAssignment_8_3");
            builder.put(grammarAccess.getSoftwareExecutionParemeterAccess().getValueAssignment_8_4_1(), "rule__SoftwareExecutionParemeter__ValueAssignment_8_4_1");
            builder.put(grammarAccess.getResourceAccess().getNameAssignment_1(), "rule__Resource__NameAssignment_1");
            builder.put(grammarAccess.getResourceAccess().getTypeAssignment_4(), "rule__Resource__TypeAssignment_4");
            builder.put(grammarAccess.getResourceAccess().getPropertiesAssignment_5_2(), "rule__Resource__PropertiesAssignment_5_2");
            builder.put(grammarAccess.getResourceAccess().getPropertiesAssignment_5_3(), "rule__Resource__PropertiesAssignment_5_3");
            builder.put(grammarAccess.getPropertyAccess().getNameAssignment_2(), "rule__Property__NameAssignment_2");
            builder.put(grammarAccess.getPropertyAccess().getKindAssignment_5(), "rule__Property__KindAssignment_5");
            builder.put(grammarAccess.getPropertyAccess().getDescriptionAssignment_6_1(), "rule__Property__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyAccess().getValueAssignment_7_3(), "rule__Property__ValueAssignment_7_3");
            builder.put(grammarAccess.getPropertyAccess().getValueAssignment_7_4_1(), "rule__Property__ValueAssignment_7_4_1");
            builder.put(grammarAccess.getPropertyAttributeAccess().getNameAssignment_2(), "rule__PropertyAttribute__NameAssignment_2");
            builder.put(grammarAccess.getPropertyAttributeAccess().getKindAssignment_5(), "rule__PropertyAttribute__KindAssignment_5");
            builder.put(grammarAccess.getPropertyAttributeAccess().getDescriptionAssignment_6_1(), "rule__PropertyAttribute__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyAttributeAccess().getValueAssignment_7_1(), "rule__PropertyAttribute__ValueAssignment_7_1");
            builder.put(grammarAccess.getPropertyMaximunAccess().getNameAssignment_2(), "rule__PropertyMaximun__NameAssignment_2");
            builder.put(grammarAccess.getPropertyMaximunAccess().getKindAssignment_5(), "rule__PropertyMaximun__KindAssignment_5");
            builder.put(grammarAccess.getPropertyMaximunAccess().getDescriptionAssignment_6_1(), "rule__PropertyMaximun__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyMaximunAccess().getValueAssignment_7_1(), "rule__PropertyMaximun__ValueAssignment_7_1");
            builder.put(grammarAccess.getPropertyMinimumAccess().getNameAssignment_2(), "rule__PropertyMinimum__NameAssignment_2");
            builder.put(grammarAccess.getPropertyMinimumAccess().getKindAssignment_5(), "rule__PropertyMinimum__KindAssignment_5");
            builder.put(grammarAccess.getPropertyMinimumAccess().getDescriptionAssignment_6_1(), "rule__PropertyMinimum__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyMinimumAccess().getValueAssignment_7_1(), "rule__PropertyMinimum__ValueAssignment_7_1");
            builder.put(grammarAccess.getPropertySelectionAccess().getNameAssignment_2(), "rule__PropertySelection__NameAssignment_2");
            builder.put(grammarAccess.getPropertySelectionAccess().getKindAssignment_5(), "rule__PropertySelection__KindAssignment_5");
            builder.put(grammarAccess.getPropertySelectionAccess().getDescriptionAssignment_6_1(), "rule__PropertySelection__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_3(), "rule__PropertySelection__ValueAssignment_7_3");
            builder.put(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_4_1(), "rule__PropertySelection__ValueAssignment_7_4_1");
            builder.put(grammarAccess.getPropertyRangeAccess().getNameAssignment_2(), "rule__PropertyRange__NameAssignment_2");
            builder.put(grammarAccess.getPropertyRangeAccess().getKindAssignment_5(), "rule__PropertyRange__KindAssignment_5");
            builder.put(grammarAccess.getPropertyRangeAccess().getDescriptionAssignment_6_1(), "rule__PropertyRange__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_3(), "rule__PropertyRange__ValueAssignment_7_3");
            builder.put(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_5(), "rule__PropertyRange__ValueAssignment_7_5");
            builder.put(grammarAccess.getPropertyValueIntAccess().getValueAssignment(), "rule__PropertyValueInt__ValueAssignment");
            builder.put(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment(), "rule__PropertyValueDouble__ValueAssignment");
            builder.put(grammarAccess.getPropertyValueStringAccess().getValueAssignment(), "rule__PropertyValueString__ValueAssignment");
            builder.put(grammarAccess.getPropertyValueListAccess().getValueAssignment_2(), "rule__PropertyValueList__ValueAssignment_2");
            builder.put(grammarAccess.getPropertyValueListAccess().getValueAssignment_3_1(), "rule__PropertyValueList__ValueAssignment_3_1");
            builder.put(grammarAccess.getProcessorArchitectureValueAccess().getValueAssignment(), "rule__ProcessorArchitectureValue__ValueAssignment");
            builder.put(grammarAccess.getResourceTypeAccess().getNameAssignment_1(), "rule__ResourceType__NameAssignment_1");
            builder.put(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1(), "rule__CommunicationType__NameAssignment_1");
            builder.put(grammarAccess.getLinuxDistributionValueAccess().getValueAssignment_1(), "rule__LinuxDistributionValue__ValueAssignment_1");
            builder.put(grammarAccess.getUbuntuVersionValueAccess().getValueAssignment_1(), "rule__UbuntuVersionValue__ValueAssignment_1");
        }
    }

    @Inject
    private NameMappings nameMappings;

    @Inject
    private ImplementationDescriptionGrammarAccess grammarAccess;

    @Override
    protected InternalImplementationDescriptionParser createParser() {
        InternalImplementationDescriptionParser result = new InternalImplementationDescriptionParser(null);
        result.setGrammarAccess(grammarAccess);
        return result;
    }

    @Override
    protected TokenSource createLexer(CharStream stream) {
        return new ImplementationDescriptionTokenSource(super.createLexer(stream));
    }

    @Override
    protected String getRuleName(AbstractElement element) {
        return nameMappings.getRuleName(element);
    }

    @Override
    protected String[] getInitialHiddenTokens() {
        return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
    }

    public ImplementationDescriptionGrammarAccess getGrammarAccess() {
        return this.grammarAccess;
    }

    public void setGrammarAccess(ImplementationDescriptionGrammarAccess grammarAccess) {
        this.grammarAccess = grammarAccess;
    }

    public NameMappings getNameMappings() {
        return nameMappings;
    }

    public void setNameMappings(NameMappings nameMappings) {
        this.nameMappings = nameMappings;
    }
}
