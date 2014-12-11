package kran_v2.classes.impl;

import kran_v2.classes.*;
import de.iils.dc43.persistence.*;
import de.iils.dc43.persistence.shared.*;
import de.iils.dc43.scriptrule.*;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public class UnterbauModelImpl extends InstanceWrapperImpl implements kran_v2.classes.UnterbauModel {

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
	public UnterbauModelImpl(String name) {
		this(createInstanceWith(name, umlClass));
	}
	
	/**
	 * Create wrapper object for an already existing UML instance
	 * @param inst UML instance to wrap
	 */
	public UnterbauModelImpl(org.eclipse.uml2.uml.InstanceSpecification inst) {
		umlInstance = inst;
		UML2JavaMap.addInstMapEntry(umlInstance, this);
		setDomain(SharedEditingDomainUtil.getInstance().getSharedEditingDomain());
	}

	private void loadPropRefs() {
		for (org.eclipse.uml2.uml.Property p : umlClass.getAllAttributes()) {
			if (p.getName().equals("position")) {
				_umlPropPosition = p;
				continue;
			}
			if (p.getName().equals("cuboid")) {
				_umlPropCuboid = p;
				continue;
			}
			if (p.getName().equals("schwerpunktxk")) {
				_umlPropSchwerpunktxk = p;
				continue;
			}
			if (p.getName().equals("schwerpunktyk")) {
				_umlPropSchwerpunktyk = p;
				continue;
			}
			if (p.getName().equals("schwerpunktzk")) {
				_umlPropSchwerpunktzk = p;
				continue;
			}
			if (p.getName().equals("Masse")) {
				_umlPropMasse = p;
				continue;
			}
			if (p.getName().equals("shape")) {
				_umlPropShape = p;
				continue;
			}
			if (p.getName().equals("existingComponent")) {
				_umlPropExistingComponent = p;
				continue;
			}
			if (p.getName().equals("color")) {
				_umlPropColor = p;
				continue;
			}
			if (p.getName().equals("primitiveShape")) {
				_umlPropPrimitiveShape = p;
				continue;
			}
			if (p.getName().equals("userDefinedFeature")) {
				_umlPropUserDefinedFeature = p;
				continue;
			}
			if (p.getName().equals("sub")) {
				_umlPropSub = p;
				continue;
			}
		}
	}		

	private org.eclipse.uml2.uml.Property _umlPropPosition;
	public org.eclipse.uml2.uml.Property umlPropPosition() {
		if (_umlPropPosition == null) {
			loadPropRefs();
		}
		return _umlPropPosition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotPosition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropPosition()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Position getPosition() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropPosition().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Position>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setPosition(geometry.Position position) {
		if (getPosition() != null) {
			deleteUniLinks(umlInstance, umlPropPosition());
		}
		if (position != null) {
			createUniLink(umlInstance, umlPropPosition().getName(), position.umlInstance());
		}
	}
	public UnterbauModel position_(geometry.Position position) {
		setPosition(position);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropCuboid;
	public org.eclipse.uml2.uml.Property umlPropCuboid() {
		if (_umlPropCuboid == null) {
			loadPropRefs();
		}
		return _umlPropCuboid;
	}
	public org.eclipse.uml2.uml.Slot umlSlotCuboid() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropCuboid()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Cuboid getCuboid() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropCuboid().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Cuboid>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setCuboid(geometry.Cuboid cuboid) {
		if (getCuboid() != null) {
			deleteUniLinks(umlInstance, umlPropCuboid());
		}
		if (cuboid != null) {
			createUniLink(umlInstance, umlPropCuboid().getName(), cuboid.umlInstance());
		}
	}
	public UnterbauModel cuboid_(geometry.Cuboid cuboid) {
		setCuboid(cuboid);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropSchwerpunktxk;
	public org.eclipse.uml2.uml.Property umlPropSchwerpunktxk() {
		if (_umlPropSchwerpunktxk == null) {
			loadPropRefs();
		}
		return _umlPropSchwerpunktxk;
	}
	public org.eclipse.uml2.uml.Slot umlSlotSchwerpunktxk() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSchwerpunktxk()) {
				return s;
			}
		}
		return null;
	}
	public Double getSchwerpunktxk() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropSchwerpunktxk().getName());
	}
	public void setSchwerpunktxk(Double schwerpunktxk) {
		setSlotValueByProperty(umlInstance(), umlPropSchwerpunktxk().getName(), schwerpunktxk.toString());
	}
	public UnterbauModel schwerpunktxk_(Double schwerpunktxk, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setSchwerpunktxk(schwerpunktxk);
		org.eclipse.uml2.uml.Slot slot = umlSlotSchwerpunktxk();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropSchwerpunktyk;
	public org.eclipse.uml2.uml.Property umlPropSchwerpunktyk() {
		if (_umlPropSchwerpunktyk == null) {
			loadPropRefs();
		}
		return _umlPropSchwerpunktyk;
	}
	public org.eclipse.uml2.uml.Slot umlSlotSchwerpunktyk() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSchwerpunktyk()) {
				return s;
			}
		}
		return null;
	}
	public Double getSchwerpunktyk() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropSchwerpunktyk().getName());
	}
	public void setSchwerpunktyk(Double schwerpunktyk) {
		setSlotValueByProperty(umlInstance(), umlPropSchwerpunktyk().getName(), schwerpunktyk.toString());
	}
	public UnterbauModel schwerpunktyk_(Double schwerpunktyk, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setSchwerpunktyk(schwerpunktyk);
		org.eclipse.uml2.uml.Slot slot = umlSlotSchwerpunktyk();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropSchwerpunktzk;
	public org.eclipse.uml2.uml.Property umlPropSchwerpunktzk() {
		if (_umlPropSchwerpunktzk == null) {
			loadPropRefs();
		}
		return _umlPropSchwerpunktzk;
	}
	public org.eclipse.uml2.uml.Slot umlSlotSchwerpunktzk() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSchwerpunktzk()) {
				return s;
			}
		}
		return null;
	}
	public Double getSchwerpunktzk() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropSchwerpunktzk().getName());
	}
	public void setSchwerpunktzk(Double schwerpunktzk) {
		setSlotValueByProperty(umlInstance(), umlPropSchwerpunktzk().getName(), schwerpunktzk.toString());
	}
	public UnterbauModel schwerpunktzk_(Double schwerpunktzk, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setSchwerpunktzk(schwerpunktzk);
		org.eclipse.uml2.uml.Slot slot = umlSlotSchwerpunktzk();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMasse;
	public org.eclipse.uml2.uml.Property umlPropMasse() {
		if (_umlPropMasse == null) {
			loadPropRefs();
		}
		return _umlPropMasse;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMasse() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMasse()) {
				return s;
			}
		}
		return null;
	}
	public Double getMasse() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropMasse().getName());
	}
	public void setMasse(Double masse) {
		setSlotValueByProperty(umlInstance(), umlPropMasse().getName(), masse.toString());
	}
	public UnterbauModel masse_(Double masse, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMasse(masse);
		org.eclipse.uml2.uml.Slot slot = umlSlotMasse();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropShape;
	public org.eclipse.uml2.uml.Property umlPropShape() {
		if (_umlPropShape == null) {
			loadPropRefs();
		}
		return _umlPropShape;
	}
	public org.eclipse.uml2.uml.Slot umlSlotShape() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropShape()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Shape getShape() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropShape().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Shape>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setShape(geometry.Shape shape) {
		if (getShape() != null) {
			deleteUniLinks(umlInstance, umlPropShape());
		}
		if (shape != null) {
			createUniLink(umlInstance, umlPropShape().getName(), shape.umlInstance());
		}
	}
	public UnterbauModel shape_(geometry.Shape shape) {
		setShape(shape);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropExistingComponent;
	public org.eclipse.uml2.uml.Property umlPropExistingComponent() {
		if (_umlPropExistingComponent == null) {
			loadPropRefs();
		}
		return _umlPropExistingComponent;
	}
	public org.eclipse.uml2.uml.Slot umlSlotExistingComponent() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropExistingComponent()) {
				return s;
			}
		}
		return null;
	}
	public geometry.ExistingComponent getExistingComponent() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropExistingComponent().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.ExistingComponent>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setExistingComponent(geometry.ExistingComponent existingComponent) {
		if (getExistingComponent() != null) {
			deleteUniLinks(umlInstance, umlPropExistingComponent());
		}
		if (existingComponent != null) {
			createUniLink(umlInstance, umlPropExistingComponent().getName(), existingComponent.umlInstance());
		}
	}
	public UnterbauModel existingComponent_(geometry.ExistingComponent existingComponent) {
		setExistingComponent(existingComponent);
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
	public UnterbauModel color_(geometry.Color color) {
		setColor(color);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropPrimitiveShape;
	public org.eclipse.uml2.uml.Property umlPropPrimitiveShape() {
		if (_umlPropPrimitiveShape == null) {
			loadPropRefs();
		}
		return _umlPropPrimitiveShape;
	}
	public org.eclipse.uml2.uml.Slot umlSlotPrimitiveShape() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropPrimitiveShape()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Shape getPrimitiveShape() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropPrimitiveShape().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Shape>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setPrimitiveShape(geometry.Shape primitiveShape) {
		if (getPrimitiveShape() != null) {
			deleteUniLinks(umlInstance, umlPropPrimitiveShape());
		}
		if (primitiveShape != null) {
			createUniLink(umlInstance, umlPropPrimitiveShape().getName(), primitiveShape.umlInstance());
		}
	}
	public UnterbauModel primitiveShape_(geometry.Shape primitiveShape) {
		setPrimitiveShape(primitiveShape);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropUserDefinedFeature;
	public org.eclipse.uml2.uml.Property umlPropUserDefinedFeature() {
		if (_umlPropUserDefinedFeature == null) {
			loadPropRefs();
		}
		return _umlPropUserDefinedFeature;
	}
	public org.eclipse.uml2.uml.Slot umlSlotUserDefinedFeature() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropUserDefinedFeature()) {
				return s;
			}
		}
		return null;
	}
	public geometry.UserDefinedFeature getUserDefinedFeature() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropUserDefinedFeature().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.UserDefinedFeature>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setUserDefinedFeature(geometry.UserDefinedFeature userDefinedFeature) {
		if (getUserDefinedFeature() != null) {
			deleteUniLinks(umlInstance, umlPropUserDefinedFeature());
		}
		if (userDefinedFeature != null) {
			createUniLink(umlInstance, umlPropUserDefinedFeature().getName(), userDefinedFeature.umlInstance());
		}
	}
	public UnterbauModel userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature) {
		setUserDefinedFeature(userDefinedFeature);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropSub;
	public org.eclipse.uml2.uml.Property umlPropSub() {
		if (_umlPropSub == null) {
			loadPropRefs();
		}
		return _umlPropSub;
	}
	public List<org.eclipse.uml2.uml.Slot> umlSlotSub() {
		List<org.eclipse.uml2.uml.Slot> slots = new ArrayList<org.eclipse.uml2.uml.Slot>();
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSub()) {
				slots.add(s);
			}
		}
		return slots;
	}
	public List<geometry.TopologyElement> getSub() {
		return new AssocList<geometry.TopologyElement>(umlInstance, umlPropSub(), geometry.TopologyElement.class);
	}
	public UnterbauModel sub_(geometry.TopologyElement... instancesToLink) {
		return sub_(Arrays.asList(instancesToLink));
	}
	public UnterbauModel sub_(List<geometry.TopologyElement> instancesToLink) {
		List<geometry.TopologyElement> linkList = new AssocList<geometry.TopologyElement>(umlInstance, umlPropSub(), geometry.TopologyElement.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public UnterbauModel sub_add_(geometry.TopologyElement instanceToLink) {
		getSub().add(instanceToLink);
		return this;
	}
}
