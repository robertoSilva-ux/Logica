import java.util.Scanner;

public class Exec5 {
    public static void main(String[]args){

        //recebendo dados
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe A, B e C: ");
        float ladoA = sc.nextFloat();
        float ladoB = sc.nextFloat();
        float ladoC = sc.nextFloat();
        String mensagem;
        
        //verificando se é triângulo

        if (ladoA < (ladoB+ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)){

            mensagem = "Forma um triângulo";


        }else{

            mensagem = "Não forma um triângulo";
        }

        System.out.println(mensagem);
        sc.close();

        
    }
} 