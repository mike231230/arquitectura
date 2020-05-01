package persona;

public class Profesor extends Persona {
    public Profesor(String nombre){
        super(nombre);
    }

    @Override
    public void tipoPersona() {
        System.out.println("soy un profesor "+super.getNombre());
    }

    @Override
    public String comunicarse() {
        return super.comunicarse();
    }
}
