package kran_v2.classes.impl;

import kran_v2.classes.*;
import de.iils.dc43.persistence.*;
import de.iils.dc43.persistence.shared.*;
import de.iils.dc43.scriptrule.*;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public class InputImpl extends InstanceWrapperImpl implements kran_v2.classes.Input {

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
	public InputImpl(String name) {
		this(createInstanceWith(name, umlClass));
	}
	
	/**
	 * Create wrapper object for an already existing UML instance
	 * @param inst UML instance to wrap
	 */
	public InputImpl(org.eclipse.uml2.uml.InstanceSpecification inst) {
		umlInstance = inst;
		UML2JavaMap.addInstMapEntry(umlInstance, this);
		setDomain(SharedEditingDomainUtil.getInstance().getSharedEditingDomain());
	}

	private void loadPropRefs() {
		for (org.eclipse.uml2.uml.Property p : umlClass.getAllAttributes()) {
			if (p.getName().equals("last")) {
				_umlPropLast = p;
				continue;
			}
			if (p.getName().equals("arbeitsbereichx")) {
				_umlPropArbeitsbereichx = p;
				continue;
			}
			if (p.getName().equals("mastdichte")) {
				_umlPropMastdichte = p;
				continue;
			}
		}
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
	public Input last_(Double last, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setLast(last);
		org.eclipse.uml2.uml.Slot slot = umlSlotLast();
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
	public Input arbeitsbereichx_(Double arbeitsbereichx, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setArbeitsbereichx(arbeitsbereichx);
		org.eclipse.uml2.uml.Slot slot = umlSlotArbeitsbereichx();
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
	public Input mastdichte_(Double mastdichte, org.eclipse.uml2.uml.Stereotype... slotStereos) {
		setMastdichte(mastdichte);
		org.eclipse.uml2.uml.Slot slot = umlSlotMastdichte();
		for (org.eclipse.uml2.uml.Stereotype stereo : slotStereos) {
			if (!slot.isStereotypeApplied(stereo)) {
				slot.applyStereotype(stereo);
			}
		}
		return this;
	}
}
