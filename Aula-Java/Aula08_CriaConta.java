class Aula08_CriaConta{
    public static void main(String[]args) {
        Conta conta1 = new Conta("1234",100);
        conta1.depositar(100);
        conta1.sacar(50);
        System.out.println("Saldo atual: R$" +conta.getSaldo());
    }
}