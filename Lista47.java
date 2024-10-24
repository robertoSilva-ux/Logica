import java.util.Scanner;

public class Lista47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String senha = "12345";
        String digitado = "";
        int tentativa = 0;

       
        while (!digitado.equals(senha)) {
            System.out.print("Digite a senha: ");
            digitado = in.next();
            tentativa ++;
            System.out.println("Senha não confere!");

        }


        System.out.println("Acesso Garantido! " + tentativa + " tentativas.");

        in.close();
    }

}