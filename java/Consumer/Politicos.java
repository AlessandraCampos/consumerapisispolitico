package Consumer;

public class Politicos {
	
	private int id;
    private String nome;
    private Partidos partido;
    private Cargos cargo;
    private String foto;
    private String atribuicao;
    
    
    public Cargos getCargo() {
		return cargo;
	}
	public Politicos(int id, String nome, Partidos partido, Cargos cargo, String foto, String atribuicao) {
		super();
		this.id = id;
		this.nome = nome;
		this.partido = partido;
		this.cargo = cargo;
		this.foto = foto;
		this.atribuicao = atribuicao;
	}
	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}
	
	
	    public int getId() {
		return id;
	}
	public Partidos getPartido() {
			return partido;
		}
		public void setPartido(Partidos partido) {
			this.partido = partido;
		}
	public Politicos() {
			
		}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getAtribuicao() {
		return atribuicao;
	}
	public void setAtribuicao(String atribuicao) {
		this.atribuicao = atribuicao;
	}
	public void setId(int id) {
		this.id = id;
	}

	


}