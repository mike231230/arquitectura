package persona;

public abstract class Persona implements IPersona {
    private  String nombre;

    public Persona(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void tipoPersona() {

    }

    public String comunicarse(){

        String mensaje;
        mensaje="hola Mundo";
        return mensaje;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
