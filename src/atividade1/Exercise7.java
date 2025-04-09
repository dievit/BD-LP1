import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        if (n > 10 ) {
            System.out.println("É maior que 10!");
        } else {
            System.out.println("Não é maior que 10!");
        }

        scanner.close();
    }
}
