import java.util.Scanner;


public class Exec10 {

    public static void main(String[] args) {
        //declaração de variáveis
        double altura, peso = 0;
        int sexo;

        // instanciando scanner

        Scanner sc = new Scanner(System.in);

        // entrada altura e sexo 1 feminino 2 masculuno

        System.out.print("Informe sua altura:");
        altura = sc.nextFloat();
        System.out.print("Informe o sexo (1 - feminino, 2 masculino):");
        sexo = sc.nextInt();

        //calcular peso ideal


        if (sexo == 1){

            peso = (62.1 * altura) - 44.7;
            
        }else if (sexo == 2){

            peso = (72.7 * altura) - 58;

        }else
        System.out.println("Sexo informado incorretamente");

    // informando peso ideal ao usuário

        System.out.printf("Peso ideal : %2.2f%n", peso);

    sc.close();

    }

}
