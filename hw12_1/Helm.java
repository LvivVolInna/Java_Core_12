package hw12_1;

import java.util.Arrays;

public class Helm {

	int helmDiameter;
	String materialOfHelm;
	

	public Helm(int helmDiameter, String mamaterialOfHelm) {
		super();
		this.helmDiameter = helmDiameter;
		this.materialOfHelm = mamaterialOfHelm;
	}

	public int getHelmDiameter() {
		return helmDiameter;
	}

	public String getMamaterialOfHelm() {
		return materialOfHelm;
	}

	@Override
	public String toString() {
		return "Helm [helmDiameter=" + helmDiameter + ", materialOfHelm=" + materialOfHelm + "]";
	}

}
