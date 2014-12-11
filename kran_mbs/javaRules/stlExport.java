import java.util.Map;

import com4j.Holder;

import de.iils.dc43.geometry.CatiaHelper;
import de.iils.dc43.geometry.API.GeometryUserDefinedFeature;
import de.iils.dc43.geometry.catiaInterface.AnyObject;

public class stlExport extends GeometryUserDefinedFeature {

	@Override
	public AnyObject executeCatia(CatiaHelper catiaHelper, Map<String, Double> parameterList) {
		catiaHelper.part().application().activeDocument().exportData(new Holder("C:\\Users\\ossig\\Desktop\\test.stl"), new Holder("stl"));
		System.out.println("export");
		return null;
	}
}
