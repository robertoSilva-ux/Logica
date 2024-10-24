import java.util.Scanner;

public class Exec7 {
    public static void main(String[]args){

        //declarando variáveis

        String tipoCombustivel;
        double precoAlcool = 3.9, precoGasolina = 4.3, percDesconto, total; 
        int litros;


        //recebendo dados
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantidade de litros:");
        litros = sc.nextInt();
        System.out.println("Tipo de Combustível (A ou G)");
        tipoCombustivel = sc.next();
        
        

        // verificando os descontos

        if (tipoCombustivel == "A"){
            if (litros <= 20){
                percDesconto = 0.03;
                total = litros * (precoAlcool * (1-percDesconto));
            }else{

                percDesconto = 0.05;
                total = litros * (precoAlcool * (1-percDesconto));
            }
        }else {
            if(litros <= 20){
                percDesconto = 0.04;
                total = litros * (precoGasolina * (1-percDesconto));
            }else{

                percDesconto = 0.06;
                total = litros * (precoGasolina * (1-percDesconto));
            }

        }

        // informando resultado

        

        System.out.println(total);

        sc.close();

        
    }
} 