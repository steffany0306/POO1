package ex2;

public class MainCarro {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.setEndereco("XV de Novembro");
		p.setNome("Carlos");
		System.out.println(p);
		
		Motor m = new Motor();
		m.setCilindros(4);
		m.setCombustivel("diesel");
		m.setMarca("Volksvagen");
		m.setPotencia(20);
		System.out.println(m);
		
		Carro c = new Carro();
		c.setAno(2025);
		c.setCor("Azul");
		c.setFabricante("Volksvagen");
		c.setModelo("Novo");
		System.out.println(c);
	}
}
