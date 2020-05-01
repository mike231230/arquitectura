package conexionSQL;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class zona {
    private Properties miproperties= new Properties();
    private Properties conexion=new Properties();
    InputStream is=null;
    InputStream con=null;

    public void propiedades(){
        try{
            is= new FileInputStream("C:/Users/migue/Desktop/arquitectura/AguirreMiguel/examenes/examen01/examen1/src/main/resources/examen1/example/qwery.properties");
            con=new FileInputStream("C://Users//migue//Desktop//arquitectura//AguirreMiguel//examenes//examen01//examen1//src//main//resources//examen1//example//conexion.properties");
            miproperties.load(is);
            conexion.load(con);
        }catch(Exception e){
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

    public int register(int idzona, String nombre) throws Exception {
        int i = 0;
        try {
            propiedades();
            String sql = miproperties.getProperty("zona.insertion");
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, idzona);
            ps.setString(2, nombre);
            i=ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }


    public ResultSet Report() throws Exception {
        ResultSet rs = null;
        try {
            propiedades();
            String sql = miproperties.getProperty("zona.selection");
            PreparedStatement ps = getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }

    }


    public ResultSet fetchDetails(int idzona) throws Exception {
        ResultSet rs = null;
        try {
            propiedades();
            String sql = miproperties.getProperty("zona.selectionfetch");
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, idzona);
            rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }

    public int updateDetails(int idzona, String nombre) throws Exception {
        int i = 0;
        try {
            propiedades();
            String sql = miproperties.getProperty("zona.upadating");
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, idzona);

            i = ps.executeUpdate();
            return i;

        } catch (Exception e) {
            e.printStackTrace();
            getConnection().rollback();
            return 0;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }


    public int deleteDetails(int idzona) throws Exception {
        getConnection().setAutoCommit(false);
        int i = 0;
        try {
            propiedades();
            String sql = miproperties.getProperty("zona.deleted");
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, idzona);
            i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            getConnection().rollback();
            return 0;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }
}


