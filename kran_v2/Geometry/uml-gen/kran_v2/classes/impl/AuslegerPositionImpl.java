package kran_v2.classes.impl;

import kran_v2.classes.*;
import de.iils.dc43.persistence.*;
import de.iils.dc43.persistence.shared.*;
import de.iils.dc43.scriptrule.*;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public class AuslegerPositionImpl extends InstanceWrapperImpl implements kran_v2.classes.AuslegerPosition {

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
	public AuslegerPositionImpl(String name) {
		this(createInstanceWith(name, umlClass));
	}
	
	/**
	 * Create wrapper object for an already existing UML instance
	 * @param inst UML instance to wrap
	 */
	public AuslegerPositionImpl(org.eclipse.uml2.uml.InstanceSpecification inst) {
		umlInstance = inst;
		UML2JavaMap.addInstMapEntry(umlInstance, this);
		setDomain(SharedEditingDomainUtil.getInstance().getSharedEditingDomain());
	}

	private void loadPropRefs() {
		for (org.eclipse.uml2.uml.Property p : umlClass.getAllAttributes()) {
			if (p.getName().equals("psi")) {
				_umlPropPsi = p;
				continue;
			}
			if (p.getName().equals("theta")) {
				_umlPropTheta = p;
				continue;
			}
			if (p.getName().equals("phi")) {
				_umlPropPhi = p;
				continue;
			}
			if (p.getName().equals("dx")) {
				_umlPropDx = p;
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
			if (p.getName().equals("a11")) {
				_umlPropA11 = p;
				continue;
			}
			if (p.getName().equals("a12")) {
				_umlPropA12 = p;
				continue;
			}
			if (p.getName().equals("a13")) {
				_umlPropA13 = p;
				continue;
			}
			if (p.getName().equals("a14")) {
				_umlPropA14 = p;
				continue;
			}
			if (p.getName().equals("a21")) {
				_umlPropA21 = p;
				continue;
			}
			if (p.getName().equals("a22")) {
				_umlPropA22 = p;
				continue;
			}
			if (p.getName().equals("a23")) {
				_umlPropA23 = p;
				continue;
			}
			if (p.getName().equals("a24")) {
				_umlPropA24 = p;
				continue;
			}
			if (p.getName().equals("a31")) {
				_umlPropA31 = p;
				continue;
			}
			if (p.getName().equals("a32")) {
				_umlPropA32 = p;
				continue;
			}
			if (p.getName().equals("a33")) {
				_umlPropA33 = p;
				continue;
			}
			if (p.getName().equals("a34")) {
				_umlPropA34 = p;
				continue;
			}
			if (p.getName().equals("a41")) {
				_umlPropA41 = p;
				continue;
			}
			if (p.getName().equals("a42")) {
				_umlPropA42 = p;
				continue;
			}
			if (p.getName().equals("a43")) {
				_umlPropA43 = p;
				continue;
			}
			if (p.getName().equals("a44")) {
				_umlPropA44 = p;
				continue;
			}
			if (p.getName().equals("sub")) {
				_umlPropSub = p;
				continue;
			}
		}
	}		

	private org.eclipse.uml2.uml.Property _umlPropPsi;
	public org.eclipse.uml2.uml.Property umlPropPsi() {
		if (_umlPropPsi == null) {
			loadPropRefs();
		}
		return _umlPropPsi;
	}
	public org.eclipse.uml2.uml.Slot umlSlotPsi() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropPsi()) {
				return s;
			}
		}
		return null;
	}
	public Double getPsi() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropPsi().getName());
	}
	public void setPsi(Double psi) {
		setSlotValueByProperty(umlInstance(), umlPropPsi().getName(), psi.toString());
	}
	public AuslegerPosition psi_(Double psi, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setPsi(psi);
		org.eclipse.uml2.uml.Slot slot = umlSlotPsi();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropTheta;
	public org.eclipse.uml2.uml.Property umlPropTheta() {
		if (_umlPropTheta == null) {
			loadPropRefs();
		}
		return _umlPropTheta;
	}
	public org.eclipse.uml2.uml.Slot umlSlotTheta() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropTheta()) {
				return s;
			}
		}
		return null;
	}
	public Double getTheta() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropTheta().getName());
	}
	public void setTheta(Double theta) {
		setSlotValueByProperty(umlInstance(), umlPropTheta().getName(), theta.toString());
	}
	public AuslegerPosition theta_(Double theta, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setTheta(theta);
		org.eclipse.uml2.uml.Slot slot = umlSlotTheta();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropPhi;
	public org.eclipse.uml2.uml.Property umlPropPhi() {
		if (_umlPropPhi == null) {
			loadPropRefs();
		}
		return _umlPropPhi;
	}
	public org.eclipse.uml2.uml.Slot umlSlotPhi() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropPhi()) {
				return s;
			}
		}
		return null;
	}
	public Double getPhi() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropPhi().getName());
	}
	public void setPhi(Double phi) {
		setSlotValueByProperty(umlInstance(), umlPropPhi().getName(), phi.toString());
	}
	public AuslegerPosition phi_(Double phi, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setPhi(phi);
		org.eclipse.uml2.uml.Slot slot = umlSlotPhi();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropDx;
	public org.eclipse.uml2.uml.Property umlPropDx() {
		if (_umlPropDx == null) {
			loadPropRefs();
		}
		return _umlPropDx;
	}
	public org.eclipse.uml2.uml.Slot umlSlotDx() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropDx()) {
				return s;
			}
		}
		return null;
	}
	public Double getDx() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropDx().getName());
	}
	public void setDx(Double dx) {
		setSlotValueByProperty(umlInstance(), umlPropDx().getName(), dx.toString());
	}
	public AuslegerPosition dx_(Double dx, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setDx(dx);
		org.eclipse.uml2.uml.Slot slot = umlSlotDx();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
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
	public AuslegerPosition dy_(Double dy, org.eclipse.uml2.uml.Stereotype... slotStereos) {
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
	public AuslegerPosition dz_(Double dz, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setDz(dz);
		org.eclipse.uml2.uml.Slot slot = umlSlotDz();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA11;
	public org.eclipse.uml2.uml.Property umlPropA11() {
		if (_umlPropA11 == null) {
			loadPropRefs();
		}
		return _umlPropA11;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA11() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA11()) {
				return s;
			}
		}
		return null;
	}
	public Double getA11() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA11().getName());
	}
	public void setA11(Double a11) {
		setSlotValueByProperty(umlInstance(), umlPropA11().getName(), a11.toString());
	}
	public AuslegerPosition a11_(Double a11, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA11(a11);
		org.eclipse.uml2.uml.Slot slot = umlSlotA11();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA12;
	public org.eclipse.uml2.uml.Property umlPropA12() {
		if (_umlPropA12 == null) {
			loadPropRefs();
		}
		return _umlPropA12;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA12() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA12()) {
				return s;
			}
		}
		return null;
	}
	public Double getA12() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA12().getName());
	}
	public void setA12(Double a12) {
		setSlotValueByProperty(umlInstance(), umlPropA12().getName(), a12.toString());
	}
	public AuslegerPosition a12_(Double a12, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA12(a12);
		org.eclipse.uml2.uml.Slot slot = umlSlotA12();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA13;
	public org.eclipse.uml2.uml.Property umlPropA13() {
		if (_umlPropA13 == null) {
			loadPropRefs();
		}
		return _umlPropA13;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA13() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA13()) {
				return s;
			}
		}
		return null;
	}
	public Double getA13() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA13().getName());
	}
	public void setA13(Double a13) {
		setSlotValueByProperty(umlInstance(), umlPropA13().getName(), a13.toString());
	}
	public AuslegerPosition a13_(Double a13, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA13(a13);
		org.eclipse.uml2.uml.Slot slot = umlSlotA13();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA14;
	public org.eclipse.uml2.uml.Property umlPropA14() {
		if (_umlPropA14 == null) {
			loadPropRefs();
		}
		return _umlPropA14;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA14() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA14()) {
				return s;
			}
		}
		return null;
	}
	public Double getA14() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA14().getName());
	}
	public void setA14(Double a14) {
		setSlotValueByProperty(umlInstance(), umlPropA14().getName(), a14.toString());
	}
	public AuslegerPosition a14_(Double a14, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA14(a14);
		org.eclipse.uml2.uml.Slot slot = umlSlotA14();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA21;
	public org.eclipse.uml2.uml.Property umlPropA21() {
		if (_umlPropA21 == null) {
			loadPropRefs();
		}
		return _umlPropA21;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA21() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA21()) {
				return s;
			}
		}
		return null;
	}
	public Double getA21() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA21().getName());
	}
	public void setA21(Double a21) {
		setSlotValueByProperty(umlInstance(), umlPropA21().getName(), a21.toString());
	}
	public AuslegerPosition a21_(Double a21, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA21(a21);
		org.eclipse.uml2.uml.Slot slot = umlSlotA21();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA22;
	public org.eclipse.uml2.uml.Property umlPropA22() {
		if (_umlPropA22 == null) {
			loadPropRefs();
		}
		return _umlPropA22;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA22() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA22()) {
				return s;
			}
		}
		return null;
	}
	public Double getA22() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA22().getName());
	}
	public void setA22(Double a22) {
		setSlotValueByProperty(umlInstance(), umlPropA22().getName(), a22.toString());
	}
	public AuslegerPosition a22_(Double a22, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA22(a22);
		org.eclipse.uml2.uml.Slot slot = umlSlotA22();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA23;
	public org.eclipse.uml2.uml.Property umlPropA23() {
		if (_umlPropA23 == null) {
			loadPropRefs();
		}
		return _umlPropA23;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA23() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA23()) {
				return s;
			}
		}
		return null;
	}
	public Double getA23() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA23().getName());
	}
	public void setA23(Double a23) {
		setSlotValueByProperty(umlInstance(), umlPropA23().getName(), a23.toString());
	}
	public AuslegerPosition a23_(Double a23, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA23(a23);
		org.eclipse.uml2.uml.Slot slot = umlSlotA23();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA24;
	public org.eclipse.uml2.uml.Property umlPropA24() {
		if (_umlPropA24 == null) {
			loadPropRefs();
		}
		return _umlPropA24;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA24() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA24()) {
				return s;
			}
		}
		return null;
	}
	public Double getA24() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA24().getName());
	}
	public void setA24(Double a24) {
		setSlotValueByProperty(umlInstance(), umlPropA24().getName(), a24.toString());
	}
	public AuslegerPosition a24_(Double a24, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA24(a24);
		org.eclipse.uml2.uml.Slot slot = umlSlotA24();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA31;
	public org.eclipse.uml2.uml.Property umlPropA31() {
		if (_umlPropA31 == null) {
			loadPropRefs();
		}
		return _umlPropA31;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA31() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA31()) {
				return s;
			}
		}
		return null;
	}
	public Double getA31() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA31().getName());
	}
	public void setA31(Double a31) {
		setSlotValueByProperty(umlInstance(), umlPropA31().getName(), a31.toString());
	}
	public AuslegerPosition a31_(Double a31, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA31(a31);
		org.eclipse.uml2.uml.Slot slot = umlSlotA31();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA32;
	public org.eclipse.uml2.uml.Property umlPropA32() {
		if (_umlPropA32 == null) {
			loadPropRefs();
		}
		return _umlPropA32;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA32() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA32()) {
				return s;
			}
		}
		return null;
	}
	public Double getA32() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA32().getName());
	}
	public void setA32(Double a32) {
		setSlotValueByProperty(umlInstance(), umlPropA32().getName(), a32.toString());
	}
	public AuslegerPosition a32_(Double a32, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA32(a32);
		org.eclipse.uml2.uml.Slot slot = umlSlotA32();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA33;
	public org.eclipse.uml2.uml.Property umlPropA33() {
		if (_umlPropA33 == null) {
			loadPropRefs();
		}
		return _umlPropA33;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA33() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA33()) {
				return s;
			}
		}
		return null;
	}
	public Double getA33() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA33().getName());
	}
	public void setA33(Double a33) {
		setSlotValueByProperty(umlInstance(), umlPropA33().getName(), a33.toString());
	}
	public AuslegerPosition a33_(Double a33, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA33(a33);
		org.eclipse.uml2.uml.Slot slot = umlSlotA33();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA34;
	public org.eclipse.uml2.uml.Property umlPropA34() {
		if (_umlPropA34 == null) {
			loadPropRefs();
		}
		return _umlPropA34;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA34() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA34()) {
				return s;
			}
		}
		return null;
	}
	public Double getA34() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA34().getName());
	}
	public void setA34(Double a34) {
		setSlotValueByProperty(umlInstance(), umlPropA34().getName(), a34.toString());
	}
	public AuslegerPosition a34_(Double a34, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA34(a34);
		org.eclipse.uml2.uml.Slot slot = umlSlotA34();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA41;
	public org.eclipse.uml2.uml.Property umlPropA41() {
		if (_umlPropA41 == null) {
			loadPropRefs();
		}
		return _umlPropA41;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA41() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA41()) {
				return s;
			}
		}
		return null;
	}
	public Double getA41() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA41().getName());
	}
	public void setA41(Double a41) {
		setSlotValueByProperty(umlInstance(), umlPropA41().getName(), a41.toString());
	}
	public AuslegerPosition a41_(Double a41, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA41(a41);
		org.eclipse.uml2.uml.Slot slot = umlSlotA41();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA42;
	public org.eclipse.uml2.uml.Property umlPropA42() {
		if (_umlPropA42 == null) {
			loadPropRefs();
		}
		return _umlPropA42;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA42() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA42()) {
				return s;
			}
		}
		return null;
	}
	public Double getA42() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA42().getName());
	}
	public void setA42(Double a42) {
		setSlotValueByProperty(umlInstance(), umlPropA42().getName(), a42.toString());
	}
	public AuslegerPosition a42_(Double a42, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA42(a42);
		org.eclipse.uml2.uml.Slot slot = umlSlotA42();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA43;
	public org.eclipse.uml2.uml.Property umlPropA43() {
		if (_umlPropA43 == null) {
			loadPropRefs();
		}
		return _umlPropA43;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA43() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA43()) {
				return s;
			}
		}
		return null;
	}
	public Double getA43() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA43().getName());
	}
	public void setA43(Double a43) {
		setSlotValueByProperty(umlInstance(), umlPropA43().getName(), a43.toString());
	}
	public AuslegerPosition a43_(Double a43, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA43(a43);
		org.eclipse.uml2.uml.Slot slot = umlSlotA43();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
	private org.eclipse.uml2.uml.Property _umlPropA44;
	public org.eclipse.uml2.uml.Property umlPropA44() {
		if (_umlPropA44 == null) {
			loadPropRefs();
		}
		return _umlPropA44;
	}
	public org.eclipse.uml2.uml.Slot umlSlotA44() {
		for (org.eclipse.uml2.uml.Slot s : umlInstance.getSlots()) {
			if (s.getDefiningFeature() == umlPropA44()) {
				return s;
			}
		}
		return null;
	}
	public Double getA44() {
		return getSlotDoubleValueByProperty(umlInstance(), umlPropA44().getName());
	}
	public void setA44(Double a44) {
		setSlotValueByProperty(umlInstance(), umlPropA44().getName(), a44.toString());
	}
	public AuslegerPosition a44_(Double a44, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setA44(a44);
		org.eclipse.uml2.uml.Slot slot = umlSlotA44();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
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
	public AuslegerPosition sub_(geometry.TopologyElement... instancesToLink) {
		return sub_(Arrays.asList(instancesToLink));
	}
	public AuslegerPosition sub_(List<geometry.TopologyElement> instancesToLink) {
		List<geometry.TopologyElement> linkList = new AssocList<geometry.TopologyElement>(umlInstance, umlPropSub(), geometry.TopologyElement.class);
		linkList.clear();
		linkList.addAll(instancesToLink);
		return this;
	}
	public AuslegerPosition sub_add_(geometry.TopologyElement instanceToLink) {
		getSub().add(instanceToLink);
		return this;
	}
}
