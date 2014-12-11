package kran_v2.classes.impl;

import kran_v2.classes.*;
import de.iils.dc43.persistence.*;
import de.iils.dc43.persistence.shared.*;
import de.iils.dc43.scriptrule.*;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public class VerbindungsseilImpl extends InstanceWrapperImpl implements kran_v2.classes.Verbindungsseil {

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
	public VerbindungsseilImpl(String name) {
		this(createInstanceWith(name, umlClass));
	}
	
	/**
	 * Create wrapper object for an already existing UML instance
	 * @param inst UML instance to wrap
	 */
	public VerbindungsseilImpl(org.eclipse.uml2.uml.InstanceSpecification inst) {
		umlInstance = inst;
		UML2JavaMap.addInstMapEntry(umlInstance, this);
		setDomain(SharedEditingDomainUtil.getInstance().getSharedEditingDomain());
	}

	private void loadPropRefs() {
		for (org.eclipse.uml2.uml.Property p : umlClass.getAllAttributes()) {
			if (p.getName().equals("mast1")) {
				_umlPropMast1 = p;
				continue;
			}
			if (p.getName().equals("mast2")) {
				_umlPropMast2 = p;
				continue;
			}
			if (p.getName().equals("mast1pos")) {
				_umlPropMast1pos = p;
				continue;
			}
			if (p.getName().equals("mast2pos")) {
				_umlPropMast2pos = p;
				continue;
			}
			if (p.getName().equals("start")) {
				_umlPropStart = p;
				continue;
			}
			if (p.getName().equals("ende")) {
				_umlPropEnde = p;
				continue;
			}
			if (p.getName().equals("seilErsatzgeometrie")) {
				_umlPropSeilErsatzgeometrie = p;
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

	private org.eclipse.uml2.uml.Property _umlPropMast1;
	public org.eclipse.uml2.uml.Property umlPropMast1() {
		if (_umlPropMast1 == null) {
			loadPropRefs();
		}
		return _umlPropMast1;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMast1() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMast1()) {
				return s;
			}
		}
		return null;
	}
	public Mast getMast1() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropMast1().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Mast>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setMast1(Mast mast1) {
		if (getMast1() != null) {
			deleteUniLinks(umlInstance, umlPropMast1());
		}
		if (mast1 != null) {
			createUniLink(umlInstance, umlPropMast1().getName(), mast1.umlInstance());
		}
	}
	public Verbindungsseil mast1_(Mast mast1) {
		setMast1(mast1);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMast2;
	public org.eclipse.uml2.uml.Property umlPropMast2() {
		if (_umlPropMast2 == null) {
			loadPropRefs();
		}
		return _umlPropMast2;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMast2() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMast2()) {
				return s;
			}
		}
		return null;
	}
	public Mast getMast2() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropMast2().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Mast>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setMast2(Mast mast2) {
		if (getMast2() != null) {
			deleteUniLinks(umlInstance, umlPropMast2());
		}
		if (mast2 != null) {
			createUniLink(umlInstance, umlPropMast2().getName(), mast2.umlInstance());
		}
	}
	public Verbindungsseil mast2_(Mast mast2) {
		setMast2(mast2);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMast1pos;
	public org.eclipse.uml2.uml.Property umlPropMast1pos() {
		if (_umlPropMast1pos == null) {
			loadPropRefs();
		}
		return _umlPropMast1pos;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMast1pos() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMast1pos()) {
				return s;
			}
		}
		return null;
	}
	public Double getMast1pos() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropMast1pos().getName());
	}
	public void setMast1pos(Double mast1pos) {
		setSlotValueByProperty(umlInstance(), umlPropMast1pos().getName(), mast1pos.toString());
	}
	public Verbindungsseil mast1pos_(Double mast1pos, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMast1pos(mast1pos);
		org.eclipse.uml2.uml.Slot slot = umlSlotMast1pos();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMast2pos;
	public org.eclipse.uml2.uml.Property umlPropMast2pos() {
		if (_umlPropMast2pos == null) {
			loadPropRefs();
		}
		return _umlPropMast2pos;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMast2pos() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMast2pos()) {
				return s;
			}
		}
		return null;
	}
	public Double getMast2pos() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropMast2pos().getName());
	}
	public void setMast2pos(Double mast2pos) {
		setSlotValueByProperty(umlInstance(), umlPropMast2pos().getName(), mast2pos.toString());
	}
	public Verbindungsseil mast2pos_(Double mast2pos, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMast2pos(mast2pos);
		org.eclipse.uml2.uml.Slot slot = umlSlotMast2pos();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropStart;
	public org.eclipse.uml2.uml.Property umlPropStart() {
		if (_umlPropStart == null) {
			loadPropRefs();
		}
		return _umlPropStart;
	}
	public org.eclipse.uml2.uml.Slot umlSlotStart() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropStart()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Point getStart() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropStart().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Point>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setStart(geometry.Point start) {
		if (getStart() != null) {
			deleteUniLinks(umlInstance, umlPropStart());
		}
		if (start != null) {
			createUniLink(umlInstance, umlPropStart().getName(), start.umlInstance());
		}
	}
	public Verbindungsseil start_(geometry.Point start) {
		setStart(start);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropEnde;
	public org.eclipse.uml2.uml.Property umlPropEnde() {
		if (_umlPropEnde == null) {
			loadPropRefs();
		}
		return _umlPropEnde;
	}
	public org.eclipse.uml2.uml.Slot umlSlotEnde() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropEnde()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Point getEnde() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropEnde().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Point>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setEnde(geometry.Point ende) {
		if (getEnde() != null) {
			deleteUniLinks(umlInstance, umlPropEnde());
		}
		if (ende != null) {
			createUniLink(umlInstance, umlPropEnde().getName(), ende.umlInstance());
		}
	}
	public Verbindungsseil ende_(geometry.Point ende) {
		setEnde(ende);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropSeilErsatzgeometrie;
	public org.eclipse.uml2.uml.Property umlPropSeilErsatzgeometrie() {
		if (_umlPropSeilErsatzgeometrie == null) {
			loadPropRefs();
		}
		return _umlPropSeilErsatzgeometrie;
	}
	public org.eclipse.uml2.uml.Slot umlSlotSeilErsatzgeometrie() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSeilErsatzgeometrie()) {
				return s;
			}
		}
		return null;
	}
	public seil.classes.SeilErsatzgeometrie getSeilErsatzgeometrie() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropSeilErsatzgeometrie().getName());
		if (targetInst != null) {
			return UML2JavaMap.<seil.classes.SeilErsatzgeometrie>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setSeilErsatzgeometrie(seil.classes.SeilErsatzgeometrie seilErsatzgeometrie) {
		if (getSeilErsatzgeometrie() != null) {
			deleteUniLinks(umlInstance, umlPropSeilErsatzgeometrie());
		}
		if (seilErsatzgeometrie != null) {
			createUniLink(umlInstance, umlPropSeilErsatzgeometrie().getName(), seilErsatzgeometrie.umlInstance());
		}
	}
	public Verbindungsseil seilErsatzgeometrie_(seil.classes.SeilErsatzgeometrie seilErsatzgeometrie) {
		setSeilErsatzgeometrie(seilErsatzgeometrie);
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
	public Verbindungsseil shape_(geometry.Shape shape) {
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
	public Verbindungsseil existingComponent_(geometry.ExistingComponent existingComponent) {
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
	public Verbindungsseil color_(geometry.Color color) {
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
	public Verbindungsseil primitiveShape_(geometry.Shape primitiveShape) {
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
	public Verbindungsseil userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature) {
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
	public Verbindungsseil sub_(geometry.TopologyElement... instancesToLink) {
		return sub_(Arrays.asList(instancesToLink));
	}
	public Verbindungsseil sub_(List<geometry.TopologyElement> instancesToLink) {
		List<geometry.TopologyElement> linkList = new AssocList<geometry.TopologyElement>(umlInstance, umlPropSub(), geometry.TopologyElement.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public Verbindungsseil sub_add_(geometry.TopologyElement instanceToLink) {
		getSub().add(instanceToLink);
		return this;
	}
}
