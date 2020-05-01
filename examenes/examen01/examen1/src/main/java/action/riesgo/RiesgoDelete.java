package action.riesgo;

import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.Riesgo;
import lombok.Data;

@Data
public class RiesgoDelete extends ActionSupport {
    private static final long serialVersionUID=1234;
    private int idriesgo;
    private String msg;
    Riesgo riesgo=new Riesgo();
    @Override
    public String execute() throws Exception{
        try{
            int isDeleted=riesgo.deleteDetails(idriesgo);
            if (isDeleted>0){
                msg="registro eliminado";
            }else{
                msg="error";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "DELETE";
    }

}
