package kran_mbs.classes.impl;

import kran_mbs.classes.*;
import de.iils.dc43.persistence.*;
import de.iils.dc43.persistence.shared.*;
import de.iils.dc43.scriptrule.*;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2015-02-24T14:21:23.398+0100")
@SuppressWarnings("all")
public class MBSBodyImpl extends InstanceWrapperImpl implements kran_mbs.classes.MBSBody {

	// umlClass is set reflectively to the corresponding UML model class by UML2JavaMap#init
	// every wrapper class needs such a field for mapping between Java and UML
	// - no matter if instances exist => it has to be static
	// - it can't be inherited from a common superclass like InstanceWrapperImpl 
	protected static org.eclipse.uml2.uml.Class umlClass;
	public org.eclipse.uml2.uml.Class umlClass() {
		return umlClass;
	}
	
	/**
	 * Create wrapper object and also the corresponding instance in the UML model
	 * @param name Name of the UML instance
	 */
	public MBSBodyImpl(String name) {
		this(createInstanceWith(name, umlClass));
	}
	
	/**
	 * Create wrapper object for an already existing UML instance
	 * @param inst UML instance to wrap
	 */
	public MBSBodyImpl(org.eclipse.uml2.uml.InstanceSpecification inst) {
		umlInstance = inst;
		UML2JavaMap.addInstMapEntry(umlInstance, this);
		setDomain(SharedEditingDomainUtil.getInstance().getSharedEditingDomain());
	}

	private void loadPropRefs() {
		for (org.eclipse.uml2.uml.Property p : umlClass.getAllAttributes()) {
			if (p.getName().equals("correspondingposition")) {
				_umlPropCorrespondingposition = p;
				continue;
			}
			if (p.getName().equals("inertiaProperties")) {
				_umlPropInertiaProperties = p;
				continue;
			}
			if (p.getName().equals("initialCondition")) {
				_umlPropInitialCondition = p;
				continue;
			}
			if (p.getName().equals("geometry")) {
				_umlPropGeometry = p;
				continue;
			}
			if (p.getName().equals("marker")) {
				_umlPropMarker = p;
				continue;
			}
			if (p.getName().equals("color")) {
				_umlPropColor = p;
				continue;
			}
			if (p.getName().equals("positionReference")) {
				_umlPropPositionReference = p;
				continue;
			}
			if (p.getName().equals("localX")) {
				_umlPropLocalX = p;
				continue;
			}
			if (p.getName().equals("localY")) {
				_umlPropLocalY = p;
				continue;
			}
			if (p.getName().equals("localZ")) {
				_umlPropLocalZ = p;
				continue;
			}
			if (p.getName().equals("localPhi")) {
				_umlPropLocalPhi = p;
				continue;
			}
			if (p.getName().equals("localTheta")) {
				_umlPropLocalTheta = p;
				continue;
			}
			if (p.getName().equals("localPsi")) {
				_umlPropLocalPsi = p;
				continue;
			}
			if (p.getName().equals("componentPosition")) {
				_umlPropComponentPosition = p;
				continue;
			}
		}
	}		

	private org.eclipse.uml2.uml.Property _umlPropCorrespondingposition;
	public org.eclipse.uml2.uml.Property umlPropCorrespondingposition() {
		if (_umlPropCorrespondingposition == null) {
			loadPropRefs();
		}
		return _umlPropCorrespondingposition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotCorrespondingposition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropCorrespondingposition()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Position getCorrespondingposition() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropCorrespondingposition().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Position>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setCorrespondingposition(geometry.Position correspondingposition) {
		if (getCorrespondingposition() != null) {
			deleteUniLinks(umlInstance, umlPropCorrespondingposition());
		}
		if (correspondingposition != null) {
			createUniLink(umlInstance, umlPropCorrespondingposition().getName(), correspondingposition.umlInstance());
		}
	}
	public MBSBody correspondingposition_(geometry.Position correspondingposition) {
		setCorrespondingposition(correspondingposition);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropInertiaProperties;
	public org.eclipse.uml2.uml.Property umlPropInertiaProperties() {
		if (_umlPropInertiaProperties == null) {
			loadPropRefs();
		}
		return _umlPropInertiaProperties;
	}
	public org.eclipse.uml2.uml.Slot umlSlotInertiaProperties() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropInertiaProperties()) {
				return s;
			}
		}
		return null;
	}
	public multibody.profile.uml.classes.InertiaProperties getInertiaProperties() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropInertiaProperties().getName());
		if (targetInst != null) {
			return UML2JavaMap.<multibody.profile.uml.classes.InertiaProperties>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setInertiaProperties(multibody.profile.uml.classes.InertiaProperties inertiaProperties) {
		if (getInertiaProperties() != null) {
			deleteUniLinks(umlInstance, umlPropInertiaProperties());
		}
		if (inertiaProperties != null) {
			createUniLink(umlInstance, umlPropInertiaProperties().getName(), inertiaProperties.umlInstance());
		}
	}
	public MBSBody inertiaProperties_(multibody.profile.uml.classes.InertiaProperties inertiaProperties) {
		setInertiaProperties(inertiaProperties);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropInitialCondition;
	public org.eclipse.uml2.uml.Property umlPropInitialCondition() {
		if (_umlPropInitialCondition == null) {
			loadPropRefs();
		}
		return _umlPropInitialCondition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotInitialCondition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropInitialCondition()) {
				return s;
			}
		}
		return null;
	}
	public multibody.profile.uml.classes.InitialCondition getInitialCondition() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropInitialCondition().getName());
		if (targetInst != null) {
			return UML2JavaMap.<multibody.profile.uml.classes.InitialCondition>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setInitialCondition(multibody.profile.uml.classes.InitialCondition initialCondition) {
		if (getInitialCondition() != null) {
			deleteUniLinks(umlInstance, umlPropInitialCondition());
		}
		if (initialCondition != null) {
			createUniLink(umlInstance, umlPropInitialCondition().getName(), initialCondition.umlInstance());
		}
	}
	public MBSBody initialCondition_(multibody.profile.uml.classes.InitialCondition initialCondition) {
		setInitialCondition(initialCondition);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropGeometry;
	public org.eclipse.uml2.uml.Property umlPropGeometry() {
		if (_umlPropGeometry == null) {
			loadPropRefs();
		}
		return _umlPropGeometry;
	}
	public org.eclipse.uml2.uml.Slot umlSlotGeometry() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropGeometry()) {
				return s;
			}
		}
		return null;
	}
	public multibody.profile.uml.classes.Geometry getGeometry() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropGeometry().getName());
		if (targetInst != null) {
			return UML2JavaMap.<multibody.profile.uml.classes.Geometry>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setGeometry(multibody.profile.uml.classes.Geometry geometry) {
		if (getGeometry() != null) {
			deleteUniLinks(umlInstance, umlPropGeometry());
		}
		if (geometry != null) {
			createUniLink(umlInstance, umlPropGeometry().getName(), geometry.umlInstance());
		}
	}
	public MBSBody geometry_(multibody.profile.uml.classes.Geometry geometry) {
		setGeometry(geometry);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMarker;
	public org.eclipse.uml2.uml.Property umlPropMarker() {
		if (_umlPropMarker == null) {
			loadPropRefs();
		}
		return _umlPropMarker;
	}
	public List<org.eclipse.uml2.uml.Slot> umlSlotMarker() {
		List<org.eclipse.uml2.uml.Slot> slots = new ArrayList<org.eclipse.uml2.uml.Slot>();
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMarker()) {
				slots.add(s);
			}
		}
		return slots;
	}
	public List<multibody.profile.uml.classes.Marker> getMarker() {
		return new AssocList<multibody.profile.uml.classes.Marker>(umlInstance, umlPropMarker(), multibody.profile.uml.classes.Marker.class);
	}
	public MBSBody marker_(multibody.profile.uml.classes.Marker... instancesToLink) {
		return marker_(Arrays.asList(instancesToLink));
	}
	public MBSBody marker_(List<multibody.profile.uml.classes.Marker> instancesToLink) {
		List<multibody.profile.uml.classes.Marker> linkList = new AssocList<multibody.profile.uml.classes.Marker>(umlInstance, umlPropMarker(), multibody.profile.uml.classes.Marker.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public MBSBody marker_add_(multibody.profile.uml.classes.Marker instanceToLink) {
		getMarker().add(instanceToLink);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropColor;
	public org.eclipse.uml2.uml.Property umlPropColor() {
		if (_umlPropColor == null) {
			loadPropRefs();
		}
		return _umlPropColor;
	}
	public org.eclipse.uml2.uml.Slot umlSlotColor() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropColor()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Color getColor() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropColor().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Color>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setColor(geometry.Color color) {
		if (getColor() != null) {
			deleteUniLinks(umlInstance, umlPropColor());
		}
		if (color != null) {
			createUniLink(umlInstance, umlPropColor().getName(), color.umlInstance());
		}
	}
	public MBSBody color_(geometry.Color color) {
		setColor(color);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropPositionReference;
	public org.eclipse.uml2.uml.Property umlPropPositionReference() {
		if (_umlPropPositionReference == null) {
			loadPropRefs();
		}
		return _umlPropPositionReference;
	}
	public org.eclipse.uml2.uml.Slot umlSlotPositionReference() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropPositionReference()) {
				return s;
			}
		}
		return null;
	}
	public multibody.profile.uml.classes.PositionReference getPositionReference() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropPositionReference().getName());
		if (targetInst != null) {
			return UML2JavaMap.<multibody.profile.uml.classes.PositionReference>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setPositionReference(multibody.profile.uml.classes.PositionReference positionReference) {
		if (getPositionReference() != null) {
			deleteUniLinks(umlInstance, umlPropPositionReference());
		}
		if (positionReference != null) {
			createUniLink(umlInstance, umlPropPositionReference().getName(), positionReference.umlInstance());
		}
	}
	public MBSBody positionReference_(multibody.profile.uml.classes.PositionReference positionReference) {
		setPositionReference(positionReference);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropLocalX;
	public org.eclipse.uml2.uml.Property umlPropLocalX() {
		if (_umlPropLocalX == null) {
			loadPropRefs();
		}
		return _umlPropLocalX;
	}
	public org.eclipse.uml2.uml.Slot umlSlotLocalX() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropLocalX()) {
				return s;
			}
		}
		return null;
	}
	public Double getLocalX() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropLocalX().getName());
	}
	public void setLocalX(Double localX) {
		setSlotValueByProperty(umlInstance(), umlPropLocalX().getName(), localX.toString());
	}
	public MBSBody localX_(Double localX, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLocalX(localX);
		org.eclipse.uml2.uml.Slot slot = umlSlotLocalX();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropLocalY;
	public org.eclipse.uml2.uml.Property umlPropLocalY() {
		if (_umlPropLocalY == null) {
			loadPropRefs();
		}
		return _umlPropLocalY;
	}
	public org.eclipse.uml2.uml.Slot umlSlotLocalY() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropLocalY()) {
				return s;
			}
		}
		return null;
	}
	public Double getLocalY() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropLocalY().getName());
	}
	public void setLocalY(Double localY) {
		setSlotValueByProperty(umlInstance(), umlPropLocalY().getName(), localY.toString());
	}
	public MBSBody localY_(Double localY, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLocalY(localY);
		org.eclipse.uml2.uml.Slot slot = umlSlotLocalY();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropLocalZ;
	public org.eclipse.uml2.uml.Property umlPropLocalZ() {
		if (_umlPropLocalZ == null) {
			loadPropRefs();
		}
		return _umlPropLocalZ;
	}
	public org.eclipse.uml2.uml.Slot umlSlotLocalZ() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropLocalZ()) {
				return s;
			}
		}
		return null;
	}
	public Double getLocalZ() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropLocalZ().getName());
	}
	public void setLocalZ(Double localZ) {
		setSlotValueByProperty(umlInstance(), umlPropLocalZ().getName(), localZ.toString());
	}
	public MBSBody localZ_(Double localZ, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLocalZ(localZ);
		org.eclipse.uml2.uml.Slot slot = umlSlotLocalZ();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropLocalPhi;
	public org.eclipse.uml2.uml.Property umlPropLocalPhi() {
		if (_umlPropLocalPhi == null) {
			loadPropRefs();
		}
		return _umlPropLocalPhi;
	}
	public org.eclipse.uml2.uml.Slot umlSlotLocalPhi() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropLocalPhi()) {
				return s;
			}
		}
		return null;
	}
	public Double getLocalPhi() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropLocalPhi().getName());
	}
	public void setLocalPhi(Double localPhi) {
		setSlotValueByProperty(umlInstance(), umlPropLocalPhi().getName(), localPhi.toString());
	}
	public MBSBody localPhi_(Double localPhi, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLocalPhi(localPhi);
		org.eclipse.uml2.uml.Slot slot = umlSlotLocalPhi();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropLocalTheta;
	public org.eclipse.uml2.uml.Property umlPropLocalTheta() {
		if (_umlPropLocalTheta == null) {
			loadPropRefs();
		}
		return _umlPropLocalTheta;
	}
	public org.eclipse.uml2.uml.Slot umlSlotLocalTheta() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropLocalTheta()) {
				return s;
			}
		}
		return null;
	}
	public Double getLocalTheta() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropLocalTheta().getName());
	}
	public void setLocalTheta(Double localTheta) {
		setSlotValueByProperty(umlInstance(), umlPropLocalTheta().getName(), localTheta.toString());
	}
	public MBSBody localTheta_(Double localTheta, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLocalTheta(localTheta);
		org.eclipse.uml2.uml.Slot slot = umlSlotLocalTheta();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropLocalPsi;
	public org.eclipse.uml2.uml.Property umlPropLocalPsi() {
		if (_umlPropLocalPsi == null) {
			loadPropRefs();
		}
		return _umlPropLocalPsi;
	}
	public org.eclipse.uml2.uml.Slot umlSlotLocalPsi() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropLocalPsi()) {
				return s;
			}
		}
		return null;
	}
	public Double getLocalPsi() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropLocalPsi().getName());
	}
	public void setLocalPsi(Double localPsi) {
		setSlotValueByProperty(umlInstance(), umlPropLocalPsi().getName(), localPsi.toString());
	}
	public MBSBody localPsi_(Double localPsi, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLocalPsi(localPsi);
		org.eclipse.uml2.uml.Slot slot = umlSlotLocalPsi();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropComponentPosition;
	public org.eclipse.uml2.uml.Property umlPropComponentPosition() {
		if (_umlPropComponentPosition == null) {
			loadPropRefs();
		}
		return _umlPropComponentPosition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotComponentPosition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropComponentPosition()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Component getComponentPosition() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropComponentPosition().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Component>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setComponentPosition(geometry.Component componentPosition) {
		if (getComponentPosition() != null) {
			deleteUniLinks(umlInstance, umlPropComponentPosition());
		}
		if (componentPosition != null) {
			createUniLink(umlInstance, umlPropComponentPosition().getName(), componentPosition.umlInstance());
		}
	}
	public MBSBody componentPosition_(geometry.Component componentPosition) {
		setComponentPosition(componentPosition);
		return this;
	}
}
