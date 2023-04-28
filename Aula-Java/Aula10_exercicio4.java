public class Televisao {
    private boolean ligar;
    private int volume;
    private int canal;
    private int trocarCanalIndicado;
    private int verificaCanal;
    private int verificaVolume;

    public boolean getLigar(){
        if(ligar == true) {
            return "Ligou Tv" + this.ligar;
        }
        else {
            return "Desligou Tv" + this.ligar;
        }
    }
    public boolean setLigar(boolean ligar){
        return this.ligar = ligar;
    }

    public int getVolume(){
        if(volume > 100){
            return "Volume no maximo";
        }
        return volume;
    }
    public int setVolume(int volume){
        return this.volume = volume;
    }

    public int getCanal(){
        return canal;
    }

    public int setCanal(int canal){
        return this.canal = canal;
    }

    public int getTrocarCanalIndicado(){
        return trocarCanalIndicado;
    }

    public int setTrocarCanalIndicado(int trocarCanalIndicado){
        return this.canal = trocarCanalIndicado;
    }

    public int getVerificaCanal(){
        return verificaCanal;
    }

    public int setVerificaCanal(int verificaCanal){
        return this.verificaCanal = verificaCanal;
    }

    public int getVerificaVolume(){
        return verificaVolume;
    }

    public int setVerificaVolume(int verificaVolume){
        return this.verificaCanal = verificaVolume;
    }

    public exibirCanal(){
        System.out.println("A tv esta: " + getLigar() + "Canal exibido é o canal: " + getCanal() + "O valume esta no: " + getVolume());
    }

    

}