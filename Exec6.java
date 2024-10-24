import java.util.Scanner;

public class Exec6 {
    public static void main(String[]args){

        //declarando variáveis

        String timeCasa, timeVisitante, mensagem;
        int pontoCasa, pontoVisitante;

        //recebendo dados
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Time da casa");
        timeCasa = sc.nextLine();
        System.out.println("Número de gols");
        pontoCasa = sc.nextInt();
        
        

        System.out.println("Time visitante: ");
        timeVisitante = sc.nextLine();
        timeVisitante = sc.nextLine();
        System.out.println("Número de Gols:");
        pontoVisitante = sc.nextInt();
        
        
        
        
        // verificando o resultado

        if (pontoCasa == pontoVisitante){

            mensagem = "EMPATE";
        }

        else if ( pontoCasa > pontoVisitante){

            mensagem = timeCasa + " é o vencedor";
        }else{

            mensagem = timeVisitante + " é o vencedor";
        }

        // informando resultado

        System.out.println(mensagem);

        sc.close();

        
    }
} 