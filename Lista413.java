import java.util.Scanner;

public class Lista413 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("informe 3 notas");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        nota3 = in.nextFloat();

        if (nota1 == nota2 && nota2 == nota3){

            media = (nota1+nota2)/2;
        } else if (nota1 > nota2 || nota1 > nota3){
            if (nota2 > nota3){

                media = (nota1 + nota2) / 2;
            }else {
                media = (nota1 + nota3) / 2;
            }
        } else {

            media = (nota2 + nota3) / 2;
        }

        System.out.println("Média: " + media);
        in.close();
    }

}