package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface Unterbau extends geometry.Component {
	
	public static final String UNTERBAU_MODEL__PROP = "unterbauModel";
	public org.eclipse.uml2.uml.Property umlPropUnterbauModel();
	public org.eclipse.uml2.uml.Slot umlSlotUnterbauModel();
	public UnterbauModel getUnterbauModel();
	public void setUnterbauModel(UnterbauModel unterbauModel);
	public static final String X_HAUPTAUSLEGER__PROP = "xHauptausleger";
	public org.eclipse.uml2.uml.Property umlPropXHauptausleger();
	public org.eclipse.uml2.uml.Slot umlSlotXHauptausleger();
	public Double getXHauptausleger();
	public void setXHauptausleger(Double xHauptausleger);
	public static final String HAUPTAUSLEGER_POSITION__PROP = "hauptauslegerPosition";
	public org.eclipse.uml2.uml.Property umlPropHauptauslegerPosition();
	public org.eclipse.uml2.uml.Slot umlSlotHauptauslegerPosition();
	public AuslegerPosition getHauptauslegerPosition();
	public void setHauptauslegerPosition(AuslegerPosition hauptauslegerPosition);
	public static final String NEBENAUSLEGER_POSITION__PROP = "nebenauslegerPosition";
	public org.eclipse.uml2.uml.Property umlPropNebenauslegerPosition();
	public org.eclipse.uml2.uml.Slot umlSlotNebenauslegerPosition();
	public AuslegerPosition getNebenauslegerPosition();
	public void setNebenauslegerPosition(AuslegerPosition nebenauslegerPosition);
	public static final String GEWICHTE_POSITION__PROP = "gewichtePosition";
	public org.eclipse.uml2.uml.Property umlPropGewichtePosition();
	public org.eclipse.uml2.uml.Slot umlSlotGewichtePosition();
	public geometry.Position getGewichtePosition();
	public void setGewichtePosition(geometry.Position gewichtePosition);
	public static final String GEWICHTE__PROP = "gewichte";
	public org.eclipse.uml2.uml.Property umlPropGewichte();
	public org.eclipse.uml2.uml.Slot umlSlotGewichte();
	public gegengewichte.classes.Gewichtestapel getGewichte();
	public void setGewichte(gegengewichte.classes.Gewichtestapel gewichte);
	public static final String ABSPANNBOCK_POSITION__PROP = "abspannbockPosition";
	public org.eclipse.uml2.uml.Property umlPropAbspannbockPosition();
	public org.eclipse.uml2.uml.Slot umlSlotAbspannbockPosition();
	public AuslegerPosition getAbspannbockPosition();
	public void setAbspannbockPosition(AuslegerPosition abspannbockPosition);
	public Unterbau unterbauModel_(UnterbauModel unterbauModel);
	public Unterbau xHauptausleger_(Double xHauptausleger, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public Unterbau hauptauslegerPosition_(AuslegerPosition hauptauslegerPosition);
	public Unterbau nebenauslegerPosition_(AuslegerPosition nebenauslegerPosition);
	public Unterbau gewichtePosition_(geometry.Position gewichtePosition);
	public Unterbau gewichte_(gegengewichte.classes.Gewichtestapel gewichte);
	public Unterbau abspannbockPosition_(AuslegerPosition abspannbockPosition);
	public Unterbau shape_(geometry.Shape shape);
	public Unterbau existingComponent_(geometry.ExistingComponent existingComponent);
	public Unterbau color_(geometry.Color color);
	public Unterbau primitiveShape_(geometry.Shape primitiveShape);
	public Unterbau userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public Unterbau sub_(geometry.TopologyElement... instancesToLink);
	public Unterbau sub_(List<geometry.TopologyElement> instancesToLink);
	public Unterbau sub_add_(geometry.TopologyElement instanceToLink);
}
