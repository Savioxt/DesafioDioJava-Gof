package cep;

public class CepApi {
    private  static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstancia() {
        return instancia;
    }

    public static  String recuperarCidade(String cep){
        return "Eunapolis";
    }

    public static  String recuperarEstado(String cep){
        return "Bahia";
    }
}
