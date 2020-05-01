package action.zona;
import conexionSQL.zona;
import com.opensymphony.xwork2.ActionSupport;

public class ZonaRegister extends ActionSupport {
    private static final long serialVersionUID= -146601914103585418L;
    private int idzona;
    private String nombre;
    private String msg;
    zona gestor=null;
    private int ctr=0;


    @Override
    public String execute() throws Exception{
        gestor=new zona();
        try{
            ctr=gestor.register(idzona,nombre);
            if (ctr>0){
                msg="registro completo";
            }
        }catch(Exception e){
            e.printStackTrace();

        }
        return "REGISTER";
    }

    public void setIdzona(int idzona) {
        this.idzona = idzona;
    }

    public int getIdzona() {
        return idzona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }

    public int getCtr() {
        return ctr;
    }
}
