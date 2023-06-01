public class Data implements MinhaData {
    int dia;
    int mes;
    int ano;
    
    public  int setDia(int dia){
        if(dia > 0 && dia <= 31) {
            return dia;
        }else{
            System.out.println("Dia invalido");
        }
    }
}