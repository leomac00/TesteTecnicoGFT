public class ICMS implements Imposto {


    @Override
    public double calculoDeImposto(double valor) {
        return valor * 0.3;
    }
}
