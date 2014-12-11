package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface Verbindungsseil extends seil.classes.Seil {
	
	public static final String MAST1__PROP = "mast1";
	public org.eclipse.uml2.uml.Property umlPropMast1();
	public org.eclipse.uml2.uml.Slot umlSlotMast1();
	public Mast getMast1();
	public void setMast1(Mast mast1);
	public static final String MAST2__PROP = "mast2";
	public org.eclipse.uml2.uml.Property umlPropMast2();
	public org.eclipse.uml2.uml.Slot umlSlotMast2();
	public Mast getMast2();
	public void setMast2(Mast mast2);
	public static final String MAST1POS__PROP = "mast1pos";
	public org.eclipse.uml2.uml.Property umlPropMast1pos();
	public org.eclipse.uml2.uml.Slot umlSlotMast1pos();
	public Double getMast1pos();
	public void setMast1pos(Double mast1pos);
	public static final String MAST2POS__PROP = "mast2pos";
	public org.eclipse.uml2.uml.Property umlPropMast2pos();
	public org.eclipse.uml2.uml.Slot umlSlotMast2pos();
	public Double getMast2pos();
	public void setMast2pos(Double mast2pos);
	public Verbindungsseil mast1_(Mast mast1);
	public Verbindungsseil mast2_(Mast mast2);
	public Verbindungsseil mast1pos_(Double mast1pos, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Verbindungsseil mast2pos_(Double mast2pos, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Verbindungsseil start_(geometry.Point start);
	public Verbindungsseil ende_(geometry.Point ende);
	public Verbindungsseil seilErsatzgeometrie_(seil.classes.SeilErsatzgeometrie seilErsatzgeometrie);
	public Verbindungsseil shape_(geometry.Shape shape);
	public Verbindungsseil existingComponent_(geometry.ExistingComponent existingComponent);
	public Verbindungsseil color_(geometry.Color color);
	public Verbindungsseil primitiveShape_(geometry.Shape primitiveShape);
	public Verbindungsseil userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public Verbindungsseil sub_(geometry.TopologyElement... instancesToLink);
	public Verbindungsseil sub_(List<geometry.TopologyElement> instancesToLink);
	public Verbindungsseil sub_add_(geometry.TopologyElement instanceToLink);
}
