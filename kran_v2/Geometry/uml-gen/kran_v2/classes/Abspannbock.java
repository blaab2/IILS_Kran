package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface Abspannbock extends kran_v2.classes.Nebenausleger {
	
	public Abspannbock mastschuss_(gittermastschuss.classes.Mastschuss... instancesToLink);
	public Abspannbock mastschuss_(List<gittermastschuss.classes.Mastschuss> instancesToLink);
	public Abspannbock mastschuss_add_(gittermastschuss.classes.Mastschuss instanceToLink);
	public Abspannbock anfangMast_(AnfangMast anfangMast);
	public Abspannbock position_(geometry.Position position);
	public Abspannbock laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock endeMast_(EndeMast endeMast);
	public Abspannbock breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock gschwerpunktxk_(Double gschwerpunktxk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock gschwerpunktyk_(Double gschwerpunktyk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock gschwerpunktzk_(Double gschwerpunktzk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock effektivelaenge_(Double effektivelaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock absoluteposition_(geometry.Position absoluteposition);
	public Abspannbock effektivehoehe_(Double effektivehoehe, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Abspannbock shape_(geometry.Shape shape);
	public Abspannbock existingComponent_(geometry.ExistingComponent existingComponent);
	public Abspannbock color_(geometry.Color color);
	public Abspannbock primitiveShape_(geometry.Shape primitiveShape);
	public Abspannbock userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public Abspannbock sub_(geometry.TopologyElement... instancesToLink);
	public Abspannbock sub_(List<geometry.TopologyElement> instancesToLink);
	public Abspannbock sub_add_(geometry.TopologyElement instanceToLink);
}
