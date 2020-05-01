package humano;

import acciones.AccionesGeneral;
import acciones.AccionesHumano;

public class Humano implements AccionesHumano, AccionesGeneral {

    private String nombre;
    private int edad;
    private double estatura;

    public Humano(String nombre, int edad, double estatura){
        this.nombre = nombre;
        this.edad = edad;


        this.estatura = estatura;
    }



    public String bailar() {
        return"estoy bailando";

    }


    public String trabajar() {
        return "estoy trabajando";

    }


    @Override
    public String alimentarse() {
       String alimento;
       alimento="comida chilanga";
       System.out.println(alimento);
       return alimento;
    }

    @Override
    public String desplazarse(int pasox, int pasoy) {
        String[][] arrays = new String[5][5];
        String mensaje = null;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == pasox && j == pasoy) {
                    mensaje= arrays[i][j] = "estoy aqui; " + i + " " + j;
                    System.out.println(arrays[i][j]);

                }
            }
        }
        return mensaje;
    }

    @Override
    public String dormir() {
        String mensaje="Zzzzzz";
        return mensaje;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
}
