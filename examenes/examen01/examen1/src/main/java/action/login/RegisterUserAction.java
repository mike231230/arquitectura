package action.login;

import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.Login;

public class RegisterUserAction extends ActionSupport {
    private String user;
    private String password;
    private String msg;
    private int ctr=0;
    Login login=new Login();


    @Override
    public String execute() throws Exception{
    try {
        ctr=login.register(user,password);
        if (ctr>0){
            msg="registro completo";
        }

    }catch (Exception e){
        e.printStackTrace();
    }
    return "REGISTER";
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMsg() {
        return msg;
    }
    public String getUser(){
        return user;
    }

    public int getCtr() {
        return ctr;
    }

    public String getPassword() {
        return password;
    }
}
