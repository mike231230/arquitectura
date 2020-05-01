package front;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

public class listAction extends ActionSupport {

    private static final long serialVersionUID=-8366209797454396351L;

    public static List<String> carrosList=new ArrayList<String>();
    public String carro;
    static {
        carrosList.add("ferrari");
        carrosList.add("Tesla");
        carrosList.add("Audi");
    }


    public String list(){
        return SUCCESS;
    }

    public String add(){
        System.out.println("carro"+carro);
        carrosList.add(carro);
        return SUCCESS;
    }

    public static List<String> getCarrosList() {
        return carrosList;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getCarro() {
    return carro;

    }
}
