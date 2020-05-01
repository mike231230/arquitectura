public class main {

    public static void main(String[] args) {
        ejemplo ejemplo1=new ejemplo();
        prueba prueba1=new prueba();
        interface1(ejemplo1);
        interface1(prueba1);

    }

    public static void interface1(maini e){
        e.ejemplo(new int[] {1, 2, 3, 4, 5});
        e.ejemplo(new float[]{5,6,7,8,9});
        e.ejemplo("hola","como","estas");

    }

}

