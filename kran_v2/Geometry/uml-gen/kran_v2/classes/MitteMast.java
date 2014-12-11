package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface MitteMast extends gittermastschuss.classes.Mastschuss {
	
	public MitteMast laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast breite0_(Double breite0, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast hoehe0_(Double hoehe0, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast hoehe1_(Double hoehe1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast teile_(Double teile, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast teillaenge_(Double teillaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast anfangsTeilMastschuss_(gittermastschuss.classes.AnfangsTeilMastschuss anfangsTeilMastschuss);
	public MitteMast anbindunglaenge_(Double anbindunglaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast mittelTeilMastschuss_(gittermastschuss.classes.MittelTeilMastschuss... instancesToLink);
	public MitteMast mittelTeilMastschuss_(List<gittermastschuss.classes.MittelTeilMastschuss> instancesToLink);
	public MitteMast mittelTeilMastschuss_add_(gittermastschuss.classes.MittelTeilMastschuss instanceToLink);
	public MitteMast dy_(Double dy, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast dz_(Double dz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast endTeilMastschuss_(gittermastschuss.classes.EndTeilMastschuss endTeilMastschuss);
	public MitteMast mastschussGeometrie_(gittermastschuss.classes.MastschussGeometrie mastschussGeometrie);
	public MitteMast xposition_(Double xposition, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast nextmastschuss_(gittermastschuss.classes.Mastschuss nextmastschuss);
	public MitteMast volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public MitteMast shape_(geometry.Shape shape);
	public MitteMast existingComponent_(geometry.ExistingComponent existingComponent);
	public MitteMast color_(geometry.Color color);
	public MitteMast primitiveShape_(geometry.Shape primitiveShape);
	public MitteMast userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public MitteMast sub_(geometry.TopologyElement... instancesToLink);
	public MitteMast sub_(List<geometry.TopologyElement> instancesToLink);
	public MitteMast sub_add_(geometry.TopologyElement instanceToLink);
}
