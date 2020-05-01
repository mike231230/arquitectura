package action.zona;

import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.zona;

public class ZonaDelete extends ActionSupport {
    private static final long serialVersionUID=-146601914103585418L;
    private int idzona;
    private String msg;
    zona getor=new zona();
    @Override
    public String execute() throws Exception{
        try{
            int isDeleted=getor.deleteDetails(idzona);
                if (isDeleted>0){
                    msg="registro eliminado";
                }else{
                    msg="error";
                }

        }catch (Exception e){
        e.printStackTrace();
        }
        return "DELETE";
    }


    public void setIdzona(int idzona) {
        this.idzona = idzona;
    }
    public int getIdzona(){
        return idzona;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
