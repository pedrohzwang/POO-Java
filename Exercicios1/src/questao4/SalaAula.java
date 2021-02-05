package questao4;

public class SalaAula extends Sala{

	private int quantidadeAssentos;
	private int quantidadeQuadros;
	private int quantidadeMesaProfessor;
	private boolean retroprojetor;
	private boolean telaProjecao;
	
	public SalaAula(int capacidade, String id, String apelido, String titulo, int quantidadeAssentos,
			int quantidadeQuadros, int quantidadeMesaProfessor, boolean retroprojetor, boolean telaProjecao) {
		super(capacidade, id, apelido, titulo);
		this.quantidadeAssentos = quantidadeAssentos;
		this.quantidadeQuadros = quantidadeQuadros;
		this.quantidadeMesaProfessor = quantidadeMesaProfessor;
		this.retroprojetor = retroprojetor;
		this.telaProjecao = telaProjecao;
	}
	
	
}
