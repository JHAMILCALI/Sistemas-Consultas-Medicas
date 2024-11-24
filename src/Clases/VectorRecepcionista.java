package Clases;

public class VectorRecepcionista {
	protected
	int max=50;
	Recepcionista v[] = new Recepcionista[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Recepcionista[] getV() {
		return v;
	}
	public void setV(Recepcionista[] v) {
		this.v = v;
	}
}
