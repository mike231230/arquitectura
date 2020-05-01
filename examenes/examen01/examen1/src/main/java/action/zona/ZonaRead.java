package action.zona;

import com.opensymphony.xwork2.ActionSupport;
import conexionSQL.zona;
import bean.ZonaBean;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ZonaRead extends ActionSupport {
    private static final long serialVersionUID=6329394260276112660L;
    ResultSet rs=null;
    ZonaBean bean=null;
    private List<ZonaBean> beanlist=null;
    zona gestor=new zona();
    private boolean noData=false;
    @Override
    public String execute() throws Exception{
        try{
            beanlist=new ArrayList<ZonaBean>();
            rs=gestor.Report();
            int i=0;
            if (rs!=null){
                while(rs.next()){
                    i++;
                    bean=new ZonaBean();
                    bean.setIdzona(rs.getInt("idzona"));
                    bean.setNombre(rs.getString("nombre"));
                    beanlist.add(bean);
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


    public boolean isNoData() {
        return noData;
    }

    public void setNoData(boolean noData) {
        this.noData = noData;
    }

    public List<ZonaBean> getBeanlist() {
        return beanlist;
    }

    public void setBeanlist(List<ZonaBean> beanlist) {
        this.beanlist = beanlist;
    }

}
