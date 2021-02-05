package questao4;

public class Sala {

	private int capacidade;
	private String id;
	private String apelido;
	private String titulo;
	
	public Sala(int capacidade, String id, String apelido, String titulo) {
		this.capacidade = capacidade;
		this.id = id;
		this.apelido = apelido;
		this.titulo = titulo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApelido() {
		if(apelido == null) {
			return "Esta sala não possui apelido!";
		}
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getTitulo() {
		if(titulo == null) {
			return "Esta sala não possui um título definido!";
		}
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
