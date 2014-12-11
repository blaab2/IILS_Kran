package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface NormVerbindungsseil extends kran_v2.classes.Verbindungsseil {
	
	public NormVerbindungsseil mast1_(Mast mast1);
	public NormVerbindungsseil mast2_(Mast mast2);
	public NormVerbindungsseil mast1pos_(Double mast1pos, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public NormVerbindungsseil mast2pos_(Double mast2pos, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public NormVerbindungsseil start_(geometry.Point start);
	public NormVerbindungsseil ende_(geometry.Point ende);
	public NormVerbindungsseil seilErsatzgeometrie_(seil.classes.SeilErsatzgeometrie seilErsatzgeometrie);
	public NormVerbindungsseil shape_(geometry.Shape shape);
	public NormVerbindungsseil existingComponent_(geometry.ExistingComponent existingComponent);
	public NormVerbindungsseil color_(geometry.Color color);
	public NormVerbindungsseil primitiveShape_(geometry.Shape primitiveShape);
	public NormVerbindungsseil userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public NormVerbindungsseil sub_(geometry.TopologyElement... instancesToLink);
	public NormVerbindungsseil sub_(List<geometry.TopologyElement> instancesToLink);
	public NormVerbindungsseil sub_add_(geometry.TopologyElement instanceToLink);
}
