package action.riesgo;

import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.Riesgo;
import lombok.Data;

import java.sql.ResultSet;

@Data
public class RiesgoUpdate extends ActionSupport {
    public static final long serialVersionUID=1234;
    private int idriesgo;
    private String nombre;
    private String descripcion;
    private String msg;
    ResultSet rs=null;
    Riesgo riesgo=new Riesgo();

    @Override
    public String execute() throws Exception {
        try {
            int i=riesgo.updateDetails(idriesgo,nombre,descripcion);
            if (i>0){
                msg="Registro Actualizado";
            }else {
                msg="Error";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "UPDATE";
    }
}
