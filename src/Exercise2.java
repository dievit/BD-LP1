import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de votos em branco: ");
        int brancos = scanner.nextInt();

        System.out.println("Digite o total de votos nulos: ");
        int nulos = scanner.nextInt();

        System.out.println("Digite o total de votos válidos: ");
        int validos = scanner.nextInt();

        System.out.println();

        int totalEleitores = brancos + nulos + validos;
        double percentualBrancos = (brancos * 100.0) / totalEleitores;
        double percentualNulos = (nulos * 100.0) / totalEleitores;
        double percentualValidos = (validos * 100.0) / totalEleitores;

        System.out.println("Total de eleitores: " + String.format("%.2f", totalEleitores));
        System.out.println("Percentual de votos em branco: " + String.format("%.2f", percentualBrancos + "%"));
        System.out.println("Percentual de votos nulos: " + String.format("%.2f", percentualNulos + "%"));
        System.out.println("Percentual de votos válidos: " + String.format("%.2f", percentualValidos + "%"));

    }
}