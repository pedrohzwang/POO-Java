package questao4;

public class SalaAula extends Sala{

	private int quantidadeAssentos;
	private int quantidadeQuadros;
	private int quantidadeMesaProfessor;
	private boolean retroprojetor;
	private boolean telaProjecao;
	private boolean tvCabo;

	public SalaAula(int capacidade, String id, String apelido, String titulo, int quantidadeAssentos,
					int quantidadeQuadros, int quantidadeMesaProfessor, boolean retroprojetor, boolean telaProjecao,
					boolean tvCabo) {
		super(capacidade, id, apelido, titulo);
		this.quantidadeAssentos = quantidadeAssentos;
		this.quantidadeQuadros = quantidadeQuadros;
		this.quantidadeMesaProfessor = quantidadeMesaProfessor;
		this.retroprojetor = retroprojetor;
		this.telaProjecao = telaProjecao;
		this.tvCabo = tvCabo;
	}

	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}

	public int getQuantidadeQuadros() {
		return quantidadeQuadros;
	}

	public void setQuantidadeQuadros(int quantidadeQuadros) {
		this.quantidadeQuadros = quantidadeQuadros;
	}

	public int getQuantidadeMesaProfessor() {
		return quantidadeMesaProfessor;
	}

	public void setQuantidadeMesaProfessor(int quantidadeMesaProfessor) {
		this.quantidadeMesaProfessor = quantidadeMesaProfessor;
	}

	public boolean isRetroprojetor() {
		return retroprojetor;
	}

	public void setRetroprojetor(boolean retroprojetor) {
		this.retroprojetor = retroprojetor;
	}

	public boolean isTelaProjecao() {
		return telaProjecao;
	}

	public void setTelaProjecao(boolean telaProjecao) {
		this.telaProjecao = telaProjecao;
	}

	public boolean isTvCabo() {
		return tvCabo;
	}

	public void setTvCabo(boolean tvCabo) {
		this.tvCabo = tvCabo;
	}
}
