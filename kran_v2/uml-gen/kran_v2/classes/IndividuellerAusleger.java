package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-12-19T10:43:58.070+0100")
@SuppressWarnings("all")
public interface IndividuellerAusleger extends kran_v2.classes.Mast {
	
	public IndividuellerAusleger mastschuss_(gittermastschuss.classes.Mastschuss... instancesToLink);
	public IndividuellerAusleger mastschuss_(List<gittermastschuss.classes.Mastschuss> instancesToLink);
	public IndividuellerAusleger mastschuss_add_(gittermastschuss.classes.Mastschuss instanceToLink);
	public IndividuellerAusleger anfangMast_(AnfangMast anfangMast);
	public IndividuellerAusleger position_(geometry.Position position);
	public IndividuellerAusleger laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger endeMast_(EndeMast endeMast);
	public IndividuellerAusleger breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger gschwerpunktxk_(Double gschwerpunktxk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger gschwerpunktyk_(Double gschwerpunktyk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger gschwerpunktzk_(Double gschwerpunktzk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger effektivelaenge_(Double effektivelaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger absoluteposition_(geometry.Position absoluteposition);
	public IndividuellerAusleger effektivehoehe_(Double effektivehoehe, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public IndividuellerAusleger shape_(geometry.Shape shape);
	public IndividuellerAusleger existingComponent_(geometry.ExistingComponent existingComponent);
	public IndividuellerAusleger color_(geometry.Color color);
	public IndividuellerAusleger primitiveShape_(geometry.Shape primitiveShape);
	public IndividuellerAusleger userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public IndividuellerAusleger sub_(geometry.TopologyElement... instancesToLink);
	public IndividuellerAusleger sub_(List<geometry.TopologyElement> instancesToLink);
	public IndividuellerAusleger sub_add_(geometry.TopologyElement instanceToLink);
}
