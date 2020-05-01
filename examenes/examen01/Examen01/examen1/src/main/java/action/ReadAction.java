package action;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.embean;
import conexionSQL.gestorDao;

import com.opensymphony.xwork2.ActionSupport;

public class ReadAction extends ActionSupport{
    private static final long serialVersionUID = 6329394260276112660L;
    ResultSet rs = null;
    embean bean = null;
    private List<embean> beanList = null;
    gestorDao gestor=new gestorDao();
    private boolean noData=false;
    @Override
    public String execute() throws Exception{
        try{
            beanList= new ArrayList<embean>();
            rs=gestor.report();
            int i=0;
            if (rs!=null){
                while (rs.next()){
                    i++;
                    bean =new embean();
                    bean.setSrNO(i);
                    bean.setNombre(rs.getString("nombre"));
                    beanList.add(bean);

                }
            }if (i==0){
                noData=false;
            }else {
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

    public void setBeanList(List<embean> beanList) {
        this.beanList = beanList;
    }
    public List<embean> getBeanList(){
       return beanList;
    }
}
