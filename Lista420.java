import java.util.Scanner;

public class Lista420 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lado;

        System.out.println("Informe o tamanho do lado do quadrado: ");
        lado = in.nextInt();
        for (int linhas = lado; linhas > 0; linhas --){
            for (int colunas = lado; colunas > 0; colunas--){
                if (colunas == 1 || colunas == lado || linhas == 1 || linhas == lado){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }               
            }
        System.out.println("");
    }
    }
}
