public class IngressoVip extends Ingresso {
    double valorAdicional;
    

    public double calcularValor(){
        return this.valor + this.valorAdicional;
    }
    

    @Override
    public String toString(){
        return "Valor do ingresso: " + calcularValor();
    }
}
