package questao4;

public class LaboratorioQuimica extends Sala{

    private int quantidadeRecipiente;
    private int quantidadeJaleco;
    private int quantidadeMaterialProtecao;

    public LaboratorioQuimica(int capacidade, String id, String apelido, String titulo, int quantidadeRecipiente,
                              int quantidadeJaleco, int quantidadeMaterialProtecao) {
        super(capacidade, id, apelido, titulo);
        this.quantidadeRecipiente = quantidadeRecipiente;
        this.quantidadeJaleco = quantidadeJaleco;
        this.quantidadeMaterialProtecao = quantidadeMaterialProtecao;
    }

    public int getQuantidadeRecipiente() {
        return quantidadeRecipiente;
    }

    public void setQuantidadeRecipiente(int quantidadeRecipiente) {
        this.quantidadeRecipiente = quantidadeRecipiente;
    }

    public int getQuantidadeJaleco() {
        return quantidadeJaleco;
    }

    public void setQuantidadeJaleco(int quantidadeJaleco) {
        this.quantidadeJaleco = quantidadeJaleco;
    }

    public int getQuantidadeMaterialProtecao() {
        return quantidadeMaterialProtecao;
    }

    public void setQuantidadeMaterialProtecao(int quantidadeMaterialProtecao) {
        this.quantidadeMaterialProtecao = quantidadeMaterialProtecao;
    }
}
