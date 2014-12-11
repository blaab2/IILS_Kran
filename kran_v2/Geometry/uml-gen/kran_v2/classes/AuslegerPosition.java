package kran_v2.classes;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = { "de.iils.dc43.scriptrule.generator.JavaGenerator" }, date = "2014-11-24T15:37:12.278+0100")
@SuppressWarnings("all")
public interface AuslegerPosition extends geometry.Position {
	
	public AuslegerPosition psi_(Double psi, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition theta_(Double theta, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition phi_(Double phi, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition dx_(Double dx, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition dy_(Double dy, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition dz_(Double dz, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a11_(Double a11, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a12_(Double a12, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a13_(Double a13, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a14_(Double a14, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a21_(Double a21, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a22_(Double a22, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a23_(Double a23, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a24_(Double a24, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a31_(Double a31, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a32_(Double a32, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a33_(Double a33, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a34_(Double a34, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a41_(Double a41, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a42_(Double a42, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a43_(Double a43, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition a44_(Double a44, org.eclipse.uml2.uml.Stereotype... slotStereos);
	public AuslegerPosition sub_(geometry.TopologyElement... instancesToLink);
	public AuslegerPosition sub_(List<geometry.TopologyElement> instancesToLink);
	public AuslegerPosition sub_add_(geometry.TopologyElement instanceToLink);
}
