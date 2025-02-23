import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
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
