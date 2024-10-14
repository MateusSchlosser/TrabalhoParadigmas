public class Pessoa {
    double salarioAnual;
    double prestacaoServicos;
    double ganhoCapital;
    double gastosMedicos;
    double gastosEducacionais;

    public Pessoa(double salarioAnual, double prestacaoServicos, double ganhoCapital, double gastosMedicos, double gastosEducacionais) {
        this.salarioAnual = salarioAnual;
        this.prestacaoServicos = prestacaoServicos;
        this.ganhoCapital = ganhoCapital;
        this.gastosMedicos = gastosMedicos;
        this.gastosEducacionais = gastosEducacionais;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public double getPrestacaoServicos() {
        return prestacaoServicos;
    }

    public double getGanhoCapital() {
        return ganhoCapital;
    }

    public double getGastosMedicos() {
        return gastosMedicos;
    }

    public double getGastosEducacionais() {
        return gastosEducacionais;
    }
}