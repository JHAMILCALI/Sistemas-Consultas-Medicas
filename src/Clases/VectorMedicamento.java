package Clases;

public class VectorMedicamento {
	protected
	int max=50;
	Medicamento v[] = new Medicamento[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Medicamento[] getV() {
		return v;
	}
	public void setV(Medicamento[] v) {
		this.v = v;
	}
}
