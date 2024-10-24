import java.util.Scanner;

public class Mini12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe total de votos: ");
        float totalEleitores = sc.nextFloat();
        System.out.print("Informe votos brancos: ");
        float branco = sc.nextFloat();
        System.out.print("Informe o total de nulos: ");
        float nulo = sc.nextFloat();
        System.out.print("Informe o total de válidos: ");
        float valido = sc.nextFloat();


        float percBranco = (branco / totalEleitores) * 100;
        float percNulos = (nulo / totalEleitores) * 100;
        float percValidos = (valido / totalEleitores) * 100;
        

        System.out.println("Brancos :"+ percBranco+"%");
        System.out.println("Nulos :"+ percNulos+"%");
        System.out.println("Validos :"+ percValidos+"%");
        
        sc.close();

        
    }
} 