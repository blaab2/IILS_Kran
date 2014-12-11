package kran_v2.classes.impl;

import kran_v2.classes.*;
import de.iils.dc43.persistence.*;
import de.iils.dc43.persistence.shared.*;
import de.iils.dc43.scriptrule.*;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public class UnterbauImpl extends InstanceWrapperImpl implements kran_v2.classes.Unterbau {

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
	public UnterbauImpl(String name) {
		this(createInstanceWith(name, umlClass));
	}
	
	/**
	 * Create wrapper object for an already existing UML instance
	 * @param inst UML instance to wrap
	 */
	public UnterbauImpl(org.eclipse.uml2.uml.InstanceSpecification inst) {
		umlInstance = inst;
		UML2JavaMap.addInstMapEntry(umlInstance, this);
		setDomain(SharedEditingDomainUtil.getInstance().getSharedEditingDomain());
	}

	private void loadPropRefs() {
		for (org.eclipse.uml2.uml.Property p : umlClass.getAllAttributes()) {
			if (p.getName().equals("unterbauModel")) {
				_umlPropUnterbauModel = p;
				continue;
			}
			if (p.getName().equals("xHauptausleger")) {
				_umlPropXHauptausleger = p;
				continue;
			}
			if (p.getName().equals("hauptauslegerPosition")) {
				_umlPropHauptauslegerPosition = p;
				continue;
			}
			if (p.getName().equals("nebenauslegerPosition")) {
				_umlPropNebenauslegerPosition = p;
				continue;
			}
			if (p.getName().equals("gewichtePosition")) {
				_umlPropGewichtePosition = p;
				continue;
			}
			if (p.getName().equals("gewichte")) {
				_umlPropGewichte = p;
				continue;
			}
			if (p.getName().equals("abspannbockPosition")) {
				_umlPropAbspannbockPosition = p;
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

	private org.eclipse.uml2.uml.Property _umlPropUnterbauModel;
	public org.eclipse.uml2.uml.Property umlPropUnterbauModel() {
		if (_umlPropUnterbauModel == null) {
			loadPropRefs();
		}
		return _umlPropUnterbauModel;
	}
	public org.eclipse.uml2.uml.Slot umlSlotUnterbauModel() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropUnterbauModel()) {
				return s;
			}
		}
		return null;
	}
	public UnterbauModel getUnterbauModel() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropUnterbauModel().getName());
		if (targetInst != null) {
			return UML2JavaMap.<UnterbauModel>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setUnterbauModel(UnterbauModel unterbauModel) {
		if (getUnterbauModel() != null) {
			deleteUniLinks(umlInstance, umlPropUnterbauModel());
		}
		if (unterbauModel != null) {
			createUniLink(umlInstance, umlPropUnterbauModel().getName(), unterbauModel.umlInstance());
		}
	}
	public Unterbau unterbauModel_(UnterbauModel unterbauModel) {
		setUnterbauModel(unterbauModel);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropXHauptausleger;
	public org.eclipse.uml2.uml.Property umlPropXHauptausleger() {
		if (_umlPropXHauptausleger == null) {
			loadPropRefs();
		}
		return _umlPropXHauptausleger;
	}
	public org.eclipse.uml2.uml.Slot umlSlotXHauptausleger() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropXHauptausleger()) {
				return s;
			}
		}
		return null;
	}
	public Double getXHauptausleger() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropXHauptausleger().getName());
	}
	public void setXHauptausleger(Double xHauptausleger) {
		setSlotValueByProperty(umlInstance(), umlPropXHauptausleger().getName(), xHauptausleger.toString());
	}
	public Unterbau xHauptausleger_(Double xHauptausleger, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setXHauptausleger(xHauptausleger);
		org.eclipse.uml2.uml.Slot slot = umlSlotXHauptausleger();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropHauptauslegerPosition;
	public org.eclipse.uml2.uml.Property umlPropHauptauslegerPosition() {
		if (_umlPropHauptauslegerPosition == null) {
			loadPropRefs();
		}
		return _umlPropHauptauslegerPosition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotHauptauslegerPosition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropHauptauslegerPosition()) {
				return s;
			}
		}
		return null;
	}
	public AuslegerPosition getHauptauslegerPosition() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropHauptauslegerPosition().getName());
		if (targetInst != null) {
			return UML2JavaMap.<AuslegerPosition>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setHauptauslegerPosition(AuslegerPosition hauptauslegerPosition) {
		if (getHauptauslegerPosition() != null) {
			deleteUniLinks(umlInstance, umlPropHauptauslegerPosition());
		}
		if (hauptauslegerPosition != null) {
			createUniLink(umlInstance, umlPropHauptauslegerPosition().getName(), hauptauslegerPosition.umlInstance());
		}
	}
	public Unterbau hauptauslegerPosition_(AuslegerPosition hauptauslegerPosition) {
		setHauptauslegerPosition(hauptauslegerPosition);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropNebenauslegerPosition;
	public org.eclipse.uml2.uml.Property umlPropNebenauslegerPosition() {
		if (_umlPropNebenauslegerPosition == null) {
			loadPropRefs();
		}
		return _umlPropNebenauslegerPosition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotNebenauslegerPosition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropNebenauslegerPosition()) {
				return s;
			}
		}
		return null;
	}
	public AuslegerPosition getNebenauslegerPosition() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropNebenauslegerPosition().getName());
		if (targetInst != null) {
			return UML2JavaMap.<AuslegerPosition>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setNebenauslegerPosition(AuslegerPosition nebenauslegerPosition) {
		if (getNebenauslegerPosition() != null) {
			deleteUniLinks(umlInstance, umlPropNebenauslegerPosition());
		}
		if (nebenauslegerPosition != null) {
			createUniLink(umlInstance, umlPropNebenauslegerPosition().getName(), nebenauslegerPosition.umlInstance());
		}
	}
	public Unterbau nebenauslegerPosition_(AuslegerPosition nebenauslegerPosition) {
		setNebenauslegerPosition(nebenauslegerPosition);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropGewichtePosition;
	public org.eclipse.uml2.uml.Property umlPropGewichtePosition() {
		if (_umlPropGewichtePosition == null) {
			loadPropRefs();
		}
		return _umlPropGewichtePosition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotGewichtePosition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropGewichtePosition()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Position getGewichtePosition() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropGewichtePosition().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Position>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setGewichtePosition(geometry.Position gewichtePosition) {
		if (getGewichtePosition() != null) {
			deleteUniLinks(umlInstance, umlPropGewichtePosition());
		}
		if (gewichtePosition != null) {
			createUniLink(umlInstance, umlPropGewichtePosition().getName(), gewichtePosition.umlInstance());
		}
	}
	public Unterbau gewichtePosition_(geometry.Position gewichtePosition) {
		setGewichtePosition(gewichtePosition);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropGewichte;
	public org.eclipse.uml2.uml.Property umlPropGewichte() {
		if (_umlPropGewichte == null) {
			loadPropRefs();
		}
		return _umlPropGewichte;
	}
	public org.eclipse.uml2.uml.Slot umlSlotGewichte() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropGewichte()) {
				return s;
			}
		}
		return null;
	}
	public gegengewichte.classes.Gewichtestapel getGewichte() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropGewichte().getName());
		if (targetInst != null) {
			return UML2JavaMap.<gegengewichte.classes.Gewichtestapel>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setGewichte(gegengewichte.classes.Gewichtestapel gewichte) {
		if (getGewichte() != null) {
			deleteUniLinks(umlInstance, umlPropGewichte());
		}
		if (gewichte != null) {
			createUniLink(umlInstance, umlPropGewichte().getName(), gewichte.umlInstance());
		}
	}
	public Unterbau gewichte_(gegengewichte.classes.Gewichtestapel gewichte) {
		setGewichte(gewichte);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropAbspannbockPosition;
	public org.eclipse.uml2.uml.Property umlPropAbspannbockPosition() {
		if (_umlPropAbspannbockPosition == null) {
			loadPropRefs();
		}
		return _umlPropAbspannbockPosition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotAbspannbockPosition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropAbspannbockPosition()) {
				return s;
			}
		}
		return null;
	}
	public AuslegerPosition getAbspannbockPosition() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropAbspannbockPosition().getName());
		if (targetInst != null) {
			return UML2JavaMap.<AuslegerPosition>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setAbspannbockPosition(AuslegerPosition abspannbockPosition) {
		if (getAbspannbockPosition() != null) {
			deleteUniLinks(umlInstance, umlPropAbspannbockPosition());
		}
		if (abspannbockPosition != null) {
			createUniLink(umlInstance, umlPropAbspannbockPosition().getName(), abspannbockPosition.umlInstance());
		}
	}
	public Unterbau abspannbockPosition_(AuslegerPosition abspannbockPosition) {
		setAbspannbockPosition(abspannbockPosition);
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
	public Unterbau shape_(geometry.Shape shape) {
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
	public Unterbau existingComponent_(geometry.ExistingComponent existingComponent) {
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
	public Unterbau color_(geometry.Color color) {
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
	public Unterbau primitiveShape_(geometry.Shape primitiveShape) {
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
	public Unterbau userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature) {
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
	public Unterbau sub_(geometry.TopologyElement... instancesToLink) {
		return sub_(Arrays.asList(instancesToLink));
	}
	public Unterbau sub_(List<geometry.TopologyElement> instancesToLink) {
		List<geometry.TopologyElement> linkList = new AssocList<geometry.TopologyElement>(umlInstance, umlPropSub(), geometry.TopologyElement.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public Unterbau sub_add_(geometry.TopologyElement instanceToLink) {
		getSub().add(instanceToLink);
		return this;
	}
}
