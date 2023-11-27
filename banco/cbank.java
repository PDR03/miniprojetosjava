package aula_03;
import java.util.Scanner;
public class cbank {
    Scanner scanner = new Scanner(System.in);
   public int nConta;
   protected String Tipo;
   private String Dono;
   private float saldo;
   private boolean Status; 
   private int resp;


public void openCount( String t){
this.setTipo(t);  
this.setStatus(true);  
if (t == "CC") {
    this.setsaldo(50f);
}else if (t == "CP"){ 
    this.setsaldo(150f); 

}

}
public void closeCount(){
    if(this.getsaldo() > 0){
        System.out.println("conta com dinheiro");
    } else if( this.getsaldo() < 0 ){
        System.out.println("Conta em débito");
    }
    else {
        this.setStatus(false);
        System.out.println("conta fechada com sucesso");
    }

}

public void deposit(float v){
    if(this.getStatus() == true){
        this.saldo += v;
    }else {
        System.out.println("não é possivel depositar");
    }
}
public void withdraw(float v){
    if((this.getStatus() == true) && (saldo >= v)){
        this.saldo -= v;
    }else {
        System.out.println("não é possivel sacar");
    }
}
public void payMonthly(){
float val = 0;
if (this.getTipo() == "CC"){
    val = 12;
}else if(this.getTipo() == "CP"){
    val = 20;
}
if ((this.getStatus() == true) && (this.getsaldo() > val )){
saldo -= val;
}
}

public cbank(){
    this.setsaldo(0);
    this.setStatus(false);
}


public int getResp(){
    return this.resp;
}

public void setResp(int r){
    this.resp = r;
}

public int getnConta(){
    return this.nConta;

}
public void setnConta(int c){
    this.nConta = c;
}

protected String getTipo(){
    return this.Tipo;
}
protected void setTipo(String k){
    this.Tipo = k;
}

public String getDono(){
    return this.Dono;
} 

public void setDono(String d){
    this.Dono = d;
}

public float getsaldo(){
    return this.saldo;
}
public void setsaldo(float s){
    this.saldo = s;
}

public boolean getStatus(){
    return this.Status;
}
public void setStatus(boolean s){
    this.Status = s;
}
}
