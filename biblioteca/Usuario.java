package biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int Idd;
    private List<ItemBiblioteca> itensEmprestados;

    public Usuario(String nome, int idd, List<ItemBiblioteca> itensEmprestados) {
        this.nome = nome;
        Idd = idd;
        this.itensEmprestados = new ArrayList<>();
    }
    public void emprestarItem(ItemBiblioteca item){
        itensEmprestados.add(item);
    }

    public void devolverItem(ItemBiblioteca item){
        itensEmprestados.remove(item);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdd() {
        return Idd;
    }
    public void setIdd(int idd) {
        Idd = idd;
    }
    public List<ItemBiblioteca> getItensEmprestados() {
        return itensEmprestados;
    }
    public void setItensEmprestados(List<ItemBiblioteca> itensEmprestados) {
        this.itensEmprestados = itensEmprestados;
    }
}