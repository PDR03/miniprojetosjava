package biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private List<ItemBiblioteca> itensDisponivels;
    private List<Usuario> usuariosCadastrados;

    public void adicionarItem(ItemBiblioteca item){
        itensDisponivels.add(item);
    }
    public void cadastrarUsuario(Usuario usuario){
        usuariosCadastrados.add(usuario);
    }

    public Biblioteca(List<ItemBiblioteca> itensDisponivels, List<Usuario> usuariosCadastrados) {
        this.itensDisponivels = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
    }

    public void exibirItensDisponiveis() {
        System.out.println("Itens Disponíveis na Biblioteca:");
        for (ItemBiblioteca item : itensDisponivels) {
            item.exibirInformacoes(); // Assume que a classe ItemBiblioteca tem um método exibirInformacoes
            System.out.println("--------------------------------------");
        }
    }

    public void exibirUsuariosCadastrados() {
        System.out.println("Usuários Cadastrados na Biblioteca:");
        for (Usuario usuario : usuariosCadastrados) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("ID: " + usuario.getIdd()); // Assume que a classe Usuario tem um método getIdd
            System.out.println("--------------------------------------");
        }
    }

    Usuario c1 = new Usuario("Doazin", 18, itensDisponivels);
    livro l1 = new livro("O iluminado", "Stephen King", 1987, 387);
    CD cd1 = new CD("As Vantagens De Ser Invisivel", "Stephen ", 1996, 243);  
}
 