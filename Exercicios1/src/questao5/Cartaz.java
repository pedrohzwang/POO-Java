package questao5;

public class Cartaz extends Filme {

    public Cartaz(String tituloOriginal, String tituloPortugues, String filmeGenero, String paisOrigem, String atoresNomes, String diretorNome, String tipoExibicao, double filmeDuracao, short faixaEtaria) {
        super(tituloOriginal, tituloPortugues, filmeGenero, paisOrigem, atoresNomes, diretorNome, tipoExibicao, filmeDuracao, faixaEtaria);
    }

    public void Cartaz() {
        System.out.println("O filme " + getTituloPortugues() + 
                           " está em cartaz! Dirigido por " + getDiretorNome() + 
                           " e feito totalmente em " + getTipoExibicao() + 
                           ", o filme possui " + getFilmeDuracao() + 
                           " minutos e sua faixa etária é " + getFaixaEtaria() + 
                           ", sendo uma excelente opção.");
    }
    
}
