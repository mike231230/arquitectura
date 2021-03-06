package conexionSQL;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Prevencion {
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

    public int register( String nombre,String descripcion, int idriesgo) throws Exception{
        int i=0;
        propiedades();
        try { //"insert into prevencion values(?,?)";
            propiedades();
            String sql=miproperties.getProperty("Prevencion.insertion");
            PreparedStatement ps=getConnection().prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2,descripcion);
            ps.setInt(3,idriesgo);
            i=ps.executeUpdate();
            return i;

        }catch (IOException e){
            e.printStackTrace();
            return i;
        }finally {
            if (getConnection()!=null){
                getConnection().close();
            }
        }
    }
    public ResultSet Report() throws Exception {
        ResultSet rs = null;
        try { //"SELECT * FROM Riesgo"
            propiedades();
            String sql = miproperties.getProperty("Prevencion.selection");
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
    public ResultSet fetchDetails(int id) throws Exception {
        ResultSet rs = null;
        try { //"SELECT nombre FROM Riesgo WHERE idRiesgo=?
            propiedades();
            String sql =miproperties.getProperty("Prevencion.selectionfetch");
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, id);
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
    public int updateDetails(int idPrevencion, String nombre,String descripcion) throws  Exception {
        getConnection().setAutoCommit(false);

        int i = 0;
        try { //"UPDATE Riesgo SET nombre =?WHERE idRiesgo=?"
            propiedades();
            String sql = miproperties.getProperty("Prevencion.upadating");
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2,descripcion);
            ps.setInt(3,idPrevencion);

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
    public int deleteDetails(int idprevencion) throws  Exception {
        getConnection().setAutoCommit(false);
        int i = 0;
        try {//"DELETE FROM Riesgo WHERE idRiesgo=?"
            propiedades();
            String sql = miproperties.getProperty("Prevencion.deleted");
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1,idprevencion);
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
