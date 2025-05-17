public class Carro {

    private Comportamento Comportamento;

    public void setComportamento(Comportamento comportamento) {
        Comportamento = comportamento;
    }

    public void Ligar(){
        Comportamento.Ligar();
    }

}
