public class ComportamentoDesligar implements Comportamento{
    @Override
    public void Ligar() {
        System.out.println("CARRO LIGADO");
    }

    @Override
    public void Desligar() {
        System.out.println("Carro desligado");
    }


}
