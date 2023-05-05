import java.util.Scanner;

public class Agenda {
    private String nome;
    private int idade;
    private float altura;
    private any arrayNome[];

public void armazenaPessoa(String nome, int idade, float altura){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.arrayNome.add(this.nome,this.idade,this.altura);

}

public void removerPessoa(String nome){
    for(int i; i < this.arrayNome.lenght; i++){
        if(this.arrayNome[i].nome == nome){
            this.arrayNome.remove(this.arrayNome[i]);
        }
    }
}
}