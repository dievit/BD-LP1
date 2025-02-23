import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
        // (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
        // escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro: R$");
        double custoFabrica = scanner.nextDouble();

        System.out.println("Digite o percentual do distribuidor: ");
        double percentualDistribuidor = scanner.nextDouble();

        System.out.println("Digite o percentual dos impostos: ");
        double percentualImpostos = scanner.nextDouble();

        double custoFinal = custoFabrica + (custoFabrica * (percentualDistribuidor/100)) + (custoFabrica * (percentualImpostos/100));

        System.out.println("O custo final do carro ao consumidor é de: R$" + String.format("%.2f", custoFinal));
        System.out.println("O valor dos impostos é de: R$" + String.format("%.2f", custoFabrica * (percentualImpostos/100)));

        scanner.close();
    }
}
