import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double salarioAnual = scanner.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double prestacaoServicos = scanner.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double ganhoCapital = scanner.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(salarioAnual, prestacaoServicos, ganhoCapital, gastosMedicos, gastosEducacionais);
        Imposto imposto = new Imposto(pessoa);

        RelatorioImposto.gerarRelatorio(imposto);

        scanner.close();
    }
}
