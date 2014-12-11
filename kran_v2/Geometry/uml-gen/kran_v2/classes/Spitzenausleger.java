package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface Spitzenausleger extends kran_v2.classes.Mast {
	
	public static final String NEXTSPITZENAUSLEGER__PROP = "nextspitzenausleger";
	public org.eclipse.uml2.uml.Property umlPropNextspitzenausleger();
	public org.eclipse.uml2.uml.Slot umlSlotNextspitzenausleger();
	public Spitzenausleger getNextspitzenausleger();
	public void setNextspitzenausleger(Spitzenausleger nextspitzenausleger);
	public static final String SPITZENAUSLEGERADAPTER1__PROP = "spitzenauslegeradapter1";
	public org.eclipse.uml2.uml.Property umlPropSpitzenauslegeradapter1();
	public org.eclipse.uml2.uml.Slot umlSlotSpitzenauslegeradapter1();
	public Spitzenauslegeradapter getSpitzenauslegeradapter1();
	public void setSpitzenauslegeradapter1(Spitzenauslegeradapter spitzenauslegeradapter1);
	public static final String PREVTHETA__PROP = "prevtheta";
	public org.eclipse.uml2.uml.Property umlPropPrevtheta();
	public org.eclipse.uml2.uml.Slot umlSlotPrevtheta();
	public Double getPrevtheta();
	public void setPrevtheta(Double prevtheta);
	public static final String SPITZENAUSLEGERADAPTER2__PROP = "spitzenauslegeradapter2";
	public org.eclipse.uml2.uml.Property umlPropSpitzenauslegeradapter2();
	public org.eclipse.uml2.uml.Slot umlSlotSpitzenauslegeradapter2();
	public Spitzenauslegeradapter getSpitzenauslegeradapter2();
	public void setSpitzenauslegeradapter2(Spitzenauslegeradapter spitzenauslegeradapter2);
	public Spitzenausleger nextspitzenausleger_(Spitzenausleger nextspitzenausleger);
	public Spitzenausleger spitzenauslegeradapter1_(Spitzenauslegeradapter spitzenauslegeradapter1);
	public Spitzenausleger prevtheta_(Double prevtheta, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger spitzenauslegeradapter2_(Spitzenauslegeradapter spitzenauslegeradapter2);
	public Spitzenausleger mastschuss_(gittermastschuss.classes.Mastschuss... instancesToLink);
	public Spitzenausleger mastschuss_(List<gittermastschuss.classes.Mastschuss> instancesToLink);
	public Spitzenausleger mastschuss_add_(gittermastschuss.classes.Mastschuss instanceToLink);
	public Spitzenausleger anfangMast_(AnfangMast anfangMast);
	public Spitzenausleger position_(geometry.Position position);
	public Spitzenausleger laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger endeMast_(EndeMast endeMast);
	public Spitzenausleger breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger gschwerpunktxk_(Double gschwerpunktxk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger gschwerpunktyk_(Double gschwerpunktyk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger gschwerpunktzk_(Double gschwerpunktzk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger effektivelaenge_(Double effektivelaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger absoluteposition_(geometry.Position absoluteposition);
	public Spitzenausleger effektivehoehe_(Double effektivehoehe, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Spitzenausleger shape_(geometry.Shape shape);
	public Spitzenausleger existingComponent_(geometry.ExistingComponent existingComponent);
	public Spitzenausleger color_(geometry.Color color);
	public Spitzenausleger primitiveShape_(geometry.Shape primitiveShape);
	public Spitzenausleger userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public Spitzenausleger sub_(geometry.TopologyElement... instancesToLink);
	public Spitzenausleger sub_(List<geometry.TopologyElement> instancesToLink);
	public Spitzenausleger sub_add_(geometry.TopologyElement instanceToLink);
}
