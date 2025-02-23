import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite um número para descobrir se é positivo ou negativo: ");
        int n = scanner.nextInt();

        if (n >= 0) {
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número é negativo!");
        }

        scanner.close();


    }
}
