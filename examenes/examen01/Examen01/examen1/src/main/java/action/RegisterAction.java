package action;
import conexionSQL.gestorDao;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
    private static final long serialVersionUID=2139116285823340125L;
    private String nombre;
    private int iddelegacion;
    private String men="";
    gestorDao gestor=null;
    private int ctr=0;

    @Override
    public String execute() throws Exception{
        gestor=new gestorDao();
        try {
            ctr=gestor.registerDelegacion( 0, "sadksdjla");
            if (ctr>0){
                men="Registro completo";
            }
        }catch (Exception e){
            e.printStackTrace();

        }
        return "REGISTER";
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

    public String getMen() {
        return men;
    }

    public void setMen(String men) {
        this.men = men;
    }

    public int getCtr() {
        return ctr;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }
}
