import java.util.Scanner;


public class Exec14 {

    public static void main(String[] args) {
        //declaração de variáveis
        float nota1, nota2, nota3, media;
        String conceito;


        // instanciando scanner

        Scanner sc = new Scanner(System.in);

        // entrada 
        System.out.print("Informe 3 notas: ");
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();

        
        //determinando média

        media = (nota1+nota2+nota3)/3;
            
        //deteminando conceito

        if (media < 6)

            conceito = "D";

        else if (media >=6 && media < 7.5)

           conceito = "C";
            
        else if (media >=7.5 && media < 9)

            conceito = "B";
        
        else conceito = "A";

        // exibindo resultados

        System.out.println("Conceito " + conceito);
        
    sc.close();

    }

}
