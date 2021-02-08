package questao4;

public class LaboratorioBiologia extends Sala{

    private int quantidadeMicroscopio;
    private int quantidadeMascara;

    public LaboratorioBiologia(int capacidade, String id, String apelido, String titulo, int quantidadeMicroscopio) {
        super(capacidade, id, apelido, titulo);
        this.quantidadeMicroscopio = quantidadeMicroscopio;
    }

    public int getQuantidadeMicroscopio() {
        return quantidadeMicroscopio;
    }

    public void setQuantidadeMicroscopio(int quantidadeMicroscopio) {
        this.quantidadeMicroscopio = quantidadeMicroscopio;
    }

    public int getQuantidadeMascara() {
        return quantidadeMascara;
    }

    public void setQuantidadeMascara(int quantidadeMascara) {
        this.quantidadeMascara = quantidadeMascara;
    }
}
