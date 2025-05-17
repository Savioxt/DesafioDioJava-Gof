public class Singleton_1 {
    private static Singleton_1 instacia;
    public int contador = 1;
    private Singleton_1(){
        super();
        System.out.println(contador++);
    }
    public static Singleton_1 getInstacia(){
        if(instacia==null){
            instacia = new Singleton_1();
            System.out.println("INSTACIA CRIADA");
        }
        return instacia;
    }
}
