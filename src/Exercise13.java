import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        //Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int firstValue = scanner.nextInt();

        System.out.println("Digite o segundo valor (diferente do primeiro): ");
        int secondValue = scanner.nextInt();

        while (firstValue == secondValue) {
            System.out.println("Você não entendeu que é um valor diferente do primeiro?");
            System.out.println("Vai, digita certo: ");
            secondValue = scanner.nextInt();
        }
        if (firstValue > secondValue) {
            System.out.println("Os valores em ordem crescente são: " + secondValue + " e " + firstValue);
        } else {
            System.out.println("Os valores em ordem crescente são: " + firstValue + " e " + secondValue);
        }
        scanner.close();
    }
}
