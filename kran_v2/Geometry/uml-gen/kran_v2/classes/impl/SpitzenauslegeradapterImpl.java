package kran_v2.classes.impl;

import kran_v2.classes.*;
import de.iils.dc43.persistence.*;
import de.iils.dc43.persistence.shared.*;
import de.iils.dc43.scriptrule.*;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public class SpitzenauslegeradapterImpl extends InstanceWrapperImpl implements kran_v2.classes.Spitzenauslegeradapter {

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
	public SpitzenauslegeradapterImpl(String name) {
		this(createInstanceWith(name, umlClass));
	}
	
	/**
	 * Create wrapper object for an already existing UML instance
	 * @param inst UML instance to wrap
	 */
	public SpitzenauslegeradapterImpl(org.eclipse.uml2.uml.InstanceSpecification inst) {
		umlInstance = inst;
		UML2JavaMap.addInstMapEntry(umlInstance, this);
		setDomain(SharedEditingDomainUtil.getInstance().getSharedEditingDomain());
	}

	private void loadPropRefs() {
		for (org.eclipse.uml2.uml.Property p : umlClass.getAllAttributes()) {
			if (p.getName().equals("spitzenausleger")) {
				_umlPropSpitzenausleger = p;
				continue;
			}
			if (p.getName().equals("mastschuss")) {
				_umlPropMastschuss = p;
				continue;
			}
			if (p.getName().equals("anfangMast")) {
				_umlPropAnfangMast = p;
				continue;
			}
			if (p.getName().equals("position")) {
				_umlPropPosition = p;
				continue;
			}
			if (p.getName().equals("laenge")) {
				_umlPropLaenge = p;
				continue;
			}
			if (p.getName().equals("endeMast")) {
				_umlPropEndeMast = p;
				continue;
			}
			if (p.getName().equals("breite1")) {
				_umlPropBreite1 = p;
				continue;
			}
			if (p.getName().equals("volumen")) {
				_umlPropVolumen = p;
				continue;
			}
			if (p.getName().equals("schwerpunktx")) {
				_umlPropSchwerpunktx = p;
				continue;
			}
			if (p.getName().equals("schwerpunkty")) {
				_umlPropSchwerpunkty = p;
				continue;
			}
			if (p.getName().equals("schwerpunktz")) {
				_umlPropSchwerpunktz = p;
				continue;
			}
			if (p.getName().equals("gschwerpunktx")) {
				_umlPropGschwerpunktx = p;
				continue;
			}
			if (p.getName().equals("gschwerpunkty")) {
				_umlPropGschwerpunkty = p;
				continue;
			}
			if (p.getName().equals("gschwerpunktz")) {
				_umlPropGschwerpunktz = p;
				continue;
			}
			if (p.getName().equals("gschwerpunktxk")) {
				_umlPropGschwerpunktxk = p;
				continue;
			}
			if (p.getName().equals("gschwerpunktyk")) {
				_umlPropGschwerpunktyk = p;
				continue;
			}
			if (p.getName().equals("gschwerpunktzk")) {
				_umlPropGschwerpunktzk = p;
				continue;
			}
			if (p.getName().equals("effektivelaenge")) {
				_umlPropEffektivelaenge = p;
				continue;
			}
			if (p.getName().equals("typ")) {
				_umlPropTyp = p;
				continue;
			}
			if (p.getName().equals("absoluteposition")) {
				_umlPropAbsoluteposition = p;
				continue;
			}
			if (p.getName().equals("effektivehoehe")) {
				_umlPropEffektivehoehe = p;
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

	private org.eclipse.uml2.uml.Property _umlPropSpitzenausleger;
	public org.eclipse.uml2.uml.Property umlPropSpitzenausleger() {
		if (_umlPropSpitzenausleger == null) {
			loadPropRefs();
		}
		return _umlPropSpitzenausleger;
	}
	public org.eclipse.uml2.uml.Slot umlSlotSpitzenausleger() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSpitzenausleger()) {
				return s;
			}
		}
		return null;
	}
	public Spitzenausleger getSpitzenausleger() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropSpitzenausleger().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Spitzenausleger>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setSpitzenausleger(Spitzenausleger spitzenausleger) {
		if (getSpitzenausleger() != null) {
			deleteUniLinks(umlInstance, umlPropSpitzenausleger());
		}
		if (spitzenausleger != null) {
			createUniLink(umlInstance, umlPropSpitzenausleger().getName(), spitzenausleger.umlInstance());
		}
	}
	public Spitzenauslegeradapter spitzenausleger_(Spitzenausleger spitzenausleger) {
		setSpitzenausleger(spitzenausleger);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMastschuss;
	public org.eclipse.uml2.uml.Property umlPropMastschuss() {
		if (_umlPropMastschuss == null) {
			loadPropRefs();
		}
		return _umlPropMastschuss;
	}
	public List<org.eclipse.uml2.uml.Slot> umlSlotMastschuss() {
		List<org.eclipse.uml2.uml.Slot> slots = new ArrayList<org.eclipse.uml2.uml.Slot>();
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMastschuss()) {
				slots.add(s);
			}
		}
		return slots;
	}
	public List<gittermastschuss.classes.Mastschuss> getMastschuss() {
		return new AssocList<gittermastschuss.classes.Mastschuss>(umlInstance, umlPropMastschuss(), gittermastschuss.classes.Mastschuss.class);
	}
	public Spitzenauslegeradapter mastschuss_(gittermastschuss.classes.Mastschuss... instancesToLink) {
		return mastschuss_(Arrays.asList(instancesToLink));
	}
	public Spitzenauslegeradapter mastschuss_(List<gittermastschuss.classes.Mastschuss> instancesToLink) {
		List<gittermastschuss.classes.Mastschuss> linkList = new AssocList<gittermastschuss.classes.Mastschuss>(umlInstance, umlPropMastschuss(), gittermastschuss.classes.Mastschuss.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public Spitzenauslegeradapter mastschuss_add_(gittermastschuss.classes.Mastschuss instanceToLink) {
		getMastschuss().add(instanceToLink);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropAnfangMast;
	public org.eclipse.uml2.uml.Property umlPropAnfangMast() {
		if (_umlPropAnfangMast == null) {
			loadPropRefs();
		}
		return _umlPropAnfangMast;
	}
	public org.eclipse.uml2.uml.Slot umlSlotAnfangMast() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropAnfangMast()) {
				return s;
			}
		}
		return null;
	}
	public AnfangMast getAnfangMast() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropAnfangMast().getName());
		if (targetInst != null) {
			return UML2JavaMap.<AnfangMast>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setAnfangMast(AnfangMast anfangMast) {
		if (getAnfangMast() != null) {
			deleteUniLinks(umlInstance, umlPropAnfangMast());
		}
		if (anfangMast != null) {
			createUniLink(umlInstance, umlPropAnfangMast().getName(), anfangMast.umlInstance());
		}
	}
	public Spitzenauslegeradapter anfangMast_(AnfangMast anfangMast) {
		setAnfangMast(anfangMast);
		return this;
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
	public Spitzenauslegeradapter position_(geometry.Position position) {
		setPosition(position);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropLaenge;
	public org.eclipse.uml2.uml.Property umlPropLaenge() {
		if (_umlPropLaenge == null) {
			loadPropRefs();
		}
		return _umlPropLaenge;
	}
	public org.eclipse.uml2.uml.Slot umlSlotLaenge() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropLaenge()) {
				return s;
			}
		}
		return null;
	}
	public Double getLaenge() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropLaenge().getName());
	}
	public void setLaenge(Double laenge) {
		setSlotValueByProperty(umlInstance(), umlPropLaenge().getName(), laenge.toString());
	}
	public Spitzenauslegeradapter laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLaenge(laenge);
		org.eclipse.uml2.uml.Slot slot = umlSlotLaenge();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropEndeMast;
	public org.eclipse.uml2.uml.Property umlPropEndeMast() {
		if (_umlPropEndeMast == null) {
			loadPropRefs();
		}
		return _umlPropEndeMast;
	}
	public org.eclipse.uml2.uml.Slot umlSlotEndeMast() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropEndeMast()) {
				return s;
			}
		}
		return null;
	}
	public EndeMast getEndeMast() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropEndeMast().getName());
		if (targetInst != null) {
			return UML2JavaMap.<EndeMast>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setEndeMast(EndeMast endeMast) {
		if (getEndeMast() != null) {
			deleteUniLinks(umlInstance, umlPropEndeMast());
		}
		if (endeMast != null) {
			createUniLink(umlInstance, umlPropEndeMast().getName(), endeMast.umlInstance());
		}
	}
	public Spitzenauslegeradapter endeMast_(EndeMast endeMast) {
		setEndeMast(endeMast);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropBreite1;
	public org.eclipse.uml2.uml.Property umlPropBreite1() {
		if (_umlPropBreite1 == null) {
			loadPropRefs();
		}
		return _umlPropBreite1;
	}
	public org.eclipse.uml2.uml.Slot umlSlotBreite1() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropBreite1()) {
				return s;
			}
		}
		return null;
	}
	public Double getBreite1() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropBreite1().getName());
	}
	public void setBreite1(Double breite1) {
		setSlotValueByProperty(umlInstance(), umlPropBreite1().getName(), breite1.toString());
	}
	public Spitzenauslegeradapter breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setBreite1(breite1);
		org.eclipse.uml2.uml.Slot slot = umlSlotBreite1();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropVolumen;
	public org.eclipse.uml2.uml.Property umlPropVolumen() {
		if (_umlPropVolumen == null) {
			loadPropRefs();
		}
		return _umlPropVolumen;
	}
	public org.eclipse.uml2.uml.Slot umlSlotVolumen() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropVolumen()) {
				return s;
			}
		}
		return null;
	}
	public Double getVolumen() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropVolumen().getName());
	}
	public void setVolumen(Double volumen) {
		setSlotValueByProperty(umlInstance(), umlPropVolumen().getName(), volumen.toString());
	}
	public Spitzenauslegeradapter volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setVolumen(volumen);
		org.eclipse.uml2.uml.Slot slot = umlSlotVolumen();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropSchwerpunktx;
	public org.eclipse.uml2.uml.Property umlPropSchwerpunktx() {
		if (_umlPropSchwerpunktx == null) {
			loadPropRefs();
		}
		return _umlPropSchwerpunktx;
	}
	public org.eclipse.uml2.uml.Slot umlSlotSchwerpunktx() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSchwerpunktx()) {
				return s;
			}
		}
		return null;
	}
	public Double getSchwerpunktx() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropSchwerpunktx().getName());
	}
	public void setSchwerpunktx(Double schwerpunktx) {
		setSlotValueByProperty(umlInstance(), umlPropSchwerpunktx().getName(), schwerpunktx.toString());
	}
	public Spitzenauslegeradapter schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setSchwerpunktx(schwerpunktx);
		org.eclipse.uml2.uml.Slot slot = umlSlotSchwerpunktx();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropSchwerpunkty;
	public org.eclipse.uml2.uml.Property umlPropSchwerpunkty() {
		if (_umlPropSchwerpunkty == null) {
			loadPropRefs();
		}
		return _umlPropSchwerpunkty;
	}
	public org.eclipse.uml2.uml.Slot umlSlotSchwerpunkty() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSchwerpunkty()) {
				return s;
			}
		}
		return null;
	}
	public Double getSchwerpunkty() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropSchwerpunkty().getName());
	}
	public void setSchwerpunkty(Double schwerpunkty) {
		setSlotValueByProperty(umlInstance(), umlPropSchwerpunkty().getName(), schwerpunkty.toString());
	}
	public Spitzenauslegeradapter schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setSchwerpunkty(schwerpunkty);
		org.eclipse.uml2.uml.Slot slot = umlSlotSchwerpunkty();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropSchwerpunktz;
	public org.eclipse.uml2.uml.Property umlPropSchwerpunktz() {
		if (_umlPropSchwerpunktz == null) {
			loadPropRefs();
		}
		return _umlPropSchwerpunktz;
	}
	public org.eclipse.uml2.uml.Slot umlSlotSchwerpunktz() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSchwerpunktz()) {
				return s;
			}
		}
		return null;
	}
	public Double getSchwerpunktz() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropSchwerpunktz().getName());
	}
	public void setSchwerpunktz(Double schwerpunktz) {
		setSlotValueByProperty(umlInstance(), umlPropSchwerpunktz().getName(), schwerpunktz.toString());
	}
	public Spitzenauslegeradapter schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setSchwerpunktz(schwerpunktz);
		org.eclipse.uml2.uml.Slot slot = umlSlotSchwerpunktz();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropGschwerpunktx;
	public org.eclipse.uml2.uml.Property umlPropGschwerpunktx() {
		if (_umlPropGschwerpunktx == null) {
			loadPropRefs();
		}
		return _umlPropGschwerpunktx;
	}
	public org.eclipse.uml2.uml.Slot umlSlotGschwerpunktx() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropGschwerpunktx()) {
				return s;
			}
		}
		return null;
	}
	public Double getGschwerpunktx() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropGschwerpunktx().getName());
	}
	public void setGschwerpunktx(Double gschwerpunktx) {
		setSlotValueByProperty(umlInstance(), umlPropGschwerpunktx().getName(), gschwerpunktx.toString());
	}
	public Spitzenauslegeradapter gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setGschwerpunktx(gschwerpunktx);
		org.eclipse.uml2.uml.Slot slot = umlSlotGschwerpunktx();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropGschwerpunkty;
	public org.eclipse.uml2.uml.Property umlPropGschwerpunkty() {
		if (_umlPropGschwerpunkty == null) {
			loadPropRefs();
		}
		return _umlPropGschwerpunkty;
	}
	public org.eclipse.uml2.uml.Slot umlSlotGschwerpunkty() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropGschwerpunkty()) {
				return s;
			}
		}
		return null;
	}
	public Double getGschwerpunkty() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropGschwerpunkty().getName());
	}
	public void setGschwerpunkty(Double gschwerpunkty) {
		setSlotValueByProperty(umlInstance(), umlPropGschwerpunkty().getName(), gschwerpunkty.toString());
	}
	public Spitzenauslegeradapter gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setGschwerpunkty(gschwerpunkty);
		org.eclipse.uml2.uml.Slot slot = umlSlotGschwerpunkty();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropGschwerpunktz;
	public org.eclipse.uml2.uml.Property umlPropGschwerpunktz() {
		if (_umlPropGschwerpunktz == null) {
			loadPropRefs();
		}
		return _umlPropGschwerpunktz;
	}
	public org.eclipse.uml2.uml.Slot umlSlotGschwerpunktz() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropGschwerpunktz()) {
				return s;
			}
		}
		return null;
	}
	public Double getGschwerpunktz() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropGschwerpunktz().getName());
	}
	public void setGschwerpunktz(Double gschwerpunktz) {
		setSlotValueByProperty(umlInstance(), umlPropGschwerpunktz().getName(), gschwerpunktz.toString());
	}
	public Spitzenauslegeradapter gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setGschwerpunktz(gschwerpunktz);
		org.eclipse.uml2.uml.Slot slot = umlSlotGschwerpunktz();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropGschwerpunktxk;
	public org.eclipse.uml2.uml.Property umlPropGschwerpunktxk() {
		if (_umlPropGschwerpunktxk == null) {
			loadPropRefs();
		}
		return _umlPropGschwerpunktxk;
	}
	public org.eclipse.uml2.uml.Slot umlSlotGschwerpunktxk() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropGschwerpunktxk()) {
				return s;
			}
		}
		return null;
	}
	public Double getGschwerpunktxk() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropGschwerpunktxk().getName());
	}
	public void setGschwerpunktxk(Double gschwerpunktxk) {
		setSlotValueByProperty(umlInstance(), umlPropGschwerpunktxk().getName(), gschwerpunktxk.toString());
	}
	public Spitzenauslegeradapter gschwerpunktxk_(Double gschwerpunktxk, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setGschwerpunktxk(gschwerpunktxk);
		org.eclipse.uml2.uml.Slot slot = umlSlotGschwerpunktxk();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropGschwerpunktyk;
	public org.eclipse.uml2.uml.Property umlPropGschwerpunktyk() {
		if (_umlPropGschwerpunktyk == null) {
			loadPropRefs();
		}
		return _umlPropGschwerpunktyk;
	}
	public org.eclipse.uml2.uml.Slot umlSlotGschwerpunktyk() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropGschwerpunktyk()) {
				return s;
			}
		}
		return null;
	}
	public Double getGschwerpunktyk() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropGschwerpunktyk().getName());
	}
	public void setGschwerpunktyk(Double gschwerpunktyk) {
		setSlotValueByProperty(umlInstance(), umlPropGschwerpunktyk().getName(), gschwerpunktyk.toString());
	}
	public Spitzenauslegeradapter gschwerpunktyk_(Double gschwerpunktyk, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setGschwerpunktyk(gschwerpunktyk);
		org.eclipse.uml2.uml.Slot slot = umlSlotGschwerpunktyk();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropGschwerpunktzk;
	public org.eclipse.uml2.uml.Property umlPropGschwerpunktzk() {
		if (_umlPropGschwerpunktzk == null) {
			loadPropRefs();
		}
		return _umlPropGschwerpunktzk;
	}
	public org.eclipse.uml2.uml.Slot umlSlotGschwerpunktzk() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropGschwerpunktzk()) {
				return s;
			}
		}
		return null;
	}
	public Double getGschwerpunktzk() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropGschwerpunktzk().getName());
	}
	public void setGschwerpunktzk(Double gschwerpunktzk) {
		setSlotValueByProperty(umlInstance(), umlPropGschwerpunktzk().getName(), gschwerpunktzk.toString());
	}
	public Spitzenauslegeradapter gschwerpunktzk_(Double gschwerpunktzk, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setGschwerpunktzk(gschwerpunktzk);
		org.eclipse.uml2.uml.Slot slot = umlSlotGschwerpunktzk();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropEffektivelaenge;
	public org.eclipse.uml2.uml.Property umlPropEffektivelaenge() {
		if (_umlPropEffektivelaenge == null) {
			loadPropRefs();
		}
		return _umlPropEffektivelaenge;
	}
	public org.eclipse.uml2.uml.Slot umlSlotEffektivelaenge() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropEffektivelaenge()) {
				return s;
			}
		}
		return null;
	}
	public Double getEffektivelaenge() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropEffektivelaenge().getName());
	}
	public void setEffektivelaenge(Double effektivelaenge) {
		setSlotValueByProperty(umlInstance(), umlPropEffektivelaenge().getName(), effektivelaenge.toString());
	}
	public Spitzenauslegeradapter effektivelaenge_(Double effektivelaenge, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setEffektivelaenge(effektivelaenge);
		org.eclipse.uml2.uml.Slot slot = umlSlotEffektivelaenge();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropTyp;
	public org.eclipse.uml2.uml.Property umlPropTyp() {
		if (_umlPropTyp == null) {
			loadPropRefs();
		}
		return _umlPropTyp;
	}
	public org.eclipse.uml2.uml.Slot umlSlotTyp() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropTyp()) {
				return s;
			}
		}
		return null;
	}
	public Double getTyp() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropTyp().getName());
	}
	public void setTyp(Double typ) {
		setSlotValueByProperty(umlInstance(), umlPropTyp().getName(), typ.toString());
	}
	public Spitzenauslegeradapter typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setTyp(typ);
		org.eclipse.uml2.uml.Slot slot = umlSlotTyp();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropAbsoluteposition;
	public org.eclipse.uml2.uml.Property umlPropAbsoluteposition() {
		if (_umlPropAbsoluteposition == null) {
			loadPropRefs();
		}
		return _umlPropAbsoluteposition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotAbsoluteposition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropAbsoluteposition()) {
				return s;
			}
		}
		return null;
	}
	public geometry.Position getAbsoluteposition() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropAbsoluteposition().getName());
		if (targetInst != null) {
			return UML2JavaMap.<geometry.Position>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setAbsoluteposition(geometry.Position absoluteposition) {
		if (getAbsoluteposition() != null) {
			deleteUniLinks(umlInstance, umlPropAbsoluteposition());
		}
		if (absoluteposition != null) {
			createUniLink(umlInstance, umlPropAbsoluteposition().getName(), absoluteposition.umlInstance());
		}
	}
	public Spitzenauslegeradapter absoluteposition_(geometry.Position absoluteposition) {
		setAbsoluteposition(absoluteposition);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropEffektivehoehe;
	public org.eclipse.uml2.uml.Property umlPropEffektivehoehe() {
		if (_umlPropEffektivehoehe == null) {
			loadPropRefs();
		}
		return _umlPropEffektivehoehe;
	}
	public org.eclipse.uml2.uml.Slot umlSlotEffektivehoehe() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropEffektivehoehe()) {
				return s;
			}
		}
		return null;
	}
	public Double getEffektivehoehe() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropEffektivehoehe().getName());
	}
	public void setEffektivehoehe(Double effektivehoehe) {
		setSlotValueByProperty(umlInstance(), umlPropEffektivehoehe().getName(), effektivehoehe.toString());
	}
	public Spitzenauslegeradapter effektivehoehe_(Double effektivehoehe, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setEffektivehoehe(effektivehoehe);
		org.eclipse.uml2.uml.Slot slot = umlSlotEffektivehoehe();
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
	public Spitzenauslegeradapter shape_(geometry.Shape shape) {
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
	public Spitzenauslegeradapter existingComponent_(geometry.ExistingComponent existingComponent) {
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
	public Spitzenauslegeradapter color_(geometry.Color color) {
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
	public Spitzenauslegeradapter primitiveShape_(geometry.Shape primitiveShape) {
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
	public Spitzenauslegeradapter userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature) {
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
	public Spitzenauslegeradapter sub_(geometry.TopologyElement... instancesToLink) {
		return sub_(Arrays.asList(instancesToLink));
	}
	public Spitzenauslegeradapter sub_(List<geometry.TopologyElement> instancesToLink) {
		List<geometry.TopologyElement> linkList = new AssocList<geometry.TopologyElement>(umlInstance, umlPropSub(), geometry.TopologyElement.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public Spitzenauslegeradapter sub_add_(geometry.TopologyElement instanceToLink) {
		getSub().add(instanceToLink);
		return this;
	}
}
