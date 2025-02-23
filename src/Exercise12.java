import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args){
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
            System.out.println("O primeiro valor é maior: " + firstValue);
        } else {
            System.out.println("O segundo valor é maior: " + secondValue);
        }

        scanner.close();

    }
}
