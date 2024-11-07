import java.util.Scanner;

public class Lista417 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valorHoraNormal, horasTrabalhadas, pagamento, horasExtras, valorHoraExtra;
        int numEmpregados, ordemEmpregado = 1;

        System.out.print("Digite o número de empregados: ");
        numEmpregados = in.nextInt();

        while (numEmpregados > 0) {
            System.out.println("\nEmpregado " + ordemEmpregado);
            System.out.print("Digite o valor da hora normal: ");
            valorHoraNormal = in.nextFloat();
            System.out.print("Digite o número de horas trabalhadas: ");
            horasTrabalhadas = in.nextFloat();

            if (horasTrabalhadas <= 40) {
                pagamento = horasTrabalhadas * valorHoraNormal;
            } else {
                horasExtras = horasTrabalhadas - 40;
                valorHoraExtra = valorHoraNormal * 1.5f;
                pagamento = 40 * valorHoraNormal + horasExtras * valorHoraExtra;
            }

            System.out.printf("O pagamento bruto do empregado %d é: R$ %.2f\n",  ordemEmpregado, pagamento);
            ordemEmpregado++;
            numEmpregados --;
        }

        in.close();
    }
}