package action.prevencion;

import bean.Prevencionbean;
import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.Prevencion;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PrevencionRead extends ActionSupport {
    private static final long serialVersionUID =1234;
    ResultSet rs=null;
    Prevencionbean prevencionbean =null;
    private List<Prevencionbean>Prevencionlist=null;
    Prevencion dao=new Prevencion();
    private boolean noData=false;
    @Override
    public String execute() throws Exception{
        try {
            Prevencionlist= new ArrayList<Prevencionbean>();
            rs=dao.Report();
            int i=0;
            if (rs!=null){
                while (rs.next()){
                    i++;
                    prevencionbean=new Prevencionbean();
                    prevencionbean.setIdprevencion(rs.getInt("idprevencion"));
                    prevencionbean.setNombre(rs.getString("nombre"));
                    prevencionbean.setDescripcion(rs.getString("descripcion"));
                    Prevencionlist.add(prevencionbean);
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
    public List<Prevencionbean> getPrevencionlist() {
        return Prevencionlist;
    }

    public void setPrevencionlist(List<Prevencionbean> prevencionlist) {
        Prevencionlist = prevencionlist;
    }

    public boolean isNoData() {
        return noData;
    }

    public void setNoData(boolean noData) {
        this.noData = noData;
    }

}
