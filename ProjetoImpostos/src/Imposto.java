public class Imposto {
    private Pessoa pessoa;

    public Imposto(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double calcularImpostoSalario() {
        double salarioMensal = pessoa.getSalarioAnual() / 12;
        if (salarioMensal < 3000) {
            return 0;
        } else if (salarioMensal < 5000) {
            return pessoa.getSalarioAnual() * 0.10;
        } else {
            return pessoa.getSalarioAnual() * 0.20;
        }
    }

    public double calcularImpostoServicos() {
        return pessoa.getPrestacaoServicos() * 0.15;
    }

    public double calcularImpostoGanhoCapital() {
        return pessoa.getGanhoCapital() * 0.20;
    }

    public double calcularImpostoBrutoTotal() {
        return calcularImpostoSalario() + calcularImpostoServicos() + calcularImpostoGanhoCapital();
    }

    public double calcularMaximoDedutivel() {
        return calcularImpostoBrutoTotal() * 0.30;
    }

    public double calcularGastosDedutiveis() {
        return pessoa.getGastosMedicos() + pessoa.getGastosEducacionais();
    }

    public double calcularAbatimento() {
        double maximoDedutivel = calcularMaximoDedutivel();
        double gastosDedutiveis = calcularGastosDedutiveis();
        return Math.min(gastosDedutiveis, maximoDedutivel);
    }

    public double calcularImpostoDevido() {
        return calcularImpostoBrutoTotal() - calcularAbatimento();
    }
}
