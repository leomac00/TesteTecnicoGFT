import java.util.Scanner;

public class CalculoDeImposto {
    public static void main(String[] args) {
        ICMS icms = new ICMS();
        IPI ipi = new  IPI();
        COFINS cofins = new COFINS();
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double v = s.nextDouble();
        double vT =v + icms.calculoDeImposto(v) + ipi.calculoDeImposto(v) + cofins.calculoDeImposto(v);
        System.out.println("ICMS: " + icms.calculoDeImposto(v));
        System.out.println("IPI: " + ipi.calculoDeImposto(v));
        System.out.println("COFINS: " + cofins.calculoDeImposto(v));
        System.out.println("Valor final: " + vT);
    }
}
