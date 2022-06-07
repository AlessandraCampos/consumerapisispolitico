package Consumer;


public class Partidos {
	

	public Partidos(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}


	public Partidos() {

	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	private String sigla;
	

	private String nome;

}
