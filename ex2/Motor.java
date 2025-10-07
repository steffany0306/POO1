package ex2;

public class Motor {

	private String marca;
	private float potencia;
	private int cilindros;
	private String combustivel;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public String toString() {
		return "Motor [marca=" + marca + ", potencia=" + potencia + ", cilindros=" + cilindros + ", combustivel="
				+ combustivel + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
