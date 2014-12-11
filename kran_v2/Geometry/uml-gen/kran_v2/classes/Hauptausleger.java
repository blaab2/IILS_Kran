package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface Hauptausleger extends kran_v2.classes.Mast {
	
	public static final String SPITZENAUSLEGER__PROP = "spitzenausleger";
	public org.eclipse.uml2.uml.Property umlPropSpitzenausleger();
	public org.eclipse.uml2.uml.Slot umlSlotSpitzenausleger();
	public Spitzenausleger getSpitzenausleger();
	public void setSpitzenausleger(Spitzenausleger spitzenausleger);
	public Hauptausleger spitzenausleger_(Spitzenausleger spitzenausleger);
	public Hauptausleger mastschuss_(gittermastschuss.classes.Mastschuss... instancesToLink);
	public Hauptausleger mastschuss_(List<gittermastschuss.classes.Mastschuss> instancesToLink);
	public Hauptausleger mastschuss_add_(gittermastschuss.classes.Mastschuss instanceToLink);
	public Hauptausleger anfangMast_(AnfangMast anfangMast);
	public Hauptausleger position_(geometry.Position position);
	public Hauptausleger laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger endeMast_(EndeMast endeMast);
	public Hauptausleger breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger gschwerpunktxk_(Double gschwerpunktxk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger gschwerpunktyk_(Double gschwerpunktyk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger gschwerpunktzk_(Double gschwerpunktzk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger effektivelaenge_(Double effektivelaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger absoluteposition_(geometry.Position absoluteposition);
	public Hauptausleger effektivehoehe_(Double effektivehoehe, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Hauptausleger shape_(geometry.Shape shape);
	public Hauptausleger existingComponent_(geometry.ExistingComponent existingComponent);
	public Hauptausleger color_(geometry.Color color);
	public Hauptausleger primitiveShape_(geometry.Shape primitiveShape);
	public Hauptausleger userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public Hauptausleger sub_(geometry.TopologyElement... instancesToLink);
	public Hauptausleger sub_(List<geometry.TopologyElement> instancesToLink);
	public Hauptausleger sub_add_(geometry.TopologyElement instanceToLink);
}
