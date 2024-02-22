/*
 * generated by Xtext 2.33.0
 */
package de.fraunhofer.ipa.deployment.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.deployment.services.UtilGrammarAccess;
import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;
import de.fraunhofer.ipa.deployment.util.AttributeKind;
import de.fraunhofer.ipa.deployment.util.CommunicationType;
import de.fraunhofer.ipa.deployment.util.Description;
import de.fraunhofer.ipa.deployment.util.EthernetCommunicationType;
import de.fraunhofer.ipa.deployment.util.LinuxDistributionValue;
import de.fraunhofer.ipa.deployment.util.LinuxOpertingSystem;
import de.fraunhofer.ipa.deployment.util.MacOSOpertingSystem;
import de.fraunhofer.ipa.deployment.util.MaximumKind;
import de.fraunhofer.ipa.deployment.util.MinimumKind;
import de.fraunhofer.ipa.deployment.util.NameOperatingSystemProperty;
import de.fraunhofer.ipa.deployment.util.OperatingSystemResouce;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue;
import de.fraunhofer.ipa.deployment.util.ProcessorResouceType;
import de.fraunhofer.ipa.deployment.util.Property;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;
import de.fraunhofer.ipa.deployment.util.PropertyMaximun;
import de.fraunhofer.ipa.deployment.util.PropertyMinimum;
import de.fraunhofer.ipa.deployment.util.PropertyRange;
import de.fraunhofer.ipa.deployment.util.PropertySelection;
import de.fraunhofer.ipa.deployment.util.PropertyValueDouble;
import de.fraunhofer.ipa.deployment.util.PropertyValueInt;
import de.fraunhofer.ipa.deployment.util.PropertyValueList;
import de.fraunhofer.ipa.deployment.util.PropertyValueString;
import de.fraunhofer.ipa.deployment.util.RangeKind;
import de.fraunhofer.ipa.deployment.util.Resource;
import de.fraunhofer.ipa.deployment.util.ResourceType;
import de.fraunhofer.ipa.deployment.util.SelectionKind;
import de.fraunhofer.ipa.deployment.util.UbuntuVersionValue;
import de.fraunhofer.ipa.deployment.util.UsbCommunicationType;
import de.fraunhofer.ipa.deployment.util.UtilPackage;
import de.fraunhofer.ipa.deployment.util.VersionOperatingSystemProperty;
import de.fraunhofer.ipa.deployment.util.WlanCommunicationType;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class UtilSemanticSequencer extends AbstractDelegatingSemanticSequencer {

  @Inject
  private UtilGrammarAccess grammarAccess;

  @Override
  public void sequence(ISerializationContext context, EObject semanticObject) {
    EPackage epackage = semanticObject.eClass().getEPackage();
    ParserRule rule = context.getParserRule();
    Action action = context.getAssignedAction();
    Set<Parameter> parameters = context.getEnabledBooleanParameters();
    if (epackage == UtilPackage.eINSTANCE)
      switch (semanticObject.eClass().getClassifierID()) {
      case UtilPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET:
        sequence_AbstractComputationAssignmentTarget(context, (AbstractComputationAssignmentTarget) semanticObject);
        return;
      case UtilPackage.ATTRIBUTE_KIND:
        sequence_AttributeKind(context, (AttributeKind) semanticObject);
        return;
      case UtilPackage.COMMUNICATION_TYPE:
        sequence_CommunicationType(context, (CommunicationType) semanticObject);
        return;
      case UtilPackage.DESCRIPTION:
        sequence_Description(context, (Description) semanticObject);
        return;
      case UtilPackage.ETHERNET_COMMUNICATION_TYPE:
        sequence_EthernetCommunicationType(context, (EthernetCommunicationType) semanticObject);
        return;
      case UtilPackage.LINUX_DISTRIBUTION_VALUE:
        sequence_LinuxDistributionValue(context, (LinuxDistributionValue) semanticObject);
        return;
      case UtilPackage.LINUX_OPERTING_SYSTEM:
        sequence_LinuxOpertingSystem(context, (LinuxOpertingSystem) semanticObject);
        return;
      case UtilPackage.MAC_OS_OPERTING_SYSTEM:
        sequence_MacOSOpertingSystem(context, (MacOSOpertingSystem) semanticObject);
        return;
      case UtilPackage.MAXIMUM_KIND:
        sequence_MaximumKind(context, (MaximumKind) semanticObject);
        return;
      case UtilPackage.MINIMUM_KIND:
        sequence_MinimumKind(context, (MinimumKind) semanticObject);
        return;
      case UtilPackage.NAME_OPERATING_SYSTEM_PROPERTY:
        sequence_NameOperatingSystemProperty(context, (NameOperatingSystemProperty) semanticObject);
        return;
      case UtilPackage.OPERATING_SYSTEM_RESOUCE:
        sequence_OperatingSystemResouce(context, (OperatingSystemResouce) semanticObject);
        return;
      case UtilPackage.PROCESSOR_ARCHITECTURE_VALUE:
        sequence_ProcessorArchitectureValue(context, (ProcessorArchitectureValue) semanticObject);
        return;
      case UtilPackage.PROCESSOR_RESOUCE_TYPE:
        sequence_ProcessorResouceType(context, (ProcessorResouceType) semanticObject);
        return;
      case UtilPackage.PROPERTY:
        sequence_Property(context, (Property) semanticObject);
        return;
      case UtilPackage.PROPERTY_ATTRIBUTE:
        sequence_PropertyAttribute(context, (PropertyAttribute) semanticObject);
        return;
      case UtilPackage.PROPERTY_MAXIMUN:
        sequence_PropertyMaximun(context, (PropertyMaximun) semanticObject);
        return;
      case UtilPackage.PROPERTY_MINIMUM:
        sequence_PropertyMinimum(context, (PropertyMinimum) semanticObject);
        return;
      case UtilPackage.PROPERTY_RANGE:
        sequence_PropertyRange(context, (PropertyRange) semanticObject);
        return;
      case UtilPackage.PROPERTY_SELECTION:
        sequence_PropertySelection(context, (PropertySelection) semanticObject);
        return;
      case UtilPackage.PROPERTY_VALUE_DOUBLE:
        sequence_PropertyValueDouble(context, (PropertyValueDouble) semanticObject);
        return;
      case UtilPackage.PROPERTY_VALUE_INT:
        sequence_PropertyValueInt(context, (PropertyValueInt) semanticObject);
        return;
      case UtilPackage.PROPERTY_VALUE_LIST:
        sequence_PropertyValueList(context, (PropertyValueList) semanticObject);
        return;
      case UtilPackage.PROPERTY_VALUE_STRING:
        sequence_PropertyValueString(context, (PropertyValueString) semanticObject);
        return;
      case UtilPackage.RANGE_KIND:
        sequence_RangeKind(context, (RangeKind) semanticObject);
        return;
      case UtilPackage.RESOURCE:
        sequence_Resource(context, (Resource) semanticObject);
        return;
      case UtilPackage.RESOURCE_TYPE:
        sequence_ResourceType(context, (ResourceType) semanticObject);
        return;
      case UtilPackage.SELECTION_KIND:
        sequence_SelectionKind(context, (SelectionKind) semanticObject);
        return;
      case UtilPackage.UBUNTU_VERSION_VALUE:
        sequence_UbuntuVersionValue(context, (UbuntuVersionValue) semanticObject);
        return;
      case UtilPackage.USB_COMMUNICATION_TYPE:
        sequence_UsbCommunicationType(context, (UsbCommunicationType) semanticObject);
        return;
      case UtilPackage.VERSION_OPERATING_SYSTEM_PROPERTY:
        sequence_VersionOperatingSystemProperty(context, (VersionOperatingSystemProperty) semanticObject);
        return;
      case UtilPackage.WLAN_COMMUNICATION_TYPE:
        sequence_WlanCommunicationType(context, (WlanCommunicationType) semanticObject);
        return;
      }
    if (errorAcceptor != null)
      errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
  }

  /**
   * <pre>
   * Contexts:
   *     AbstractComputationAssignmentTarget returns AbstractComputationAssignmentTarget
   *
   * Constraint:
   *     {AbstractComputationAssignmentTarget}
   * </pre>
   */
  protected void sequence_AbstractComputationAssignmentTarget(ISerializationContext context, AbstractComputationAssignmentTarget semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyKind returns AttributeKind
   *     AttributeKind returns AttributeKind
   *
   * Constraint:
   *     {AttributeKind}
   * </pre>
   */
  protected void sequence_AttributeKind(ISerializationContext context, AttributeKind semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractCommunicationType returns CommunicationType
   *     CommunicationType returns CommunicationType
   *
   * Constraint:
   *     name=EString
   * </pre>
   */
  protected void sequence_CommunicationType(ISerializationContext context, CommunicationType semanticObject) {
    if (errorAcceptor != null) {
      if (transientValues.isValueTransient(semanticObject, UtilPackage.Literals.COMMUNICATION_TYPE__NAME) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.COMMUNICATION_TYPE__NAME));
    }
    SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
    feeder.accept(grammarAccess.getCommunicationTypeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
    feeder.finish();
  }


  /**
   * <pre>
   * Contexts:
   *     Description returns Description
   *
   * Constraint:
   *     {Description}
   * </pre>
   */
  protected void sequence_Description(ISerializationContext context, Description semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractCommunicationType returns EthernetCommunicationType
   *     NetworkCommunicationType returns EthernetCommunicationType
   *     EthernetCommunicationType returns EthernetCommunicationType
   *
   * Constraint:
   *     {EthernetCommunicationType}
   * </pre>
   */
  protected void sequence_EthernetCommunicationType(ISerializationContext context, EthernetCommunicationType semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyValue returns LinuxDistributionValue
   *     LinuxDistributionValue returns LinuxDistributionValue
   *     OpertingSystemName returns LinuxDistributionValue
   *
   * Constraint:
   *     value=LinuxDistribution
   * </pre>
   */
  protected void sequence_LinuxDistributionValue(ISerializationContext context, LinuxDistributionValue semanticObject) {
    if (errorAcceptor != null) {
      if (transientValues.isValueTransient(semanticObject, UtilPackage.Literals.LINUX_DISTRIBUTION_VALUE__VALUE) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.LINUX_DISTRIBUTION_VALUE__VALUE));
    }
    SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
    feeder.accept(grammarAccess.getLinuxDistributionValueAccess().getValueLinuxDistributionEnumRuleCall_1_0(), semanticObject.getValue());
    feeder.finish();
  }


  /**
   * <pre>
   * Contexts:
   *     OpertingSystemResouceType returns LinuxOpertingSystem
   *     LinuxOpertingSystem returns LinuxOpertingSystem
   *
   * Constraint:
   *     {LinuxOpertingSystem}
   * </pre>
   */
  protected void sequence_LinuxOpertingSystem(ISerializationContext context, LinuxOpertingSystem semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     OpertingSystemResouceType returns MacOSOpertingSystem
   *     MacOSOpertingSystem returns MacOSOpertingSystem
   *
   * Constraint:
   *     {MacOSOpertingSystem}
   * </pre>
   */
  protected void sequence_MacOSOpertingSystem(ISerializationContext context, MacOSOpertingSystem semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyKind returns MaximumKind
   *     MaximumKind returns MaximumKind
   *
   * Constraint:
   *     {MaximumKind}
   * </pre>
   */
  protected void sequence_MaximumKind(ISerializationContext context, MaximumKind semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyKind returns MinimumKind
   *     MinimumKind returns MinimumKind
   *
   * Constraint:
   *     {MinimumKind}
   * </pre>
   */
  protected void sequence_MinimumKind(ISerializationContext context, MinimumKind semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractOperatingSystemProperty returns NameOperatingSystemProperty
   *     NameOperatingSystemProperty returns NameOperatingSystemProperty
   *
   * Constraint:
   *     (name='os_name' kind=AttributeKind description=EString? value=PropertyValue?)
   * </pre>
   */
  protected void sequence_NameOperatingSystemProperty(ISerializationContext context, NameOperatingSystemProperty semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     OperatingSystemResouce returns OperatingSystemResouce
   *
   * Constraint:
   *     (name=EString type=OpertingSystemResouceType properties+=AbstractOperatingSystemProperty*)
   * </pre>
   */
  protected void sequence_OperatingSystemResouce(ISerializationContext context, OperatingSystemResouce semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyValue returns ProcessorArchitectureValue
   *     ProcessorArchitectureValue returns ProcessorArchitectureValue
   *
   * Constraint:
   *     value=ProcessorArchitectureType
   * </pre>
   */
  protected void sequence_ProcessorArchitectureValue(ISerializationContext context, ProcessorArchitectureValue semanticObject) {
    if (errorAcceptor != null) {
      if (transientValues.isValueTransient(semanticObject, UtilPackage.Literals.PROCESSOR_ARCHITECTURE_VALUE__VALUE) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.PROCESSOR_ARCHITECTURE_VALUE__VALUE));
    }
    SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
    feeder.accept(grammarAccess.getProcessorArchitectureValueAccess().getValueProcessorArchitectureTypeEnumRuleCall_0(), semanticObject.getValue());
    feeder.finish();
  }


  /**
   * <pre>
   * Contexts:
   *     ProcessorResouceType returns ProcessorResouceType
   *
   * Constraint:
   *     {ProcessorResouceType}
   * </pre>
   */
  protected void sequence_ProcessorResouceType(ISerializationContext context, ProcessorResouceType semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractProperty returns PropertyAttribute
   *     PropertyAttribute returns PropertyAttribute
   *
   * Constraint:
   *     (name=EString kind=AttributeKind description=EString? value=PropertyValue?)
   * </pre>
   */
  protected void sequence_PropertyAttribute(ISerializationContext context, PropertyAttribute semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractProperty returns PropertyMaximun
   *     PropertyMaximun returns PropertyMaximun
   *
   * Constraint:
   *     (name=EString kind=MaximumKind description=EString? value=PropertyValue?)
   * </pre>
   */
  protected void sequence_PropertyMaximun(ISerializationContext context, PropertyMaximun semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractProperty returns PropertyMinimum
   *     PropertyMinimum returns PropertyMinimum
   *
   * Constraint:
   *     (name=EString kind=MinimumKind description=EString? value=PropertyValue?)
   * </pre>
   */
  protected void sequence_PropertyMinimum(ISerializationContext context, PropertyMinimum semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractProperty returns PropertyRange
   *     PropertyRange returns PropertyRange
   *
   * Constraint:
   *     (name=EString kind=RangeKind description=EString? (value+=PropertyValue value+=PropertyValue)?)
   * </pre>
   */
  protected void sequence_PropertyRange(ISerializationContext context, PropertyRange semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractProperty returns PropertySelection
   *     PropertySelection returns PropertySelection
   *
   * Constraint:
   *     (name=EString kind=SelectionKind description=EString? (value+=PropertyValue value+=PropertyValue*)?)
   * </pre>
   */
  protected void sequence_PropertySelection(ISerializationContext context, PropertySelection semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyValue returns PropertyValueDouble
   *     PropertyValueDouble returns PropertyValueDouble
   *
   * Constraint:
   *     value=Double0
   * </pre>
   */
  protected void sequence_PropertyValueDouble(ISerializationContext context, PropertyValueDouble semanticObject) {
    if (errorAcceptor != null) {
      if (transientValues.isValueTransient(semanticObject, UtilPackage.Literals.PROPERTY_VALUE_DOUBLE__VALUE) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.PROPERTY_VALUE_DOUBLE__VALUE));
    }
    SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
    feeder.accept(grammarAccess.getPropertyValueDoubleAccess().getValueDouble0ParserRuleCall_0(), semanticObject.getValue());
    feeder.finish();
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyValue returns PropertyValueInt
   *     PropertyValueInt returns PropertyValueInt
   *
   * Constraint:
   *     value=Integer0
   * </pre>
   */
  protected void sequence_PropertyValueInt(ISerializationContext context, PropertyValueInt semanticObject) {
    if (errorAcceptor != null) {
      if (transientValues.isValueTransient(semanticObject, UtilPackage.Literals.PROPERTY_VALUE_INT__VALUE) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.PROPERTY_VALUE_INT__VALUE));
    }
    SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
    feeder.accept(grammarAccess.getPropertyValueIntAccess().getValueInteger0ParserRuleCall_0(), semanticObject.getValue());
    feeder.finish();
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyValue returns PropertyValueList
   *     PropertyValueList returns PropertyValueList
   *
   * Constraint:
   *     (value+=PropertyValue value+=PropertyValue*)
   * </pre>
   */
  protected void sequence_PropertyValueList(ISerializationContext context, PropertyValueList semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyValue returns PropertyValueString
   *     PropertyValueString returns PropertyValueString
   *
   * Constraint:
   *     value=EString
   * </pre>
   */
  protected void sequence_PropertyValueString(ISerializationContext context, PropertyValueString semanticObject) {
    if (errorAcceptor != null) {
      if (transientValues.isValueTransient(semanticObject, UtilPackage.Literals.PROPERTY_VALUE_STRING__VALUE) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.PROPERTY_VALUE_STRING__VALUE));
    }
    SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
    feeder.accept(grammarAccess.getPropertyValueStringAccess().getValueEStringParserRuleCall_0(), semanticObject.getValue());
    feeder.finish();
  }


  /**
   * <pre>
   * Contexts:
   *     Property returns Property
   *
   * Constraint:
   *     (name=EString kind=PropertyKind description=EString? (value+=PropertyValue value+=PropertyValue*)?)
   * </pre>
   */
  protected void sequence_Property(ISerializationContext context, Property semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyKind returns RangeKind
   *     RangeKind returns RangeKind
   *
   * Constraint:
   *     {RangeKind}
   * </pre>
   */
  protected void sequence_RangeKind(ISerializationContext context, RangeKind semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractResouceType returns ResourceType
   *     ResourceType returns ResourceType
   *
   * Constraint:
   *     name=EString
   * </pre>
   */
  protected void sequence_ResourceType(ISerializationContext context, ResourceType semanticObject) {
    if (errorAcceptor != null) {
      if (transientValues.isValueTransient(semanticObject, UtilPackage.Literals.RESOURCE_TYPE__NAME) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.RESOURCE_TYPE__NAME));
    }
    SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
    feeder.accept(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
    feeder.finish();
  }


  /**
   * <pre>
   * Contexts:
   *     Resource returns Resource
   *
   * Constraint:
   *     (name=EString type=AbstractResouceType (properties+=AbstractProperty properties+=AbstractProperty*)?)
   * </pre>
   */
  protected void sequence_Resource(ISerializationContext context, Resource semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyKind returns SelectionKind
   *     SelectionKind returns SelectionKind
   *
   * Constraint:
   *     {SelectionKind}
   * </pre>
   */
  protected void sequence_SelectionKind(ISerializationContext context, SelectionKind semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     PropertyValue returns UbuntuVersionValue
   *     UbuntuVersionValue returns UbuntuVersionValue
   *
   * Constraint:
   *     value=UbuntuVersion
   * </pre>
   */
  protected void sequence_UbuntuVersionValue(ISerializationContext context, UbuntuVersionValue semanticObject) {
    if (errorAcceptor != null) {
      if (transientValues.isValueTransient(semanticObject, UtilPackage.Literals.UBUNTU_VERSION_VALUE__VALUE) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.UBUNTU_VERSION_VALUE__VALUE));
    }
    SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
    feeder.accept(grammarAccess.getUbuntuVersionValueAccess().getValueUbuntuVersionEnumRuleCall_1_0(), semanticObject.getValue());
    feeder.finish();
  }


  /**
   * <pre>
   * Contexts:
   *     UsbCommunicationType returns UsbCommunicationType
   *
   * Constraint:
   *     {UsbCommunicationType}
   * </pre>
   */
  protected void sequence_UsbCommunicationType(ISerializationContext context, UsbCommunicationType semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractOperatingSystemProperty returns VersionOperatingSystemProperty
   *     VersionOperatingSystemProperty returns VersionOperatingSystemProperty
   *
   * Constraint:
   *     (name='os_version' kind=AttributeKind description=EString? value=PropertyValue?)
   * </pre>
   */
  protected void sequence_VersionOperatingSystemProperty(ISerializationContext context, VersionOperatingSystemProperty semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractCommunicationType returns WlanCommunicationType
   *     NetworkCommunicationType returns WlanCommunicationType
   *     WlanCommunicationType returns WlanCommunicationType
   *
   * Constraint:
   *     {WlanCommunicationType}
   * </pre>
   */
  protected void sequence_WlanCommunicationType(ISerializationContext context, WlanCommunicationType semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


}
