import java.util.Scanner;

public class Lista410 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salario;
       
        System.out.println("Informe o salário: ");
        salario = in.nextFloat();

        if (salario < 0 || salario > 100000){

            System.out.println("Valor Invalido, tente novamente.");

        } else {

            System.out.printf("O valor informado foi R$ %.2f%n", salario);
        }



        in.close();
    }

}