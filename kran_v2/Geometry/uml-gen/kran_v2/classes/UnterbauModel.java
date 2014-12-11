package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface UnterbauModel extends geometry.Component {
	
	public static final String POSITION__PROP = "position";
	public org.eclipse.uml2.uml.Property umlPropPosition();
	public org.eclipse.uml2.uml.Slot umlSlotPosition();
	public geometry.Position getPosition();
	public void setPosition(geometry.Position position);
	public static final String CUBOID__PROP = "cuboid";
	public org.eclipse.uml2.uml.Property umlPropCuboid();
	public org.eclipse.uml2.uml.Slot umlSlotCuboid();
	public geometry.Cuboid getCuboid();
	public void setCuboid(geometry.Cuboid cuboid);
	public static final String SCHWERPUNKTXK__PROP = "schwerpunktxk";
	public org.eclipse.uml2.uml.Property umlPropSchwerpunktxk();
	public org.eclipse.uml2.uml.Slot umlSlotSchwerpunktxk();
	public Double getSchwerpunktxk();
	public void setSchwerpunktxk(Double schwerpunktxk);
	public static final String SCHWERPUNKTYK__PROP = "schwerpunktyk";
	public org.eclipse.uml2.uml.Property umlPropSchwerpunktyk();
	public org.eclipse.uml2.uml.Slot umlSlotSchwerpunktyk();
	public Double getSchwerpunktyk();
	public void setSchwerpunktyk(Double schwerpunktyk);
	public static final String SCHWERPUNKTZK__PROP = "schwerpunktzk";
	public org.eclipse.uml2.uml.Property umlPropSchwerpunktzk();
	public org.eclipse.uml2.uml.Slot umlSlotSchwerpunktzk();
	public Double getSchwerpunktzk();
	public void setSchwerpunktzk(Double schwerpunktzk);
	public static final String MASSE__PROP = "Masse";
	public org.eclipse.uml2.uml.Property umlPropMasse();
	public org.eclipse.uml2.uml.Slot umlSlotMasse();
	public Double getMasse();
	public void setMasse(Double masse);
	public UnterbauModel position_(geometry.Position position);
	public UnterbauModel cuboid_(geometry.Cuboid cuboid);
	public UnterbauModel schwerpunktxk_(Double schwerpunktxk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public UnterbauModel schwerpunktyk_(Double schwerpunktyk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public UnterbauModel schwerpunktzk_(Double schwerpunktzk, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public UnterbauModel masse_(Double masse, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public UnterbauModel shape_(geometry.Shape shape);
	public UnterbauModel existingComponent_(geometry.ExistingComponent existingComponent);
	public UnterbauModel color_(geometry.Color color);
	public UnterbauModel primitiveShape_(geometry.Shape primitiveShape);
	public UnterbauModel userDefinedFeature_(geometry.UserDefinedFeature userDefinedFeature);
	public UnterbauModel sub_(geometry.TopologyElement... instancesToLink);
	public UnterbauModel sub_(List<geometry.TopologyElement> instancesToLink);
	public UnterbauModel sub_add_(geometry.TopologyElement instanceToLink);
}
