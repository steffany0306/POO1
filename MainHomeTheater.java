
public class MainHomeTheater {

	public static void main(String[] args) {

		SistemaDeSom ss = new SistemaDeSom();
		ss.setMarca(null);
		ss.setModelo(null);
		ss.setPotencia(0);
		System.out.println(ss);
		
		SistemaDeVideo sv = new SistemaDeVideo();
		sv.setMarcavideo(null);
		sv.setModeloVideo(null);
		sv.setResolucao(null);
		sv.setTipo(null);
		System.out.println(sv);
		;
	}

}
