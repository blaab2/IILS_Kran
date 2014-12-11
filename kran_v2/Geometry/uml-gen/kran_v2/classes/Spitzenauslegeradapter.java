package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface Spitzenauslegeradapter extends kran_v2.classes.Mast {
	
	public static final String SPITZENAUSLEGER__PROP = "spitzenausleger";
	public org.eclipse.uml2.uml.Property umlPropSpitzenausleger();
	public org.eclipse.uml2.uml.Slot umlSlotSpitzenausleger();
	public Spitzenausleger getSpitzenausleger();
	public void setSpitzenausleger(Spitzenausleger spitzenausleger);
	public Spitzenauslegeradapter spitzenausleger_(Spitzenausleger spitzenausleger);
	public Spitzenauslegeradapter mastschuss_(gittermastschuss.classes.Mastschuss... instancesToLink);
	public Spitzenauslegeradapter mastschuss_(List<gittermastschuss.classes.Mastschuss> instancesToLink);
	public Spitzenauslegeradapter mastschuss_add_(gittermastschuss.classes.Mastschuss instanceToLink);
	public Spitzenauslegeradapter anfangMast_(AnfangMast anfangMast);
	public Spitzenauslegeradapter position_(geometry.Position position);
	public Spitzenauslegeradapter laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter endeMast_(EndeMast endeMast);
	public Spitzenauslegeradapter breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter gschwerpunktxk_(Double gschwerpunktxk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter gschwerpunktyk_(Double gschwerpunktyk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter gschwerpunktzk_(Double gschwerpunktzk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter effektivelaenge_(Double effektivelaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter absoluteposition_(geometry.Position absoluteposition);
	public Spitzenauslegeradapter effektivehoehe_(Double effektivehoehe, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenauslegeradapter shape_(geometry.Shape shape);
	public Spitzenauslegeradapter existingComponent_(geometry.ExistingComponent existingComponent);
	public Spitzenauslegeradapter color_(geometry.Color color);
	public Spitzenauslegeradapter primitiveShape_(geometry.Shape primitiveShape);
	public Spitzenauslegeradapter userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public Spitzenauslegeradapter sub_(geometry.TopologyElement... instancesToLink);
	public Spitzenauslegeradapter sub_(List<geometry.TopologyElement> instancesToLink);
	public Spitzenauslegeradapter sub_add_(geometry.TopologyElement instanceToLink);
}
