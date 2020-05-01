package action.riesgo;

import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.Riesgo;

public class RiesgoRegister extends ActionSupport {
    private static final long serialVersionUID = 1234;
    private int idriesgo;
    private String nombre;
    private String descripcion;
    private String msg;
    Riesgo riesgo =null;
    private int ctr = 0;
    RiesgoBuild riesgoBuild=null;

    public RiesgoRegister() {
    }

    @Override
    public String execute() throws Exception {
        RiesgoBuild riesgoBuild = new RiesgoBuild(nombre);
        if (descripcion != null) {
            riesgoBuild.setDescripcion(descripcion);
        }
        riesgo= new Riesgo();
        try {

            ctr = riesgo.register(riesgoBuild.build());
            if (ctr > 0) {
                msg = "Registro Completo";
            } else {
                msg = "error";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "REGISTER";
    }

    public int getIdriesgo() {
        return this.idriesgo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getMsg() {
        return this.msg;
    }

    public Riesgo getRiesgo() {
        return this.riesgo;
    }

    public int getCtr() {
        return this.ctr;
    }

    public void setIdriesgo(int idriesgo) {
        this.idriesgo = idriesgo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setRiesgo(Riesgo riesgo) {
        this.riesgo = riesgo;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }

}

