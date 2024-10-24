import java.util.Scanner;

public class Exec15 {

    public static void main(String[] args) {
        //declaração de variáveis
        float ladoA, ladoB, ladoC;
        String mensagem;


        // instanciando scanner

        Scanner sc = new Scanner(System.in);

        // entrada 
        System.out.print("Informe 3 medidas: ");
        ladoA = sc.nextFloat();
        ladoB = sc.nextFloat();
        ladoC = sc.nextFloat();

            
        //deteminando triangulo

        if ((ladoA < (ladoB + ladoC))
         && (ladoB < (ladoA+ladoC))
         && (ladoC < (ladoA + ladoB)))
            if (ladoA == ladoB && ladoB==ladoC)
            mensagem = "Triângulo Equilátero";
            else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA)
            mensagem = "Triângulo Isósceles";
            else mensagem = "Triângulo Escaleno";
        else mensagem = "Não é possível formar um triângulo";
        
            

        // exibindo resultados

        System.out.println(mensagem);
        
    sc.close();
    }

}
