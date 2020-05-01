package conexionSQL;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import static java.lang.Class.forName;

public class Login {
    private Properties miproperties= new Properties();
    private Properties conexion=new Properties();
    InputStream is=null;
    InputStream con=null;

    public Login(){
        this.propiedades();
    }
    public void propiedades(){
        try{
            is= new FileInputStream("C:/Users/migue/Desktop/arquitectura/AguirreMiguel/examenes/examen01/examen1/src/main/resources/examen1/example/qwery.properties");
            con=new FileInputStream("C://Users//migue//Desktop//arquitectura//AguirreMiguel//examenes//examen01//examen1//src//main//resources//examen1//example//conexion.properties");
            miproperties.load(is);
            conexion.load(con);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Connection getConnection() throws Exception{
        try {
            propiedades();
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(conexion.getProperty("conexion"),conexion.getProperty("user"),conexion.getProperty("paswd"));


        }catch (Exception e){
            e.printStackTrace();
            return null;

        }
    }

    public boolean validar(String user,String pswd) throws Exception{
        ResultSet rs=null;
        getConnection().setAutoCommit(false);
        boolean estado=false;
        try {
            propiedades();
            String sql=miproperties.getProperty("User.selectionfetch");
            PreparedStatement ps= getConnection().prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,pswd);

            rs=ps.executeQuery();
            estado=rs.next();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return estado;
        }

    }
    public boolean validar(String user,String pswd,int codigo) throws Exception{
        ResultSet rs=null;
        getConnection().setAutoCommit(false);
        boolean estado=false;
        try {
            propiedades();
            String sql=miproperties.getProperty("User.selectionAdmin");
            PreparedStatement ps= getConnection().prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,pswd);
            ps.setInt(3,codigo);

            rs=ps.executeQuery();
            estado=rs.next();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return estado;
        }

    }
    public boolean validar(Integer codigo) throws Exception{
        ResultSet rs=null;
        getConnection().setAutoCommit(false);
        boolean estado=false;
        try {
            propiedades();
            String sql=miproperties.getProperty("User.comparate");
            PreparedStatement ps= getConnection().prepareStatement(sql);
            ps.setInt(1,codigo);
            rs=ps.executeQuery();
            estado= rs.next();

        }catch (Exception e){
            e.printStackTrace();
        }
        return estado;
    }

    public int register(String usuario,String pswd) throws Exception{
        int i=0;
        propiedades();
        try{
            propiedades();
            String sql=miproperties.getProperty("User.insertion");
            PreparedStatement ps=getConnection().prepareStatement(sql);
            ps.setString(1,usuario);
            ps.setString(2,pswd);
            i=ps.executeUpdate();
            return i;
        }catch (Exception e){
            e.printStackTrace();
            return i;
        }finally {
            if (getConnection()!=null){
                getConnection().close();
            }
        }
    }

}
