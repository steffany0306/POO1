package ex2;

public class Carro {

	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
