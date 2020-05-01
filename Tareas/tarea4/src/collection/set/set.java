package collection.set;




import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set {

    public Set<Integer>numeros=new HashSet<>();

    public List<Integer> listnumeros= Arrays.asList(3,6,9,1,4,7,2,5,3,8,9,1,3,8,6);

    public set(){


    }



    public Set<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(Set<Integer> numeros) {
        this.numeros = numeros;
    }

    public List<Integer> getListnumeros() {
        return listnumeros;
    }

    public void setListnumeros(List<Integer> listnumeros) {
        this.listnumeros = listnumeros;
    }

    public void imprimirset(){
        System.out.println(listnumeros);
        Set<Integer> uniquenumberos = new HashSet<>(listnumeros);
        System.out.println(uniquenumberos);
    }

    public void removeset(Integer remover){
        if (numeros.remove(remover)){
            System.out.println("el numero "+remover+" se elimino");

        }
        imprimirset();

    }

    public void addset(Integer add){
        if (numeros.contains(add)){
            System.out.println("el numero ya existe");
        }else if (numeros.add(add)) {
            System.out.println("el numero " + add + " se ha agregado");
            imprimirset();
        }

    }



}
