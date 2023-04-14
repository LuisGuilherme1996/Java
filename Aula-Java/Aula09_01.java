public class Aula09_01{
    public static void main(String args[]) {
        Aula09 lampada1 = new Aula09("Incandescente");
        lampada1.setPotencia(40);
        System.out.println(lampadal);
        Aula09Interruptor i1 = new Aula09Interruptor();
        i1.conectar(lampada1);
        System.out.println(i1);
        i1.desligar();
        System.out.println(lampada1);
    }
}