import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
        // correspondente em graus Celsius. Observação: Para testar se a sua resposta está
        // correta saiba que 100°C = 212°F

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("A temperatura em Celsius é de: " + String.format("%.2f", celsius) + "°C");

        scanner.close();
    }
}