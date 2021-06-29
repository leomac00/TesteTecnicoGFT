import java.text.DecimalFormat;

public class CalculoDoCaixa {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("####0.00");
        Produto produto1 = new Produto("Banana",0.99, 3);
        Produto produto2 = new Produto("Energético",5.49, 3);
        Produto produto3 = new Produto("Arroz",20, 1);
        Produto produto4 = new Produto("Chocolate",4.50, 1);
        Produto produto5 = new Produto("Leite",3.73, 3);
        Produto produto6 = new Produto("Abacaxi",2.4, 2);

        Caixa caixa = new Caixa();
        System.out.println(produto1.nome + " - R$" + df.format(caixa.calculaValorFinal(produto1, 3)));
        System.out.println(produto2.nome + " - R$" + df.format(caixa.calculaValorFinal(produto2, 7)));
        System.out.println(produto3.nome + " - R$" + df.format(caixa.calculaValorFinal(produto3, 1)));
        System.out.println(produto4.nome + " - R$" + df.format(caixa.calculaValorFinal(produto4, 12)));
        System.out.println(produto5.nome + " - R$" + df.format(caixa.calculaValorFinal(produto5, 5)));
        System.out.println(produto6.nome + " - R$" + df.format(caixa.calculaValorFinal(produto6, 1)));
    }
}
