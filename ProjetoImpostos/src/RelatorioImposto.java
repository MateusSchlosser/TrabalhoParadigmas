public class RelatorioImposto {
    public static void gerarRelatorio(Imposto imposto) {
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f%n", imposto.calcularImpostoSalario());
        System.out.printf("Imposto sobre serviços: %.2f%n", imposto.calcularImpostoServicos());
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", imposto.calcularImpostoGanhoCapital());
        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", imposto.calcularMaximoDedutivel());
        System.out.printf("Gastos dedutíveis: %.2f%n", imposto.calcularGastosDedutiveis());
        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", imposto.calcularImpostoBrutoTotal());
        System.out.printf("Abatimento: %.2f%n", imposto.calcularAbatimento());
        System.out.printf("Imposto devido: %.2f%n", imposto.calcularImpostoDevido());
    }
}
