package action.delegacion;
import conexionSQL.gestorDao;
import com.opensymphony.xwork2.ActionSupport;
import services.LoginService;

public class RegisterAction extends ActionSupport{
    private static final long serialVersionUID=2139116285823340125L;
    private String nombre;
    private int iddelegacion;
    private String men="";
    gestorDao gestor=null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    Integer code;
    private int ctr=0;
    LoginService service= new LoginService();
    @Override
    public String execute() throws Exception{
        if (code!=null){
            try {
                if(this.service.validUserAdmin(this.code)){
                    gestor=gestorDao.getInstance();
                    ctr=gestor.register( iddelegacion, nombre);
                    if (ctr>0){
                        men="Registro completo";
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }


        }else{
            men="codigo incorrecto";
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
