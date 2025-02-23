public class Exercise16 {
    public static void main(String[] args) {
        //Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro
        //trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro,
        //23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre
        //e a média mensal de gastos.

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
