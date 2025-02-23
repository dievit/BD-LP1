public class Exercise16 {
    public static void main(String[] args) {
        double janeiro = 15000;
        double fevereiro = 23000;
        double marco = 17000;

        double total = janeiro + fevereiro + marco;
        double media = total / 3;

        System.out.println("Gastos de Janeiro: R$" + String.format("%.2f", janeiro));
        System.out.println("Gastos de Fevereiro: R$" + String.format("%.2f", fevereiro));
        System.out.println("Gastos de Março: R$" + String.format("%.2f", marco));
        System.out.println();
        System.out.println("O gasto total do trimestre foi de R$" + String.format("%.2f", total));
        System.out.println("A média mensal de gastos foi de R$" + String.format("%.2f", media));

    }
}
