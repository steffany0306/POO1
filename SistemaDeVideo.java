
public class SistemaDeVideo {

	private String marcavideo;
	private String modeloVideo;
	private String tipo;
	private String resolucao;
	public String getMarcavideo() {
		return marcavideo;
	}
	public void setMarcavideo(String marcavideo) {
		this.marcavideo = marcavideo;
	}
	public String getModeloVideo() {
		return modeloVideo;
	}
	public void setModeloVideo(String modeloVideo) {
		this.modeloVideo = modeloVideo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getResolucao() {
		return resolucao;
	}
	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	
	public String toString() {
		return "SistemaDeVideo [marcavideo=" + marcavideo + ", modeloVideo=" + modeloVideo + ", tipo=" + tipo
				+ ", resolucao=" + resolucao + ", toString()=" + super.toString() + "]";
	}
	
	
}
