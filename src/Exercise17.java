import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        //Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno.
        //Fórmula para cálculo de média de LP1.
        //(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*
        // (API*0.5)+X+(SUB*0.3)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da P1: ");
        double P1 = scanner.nextDouble();

        System.out.println("Digite o valor da E1: ");
        double E1 = scanner.nextDouble();

        System.out.println("Digite o valor da E2: ");
        double E2 = scanner.nextDouble();

        System.out.println("Digite o valor da API: ");
        double API = scanner.nextDouble();

        System.out.println("Digite o valor de X: ");
        double X = scanner.nextDouble();

        System.out.println("Digite o valor da SUB(se houver): ");
        double SUB = scanner.nextDouble();

        double media = (P1*0.6+((E1+E2)/2)*0.4)*0.5+(Math.max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9)*(API*0.5)+X+(SUB*0.3));

        System.out.println("A média do aluno é: " + media);

        scanner.close();


    }
}
