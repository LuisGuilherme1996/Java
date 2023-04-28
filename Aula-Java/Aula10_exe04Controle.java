public class Aula10__exe04Controle {
public static void main(String[] args) {
    Televisao tv = new Televisao();
    Scanner console = new Scanner(System.in);
    System.out.print("Ligue ou desligue a tv: " );
    int ligarTv = console.nextLine();
    tv.ligar(ligarTv);
    System.out.println("Aumente ou diminua o volume: ");
        int volume = console.nextLine();
        tv.setVolume(volume);
        System.out.println("Digite o canal: ");
        int canal = console.nextFloat();
        tv.canal(canal);
        tv.exibirCanal();
  
}
}