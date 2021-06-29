public class COFINS  implements Imposto{
    @Override
    public double calculoDeImposto(double valor) {
        if(valor > 17000) {
            return valor * 0.08;
        } else {
            return valor;
        }
    }
}
