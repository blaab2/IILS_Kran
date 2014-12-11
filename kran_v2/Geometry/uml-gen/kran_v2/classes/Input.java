package kran_v2.classes;

import de.iils.dc43.scriptrule.InstanceWrapper;
import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface Input extends InstanceWrapper {
	
	public static final String LAST__PROP = "last";
	public org.eclipse.uml2.uml.Property umlPropLast();
	public org.eclipse.uml2.uml.Slot umlSlotLast();
	public Double getLast();
	public void setLast(Double last);
	public static final String ARBEITSBEREICHX__PROP = "arbeitsbereichx";
	public org.eclipse.uml2.uml.Property umlPropArbeitsbereichx();
	public org.eclipse.uml2.uml.Slot umlSlotArbeitsbereichx();
	public Double getArbeitsbereichx();
	public void setArbeitsbereichx(Double arbeitsbereichx);
	public static final String MASTDICHTE__PROP = "mastdichte";
	public org.eclipse.uml2.uml.Property umlPropMastdichte();
	public org.eclipse.uml2.uml.Slot umlSlotMastdichte();
	public Double getMastdichte();
	public void setMastdichte(Double mastdichte);
	public Input last_(Double last, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Input arbeitsbereichx_(Double arbeitsbereichx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Input mastdichte_(Double mastdichte, org.eclipse.uml2.uml.Stereotype... slotStereos);
}
