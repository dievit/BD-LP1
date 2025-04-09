import java.time.LocalDate;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actualYear = LocalDate.now().getYear();

        System.out.println("Digite o ano de nascimento (no formato AAAA) para saber se você poderá votar este ano: ");
        int birthYear = scanner.nextInt();

        if (actualYear - birthYear >= 16) {
            System.out.println("Você poderá votar este ano! Você tem: " + (actualYear - birthYear) + " anos.");
        } else {
            System.out.println("Você não poderá votar este ano! Você tem apenas: " + (actualYear - birthYear) + " anos.");
        }

        scanner.close();
    }
}
