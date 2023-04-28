import java.util.Scanner;

public class Aula10__ex02 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner console = new Scanner(System.in);
        System.out.print("DIgite o seu nome: " );
        String nome = console.nextLine();
        p.setNome(nome);
        System.out.println("Digite o seu aniversario: ");
        String dataNascimento = console.nextLine();
        p.setDataNascimento(dataNascimento);
        System.out.println("Digite a sua altura: ");
        float altura = console.nextFloat();
        p.setAltura(altura);
        p.exibedados();
    }
}