import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
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
