public class IPI implements Imposto {

    @Override
    public double calculoDeImposto(double valor) {
        if(valor < 25000) {
            return valor * 0.05;
        } else {
            return valor * 0.1;
        }
    }
}
