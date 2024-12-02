import java.util.Scanner;

public class Lista422 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    float popA = 0f, popB = 0f, taxaA = 0.03f, taxaB = 0.02f;

    int tempo = 0;

    System.out.println("Informe a população de A e B");

    popA = in.nextInt();
    popB = in.nextInt();

    while (popA < popB){

        popA += popA * taxaA;
        popB += popB * taxaB;

        tempo ++;
    }

    System.out.println("Serão necessários " + tempo + " anos");

}    
}
