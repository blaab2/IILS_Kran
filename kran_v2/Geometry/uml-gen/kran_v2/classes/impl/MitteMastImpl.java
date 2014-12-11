package kran_v2.classes.impl;

import kran_v2.classes.*;
import de.iils.dc43.persistence.*;
import de.iils.dc43.persistence.shared.*;
import de.iils.dc43.scriptrule.*;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public class MitteMastImpl extends InstanceWrapperImpl implements kran_v2.classes.MitteMast {

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
	public MitteMastImpl(String name) {
		this(createInstanceWith(name, umlClass));
	}
	
	/**
	 * Create wrapper object for an already existing UML instance
	 * @param inst UML instance to wrap
	 */
	public MitteMastImpl(org.eclipse.uml2.uml.InstanceSpecification inst) {
		umlInstance = inst;
		UML2JavaMap.addInstMapEntry(umlInstance, this);
		setDomain(SharedEditingDomainUtil.getInstance().getSharedEditingDomain());
	}

	private void loadPropRefs() {
		for (org.eclipse.uml2.uml.Property p : umlClass.getAllAttributes()) {
			if (p.getName().equals("laenge")) {
				_umlPropLaenge = p;
				continue;
			}
			if (p.getName().equals("breite0")) {
				_umlPropBreite0 = p;
				continue;
			}
			if (p.getName().equals("hoehe0")) {
				_umlPropHoehe0 = p;
				continue;
			}
			if (p.getName().equals("breite1")) {
				_umlPropBreite1 = p;
				continue;
			}
			if (p.getName().equals("hoehe1")) {
				_umlPropHoehe1 = p;
				continue;
			}
			if (p.getName().equals("teile")) {
				_umlPropTeile = p;
				continue;
			}
			if (p.getName().equals("teillaenge")) {
				_umlPropTeillaenge = p;
				continue;
			}
			if (p.getName().equals("anfangsTeilMastschuss")) {
				_umlPropAnfangsTeilMastschuss = p;
				continue;
			}
			if (p.getName().equals("anbindunglaenge")) {
				_umlPropAnbindunglaenge = p;
				continue;
			}
			if (p.getName().equals("mittelTeilMastschuss")) {
				_umlPropMittelTeilMastschuss = p;
				continue;
			}
			if (p.getName().equals("dy")) {
				_umlPropDy = p;
				continue;
			}
			if (p.getName().equals("dz")) {
				_umlPropDz = p;
				continue;
			}
			if (p.getName().equals("endTeilMastschuss")) {
				_umlPropEndTeilMastschuss = p;
				continue;
			}
			if (p.getName().equals("mastschussGeometrie")) {
				_umlPropMastschussGeometrie = p;
				continue;
			}
			if (p.getName().equals("xposition")) {
				_umlPropXposition = p;
				continue;
			}
			if (p.getName().equals("nextmastschuss")) {
				_umlPropNextmastschuss = p;
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
			if (p.getName().equals("typ")) {
				_umlPropTyp = p;
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
	public MitteMast laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLaenge(laenge);
		org.eclipse.uml2.uml.Slot slot = umlSlotLaenge();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropBreite0;
	public org.eclipse.uml2.uml.Property umlPropBreite0() {
		if (_umlPropBreite0 == null) {
			loadPropRefs();
		}
		return _umlPropBreite0;
	}
	public org.eclipse.uml2.uml.Slot umlSlotBreite0() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropBreite0()) {
				return s;
			}
		}
		return null;
	}
	public Double getBreite0() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropBreite0().getName());
	}
	public void setBreite0(Double breite0) {
		setSlotValueByProperty(umlInstance(), umlPropBreite0().getName(), breite0.toString());
	}
	public MitteMast breite0_(Double breite0, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setBreite0(breite0);
		org.eclipse.uml2.uml.Slot slot = umlSlotBreite0();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropHoehe0;
	public org.eclipse.uml2.uml.Property umlPropHoehe0() {
		if (_umlPropHoehe0 == null) {
			loadPropRefs();
		}
		return _umlPropHoehe0;
	}
	public org.eclipse.uml2.uml.Slot umlSlotHoehe0() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropHoehe0()) {
				return s;
			}
		}
		return null;
	}
	public Double getHoehe0() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropHoehe0().getName());
	}
	public void setHoehe0(Double hoehe0) {
		setSlotValueByProperty(umlInstance(), umlPropHoehe0().getName(), hoehe0.toString());
	}
	public MitteMast hoehe0_(Double hoehe0, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setHoehe0(hoehe0);
		org.eclipse.uml2.uml.Slot slot = umlSlotHoehe0();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
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
	public MitteMast breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setBreite1(breite1);
		org.eclipse.uml2.uml.Slot slot = umlSlotBreite1();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropHoehe1;
	public org.eclipse.uml2.uml.Property umlPropHoehe1() {
		if (_umlPropHoehe1 == null) {
			loadPropRefs();
		}
		return _umlPropHoehe1;
	}
	public org.eclipse.uml2.uml.Slot umlSlotHoehe1() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropHoehe1()) {
				return s;
			}
		}
		return null;
	}
	public Double getHoehe1() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropHoehe1().getName());
	}
	public void setHoehe1(Double hoehe1) {
		setSlotValueByProperty(umlInstance(), umlPropHoehe1().getName(), hoehe1.toString());
	}
	public MitteMast hoehe1_(Double hoehe1, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setHoehe1(hoehe1);
		org.eclipse.uml2.uml.Slot slot = umlSlotHoehe1();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropTeile;
	public org.eclipse.uml2.uml.Property umlPropTeile() {
		if (_umlPropTeile == null) {
			loadPropRefs();
		}
		return _umlPropTeile;
	}
	public org.eclipse.uml2.uml.Slot umlSlotTeile() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropTeile()) {
				return s;
			}
		}
		return null;
	}
	public Double getTeile() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropTeile().getName());
	}
	public void setTeile(Double teile) {
		setSlotValueByProperty(umlInstance(), umlPropTeile().getName(), teile.toString());
	}
	public MitteMast teile_(Double teile, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setTeile(teile);
		org.eclipse.uml2.uml.Slot slot = umlSlotTeile();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropTeillaenge;
	public org.eclipse.uml2.uml.Property umlPropTeillaenge() {
		if (_umlPropTeillaenge == null) {
			loadPropRefs();
		}
		return _umlPropTeillaenge;
	}
	public org.eclipse.uml2.uml.Slot umlSlotTeillaenge() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropTeillaenge()) {
				return s;
			}
		}
		return null;
	}
	public Double getTeillaenge() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropTeillaenge().getName());
	}
	public void setTeillaenge(Double teillaenge) {
		setSlotValueByProperty(umlInstance(), umlPropTeillaenge().getName(), teillaenge.toString());
	}
	public MitteMast teillaenge_(Double teillaenge, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setTeillaenge(teillaenge);
		org.eclipse.uml2.uml.Slot slot = umlSlotTeillaenge();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropAnfangsTeilMastschuss;
	public org.eclipse.uml2.uml.Property umlPropAnfangsTeilMastschuss() {
		if (_umlPropAnfangsTeilMastschuss == null) {
			loadPropRefs();
		}
		return _umlPropAnfangsTeilMastschuss;
	}
	public org.eclipse.uml2.uml.Slot umlSlotAnfangsTeilMastschuss() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropAnfangsTeilMastschuss()) {
				return s;
			}
		}
		return null;
	}
	public gittermastschuss.classes.AnfangsTeilMastschuss getAnfangsTeilMastschuss() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropAnfangsTeilMastschuss().getName());
		if (targetInst != null) {
			return UML2JavaMap.<gittermastschuss.classes.AnfangsTeilMastschuss>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setAnfangsTeilMastschuss(gittermastschuss.classes.AnfangsTeilMastschuss anfangsTeilMastschuss) {
		if (getAnfangsTeilMastschuss() != null) {
			deleteUniLinks(umlInstance, umlPropAnfangsTeilMastschuss());
		}
		if (anfangsTeilMastschuss != null) {
			createUniLink(umlInstance, umlPropAnfangsTeilMastschuss().getName(), anfangsTeilMastschuss.umlInstance());
		}
	}
	public MitteMast anfangsTeilMastschuss_(gittermastschuss.classes.AnfangsTeilMastschuss anfangsTeilMastschuss) {
		setAnfangsTeilMastschuss(anfangsTeilMastschuss);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropAnbindunglaenge;
	public org.eclipse.uml2.uml.Property umlPropAnbindunglaenge() {
		if (_umlPropAnbindunglaenge == null) {
			loadPropRefs();
		}
		return _umlPropAnbindunglaenge;
	}
	public org.eclipse.uml2.uml.Slot umlSlotAnbindunglaenge() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropAnbindunglaenge()) {
				return s;
			}
		}
		return null;
	}
	public Double getAnbindunglaenge() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropAnbindunglaenge().getName());
	}
	public void setAnbindunglaenge(Double anbindunglaenge) {
		setSlotValueByProperty(umlInstance(), umlPropAnbindunglaenge().getName(), anbindunglaenge.toString());
	}
	public MitteMast anbindunglaenge_(Double anbindunglaenge, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setAnbindunglaenge(anbindunglaenge);
		org.eclipse.uml2.uml.Slot slot = umlSlotAnbindunglaenge();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMittelTeilMastschuss;
	public org.eclipse.uml2.uml.Property umlPropMittelTeilMastschuss() {
		if (_umlPropMittelTeilMastschuss == null) {
			loadPropRefs();
		}
		return _umlPropMittelTeilMastschuss;
	}
	public List<org.eclipse.uml2.uml.Slot> umlSlotMittelTeilMastschuss() {
		List<org.eclipse.uml2.uml.Slot> slots = new ArrayList<org.eclipse.uml2.uml.Slot>();
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMittelTeilMastschuss()) {
				slots.add(s);
			}
		}
		return slots;
	}
	public List<gittermastschuss.classes.MittelTeilMastschuss> getMittelTeilMastschuss() {
		return new AssocList<gittermastschuss.classes.MittelTeilMastschuss>(umlInstance, umlPropMittelTeilMastschuss(), gittermastschuss.classes.MittelTeilMastschuss.class);
	}
	public MitteMast mittelTeilMastschuss_(gittermastschuss.classes.MittelTeilMastschuss... instancesToLink) {
		return mittelTeilMastschuss_(Arrays.asList(instancesToLink));
	}
	public MitteMast mittelTeilMastschuss_(List<gittermastschuss.classes.MittelTeilMastschuss> instancesToLink) {
		List<gittermastschuss.classes.MittelTeilMastschuss> linkList = new AssocList<gittermastschuss.classes.MittelTeilMastschuss>(umlInstance, umlPropMittelTeilMastschuss(), gittermastschuss.classes.MittelTeilMastschuss.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public MitteMast mittelTeilMastschuss_add_(gittermastschuss.classes.MittelTeilMastschuss instanceToLink) {
		getMittelTeilMastschuss().add(instanceToLink);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropDy;
	public org.eclipse.uml2.uml.Property umlPropDy() {
		if (_umlPropDy == null) {
			loadPropRefs();
		}
		return _umlPropDy;
	}
	public org.eclipse.uml2.uml.Slot umlSlotDy() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropDy()) {
				return s;
			}
		}
		return null;
	}
	public Double getDy() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropDy().getName());
	}
	public void setDy(Double dy) {
		setSlotValueByProperty(umlInstance(), umlPropDy().getName(), dy.toString());
	}
	public MitteMast dy_(Double dy, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setDy(dy);
		org.eclipse.uml2.uml.Slot slot = umlSlotDy();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropDz;
	public org.eclipse.uml2.uml.Property umlPropDz() {
		if (_umlPropDz == null) {
			loadPropRefs();
		}
		return _umlPropDz;
	}
	public org.eclipse.uml2.uml.Slot umlSlotDz() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropDz()) {
				return s;
			}
		}
		return null;
	}
	public Double getDz() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropDz().getName());
	}
	public void setDz(Double dz) {
		setSlotValueByProperty(umlInstance(), umlPropDz().getName(), dz.toString());
	}
	public MitteMast dz_(Double dz, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setDz(dz);
		org.eclipse.uml2.uml.Slot slot = umlSlotDz();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropEndTeilMastschuss;
	public org.eclipse.uml2.uml.Property umlPropEndTeilMastschuss() {
		if (_umlPropEndTeilMastschuss == null) {
			loadPropRefs();
		}
		return _umlPropEndTeilMastschuss;
	}
	public org.eclipse.uml2.uml.Slot umlSlotEndTeilMastschuss() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropEndTeilMastschuss()) {
				return s;
			}
		}
		return null;
	}
	public gittermastschuss.classes.EndTeilMastschuss getEndTeilMastschuss() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropEndTeilMastschuss().getName());
		if (targetInst != null) {
			return UML2JavaMap.<gittermastschuss.classes.EndTeilMastschuss>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setEndTeilMastschuss(gittermastschuss.classes.EndTeilMastschuss endTeilMastschuss) {
		if (getEndTeilMastschuss() != null) {
			deleteUniLinks(umlInstance, umlPropEndTeilMastschuss());
		}
		if (endTeilMastschuss != null) {
			createUniLink(umlInstance, umlPropEndTeilMastschuss().getName(), endTeilMastschuss.umlInstance());
		}
	}
	public MitteMast endTeilMastschuss_(gittermastschuss.classes.EndTeilMastschuss endTeilMastschuss) {
		setEndTeilMastschuss(endTeilMastschuss);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropMastschussGeometrie;
	public org.eclipse.uml2.uml.Property umlPropMastschussGeometrie() {
		if (_umlPropMastschussGeometrie == null) {
			loadPropRefs();
		}
		return _umlPropMastschussGeometrie;
	}
	public org.eclipse.uml2.uml.Slot umlSlotMastschussGeometrie() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropMastschussGeometrie()) {
				return s;
			}
		}
		return null;
	}
	public gittermastschuss.classes.MastschussGeometrie getMastschussGeometrie() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropMastschussGeometrie().getName());
		if (targetInst != null) {
			return UML2JavaMap.<gittermastschuss.classes.MastschussGeometrie>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setMastschussGeometrie(gittermastschuss.classes.MastschussGeometrie mastschussGeometrie) {
		if (getMastschussGeometrie() != null) {
			deleteUniLinks(umlInstance, umlPropMastschussGeometrie());
		}
		if (mastschussGeometrie != null) {
			createUniLink(umlInstance, umlPropMastschussGeometrie().getName(), mastschussGeometrie.umlInstance());
		}
	}
	public MitteMast mastschussGeometrie_(gittermastschuss.classes.MastschussGeometrie mastschussGeometrie) {
		setMastschussGeometrie(mastschussGeometrie);
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropXposition;
	public org.eclipse.uml2.uml.Property umlPropXposition() {
		if (_umlPropXposition == null) {
			loadPropRefs();
		}
		return _umlPropXposition;
	}
	public org.eclipse.uml2.uml.Slot umlSlotXposition() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropXposition()) {
				return s;
			}
		}
		return null;
	}
	public Double getXposition() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropXposition().getName());
	}
	public void setXposition(Double xposition) {
		setSlotValueByProperty(umlInstance(), umlPropXposition().getName(), xposition.toString());
	}
	public MitteMast xposition_(Double xposition, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setXposition(xposition);
		org.eclipse.uml2.uml.Slot slot = umlSlotXposition();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropNextmastschuss;
	public org.eclipse.uml2.uml.Property umlPropNextmastschuss() {
		if (_umlPropNextmastschuss == null) {
			loadPropRefs();
		}
		return _umlPropNextmastschuss;
	}
	public org.eclipse.uml2.uml.Slot umlSlotNextmastschuss() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropNextmastschuss()) {
				return s;
			}
		}
		return null;
	}
	public gittermastschuss.classes.Mastschuss getNextmastschuss() {
		org.eclipse.uml2.uml.InstanceSpecification targetInst = getInstanceByProperty(umlInstance(), umlPropNextmastschuss().getName());
		if (targetInst != null) {
			return UML2JavaMap.<gittermastschuss.classes.Mastschuss>findOrCreateWrapper(targetInst);
		}
		return null;
	}
	public void setNextmastschuss(gittermastschuss.classes.Mastschuss nextmastschuss) {
		if (getNextmastschuss() != null) {
			deleteUniLinks(umlInstance, umlPropNextmastschuss());
		}
		if (nextmastschuss != null) {
			createUniLink(umlInstance, umlPropNextmastschuss().getName(), nextmastschuss.umlInstance());
		}
	}
	public MitteMast nextmastschuss_(gittermastschuss.classes.Mastschuss nextmastschuss) {
		setNextmastschuss(nextmastschuss);
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
	public MitteMast volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos) {
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
	public MitteMast schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos) {
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
	public MitteMast schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos) {
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
	public MitteMast schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos) {
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
	public MitteMast gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos) {
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
	public MitteMast gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos) {
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
	public MitteMast gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setGschwerpunktz(gschwerpunktz);
		org.eclipse.uml2.uml.Slot slot = umlSlotGschwerpunktz();
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
	public MitteMast typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setTyp(typ);
		org.eclipse.uml2.uml.Slot slot = umlSlotTyp();
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
	public MitteMast shape_(geometry.Shape shape) {
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
	public MitteMast existingComponent_(geometry.ExistingComponent existingComponent) {
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
	public MitteMast color_(geometry.Color color) {
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
	public MitteMast primitiveShape_(geometry.Shape primitiveShape) {
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
	public MitteMast userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature) {
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
	public MitteMast sub_(geometry.TopologyElement... instancesToLink) {
		return sub_(Arrays.asList(instancesToLink));
	}
	public MitteMast sub_(List<geometry.TopologyElement> instancesToLink) {
		List<geometry.TopologyElement> linkList = new AssocList<geometry.TopologyElement>(umlInstance, umlPropSub(), geometry.TopologyElement.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public MitteMast sub_add_(geometry.TopologyElement instanceToLink) {
		getSub().add(instanceToLink);
		return this;
	}
}
