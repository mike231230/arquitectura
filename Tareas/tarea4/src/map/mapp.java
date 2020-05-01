package map;

import java.util.HashMap;
import java.util.Map;

public class mapp {
    public Map <Integer,String> mapa= new HashMap<Integer, String>();
    public mapp(){

    }

    public void crearMapa(){
        for (int i=0;i<16;i++){
            mapa.put(i,"elemento"+i);
        }
    }



    public Map<Integer, String> getMapa() {
        return mapa;
    }
    public void llaves(){

        System.out.println(mapa.keySet());
    }

    public void setMapa(Map<Integer, String> mapa) {
        this.mapa = mapa;
    }
}
