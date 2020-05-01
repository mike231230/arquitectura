package persona;

public class estudiante extends Persona{


    public estudiante(String nombre){
        super(nombre);

    }


    @Override
    public void tipoPersona() {
        System.out.println("soy un estudiante me llamo "+ super.getNombre());
    }

    @Override
    public String comunicarse() {
        return super.comunicarse();
    }
}
