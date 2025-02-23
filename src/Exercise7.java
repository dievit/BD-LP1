import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10
        // , caso contrário escrever NÃO É MAIOR QUE 10!

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
