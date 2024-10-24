import java.util.Scanner;


public class Exec12 {

    public static void main(String[] args) {
        //declaração de variáveis
        int lados;

        // instanciando scanner

        Scanner sc = new Scanner(System.in);

        // entrada 
        System.out.print("Informe número de lados:");
        lados = sc.nextInt();
    
        //deteminando qual figura

        if (lados < 3)

            System.out.println("Não é um polígono");

        else if (lados == 3)

            System.out.println("Triângulo");
            
        else if (lados == 4)

            System.out.println("Quadrado");

        else if (lados == 5)

            System.out.println("Pentágono");
        else 

            System.out.println("Polígono não identificado");

        

    sc.close();

    }

}
