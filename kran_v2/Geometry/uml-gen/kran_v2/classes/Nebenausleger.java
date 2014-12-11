package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface Nebenausleger extends kran_v2.classes.Mast {
	
	public Nebenausleger mastschuss_(gittermastschuss.classes.Mastschuss... instancesToLink);
	public Nebenausleger mastschuss_(List<gittermastschuss.classes.Mastschuss> instancesToLink);
	public Nebenausleger mastschuss_add_(gittermastschuss.classes.Mastschuss instanceToLink);
	public Nebenausleger anfangMast_(AnfangMast anfangMast);
	public Nebenausleger position_(geometry.Position position);
	public Nebenausleger laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger endeMast_(EndeMast endeMast);
	public Nebenausleger breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger gschwerpunktxk_(Double gschwerpunktxk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger gschwerpunktyk_(Double gschwerpunktyk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger gschwerpunktzk_(Double gschwerpunktzk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger effektivelaenge_(Double effektivelaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger absoluteposition_(geometry.Position absoluteposition);
	public Nebenausleger effektivehoehe_(Double effektivehoehe, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Nebenausleger shape_(geometry.Shape shape);
	public Nebenausleger existingComponent_(geometry.ExistingComponent existingComponent);
	public Nebenausleger color_(geometry.Color color);
	public Nebenausleger primitiveShape_(geometry.Shape primitiveShape);
	public Nebenausleger userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public Nebenausleger sub_(geometry.TopologyElement... instancesToLink);
	public Nebenausleger sub_(List<geometry.TopologyElement> instancesToLink);
	public Nebenausleger sub_add_(geometry.TopologyElement instanceToLink);
}
