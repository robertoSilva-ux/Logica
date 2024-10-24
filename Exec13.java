import java.util.Scanner;


public class Exec13 {

    public static void main(String[] args) {
        //declaração de variáveis
        float preco, total;
        double desconto, valorLiquido;
        int  quantidade;
        String nome;


        // instanciando scanner

        Scanner sc = new Scanner(System.in);

        // entrada 
        System.out.print("Informe nome do produto: ");
        nome = sc.nextLine();

        System.out.print("Informe a quantidade: ");
        quantidade = sc.nextInt();

        System.out.print("Informe o preço unitário: ");
        preco = sc.nextFloat();

        
        //determinando total comprado

        total = quantidade * preco;
            
        //deteminando descontos

        if (quantidade <= 5)

            desconto = 0.02;

        else if (quantidade > 5 && quantidade <=10)

            desconto = 0.03;
            
        else 

            desconto = 0.05;

        // calculo desconto e valor liquido

        
        valorLiquido = total * (1 - desconto);

        
        // exibindo resultados

        System.out.println("");
        System.out.println("Totais da Operação:");
        System.out.println("===================");

        System.out.printf("Total dos Produtos: R$ %8.2f%n", total);
        System.out.printf("Descontos:          R$ %8.2f%n", (total - valorLiquido) );
        System.out.println("                     ----------");
        System.out.printf("Valor Líquido:      R$ %8.2f%n", valorLiquido);


    sc.close();

    }

}
