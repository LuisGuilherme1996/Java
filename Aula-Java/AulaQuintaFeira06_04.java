import javax.swing.JOptionPane;

class AulaQuintaFeira06_04 {
 private String nome; private int idade;
 private String tefelone;
 public Pessoa(String n, int i, String f){
    nome = n; idade=i; telefone=f;
 }   
 public void novo_fone(String f) {
    tefelone=f;
 }
 public void novo_fone(){
    telefone=JOptionPane.showInputDialog("Novo  Fone");
 }
 public String nro_fone() {
    return tefelone;
 }
}