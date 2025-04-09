import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário fixo do vendedor: R$");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite quantos carros o vendedor vendeu: ");
        int carrosVendidos = scanner.nextInt();

        System.out.println("Digite a comissão fixa para cada veículo vendido: R$");
        double comissaoFixa = scanner.nextDouble();

        System.out.println("Digite o valor total das vendas: R$");
        double valorVendas = scanner.nextDouble();

        double comissaoVendas = valorVendas * 0.05;

        double salarioFinal = salarioFixo + (carrosVendidos * comissaoFixa) + comissaoVendas;

        System.out.println("O salário final do vendedor é de: R$" + String.format("%.2f", salarioFinal));

        scanner.close();
    }
}
