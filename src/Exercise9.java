import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        //As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas
        // pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva
        // o custo total da compra.

        Scanner scanner = new Scanner(System.in);
        double appleNoDiscount = 1.30;
        double appleDiscount = 1.00;

        System.out.println("Digite o número de maçãs compradas: ");
        int apples = scanner.nextInt();

        if (apples < 12) {
            System.out.println("O custo total da compra é de: R$" + String.format("%.2f", apples * appleNoDiscount));
        } else {
            System.out.println("O custo total da compra é de: R$" + String.format("%.2f", apples * appleDiscount));
        }

        scanner.close();

    }
}
