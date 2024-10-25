import java.util.Scanner;

public class Lista49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
       
        System.out.println("Informe a idade: ");
        idade = in.nextInt();

        if (idade < 0 || idade > 150){

            System.out.println("Idade Invalida, tente novamente.");

        } else {

            System.out.println("A idade informada foi " + idade);
        }



        in.close();
    }

}