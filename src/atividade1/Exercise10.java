import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
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
