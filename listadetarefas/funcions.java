package listadetarefas;

import java.util.*;
public class funcions {
    Scanner scanner = new Scanner(System.in);
    //variaveis
    public List<String> tasks = new ArrayList<>();
    public List<Boolean> status = new ArrayList<>();   
    //funcions
    public void firstLocal(){
    tasks.add("Todas as tarefas são:");
    status.add(true);}

    public void newTask(){
        System.out.println("Digite a Task que deseja adicionar: ");
        
        tasks.add(scanner.nextLine());
        status.add(false);
        
    }
    public void seeTask(){
        System.out.println("Qual Task deseja ver? (digite o numero 0 se deseja ver todas)");
        int index = scanner.nextInt();
        if(index >= 1 && index < tasks.size()){
            System.out.println("A task" + index + " é: " + tasks.get(index));
        } else if(index == 0 ){
            for(int i = 1; i < tasks.size(); i++){
                System.out.println("A task " + i + "é: " + tasks.get(i));
                if(status.get(i) == true){
                    System.out.println("Task concluida");
                }else if(status.get(i) == false){
                    System.out.println("Task não concluida");
                }
            } 
          } else if(!tasks.isEmpty()) {
                        System.out.println("A lista está vazia");
            }
    }
    public void editTask(){
        System.out.println("Qual task deseja modificar?");  
        int n = scanner.nextInt();
        status.set(n, true);     
        System.out.println(tasks.get(n) + "foi concluida"); 
    }   
    public void taskQuestion(){
        System.out.println("""
        1- Adicionar tarefa
        2- Ver tarefas
        3- Editar tarefa""");
    }

}
