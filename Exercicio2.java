import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float primeiro = 0, segundo = 0, terceiro = 0;

        System.out.print("Informe 3 números: ");
        primeiro = input.nextFloat();
        segundo = input.nextFloat();
        terceiro = input.nextFloat();


        if (terceiro < primeiro && primeiro > segundo ){

            System.out.println(primeiro);
        }

        else if (terceiro < segundo && segundo > primeiro) {

            System.out.println(segundo);
            
        }
        
        else {

            System.out.println(terceiro);


        }
       
        input.close();

    } 

}