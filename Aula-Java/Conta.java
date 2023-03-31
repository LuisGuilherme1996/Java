 public class Conta {
    private String numero;
    private double saldo;
    public Conta(String nro, double saldoInicial) {
        this.nro = nro;
        this.saldo = saldoInicial;
    }
    public void depositar(double valor){
            this.saldo += valor;
    }
    public void sacar(double valor){
            this.saldo -= valor;
    }
    public double getSaldo(){
        return this.saldo;
    }
}



