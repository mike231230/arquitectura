package persona;

public class main {

    public static void main(String arg[]) {

        estudiante est = new estudiante("miguel");
        crearPersona(est);
        Profesor profe=new Profesor("javier");
        crearPersona(profe);

    }
    public static void crearPersona(IPersona persona){
            persona.comunicarse();
            persona.tipoPersona();
    }





}
