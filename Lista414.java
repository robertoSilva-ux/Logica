/**Ler 10 valores e escrever quantos desses valores lidos estão compreendidos entre o
intervalo de 1 até 10. Mostre a multiplicação entre valores digitados no intervalo de 0
e 10, e a soma dos valores fora deste intervalo. */

import java.util.Scanner;

public class Lista414 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, fora = 0 , dentro = 0;
        int cont = 10;


        while (cont < 11 && cont > 0){

        System.out.println("Informe "+ cont + " numeros");
        n1 = in.nextFloat();


        if (n1 < 1 || n1 > 10){

            fora += n1;

        } else {

           dentro += n1;
        }

        cont--;
    }
        System.out.println(+ dentro + " * " + fora + "  =  " + (dentro * fora));
        

        in.close();
    }

}