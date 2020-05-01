package services;

import conexionSQL.Login;

public class LoginService {
    private static  Login login = new Login();
    public boolean validUserAdmin(Integer cod) throws Exception {
        return login.validar(cod);
    }
}
