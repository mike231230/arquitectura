package action;
import conexionSQL.gestorDao;
import com.opensymphony.xwork2.ActionSupport;
public class DeleteAction extends ActionSupport{
    private static final long serialVersionUID = -146601914103585418L;
    private int iddelegacion;
    private String msg;
    gestorDao gestor=new gestorDao();
    @Override
    public String execute() throws Exception{
        try{
            int isDeleted=gestor.deleteDelegacionDetails(iddelegacion);
                if (isDeleted>0){
                    msg="registro Eliminado";
                }else
                    msg="error";

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
}
