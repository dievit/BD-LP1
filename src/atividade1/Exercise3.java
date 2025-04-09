import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário atual: R$");
        double salarioAtual = scanner.nextDouble();

        System.out.println();

        System.out.println("Digite o percentual de aumento: ");
        double percentualAumento = scanner.nextDouble();

        System.out.println();

        double novoSalario = salarioAtual + (salarioAtual * (percentualAumento/100));

        System.out.println("Seu salario atual é de: R$" + String.format("%.2f", salarioAtual));
        System.out.println("Seu novo salário é de: R$" + String.format("%.2f", novoSalario));
        System.out.println("O percentual de aumento foi de: " + String.format("%.2f", percentualAumento) + "%");

        scanner.close();
    }
}
