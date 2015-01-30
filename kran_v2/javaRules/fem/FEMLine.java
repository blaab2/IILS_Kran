package fem;

public class FEMLine {
	FEMPunkt p1;
	FEMPunkt p2;
	int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public FEMLine(FEMPunkt p1, FEMPunkt p2, int id) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.ID = id;
	}

	public FEMPunkt getP1() {
		return p1;
	}

	public void setP1(FEMPunkt p1) {
		this.p1 = p1;
	}

	public FEMPunkt getP2() {
		return p2;
	}

	public void setP2(FEMPunkt p2) {
		this.p2 = p2;
	}

}
