package action.prevencion;

import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.Prevencion;

import javax.activity.ActivityRequiredException;
import java.sql.ResultSet;

public class PrevencionUpdate extends ActionSupport {
    public static final long serialVersionUID=1234;
    private int idprevencion;
    private String nombre;
    private String descripcion;
    private String msg;
    ResultSet rs=null;
    Prevencion prevencion=new Prevencion();

    @Override
    public String execute() throws Exception{
        try {
            int i=prevencion.updateDetails(idprevencion,nombre,descripcion);
            if (i>0){
                msg="Registro Actualizado";

            }else{
                msg="ERROR";
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return "UPDATE";
    }
}
