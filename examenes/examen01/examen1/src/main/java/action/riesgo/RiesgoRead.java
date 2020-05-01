package action.riesgo;

import bean.Riesgobean;
import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.Riesgo;
import lombok.Data;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Data
public class RiesgoRead extends ActionSupport {
    private static final long serialVersionUID=1234;

    ResultSet rs=null;
    Riesgobean bean=null;
    private List<Riesgobean> riesgobeanList=null;

    Riesgo dao=new Riesgo();
    private boolean noData=false;
    @Override
    public String execute() throws Exception{
        try {
            riesgobeanList=new ArrayList<Riesgobean>();
            rs=dao.Report();
            int i=0;
            if (rs!=null) {
                while (rs.next()) {
                    i++;
                    bean = new Riesgobean();
                    bean.setIdriesgo(rs.getInt("idriesgo"));
                    bean.setNombre(rs.getString("nombre"));
                    bean.setDescripcion(rs.getString("descripcion"));
                    riesgobeanList.add(bean);
                }
            }if (i==0){
                    noData=false;
              }else{
                    noData=true;
                }


        }catch (Exception e){
            e.printStackTrace();
        }

        return "REPORT";
    }



}
