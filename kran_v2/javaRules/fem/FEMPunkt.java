package fem;

public class FEMPunkt {

	private double x;
	private double y;
	private double z;
	private int index;

	public FEMPunkt(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public boolean equals(Object obj) {
		// if (obj instanceof FEMPunkt) {
		//
		// }
		return super.equals(obj);
	}

}
