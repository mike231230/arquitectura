package action.login;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
public class LoginAdmin extends ActionSupport {
    private int codigo;
    LoginAction admi =null;
    public LoginAdmin(LoginAction user){
        this.admi=user;
    }
    @Override
    public String execute() throws Exception{
        admi.getUser();
        admi.getPswd();
        if(admi.login.validar(admi.getUser(),admi.getPswd(),codigo)){
            return "ok";
        }else {
            return "error";
        }

    }

}
