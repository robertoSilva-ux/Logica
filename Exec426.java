import java.util.Scanner;


public class Exec426 {
    public static void main(String[] args) {
        
        //candidatos

        String candidatoA = "11", candidatoB = "21", candidatoC = "31", numero = "", vencedor;
        int brancos = 0, nulos = 0, votantes, qtA = 0, qtB = 0, qtC = 0;
        Scanner in = new Scanner(System.in);

        while (!numero.equals("-1")) {
        
        System.out.print(" Informe o número do candidato:");
        numero = in.next();

            if (numero.equals("-1")){
                break;
            }
            else if (numero.equals("11")){
                qtA++;
            } else if (numero.equals("21")){
                qtB++;
            }else if (numero.equals("31")){
                qtC++;
            }else if (numero.equals("99")){
                brancos ++;
            } else {

                nulos++;
            }

        }

        votantes = qtA + qtB + qtC + brancos + nulos;

        if (qtA > qtB && qtA > qtC){

            vencedor = candidatoA;
        } else if (qtB > qtA && qtB > qtC){
            vencedor = candidatoB;
        } else {
            vencedor = candidatoC;
        }

        System.out.println("O candidato vencedor foi o de número " + vencedor);
        System.out.println("Votos em branco: " + brancos);
        System.out.println("Votos nulos: " + nulos);
        System.out.println("O total de votantes: " + votantes);

    }
    
}
