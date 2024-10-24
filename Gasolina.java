import java.util.Scanner;

public class Gasolina {
    public static void main(String[]args){

        //declarando variáveis

        char tipoCombustivel;
        double precoAlcool = 3.9, precoGasolina = 4.3, percDesconto, total = 0; 
        int litros;


        //recebendo dados
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantidade de litros:");
        litros = sc.nextInt();
        System.out.println("Tipo de Combustível (A ou G)");
        tipoCombustivel = sc.next().charAt(0);
                
        // verificando os descontos

        if (tipoCombustivel == 'A'){
            if (litros <= 20){
                percDesconto = 0.03;
                total = litros * (precoAlcool * (1-percDesconto));
            }else{

                percDesconto = 0.05;
                total = litros * (precoAlcool * (1-percDesconto));
            }
        }else if (tipoCombustivel== 'G'){
            if(litros <= 20){
                percDesconto = 0.04;
                total = litros * (precoGasolina * (1-percDesconto));
            }else{

                percDesconto = 0.06;
                total = litros * (precoGasolina * (1-percDesconto));
            }
        } else {

            System.out.println("erro");
        }

    // informando resultado

        

        System.out.printf("%.2f%n", total);

        sc.close();

        
    }
} 