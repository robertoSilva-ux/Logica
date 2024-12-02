import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        int tamanho, triangulo;
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o tamanho do triangulo:");
        tamanho = in.nextInt();
        triangulo = 2 * tamanho -1;
        for (int j = tamanho; j > 0; j --){
            for (int i = triangulo; i > 0; i--){
                System.out.print("*");
            }
        System.out.println("");
        triangulo -= 2;
        }
        in.close();
    }
}

