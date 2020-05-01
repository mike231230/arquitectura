package conexionSQL;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class PoolConexion {
    private static BasicDataSource ds= null;
    //PoolDataSourse pds=PoolDataSourceFactory.getPoolDataSourse();


    public DataSource getDataSource(){
        if (ds==null){
            ds= new BasicDataSource();
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
            ds.setUsername("root");
            ds.setPassword("root");
            ds.setUrl("jdbc:mysql://localhost/gestor?serveruseUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");

            ds.setInitialSize(50);
            ds.setMaxIdle(10);
            ds.setMaxTotal(20);
            ds.setMaxWaitMillis(5000);

        }
        return ds;


    }
    public Connection getConexion() throws SQLException{
        return getDataSource().getConnection();
    }

}
