import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float primeiro = 0, segundo = 0, terceiro = 0;

        System.out.print("Informe 3 números: ");
        primeiro = input.nextFloat();
        segundo = input.nextFloat();
        terceiro = input.nextFloat();

        if (primeiro > segundo && primeiro > terceiro){
            if (segundo > terceiro)
            System.out.printf("%.0f, %.0f, %.0f", terceiro, segundo, primeiro)   ;
            else 
            System.out.printf("%.0f, %.0f, %.0f", segundo, terceiro, primeiro)   ;
        } else if (segundo > primeiro && segundo > terceiro){
            if (primeiro > terceiro)
            System.out.printf("%.0f, %.0f, %.0f", terceiro, primeiro, segundo)   ;
            else 
            System.out.printf("%.0f, %.0f, %.0f", primeiro, terceiro, segundo)   ;
        } else if (segundo > primeiro)
        System.out.printf("%.0f, %.0f, %.0f", primeiro, segundo, terceiro)   ;
        else 
        System.out.printf("%.0f, %.0f, %.0f", segundo, primeiro, terceiro)   ;

    }  
       
    

    

}