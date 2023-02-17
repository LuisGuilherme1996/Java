import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula3_Condicional {
    public static void main(String[] args)
    {
        int preco = 20;
        if(preco < 0 )
        {
            System.out.println("Preco negativo");
        }else{
            System.out.println("Produto cadastrado!!");
        }
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        list.stream().filter(filtro -> filtro < 9)
        .forEach(System.out::println);
        for(int i = 0; i < 100; i++)
        System.out.println("\n"+i);
     }
}

     