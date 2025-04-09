import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contador de horas de um jogo de xadrez");

        System.out.println("Digite a hora inicial do jogo: ");
        int gameStart = scanner.nextInt();

        System.out.println("Digite a hora final do jogo: ");
        int gameEnd = scanner.nextInt();

        int totalDuration;

        if (gameEnd > gameStart) {
            totalDuration = gameEnd - gameStart;
        } else {
            totalDuration = (24 - gameStart) + gameEnd;
        }

        System.out.println("A duração do jogo foi de: " + totalDuration + " horas");

        scanner.close();
    }
}
