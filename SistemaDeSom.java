
public class SistemaDeSom {

	private String marca;
	private String modelo;
	private float potencia;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	public String toString() {
		return "SistemaDeSom [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
