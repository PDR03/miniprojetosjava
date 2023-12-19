package biblioteca;

public class livro extends ItemBiblioteca{
private int numeroDePag = 0;

public livro(String titulo, String autor, int anoDePublicacao, int numeroDePag){
    this.setTitulo(titulo);
    this.setAutor(autor);
    this.setNumeroDePag(numeroDePag);
    this.setAnoPublicacao(anoDePublicacao);
}




    @Override
    public String toString() {
        return "livro [numeroDePag=" + numeroDePag + super.toString() + "]";
    }


    @Override
    public void exibirInformacoes() {
        toString();
        
    }


    //Gettter and Setters
    
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

    public int getNumeroDePag() {
        return numeroDePag;
    }

    public void setNumeroDePag(int numeroDePag) {
        this.numeroDePag = numeroDePag;
    }
}
