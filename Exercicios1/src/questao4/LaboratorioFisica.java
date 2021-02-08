package questao4;

public class LaboratorioFisica extends Sala{

    private int quantidadeFios;
    private int quantidadeMultimetro;
    private int quantidadeFerramenta;

    public LaboratorioFisica(int capacidade, String id, String apelido, String titulo,
                             int quantidadeFios, int quantidadeMultimetro, int quantidadeFerramenta) {
        super(capacidade, id, apelido, titulo);
        this.quantidadeFios = quantidadeFios;
        this.quantidadeMultimetro = quantidadeMultimetro;
        this.quantidadeFerramenta = quantidadeFerramenta;
    }

    public int getQuantidadeFios() {
        return quantidadeFios;
    }

    public void setQuantidadeFios(int quantidadeFios) {
        this.quantidadeFios = quantidadeFios;
    }

    public int getQuantidadeMultimetro() {
        return quantidadeMultimetro;
    }

    public void setQuantidadeMultimetro(int quantidadeMultimetro) {
        this.quantidadeMultimetro = quantidadeMultimetro;
    }

    public int getQuantidadeFerramenta() {
        return quantidadeFerramenta;
    }

    public void setQuantidadeFerramenta(int quantidadeFerramenta) {
        this.quantidadeFerramenta = quantidadeFerramenta;
    }
}
