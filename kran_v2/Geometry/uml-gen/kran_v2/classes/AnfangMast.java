package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface AnfangMast extends gittermastschuss.classes.Mastschuss {
	
	public AnfangMast laenge_(Double laenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast breite0_(Double breite0, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast hoehe0_(Double hoehe0, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast breite1_(Double breite1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast hoehe1_(Double hoehe1, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast teile_(Double teile, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast teillaenge_(Double teillaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast anfangsTeilMastschuss_(gittermastschuss.classes.AnfangsTeilMastschuss anfangsTeilMastschuss);
	public AnfangMast anbindunglaenge_(Double anbindunglaenge, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast mittelTeilMastschuss_(gittermastschuss.classes.MittelTeilMastschuss... instancesToLink);
	public AnfangMast mittelTeilMastschuss_(List<gittermastschuss.classes.MittelTeilMastschuss> instancesToLink);
	public AnfangMast mittelTeilMastschuss_add_(gittermastschuss.classes.MittelTeilMastschuss instanceToLink);
	public AnfangMast dy_(Double dy, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast dz_(Double dz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast endTeilMastschuss_(gittermastschuss.classes.EndTeilMastschuss endTeilMastschuss);
	public AnfangMast mastschussGeometrie_(gittermastschuss.classes.MastschussGeometrie mastschussGeometrie);
	public AnfangMast xposition_(Double xposition, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast nextmastschuss_(gittermastschuss.classes.Mastschuss nextmastschuss);
	public AnfangMast volumen_(Double volumen, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast schwerpunktx_(Double schwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast schwerpunkty_(Double schwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast schwerpunktz_(Double schwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast gschwerpunktx_(Double gschwerpunktx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast gschwerpunkty_(Double gschwerpunkty, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast gschwerpunktz_(Double gschwerpunktz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast typ_(Double typ, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AnfangMast shape_(geometry.Shape shape);
	public AnfangMast existingComponent_(geometry.ExistingComponent existingComponent);
	public AnfangMast color_(geometry.Color color);
	public AnfangMast primitiveShape_(geometry.Shape primitiveShape);
	public AnfangMast userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public AnfangMast sub_(geometry.TopologyElement... instancesToLink);
	public AnfangMast sub_(List<geometry.TopologyElement> instancesToLink);
	public AnfangMast sub_add_(geometry.TopologyElement instanceToLink);
}
