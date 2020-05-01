package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class gestorDao {

    public static Connection getConnection() throws Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/gestor?serveruseUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","root");


        }catch (Exception e){
            e.printStackTrace();
            return null;

        }
    }

    public int registerDelegacion(int id,String nombre) throws Exception{
        int i=0;
        try {
            String sql="insert into delegacion values(?,?)";
            PreparedStatement ps=getConnection().prepareStatement(sql);
            ps.setInt(1,id);
            ps.setString(2,nombre);
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

    public ResultSet report() throws Exception {
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM delegacion";
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
    public ResultSet fetchdelegacionDetails(int id) throws SQLException, Exception {
        ResultSet rs = null;
        try {
            String sql = "SELECT nombre FROM delegacion WHERE iddelegacion=?";
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
    public int updateDelegacionDetails(String nombre)
            throws SQLException, Exception {
        getConnection().setAutoCommit(false);
        int i = 0;
        try {
            String sql = "UPDATE delegacion SET nombre=? WHERE iddelegacion=?";
            PreparedStatement ps = getConnection().prepareStatement(sql);

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
    public int deleteDelegacionDetails(int iddelegacion) throws SQLException, Exception {
        getConnection().setAutoCommit(false);
        int i = 0;
        try {
            String sql = "DELETE FROM STRUTS2CRUD WHERE UEMAIL=?";
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1,iddelegacion);
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
