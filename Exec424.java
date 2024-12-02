import java.util.Scanner;

public class Exec424{
    public static void main(String[] args) {

        String nome = "";
        int sexo, idade = 0, ordem = 0;
        float peso, altura, maiorAltura = 0, maiorPeso = 0, mediaIdades, somaIdade = 0;

        Scanner in = new Scanner(System.in);
        
        while (!nome.equals("@")) {

            ordem++;            
            System.out.println("Informe Nome, Sexo (1 para masculino, 2 para feminino), idade, peso e altura, para o atleta " +ordem+ " (@ para sair)");
            nome = in.next();            
            if (nome.equals("@")){
                ordem --;
                break;                
            }       
            sexo = in.nextInt();
            idade = in.nextInt();
            peso = in.nextFloat();
            altura = in.nextFloat();

            somaIdade+=idade;

            if (sexo == 1 && altura > maiorAltura ){

                maiorAltura = altura;
        
            }

            if (sexo == 2 && peso > maiorPeso){

                maiorPeso = peso;


            }

            
        }

        mediaIdades = somaIdade / ordem;

        System.out.println(maiorAltura);
        System.out.println(maiorPeso);
        System.out.println(mediaIdades);

    }



}