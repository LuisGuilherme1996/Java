import java.util.Scanner;
public class Midia {
    private int codigo;
    private double preco;
    private String name;
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
     public void setPreco(double preco) {
        this.preco = preco;
     }
     public void setName(String name){
        this.name = name;
     }
     public int getCodigo() {
        return codigo;
     }
     public double getPreco(){
        return preco;
     }
     public String getName(){
        return name;
     }
     public Midia(){
        this(0,0,0, "Nenhum");
     }
}