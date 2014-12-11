package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface AuslegerEndeSeil extends kran_v2.classes.Verbindungsseil {
	
	public AuslegerEndeSeil mast1_(Mast mast1);
	public AuslegerEndeSeil mast2_(Mast mast2);
	public AuslegerEndeSeil mast1pos_(Double mast1pos, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerEndeSeil mast2pos_(Double mast2pos, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerEndeSeil start_(geometry.Point start);
	public AuslegerEndeSeil ende_(geometry.Point ende);
	public AuslegerEndeSeil seilErsatzgeometrie_(seil.classes.SeilErsatzgeometrie seilErsatzgeometrie);
	public AuslegerEndeSeil shape_(geometry.Shape shape);
	public AuslegerEndeSeil existingComponent_(geometry.ExistingComponent existingComponent);
	public AuslegerEndeSeil color_(geometry.Color color);
	public AuslegerEndeSeil primitiveShape_(geometry.Shape primitiveShape);
	public AuslegerEndeSeil userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public AuslegerEndeSeil sub_(geometry.TopologyElement... instancesToLink);
	public AuslegerEndeSeil sub_(List<geometry.TopologyElement> instancesToLink);
	public AuslegerEndeSeil sub_add_(geometry.TopologyElement instanceToLink);
}
