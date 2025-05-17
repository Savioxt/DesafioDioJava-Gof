
public class Main {
    public static String outraInstaciaSingleton(){
        var teste = Singleton_1.getInstacia();
        return teste.toString();
    }

    public static String outraInstaciaNormal(){
        var b = new ObjNormal("Felipe");
        return b.mostar();
    }

    public static void main(String[] args) {
        System.out.println("BEM VINDO");
            /*var teste = Singleton_1.getInstacia();*/
            var a = new ObjNormal("savio");
            System.out.println(a.mostar());
            System.out.println(outraInstaciaNormal());


        }

}