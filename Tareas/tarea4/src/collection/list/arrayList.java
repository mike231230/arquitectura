package collection.list;

import java.util.ArrayList;
import java.util.List;

public class arrayList {


    private List<String> lista;
    public arrayList(ArrayList<String> nombres){
        this.lista=nombres;

    }

    public void imprimeLista(List<String> lista){

        for(String str:lista){
            System.out.println(str);

        }

    }


}
