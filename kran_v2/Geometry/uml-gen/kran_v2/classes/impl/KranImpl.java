package kran_v2.classes.impl;

import kran_v2.classes.*;
import de.iils.dc43.persistence.*;
import de.iils.dc43.persistence.shared.*;
import de.iils.dc43.scriptrule.*;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public class KranImpl extends InstanceWrapperImpl implements kran_v2.classes.Kran {

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
	public KranImpl(String name) {
		this(createInstanceWith(name, umlClass));
	}
	
	/**
	 * Create wrapper object for an already existing UML instance
	 * @param inst UML instance to wrap
	 */
	public KranImpl(org.eclipse.uml2.uml.InstanceSpecification inst) {
		umlInstance = inst;
		UML2JavaMap.addInstMapEntry(umlInstance, this);
		setDomain(SharedEditingDomainUtil.getInstance().getSharedEditingDomain());
	}

	private void loadPropRefs() {
		for (org.eclipse.uml2.uml.Property p : umlClass.getAllAttributes()) {
			if (p.getName().equals("mast")) {
				_umlPropMast = p;
				continue;
			}
			if (p.getName().equals("unterbau")) {
				_umlPropUnterbau = p;
				continue;
			}
			if (p.getName().equals("hauptausleger")) {
				_umlPropHauptausleger = p;
				continue;
			}
			if (p.getName().equals("fahrwerk")) {
				_umlPropFahrwerk = p;
				continue;
			}
			if (p.getName().equals("nebenausleger")) {
				_umlPropNebenausleger = p;
				continue;
			}
			if (p.getName().equals("hatunterbau")) {
				_umlPropHatunterbau = p;
				continue;
			}
			if (p.getName().equals("hathauptausleger")) {
				_umlPropHathauptausleger = p;
				continue;
			}
			if (p.getName().equals("solid")) {
				_umlPropSolid = p;
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
			if (p.getName().equals("mastvolumen")) {
				_umlPropMastvolumen = p;
				continue;
			}
			if (p.getName().equals("mastdichte")) {
				_umlPropMastdichte = p;
				continue;
			}
			if (p.getName().equals("mschwerpunktx")) {
				_umlPropMschwerpunktx = p;
				continue;
			}
			if (p.getName().equals("mschwerpunkty")) {
				_umlPropMschwerpunkty = p;
				continue;
			}
			if (p.getName().equals("mschwerpunktz")) {
				_umlPropMschwerpunktz = p;
				continue;
			}
			if (p.getName().equals("mastmasse")) {
				_umlPropMastmasse = p;
				continue;
			}
			if (p.getName().equals("masse")) {
				_umlPropMasse = p;
				continue;
			}
			if (p.getName().equals("arbeitsbereichx")) {
				_umlPropArbeitsbereichx = p;
				continue;
			}
			if (p.getName().equals("mastvorne")) {
				_umlPropMastvorne = p;
				continue;
			}
			if (p.getName().equals("last")) {
				_umlPropLast = p;
				continue;
			}
			if (p.getName().equals("input")) {
				_umlPropInput = p;
				continue;
			}
			if (p.getName().equals("abspannbock")) {
				_umlPropAbspannbock = p;
				continue;
			}
			if (p.getName().equals("verbindungsseil")) {
				_umlPropVerbindungsseil = p;
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

	private org.eclipse.uml2.uml.Property _umlPropMast;
	public org.eclipse.uml2.uml.Property umlPropMast() {
		if (_umlPropMast == null) {
			loadPropRefs();
		}
		return _umlPropMast;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMast() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMast()) {
				return s;
			}
		}
		return null;
	}
	public Mast getMast() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropMast().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Mast>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setMast(Mast mast) {
		if (getMast() != null) {
			deleteUniLinks(umlInstance, umlPropMast());
		}
		if (mast != null) {
			createUniLink(umlInstance, umlPropMast().getName(), mast.umlInstance());
		}
	}
	public Kran mast_(Mast mast) {
		setMast(mast);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropUnterbau;
	public org.eclipse.uml2.uml.Property umlPropUnterbau() {
		if (_umlPropUnterbau == null) {
			loadPropRefs();
		}
		return _umlPropUnterbau;
	}
	public org.eclipse.uml2.uml.Slot umlSlotUnterbau() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropUnterbau()) {
				return s;
			}
		}
		return null;
	}
	public Unterbau getUnterbau() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropUnterbau().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Unterbau>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setUnterbau(Unterbau unterbau) {
		if (getUnterbau() != null) {
			deleteUniLinks(umlInstance, umlPropUnterbau());
		}
		if (unterbau != null) {
			createUniLink(umlInstance, umlPropUnterbau().getName(), unterbau.umlInstance());
		}
	}
	public Kran unterbau_(Unterbau unterbau) {
		setUnterbau(unterbau);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropHauptausleger;
	public org.eclipse.uml2.uml.Property umlPropHauptausleger() {
		if (_umlPropHauptausleger == null) {
			loadPropRefs();
		}
		return _umlPropHauptausleger;
	}
	public org.eclipse.uml2.uml.Slot umlSlotHauptausleger() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropHauptausleger()) {
				return s;
			}
		}
		return null;
	}
	public Hauptausleger getHauptausleger() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropHauptausleger().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Hauptausleger>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setHauptausleger(Hauptausleger hauptausleger) {
		if (getHauptausleger() != null) {
			deleteUniLinks(umlInstance, umlPropHauptausleger());
		}
		if (hauptausleger != null) {
			createUniLink(umlInstance, umlPropHauptausleger().getName(), hauptausleger.umlInstance());
		}
	}
	public Kran hauptausleger_(Hauptausleger hauptausleger) {
		setHauptausleger(hauptausleger);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropFahrwerk;
	public org.eclipse.uml2.uml.Property umlPropFahrwerk() {
		if (_umlPropFahrwerk == null) {
			loadPropRefs();
		}
		return _umlPropFahrwerk;
	}
	public org.eclipse.uml2.uml.Slot umlSlotFahrwerk() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropFahrwerk()) {
				return s;
			}
		}
		return null;
	}
	public raupe.classes.Fahrwerk getFahrwerk() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropFahrwerk().getName());
		if (targetInst != null) {
			return UML2JavaMap.<raupe.classes.Fahrwerk>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setFahrwerk(raupe.classes.Fahrwerk fahrwerk) {
		if (getFahrwerk() != null) {
			deleteUniLinks(umlInstance, umlPropFahrwerk());
		}
		if (fahrwerk != null) {
			createUniLink(umlInstance, umlPropFahrwerk().getName(), fahrwerk.umlInstance());
		}
	}
	public Kran fahrwerk_(raupe.classes.Fahrwerk fahrwerk) {
		setFahrwerk(fahrwerk);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropNebenausleger;
	public org.eclipse.uml2.uml.Property umlPropNebenausleger() {
		if (_umlPropNebenausleger == null) {
			loadPropRefs();
		}
		return _umlPropNebenausleger;
	}
	public org.eclipse.uml2.uml.Slot umlSlotNebenausleger() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropNebenausleger()) {
				return s;
			}
		}
		return null;
	}
	public Nebenausleger getNebenausleger() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropNebenausleger().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Nebenausleger>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setNebenausleger(Nebenausleger nebenausleger) {
		if (getNebenausleger() != null) {
			deleteUniLinks(umlInstance, umlPropNebenausleger());
		}
		if (nebenausleger != null) {
			createUniLink(umlInstance, umlPropNebenausleger().getName(), nebenausleger.umlInstance());
		}
	}
	public Kran nebenausleger_(Nebenausleger nebenausleger) {
		setNebenausleger(nebenausleger);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropHatunterbau;
	public org.eclipse.uml2.uml.Property umlPropHatunterbau() {
		if (_umlPropHatunterbau == null) {
			loadPropRefs();
		}
		return _umlPropHatunterbau;
	}
	public org.eclipse.uml2.uml.Slot umlSlotHatunterbau() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropHatunterbau()) {
				return s;
			}
		}
		return null;
	}
	public Boolean isHatunterbau() {
		String stringValue = getSlotStringValueByProperty(umlInstance(), umlPropHatunterbau().getName());
		if (stringValue == null) {
			return null;
		}
		return stringValue.toUpperCase().equals("TRUE");
	}
	public void setHatunterbau(Boolean hatunterbau) {
		setSlotValueByProperty(umlInstance(), umlPropHatunterbau().getName(), hatunterbau.toString());
	}
	public Kran hatunterbau_(Boolean hatunterbau, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setHatunterbau(hatunterbau);
		org.eclipse.uml2.uml.Slot slot = umlSlotHatunterbau();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropHathauptausleger;
	public org.eclipse.uml2.uml.Property umlPropHathauptausleger() {
		if (_umlPropHathauptausleger == null) {
			loadPropRefs();
		}
		return _umlPropHathauptausleger;
	}
	public org.eclipse.uml2.uml.Slot umlSlotHathauptausleger() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropHathauptausleger()) {
				return s;
			}
		}
		return null;
	}
	public Boolean isHathauptausleger() {
		String stringValue = getSlotStringValueByProperty(umlInstance(), umlPropHathauptausleger().getName());
		if (stringValue == null) {
			return null;
		}
		return stringValue.toUpperCase().equals("TRUE");
	}
	public void setHathauptausleger(Boolean hathauptausleger) {
		setSlotValueByProperty(umlInstance(), umlPropHathauptausleger().getName(), hathauptausleger.toString());
	}
	public Kran hathauptausleger_(Boolean hathauptausleger, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setHathauptausleger(hathauptausleger);
		org.eclipse.uml2.uml.Slot slot = umlSlotHathauptausleger();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropSolid;
	public org.eclipse.uml2.uml.Property umlPropSolid() {
		if (_umlPropSolid == null) {
			loadPropRefs();
		}
		return _umlPropSolid;
	}
	public org.eclipse.uml2.uml.Slot umlSlotSolid() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropSolid()) {
				return s;
			}
		}
		return null;
	}
	public Boolean isSolid() {
		String stringValue = getSlotStringValueByProperty(umlInstance(), umlPropSolid().getName());
		if (stringValue == null) {
			return null;
		}
		return stringValue.toUpperCase().equals("TRUE");
	}
	public void setSolid(Boolean solid) {
		setSlotValueByProperty(umlInstance(), umlPropSolid().getName(), solid.toString());
	}
	public Kran solid_(Boolean solid, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setSolid(solid);
		org.eclipse.uml2.uml.Slot slot = umlSlotSolid();
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
	public Kran schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos) {
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
	public Kran schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos) {
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
	public Kran schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setSchwerpunktz(schwerpunktz);
		org.eclipse.uml2.uml.Slot slot = umlSlotSchwerpunktz();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMastvolumen;
	public org.eclipse.uml2.uml.Property umlPropMastvolumen() {
		if (_umlPropMastvolumen == null) {
			loadPropRefs();
		}
		return _umlPropMastvolumen;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMastvolumen() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMastvolumen()) {
				return s;
			}
		}
		return null;
	}
	public Double getMastvolumen() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropMastvolumen().getName());
	}
	public void setMastvolumen(Double mastvolumen) {
		setSlotValueByProperty(umlInstance(), umlPropMastvolumen().getName(), mastvolumen.toString());
	}
	public Kran mastvolumen_(Double mastvolumen, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMastvolumen(mastvolumen);
		org.eclipse.uml2.uml.Slot slot = umlSlotMastvolumen();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMastdichte;
	public org.eclipse.uml2.uml.Property umlPropMastdichte() {
		if (_umlPropMastdichte == null) {
			loadPropRefs();
		}
		return _umlPropMastdichte;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMastdichte() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMastdichte()) {
				return s;
			}
		}
		return null;
	}
	public Double getMastdichte() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropMastdichte().getName());
	}
	public void setMastdichte(Double mastdichte) {
		setSlotValueByProperty(umlInstance(), umlPropMastdichte().getName(), mastdichte.toString());
	}
	public Kran mastdichte_(Double mastdichte, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMastdichte(mastdichte);
		org.eclipse.uml2.uml.Slot slot = umlSlotMastdichte();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMschwerpunktx;
	public org.eclipse.uml2.uml.Property umlPropMschwerpunktx() {
		if (_umlPropMschwerpunktx == null) {
			loadPropRefs();
		}
		return _umlPropMschwerpunktx;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMschwerpunktx() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMschwerpunktx()) {
				return s;
			}
		}
		return null;
	}
	public Double getMschwerpunktx() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropMschwerpunktx().getName());
	}
	public void setMschwerpunktx(Double mschwerpunktx) {
		setSlotValueByProperty(umlInstance(), umlPropMschwerpunktx().getName(), mschwerpunktx.toString());
	}
	public Kran mschwerpunktx_(Double mschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMschwerpunktx(mschwerpunktx);
		org.eclipse.uml2.uml.Slot slot = umlSlotMschwerpunktx();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMschwerpunkty;
	public org.eclipse.uml2.uml.Property umlPropMschwerpunkty() {
		if (_umlPropMschwerpunkty == null) {
			loadPropRefs();
		}
		return _umlPropMschwerpunkty;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMschwerpunkty() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMschwerpunkty()) {
				return s;
			}
		}
		return null;
	}
	public Double getMschwerpunkty() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropMschwerpunkty().getName());
	}
	public void setMschwerpunkty(Double mschwerpunkty) {
		setSlotValueByProperty(umlInstance(), umlPropMschwerpunkty().getName(), mschwerpunkty.toString());
	}
	public Kran mschwerpunkty_(Double mschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMschwerpunkty(mschwerpunkty);
		org.eclipse.uml2.uml.Slot slot = umlSlotMschwerpunkty();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMschwerpunktz;
	public org.eclipse.uml2.uml.Property umlPropMschwerpunktz() {
		if (_umlPropMschwerpunktz == null) {
			loadPropRefs();
		}
		return _umlPropMschwerpunktz;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMschwerpunktz() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMschwerpunktz()) {
				return s;
			}
		}
		return null;
	}
	public Double getMschwerpunktz() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropMschwerpunktz().getName());
	}
	public void setMschwerpunktz(Double mschwerpunktz) {
		setSlotValueByProperty(umlInstance(), umlPropMschwerpunktz().getName(), mschwerpunktz.toString());
	}
	public Kran mschwerpunktz_(Double mschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMschwerpunktz(mschwerpunktz);
		org.eclipse.uml2.uml.Slot slot = umlSlotMschwerpunktz();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMastmasse;
	public org.eclipse.uml2.uml.Property umlPropMastmasse() {
		if (_umlPropMastmasse == null) {
			loadPropRefs();
		}
		return _umlPropMastmasse;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMastmasse() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMastmasse()) {
				return s;
			}
		}
		return null;
	}
	public Double getMastmasse() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropMastmasse().getName());
	}
	public void setMastmasse(Double mastmasse) {
		setSlotValueByProperty(umlInstance(), umlPropMastmasse().getName(), mastmasse.toString());
	}
	public Kran mastmasse_(Double mastmasse, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMastmasse(mastmasse);
		org.eclipse.uml2.uml.Slot slot = umlSlotMastmasse();
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
	public Kran masse_(Double masse, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMasse(masse);
		org.eclipse.uml2.uml.Slot slot = umlSlotMasse();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropArbeitsbereichx;
	public org.eclipse.uml2.uml.Property umlPropArbeitsbereichx() {
		if (_umlPropArbeitsbereichx == null) {
			loadPropRefs();
		}
		return _umlPropArbeitsbereichx;
	}
	public org.eclipse.uml2.uml.Slot umlSlotArbeitsbereichx() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropArbeitsbereichx()) {
				return s;
			}
		}
		return null;
	}
	public Double getArbeitsbereichx() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropArbeitsbereichx().getName());
	}
	public void setArbeitsbereichx(Double arbeitsbereichx) {
		setSlotValueByProperty(umlInstance(), umlPropArbeitsbereichx().getName(), arbeitsbereichx.toString());
	}
	public Kran arbeitsbereichx_(Double arbeitsbereichx, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setArbeitsbereichx(arbeitsbereichx);
		org.eclipse.uml2.uml.Slot slot = umlSlotArbeitsbereichx();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMastvorne;
	public org.eclipse.uml2.uml.Property umlPropMastvorne() {
		if (_umlPropMastvorne == null) {
			loadPropRefs();
		}
		return _umlPropMastvorne;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMastvorne() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMastvorne()) {
				return s;
			}
		}
		return null;
	}
	public Mast getMastvorne() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropMastvorne().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Mast>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setMastvorne(Mast mastvorne) {
		if (getMastvorne() != null) {
			deleteUniLinks(umlInstance, umlPropMastvorne());
		}
		if (mastvorne != null) {
			createUniLink(umlInstance, umlPropMastvorne().getName(), mastvorne.umlInstance());
		}
	}
	public Kran mastvorne_(Mast mastvorne) {
		setMastvorne(mastvorne);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropLast;
	public org.eclipse.uml2.uml.Property umlPropLast() {
		if (_umlPropLast == null) {
			loadPropRefs();
		}
		return _umlPropLast;
	}
	public org.eclipse.uml2.uml.Slot umlSlotLast() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropLast()) {
				return s;
			}
		}
		return null;
	}
	public Double getLast() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropLast().getName());
	}
	public void setLast(Double last) {
		setSlotValueByProperty(umlInstance(), umlPropLast().getName(), last.toString());
	}
	public Kran last_(Double last, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLast(last);
		org.eclipse.uml2.uml.Slot slot = umlSlotLast();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropInput;
	public org.eclipse.uml2.uml.Property umlPropInput() {
		if (_umlPropInput == null) {
			loadPropRefs();
		}
		return _umlPropInput;
	}
	public org.eclipse.uml2.uml.Slot umlSlotInput() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropInput()) {
				return s;
			}
		}
		return null;
	}
	public Input getInput() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropInput().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Input>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setInput(Input input) {
		if (getInput() != null) {
			deleteUniLinks(umlInstance, umlPropInput());
		}
		if (input != null) {
			createUniLink(umlInstance, umlPropInput().getName(), input.umlInstance());
		}
	}
	public Kran input_(Input input) {
		setInput(input);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropAbspannbock;
	public org.eclipse.uml2.uml.Property umlPropAbspannbock() {
		if (_umlPropAbspannbock == null) {
			loadPropRefs();
		}
		return _umlPropAbspannbock;
	}
	public org.eclipse.uml2.uml.Slot umlSlotAbspannbock() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropAbspannbock()) {
				return s;
			}
		}
		return null;
	}
	public Abspannbock getAbspannbock() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropAbspannbock().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Abspannbock>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setAbspannbock(Abspannbock abspannbock) {
		if (getAbspannbock() != null) {
			deleteUniLinks(umlInstance, umlPropAbspannbock());
		}
		if (abspannbock != null) {
			createUniLink(umlInstance, umlPropAbspannbock().getName(), abspannbock.umlInstance());
		}
	}
	public Kran abspannbock_(Abspannbock abspannbock) {
		setAbspannbock(abspannbock);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropVerbindungsseil;
	public org.eclipse.uml2.uml.Property umlPropVerbindungsseil() {
		if (_umlPropVerbindungsseil == null) {
			loadPropRefs();
		}
		return _umlPropVerbindungsseil;
	}
	public org.eclipse.uml2.uml.Slot umlSlotVerbindungsseil() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropVerbindungsseil()) {
				return s;
			}
		}
		return null;
	}
	public Verbindungsseil getVerbindungsseil() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropVerbindungsseil().getName());
		if (targetInst != null) {
			return UML2JavaMap.<Verbindungsseil>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setVerbindungsseil(Verbindungsseil verbindungsseil) {
		if (getVerbindungsseil() != null) {
			deleteUniLinks(umlInstance, umlPropVerbindungsseil());
		}
		if (verbindungsseil != null) {
			createUniLink(umlInstance, umlPropVerbindungsseil().getName(), verbindungsseil.umlInstance());
		}
	}
	public Kran verbindungsseil_(Verbindungsseil verbindungsseil) {
		setVerbindungsseil(verbindungsseil);
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
	public Kran shape_(geometry.Shape shape) {
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
	public Kran existingComponent_(geometry.ExistingComponent existingComponent) {
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
	public Kran color_(geometry.Color color) {
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
	public Kran primitiveShape_(geometry.Shape primitiveShape) {
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
	public Kran userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature) {
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
	public Kran sub_(geometry.TopologyElement... instancesToLink) {
		return sub_(Arrays.asList(instancesToLink));
	}
	public Kran sub_(List<geometry.TopologyElement> instancesToLink) {
		List<geometry.TopologyElement> linkList = new AssocList<geometry.TopologyElement>(umlInstance, umlPropSub(), geometry.TopologyElement.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public Kran sub_add_(geometry.TopologyElement instanceToLink) {
		getSub().add(instanceToLink);
		return this;
	}
}
