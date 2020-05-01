package action.delegacion;
import java.sql.ResultSet;

import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import conexionSQL.gestorDao;

import com.opensymphony.xwork2.ActionSupport;
import services.LoginService;

public class UpdateAction extends ActionSupport {
    private static final long serialVersionUID = -1905974197186620917L;
    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateAction.class);
    private String nombre;
    private int iddelegacion;
    private String msg="";
    private Integer code;
    private LoginService service = new LoginService();
    ResultSet rs=null;
    gestorDao gestor=null;
    String submitType;


    @Override
    public String execute() throws Exception{
        if (code !=null){
            try {
                if (this.service.validUserAdmin(this.code)){
                    gestor=gestorDao.getInstance();
                    LOGGER.info("nombre: " + nombre);
                    int i= gestor.updateDetails(iddelegacion,nombre);
                    if (i>0){
                        msg="Registro Actualizado";
                    }else {
                        msg="ERROR";
                    }
                } else {
                    msg = "Codigo incorrecto";
                }

            }
            catch (Exception e){
                e.printStackTrace();
            }
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

    public void setCode(Integer code) {
        this.code = code;
    }
}
