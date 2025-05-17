
public class Main {
    public static void main(String[] args) {

        Comportamento ligar = new ComportamentoLigar();
        Comportamento desligar = new ComportamentoDesligar();
        Carro carro = new Carro();
        carro.setComportamento(ligar);
        carro.Ligar();
        carro.setComportamento(desligar);

    }
}