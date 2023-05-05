public class Aula11_Animal{
    private String nomeDaClasse;
    public getNome(){
        return this.nomeDaClasse;
    }
    public  setNome(String nome){
        return this.nomeDaClasse = nome;
    }
    public void andar(){
        if(this.getNome()){
            System.out.println(this.getNome() + "Andando");
        }
    }
    
}