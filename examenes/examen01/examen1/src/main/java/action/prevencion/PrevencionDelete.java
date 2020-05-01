package action.prevencion;

import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.Prevencion;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
public class PrevencionDelete extends ActionSupport {
    private static final long serialVersionUID=1234;
    private int idprevencion;
    private String msg;
    Prevencion prevencion=null;

    @Override
    public String execute() throws Exception{
        try {
            int isDeleted=prevencion.deleteDetails(idprevencion);
            if (isDeleted>0){
                msg="Registro Eliminado";
            }else{
                msg="ERROR";
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return "DELETED";
    }
}
