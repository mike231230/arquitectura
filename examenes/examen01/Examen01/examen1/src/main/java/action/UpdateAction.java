package action;
import java.sql.ResultSet;

import conexionSQL.gestorDao;

import com.opensymphony.xwork2.ActionSupport;
public class UpdateAction extends ActionSupport {
    private static final long serialVersionUID = -1905974197186620917L;
    private String nombre;
    private int iddelegacion;
    private String msg="";
    ResultSet rs=null;
    gestorDao gestor=new gestorDao();
    String submitType;
    @Override
    public String execute() throws Exception{
        try {
            if (submitType.equals("updatedata")){
                rs=gestor.fetchdelegacionDetails(iddelegacion);
                if (rs!=null){
                    while (rs.next()){
                        nombre=rs.getString("nombre");
                        iddelegacion=rs.getInt("iddelegacion");

                    }
                }else{
                    int i= gestor.updateDelegacionDetails(nombre);
                    if (i>0){
                        msg="Registro Actualizado";
                    }else {
                        msg="ERROR";
                    }
                }
            }
        }catch (Exception e){
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

    public int getIddelegacion() {
        return iddelegacion;
    }

    public void setIddelegacion(int iddelegacion) {
        this.iddelegacion = iddelegacion;
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
