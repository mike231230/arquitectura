package action.zona;
import com.opensymphony.xwork2.ActionSupport;

import conexionSQL.zona;


import java.sql.ResultSet;

public class ZonaUpdate extends ActionSupport {
    public static final long serialVersionUID=-1905974197186620917L;
    private String nombre;
    private int idzona;
    private String msg="";
    ResultSet rs=null;
    zona gestor=new zona();
    String submitType;


    @Override
    public String execute() throws Exception{
        try {
            int i= gestor.updateDetails(idzona,nombre);
            if (i>0){
                msg="Registro Actualizado";
            }else {
                msg="ERROR";
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "UPDATE";
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdzona() {
        return idzona;
    }

    public void setIdzona(int idzona) {
        this.idzona = idzona;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }
}

