public class Aula09Interruptor {
    public Lampada conectada;
    public boolean ligado;
    public Aula09Interruptor(Lampada conectada) {
        this.conectar(conectada);
    }
    public void conectar(Lampada l) {
        this.conectada = l;
    }
    public void ligar(){
        System.out.println("Ligando interruptor");
        if(!this.ligado) {
            this.ligado = true;
            if(conectada != null){
                conectada.acender();
            }
        }
    }
    public void desligar() {
        System.out.println("Desligando interruptor");
        if(this.ligado) {
            this.ligado = false;
            if(conectada != null) {
                conectada.apagar();
            }
        }
    }
    @Override
    public String toString(){
        return "Interruptor [conecetada=" + conectada + "]";
    }
}