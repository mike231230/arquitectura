package action.prevencion;

import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.Prevencion;
import lombok.Data;


@Data
public class PrevencionRegister extends ActionSupport {
    private static long serialVersionUID=1234;
    private String nombre;
    private String descripcion;
    private int idriesgo;
    private String msg;
    private int ctr=0;
    Prevencion prevencion=new Prevencion();

    @Override
    public String execute() throws Exception{
        try {
            ctr=prevencion.register(nombre,descripcion,idriesgo);
            if (ctr>0){
                msg="Registro Completado";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "REGISTER";
    }

}
