public class Pessoa {
    private String nome;
    private String dataNascimento;
    private float altura;
    // metodos
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void exibedados() {
        System.out.println("Nome: " + getNome() + " - aniversario: " + getDataNascimento()+" - Altura: "+ getAltura());
    }
}