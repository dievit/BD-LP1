import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
       int horasNormais = 40*4;
       double rateHoraExtra = 1.5;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

       System.out.println("Digite o valor das horas trabalhadas: ");
        double valorHora = scanner.nextDouble();

        if (horasTrabalhadas > horasNormais) {
            int horasExtras = horasTrabalhadas - horasNormais;
            double salario = (horasNormais * valorHora) + (horasExtras * valorHora * rateHoraExtra);
            System.out.println("O salário total do funcionário é: R$" + String.format("%.2f", salario));
            System.out.println("O funcionário trabalhou " + horasExtras + " horas extras");
        } else {
            double salario = horasTrabalhadas * valorHora;
            System.out.println("O salário total do funcionário é: R$" + String.format("%.2f", salario));
            System.out.println("O funcionário não teve horas extras");
        }

        scanner.close();
    }
}
