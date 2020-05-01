package action.login;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import conexionSQL.Login;

import java.sql.ResultSet;


public class LoginAction extends ActionSupport implements Preparable {
   private String usuario;
    private String pswd;
    private int codigo;
    Login login=null;
    int ctr=0;
    private boolean admin;

    @Override
    public String execute() throws Exception{
        Login login=new Login();

        if (login.validar(usuario,pswd)){
            return "success";

        }else{
            return "info";
        }

    }



    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getUser(){
        return usuario;
    }
    public String getPswd(){
        return pswd;
    }
    public void setUser(String usuario) {
        this.usuario = usuario;
    }


    public void setCodigo(int codigo) {
    this.codigo=codigo;
    }
    public boolean getAdmin(){
        return admin;
    }



    public void setAdmin(boolean admin) {
    this.admin=admin;
    }


    public String loginUser(String user, String pswd) throws Exception{
        if (login.validar(user,pswd)){
            return "success";
        }
        return "info";
    }
    @Override
    public void prepare() throws Exception {

    }




//    public String loginUser() throws Exception {
//       if (!this.getUser().equals("") && !this.getPswd().equals("")){
//           return "success";
//       }
//        return "info";
//    }
}
