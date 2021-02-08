package questao5;

public class Cinema {
    private int numeroIdentificacao;
    private short capacidadeLotacao, quantidadeSalasTotal, quantidadeSalasDisponiveis, numeroTelefone;
    private String nomeCinema, enderecoRua, enderecoNumero, enderecoBairro;

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public short getCapacidadeLotacao() {
        return capacidadeLotacao;
    }

    public void setCapacidadeLotacao(short capacidadeLotacao) {
        this.capacidadeLotacao = capacidadeLotacao;
    }

    public short getQuantidadeSalasTotal() {
        return quantidadeSalasTotal;
    }

    public void setQuantidadeSalasTotal(short quantidadeSalasTotal) {
        this.quantidadeSalasTotal = quantidadeSalasTotal;
    }

    public short getQuantidadeSalasDisponiveis() {
        return quantidadeSalasDisponiveis;
    }

    public void setQuantidadeSalasDisponiveis(short quantidadeSalasDisponiveis) {
        this.quantidadeSalasDisponiveis = quantidadeSalasDisponiveis;
    }

    public short getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(short numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNomeCinema() {
        return nomeCinema;
    }

    public void setNomeCinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public Cinema(int numeroIdentificacao, short capacidadeLotacao, short quantidadeSalasTotal, short quantidadeSalasDisponiveis, short numeroTelefone, String nomeCinema, String enderecoRua, String enderecoNumero, String enderecoBairro) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.capacidadeLotacao = capacidadeLotacao;
        this.quantidadeSalasTotal = quantidadeSalasTotal;
        this.quantidadeSalasDisponiveis = quantidadeSalasDisponiveis;
        this.numeroTelefone = numeroTelefone;
        this.nomeCinema = nomeCinema;
        this.enderecoRua = enderecoRua;
        this.enderecoNumero = enderecoNumero;
        this.enderecoBairro = enderecoBairro;
    }
    
}
