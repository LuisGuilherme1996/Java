public class Aula09
// lampada
{

        private int potencia;
        private String tipo;
        private boolean acesa;
        public Aula09(String tipo){
            this.tipo = tipo;
        }
        public int getPotencia() {
            return potencia;
        }
        public void setPotencia(int potencia){
            this.potencia = potencia;
        }
        public String getTipo(){
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        public boolean isAcesa(){
            return acesa;
        }
        public void setAcesa(boolean acesa){
            this.acesa = acesa;
        }
        public void acender() {
            System.out.println("Acendendo lampada");
            this.acesa = true;
        }
        @Override
        public String toString(){
            return "Lampada {potencia=" + potencia + ", tipo=" + tipo + ", acesa=" + acesa + "}";
        
    }
}