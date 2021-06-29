public class Caixa {

    public double calculaValorFinal(Produto produto, int quantity) {
        double discount = 0;
        switch (produto.tipo){
            case 1:
                discount = 0.9;
            case 2:
                discount = 0.8;
            case 3:
                if(quantity > 5) {
                    discount = 0.9;
                } else {
                    discount = 1;
                }
                break;
            default:
                discount = 1;
        }
        return (produto.valor*quantity)*discount;
    }
}
