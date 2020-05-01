package action.delegacion;
import conexionSQL.gestorDao;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import services.LoginService;


@Data
public class DeleteAction extends ActionSupport{
    private static final long serialVersionUID = -146601914103585418L;
    private int iddelegacion;
    private String msg;
    private Integer code;
    gestorDao gestor=null;
    private LoginService service= new LoginService();


    @Override
    public String execute() throws Exception{

            try {
                gestor =  gestorDao.getInstance();
                int isDeleted = gestor.deleteDetails(iddelegacion);
                if (isDeleted > 0) {
                    msg = "registro Eliminado";
                } else
                    msg = "error";
            }catch (Exception e){
                e.printStackTrace();
            }

        return "DELETE";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setIddelegacion(int iddelegacion) {
        this.iddelegacion = iddelegacion;
    }

    public int getIddelegacion() {
        return iddelegacion;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
