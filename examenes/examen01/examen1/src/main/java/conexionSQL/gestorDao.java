package conexionSQL;

import action.login.LoginAction;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import services.LoginService;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

import java.util.Properties;

public class gestorDao {
    private static gestorDao gestorDao = null;
    PoolConexion pool =new PoolConexion();

    private static final Logger LOGGER = LoggerFactory.getLogger(gestorDao.class);
    private String tabla;
    private String variable;
    private Properties miproperties= new Properties();
    //private Properties conexion=new Properties();
    InputStream is=null;
    InputStream con=null;
    Connection cone= null;


    public gestorDao()  {
    }
    public static gestorDao getInstance(){
        if (gestorDao == null){
            gestorDao = new gestorDao();
        }
        return gestorDao;

    }

    public void propiedades(){
        try{

            is= new FileInputStream("C:/Users/migue/Desktop/arquitectura/AguirreMiguel/examenes/examen01/examen1/src/main/resources/examen1/example/qwery.properties");
//            con=new FileInputStream("C://Users//migue//Desktop//arquitectura//AguirreMiguel//examenes//examen01//examen1//src//main//resources//examen1//example//conexion.properties");
            miproperties.load(is);
           // conexion.load(con);
        }catch(Exception e){
            e.printStackTrace();
        }


    }




//    public Connection getConnection() throws Exception{
//        try {
////            propiedades();
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            return DriverManager.getConnection(conexion.getProperty("conexion"),conexion.getProperty("user"),conexion.getProperty("paswd"));
//           return pool.getDataSource().getConnection();
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//            return null;
//
//        }
//    }





    public int register(int iddelegacion, String nombre) throws Exception{
        int i=0;
        propiedades();
        try { //"insert into delegacion values(?,?)";
            cone=pool.getDataSource().getConnection();
            propiedades();
            String sql=miproperties.getProperty("delegacion.insertion");
            PreparedStatement ps=cone.prepareStatement(sql);
            ps.setInt(1,iddelegacion);
            ps.setString(2,nombre);
            i=ps.executeUpdate();
            return i;

        }catch (Exception e){
            e.printStackTrace();
            return i;
        }finally {
            if (cone!=null){
                cone.close();
            }
        }
    }


    public ResultSet Report() throws Exception {

        try { //"SELECT * FROM delegacion"
            ResultSet rs = null;
            cone=pool.getDataSource().getConnection();
            propiedades();
            String sql = miproperties.getProperty("delegacion.selection");
            PreparedStatement ps = cone.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
       }
//       finally {
//           if (cone != null) {
//               cone.close();
//           }
//        }
    }





    public ResultSet fetchDetails(int id) throws Exception {
        ResultSet rs = null;
        try { //"SELECT nombre FROM delegacion WHERE iddelegacion=?
            cone=pool.getDataSource().getConnection();
            propiedades();
            String sql =miproperties.getProperty("delegacion.selectionfetch");
            PreparedStatement ps = cone.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (cone != null) {
                cone.close();
            }
        }
    }

    public int updateDetails(int iddelegacion, String nombre) throws  Exception {
//        cone.setAutoCommit(false);
    //    LOGGER.debug(iddelegacion + nombre);
        int i = 0;
        propiedades();

        try { //"UPDATE delegacion SET nombre =?WHERE iddelegacion=?"
            cone=pool.getDataSource().getConnection();
            cone.setAutoCommit(false);
            String sql = miproperties.getProperty("delegacion.upadating");
            PreparedStatement ps = cone.prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setInt(2,iddelegacion);
            i = ps.executeUpdate();
            cone.commit();
            ps.close();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            cone.rollback();
            return 0;
        } finally {
            if (cone != null) {
                cone.close();
            }
        }
    }



    public int deleteDetails(int iddelegacion) throws  Exception {
        //cone.setAutoCommit(false);
        int i = 0;
        try {//"DELETE FROM delegacion WHERE iddelegacion=?"
            cone=pool.getDataSource().getConnection();
            cone.setAutoCommit(false);
            propiedades();
            String sql = miproperties.getProperty("delegacion.deleted");
            PreparedStatement ps = cone.prepareStatement(sql);
            ps.setInt(1,iddelegacion);
            i = ps.executeUpdate();
            cone.commit();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            cone.rollback();
            return 0;
        } finally {
            if (cone != null) {
                cone.close();
            }
        }
    }
}
