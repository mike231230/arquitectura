package humano;


public class Hombre extends Humano {



    public Hombre(String nombre, int edad, double estatura){
        super(nombre,edad,estatura);

    }

    public static int engordar(int peso){
        peso=peso+5;
        System.out.println("mi peso es: "+peso);

        return peso;
    }



}
