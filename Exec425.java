import java.util.Scanner;


public class Exec425 {
    public static void main(String[] args) {

        int numero = 0, quadrado = 0;
        Scanner in = new Scanner(System.in);
        
        while (numero >=0 ){

            System.out.println("Informe o numero a ser testado:");

            numero = in.nextInt();

            for (int i = 0; quadrado <= numero; i++){

                quadrado = i * i;
               
            
                if (numero == quadrado){
                    System.out.println("é quadrado perfeito de " +i);
                   
                } 

            }

            

            
            quadrado = 0;


        }


    in.close();


    }
}
