package action.riesgo;

import bean.Riesgobean;

public class RiesgoBuild {
    private Riesgobean riesgo;

    public RiesgoBuild(String nombre){
        riesgo= new Riesgobean();
        riesgo.setNombre(nombre);
    }

    public RiesgoBuild setDescripcion(String descripcion){
        riesgo.setDescripcion(descripcion);
        return this;
    }
    public Riesgobean build(){
        return riesgo;
    }
}
