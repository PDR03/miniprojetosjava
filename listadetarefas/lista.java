package listadetarefas;
import java.util.*;
public class lista {
    
    public static void main(String[] args) {
    Scanner iskan = new Scanner(System.in);
    funcions n = new funcions();
        int resp = 0;
        n.firstLocal();
        System.out.println("Lista de tarefas");
        System.out.println("O que deseja fazer");
        n.taskQuestion();
        resp = iskan.nextInt();
        while (resp != 4) {
          switch (resp) {
            case 1: 
            n.newTask();  
            n.taskQuestion(); 
            resp = iskan.nextInt();
                break;
            case 2:
            n.seeTask(); 
            n.taskQuestion();
            resp = iskan.nextInt(); 
                break;
            case 3:
            n.editTask();  
            n.taskQuestion();
            resp = iskan.nextInt();
                break;
            default:
                break;
          }    
        }
    }
}
