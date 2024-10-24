import java.util.Scanner;

public class Lista48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total, cont = 0;
        float valor, soma = 0;

        
        System.out.print("Informe o total de mercadorias: ");
        total = in.nextInt();


        while (cont < total){

            cont ++;

            System.out.printf("Informe o valor da mercadoria %d: ", cont);
            valor = in.nextFloat();
            soma += valor;
         }

         System.out.printf("Total em estoque: R$ %.2f%n", soma);
         System.out.printf("Média dos produtos: R$ %.2f%n",  soma/total);
        
        in.close();
    }

}