/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fraunhofer.ipa.deployment.ide.contentassist.antlr.internal.InternalPlanParser;
import de.fraunhofer.ipa.deployment.services.PlanGrammarAccess;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PlanParser extends AbstractContentAssistParser {

  @Singleton
  public static final class NameMappings {

    private final Map<AbstractElement, String> mappings;

    @Inject
    public NameMappings(PlanGrammarAccess grammarAccess) {
      ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
      init(builder, grammarAccess);
      this.mappings = builder.build();
    }

    public String getRuleName(AbstractElement element) {
      return mappings.get(element);
    }

    private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PlanGrammarAccess grammarAccess) {
      builder.put(grammarAccess.getAbstractOperatingSystemPropertyAccess().getAlternatives(), "rule__AbstractOperatingSystemProperty__Alternatives");
      builder.put(grammarAccess.getAbstractPropertyAccess().getAlternatives(), "rule__AbstractProperty__Alternatives");
      builder.put(grammarAccess.getPropertyKindAccess().getAlternatives(), "rule__PropertyKind__Alternatives");
      builder.put(grammarAccess.getPropertyValueAccess().getAlternatives(), "rule__PropertyValue__Alternatives");
      builder.put(grammarAccess.getOpertingSystemResouceTypeAccess().getAlternatives(), "rule__OpertingSystemResouceType__Alternatives");
      builder.put(grammarAccess.getAbstractCommunicationTypeAccess().getAlternatives(), "rule__AbstractCommunicationType__Alternatives");
      builder.put(grammarAccess.getNetworkCommunicationTypeAccess().getAlternatives(), "rule__NetworkCommunicationType__Alternatives");
      builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
      builder.put(grammarAccess.getROSDistroAccess().getAlternatives(), "rule__ROSDistro__Alternatives");
      builder.put(grammarAccess.getProcessorArchitectureTypeAccess().getAlternatives(), "rule__ProcessorArchitectureType__Alternatives");
      builder.put(grammarAccess.getLinuxDistributionAccess().getAlternatives(), "rule__LinuxDistribution__Alternatives");
      builder.put(grammarAccess.getUbuntuVersionAccess().getAlternatives(), "rule__UbuntuVersion__Alternatives");
      builder.put(grammarAccess.getDeploymentPlanAccess().getGroup(), "rule__DeploymentPlan__Group__0");
      builder.put(grammarAccess.getRealizationAccess().getGroup(), "rule__Realization__Group__0");
      builder.put(grammarAccess.getRealizationAccess().getGroup_1(), "rule__Realization__Group_1__0");
      builder.put(grammarAccess.getConfigSoftwareComponentAccess().getGroup(), "rule__ConfigSoftwareComponent__Group__0");
      builder.put(grammarAccess.getConfigSoftwareComponentAccess().getGroup_1(), "rule__ConfigSoftwareComponent__Group_1__0");
      builder.put(grammarAccess.getConfigSoftwareComponentAccess().getGroup_1_1(), "rule__ConfigSoftwareComponent__Group_1_1__0");
      builder.put(grammarAccess.getConfigSoftwareComponentAccess().getGroup_1_2(), "rule__ConfigSoftwareComponent__Group_1_2__0");
      builder.put(grammarAccess.getConfigSoftwareComponentAccess().getGroup_1_2_4(), "rule__ConfigSoftwareComponent__Group_1_2_4__0");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getGroup(), "rule__ImplementationAssignment__Group__0");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getGroup_12(), "rule__ImplementationAssignment__Group_12__0");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getGroup_14(), "rule__ImplementationAssignment__Group_14__0");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getGroup_15(), "rule__ImplementationAssignment__Group_15__0");
      builder.put(grammarAccess.getContainerRuntimeAccess().getGroup(), "rule__ContainerRuntime__Group__0");
      builder.put(grammarAccess.getContainerRuntimeAccess().getGroup_4(), "rule__ContainerRuntime__Group_4__0");
      builder.put(grammarAccess.getContainerRuntimeAccess().getGroup_5(), "rule__ContainerRuntime__Group_5__0");
      builder.put(grammarAccess.getContainerRuntimeAccess().getGroup_5_4(), "rule__ContainerRuntime__Group_5_4__0");
      builder.put(grammarAccess.getConfigExecutionParameterAccess().getGroup(), "rule__ConfigExecutionParameter__Group__0");
      builder.put(grammarAccess.getConfigExecutionParameterAccess().getGroup_5(), "rule__ConfigExecutionParameter__Group_5__0");
      builder.put(grammarAccess.getConfigExecutionParameterAccess().getGroup_6(), "rule__ConfigExecutionParameter__Group_6__0");
      builder.put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
      builder.put(grammarAccess.getResourceAccess().getGroup_5(), "rule__Resource__Group_5__0");
      builder.put(grammarAccess.getOperatingSystemResouceAccess().getGroup(), "rule__OperatingSystemResouce__Group__0");
      builder.put(grammarAccess.getOperatingSystemResouceAccess().getGroup_6(), "rule__OperatingSystemResouce__Group_6__0");
      builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup(), "rule__NameOperatingSystemProperty__Group__0");
      builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup_7(), "rule__NameOperatingSystemProperty__Group_7__0");
      builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup_8(), "rule__NameOperatingSystemProperty__Group_8__0");
      builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup(), "rule__VersionOperatingSystemProperty__Group__0");
      builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup_7(), "rule__VersionOperatingSystemProperty__Group_7__0");
      builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup_8(), "rule__VersionOperatingSystemProperty__Group_8__0");
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
      builder.put(grammarAccess.getDeploymentPlanAccess().getNameAssignment_3(), "rule__DeploymentPlan__NameAssignment_3");
      builder.put(grammarAccess.getDeploymentPlanAccess().getDeployToAssignment_5(), "rule__DeploymentPlan__DeployToAssignment_5");
      builder.put(grammarAccess.getDeploymentPlanAccess().getRealizeAssignment_6(), "rule__DeploymentPlan__RealizeAssignment_6");
      builder.put(grammarAccess.getRealizationAccess().getRealizationsAssignment_1_2(), "rule__Realization__RealizationsAssignment_1_2");
      builder.put(grammarAccess.getConfigSoftwareComponentAccess().getComponentAssignment_0(), "rule__ConfigSoftwareComponent__ComponentAssignment_0");
      builder.put(grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationAssignment_1_1_3(), "rule__ConfigSoftwareComponent__ExecutionConfigurationAssignment_1_1_3");
      builder.put(grammarAccess.getConfigSoftwareComponentAccess().getStartCommandAssignment_1_2_3(), "rule__ConfigSoftwareComponent__StartCommandAssignment_1_2_3");
      builder.put(grammarAccess.getConfigSoftwareComponentAccess().getStartCommandAssignment_1_2_4_1(), "rule__ConfigSoftwareComponent__StartCommandAssignment_1_2_4_1");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getNameAssignment_2(), "rule__ImplementationAssignment__NameAssignment_2");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getExecutedByAssignment_5(), "rule__ImplementationAssignment__ExecutedByAssignment_5");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getVersionAssignment_7(), "rule__ImplementationAssignment__VersionAssignment_7");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getSoftwareComponentsAssignment_11(), "rule__ImplementationAssignment__SoftwareComponentsAssignment_11");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getSoftwareComponentsAssignment_12_1(), "rule__ImplementationAssignment__SoftwareComponentsAssignment_12_1");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getMiddlewareAssignment_14_1(), "rule__ImplementationAssignment__MiddlewareAssignment_14_1");
      builder.put(grammarAccess.getImplementationAssignmentAccess().getRuntimeTypeAssignment_15_1(), "rule__ImplementationAssignment__RuntimeTypeAssignment_15_1");
      builder.put(grammarAccess.getRosMiddlewareAccess().getValueAssignment(), "rule__RosMiddleware__ValueAssignment");
      builder.put(grammarAccess.getContainerRuntimeAccess().getTypeAssignment_3(), "rule__ContainerRuntime__TypeAssignment_3");
      builder.put(grammarAccess.getContainerRuntimeAccess().getRegistryAssignment_4_1(), "rule__ContainerRuntime__RegistryAssignment_4_1");
      builder.put(grammarAccess.getContainerRuntimeAccess().getOpertingSystemResourceAssignment_5_3(), "rule__ContainerRuntime__OpertingSystemResourceAssignment_5_3");
      builder.put(grammarAccess.getContainerRuntimeAccess().getOpertingSystemResourceAssignment_5_4_1(), "rule__ContainerRuntime__OpertingSystemResourceAssignment_5_4_1");
      builder.put(grammarAccess.getConfigExecutionParameterAccess().getFromAssignment_3(), "rule__ConfigExecutionParameter__FromAssignment_3");
      builder.put(grammarAccess.getConfigExecutionParameterAccess().getToAssignment_5_1(), "rule__ConfigExecutionParameter__ToAssignment_5_1");
      builder.put(grammarAccess.getConfigExecutionParameterAccess().getValueAssignment_6_1(), "rule__ConfigExecutionParameter__ValueAssignment_6_1");
      builder.put(grammarAccess.getResourceAccess().getNameAssignment_1(), "rule__Resource__NameAssignment_1");
      builder.put(grammarAccess.getResourceAccess().getTypeAssignment_4(), "rule__Resource__TypeAssignment_4");
      builder.put(grammarAccess.getResourceAccess().getPropertiesAssignment_5_2(), "rule__Resource__PropertiesAssignment_5_2");
      builder.put(grammarAccess.getResourceAccess().getPropertiesAssignment_5_3(), "rule__Resource__PropertiesAssignment_5_3");
      builder.put(grammarAccess.getOperatingSystemResouceAccess().getNameAssignment_2(), "rule__OperatingSystemResouce__NameAssignment_2");
      builder.put(grammarAccess.getOperatingSystemResouceAccess().getTypeAssignment_5(), "rule__OperatingSystemResouce__TypeAssignment_5");
      builder.put(grammarAccess.getOperatingSystemResouceAccess().getPropertiesAssignment_6_2(), "rule__OperatingSystemResouce__PropertiesAssignment_6_2");
      builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getNameAssignment_3(), "rule__NameOperatingSystemProperty__NameAssignment_3");
      builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAssignment_6(), "rule__NameOperatingSystemProperty__KindAssignment_6");
      builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionAssignment_7_1(), "rule__NameOperatingSystemProperty__DescriptionAssignment_7_1");
      builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getValueAssignment_8_1(), "rule__NameOperatingSystemProperty__ValueAssignment_8_1");
      builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameAssignment_3(), "rule__VersionOperatingSystemProperty__NameAssignment_3");
      builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAssignment_6(), "rule__VersionOperatingSystemProperty__KindAssignment_6");
      builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionAssignment_7_1(), "rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1");
      builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getValueAssignment_8_1(), "rule__VersionOperatingSystemProperty__ValueAssignment_8_1");
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
  private PlanGrammarAccess grammarAccess;

  @Override
  protected InternalPlanParser createParser() {
    InternalPlanParser result = new InternalPlanParser(null);
    result.setGrammarAccess(grammarAccess);
    return result;
  }

  @Override
  protected TokenSource createLexer(CharStream stream) {
    return new PlanTokenSource(super.createLexer(stream));
  }

  @Override
  protected String getRuleName(AbstractElement element) {
    return nameMappings.getRuleName(element);
  }

  @Override
  protected String[] getInitialHiddenTokens() {
    return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
  }

  public PlanGrammarAccess getGrammarAccess() {
    return this.grammarAccess;
  }

  public void setGrammarAccess(PlanGrammarAccess grammarAccess) {
    this.grammarAccess = grammarAccess;
  }

  public NameMappings getNameMappings() {
    return nameMappings;
  }

  public void setNameMappings(NameMappings nameMappings) {
    this.nameMappings = nameMappings;
  }
}
