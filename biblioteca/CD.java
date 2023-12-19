package biblioteca;

public class CD extends ItemBiblioteca{
private int duracao;

    public CD(String titulo, String autor, int anoDePublicacao, int duracao){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setDuracao(duracao);
        this.setAnoPublicacao(anoDePublicacao);
    }

    @Override 

    public String toString(){
        return super.toString() + duracao;
    }
    @Override
    public void exibirInformacoes() {
     toString();
    }

    //Getter and Setters    
    @Override
    public int getAnoPublicacao() {
        return super.getAnoPublicacao();
    }
    @Override
    public String getAutor() {
        return super.getAutor();
    }
    @Override
    public String getTitulo() {
        return super.getTitulo();
    }
    @Override
    public void setAnoPublicacao(int anoPublicacao) {
        super.setAnoPublicacao(anoPublicacao);
    }
    @Override
    public void setAutor(String autor) {
        super.setAutor(autor);
    }
    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }


    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
