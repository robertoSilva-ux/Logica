import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float primeiro = 0, segundo = 0, terceiro = 0, soma;

        System.out.print("Informe 3 números: ");
        primeiro = input.nextFloat();
        segundo = input.nextFloat();
        terceiro = input.nextFloat();


        if (primeiro < segundo && primeiro < terceiro) {
            soma = segundo + terceiro;
        
        }

        else if (segundo < primeiro && segundo > terceiro) {

            soma = primeiro + terceiro;
            
        }
        
        else {
            soma = primeiro + segundo;
            


        }
       
        System.out.println(soma);
        input.close();

    } 

}