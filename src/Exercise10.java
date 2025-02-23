import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        // Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
        // uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6
        // o aluno é aprovado). Escrever também a média calculada.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova: ");
        double firstGrade = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        double secondGrade = scanner.nextDouble();

        double average = (firstGrade + secondGrade) / 2;

        if (average >=6) {
            System.out.println("O aluno foi aprovado com média: " + String.format("%.2f", average));
        } else {
            System.out.println("O aluno foi reprovado com média: " + String.format("%.2f", average));
        }

        scanner.close();
    }
}
