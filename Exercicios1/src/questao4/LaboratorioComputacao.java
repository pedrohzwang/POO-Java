package questao4;

public class LaboratorioComputacao extends Sala{

    private int quantidadeComputadores;
    private int quantidadeMouse;
    private int quantidadeTeclados;

    public LaboratorioComputacao(int capacidade, String id, String apelido, String titulo,
                                 int quantidadeComputadores, int quantidadeMouse, int quantidadeTeclados) {
        super(capacidade, id, apelido, titulo);
        this.quantidadeComputadores = quantidadeComputadores;
        this.quantidadeMouse = quantidadeMouse;
        this.quantidadeTeclados = quantidadeTeclados;
    }

    public int getQuantidadeComputadores() {
        return quantidadeComputadores;
    }

    public void setQuantidadeComputadores(int quantidadeComputadores) {
        this.quantidadeComputadores = quantidadeComputadores;
    }

    public int getQuantidadeMouse() {
        return quantidadeMouse;
    }

    public void setQuantidadeMouse(int quantidadeMouse) {
        this.quantidadeMouse = quantidadeMouse;
    }

    public int getQuantidadeTeclados() {
        return quantidadeTeclados;
    }

    public void setQuantidadeTeclados(int quantidadeTeclados) {
        this.quantidadeTeclados = quantidadeTeclados;
    }
}
