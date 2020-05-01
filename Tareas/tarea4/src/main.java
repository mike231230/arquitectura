import collection.list.arrayList;
import collection.set.set;
import map.mapp;

import java.util.Scanner;

import java.util.ArrayList;

public class main {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        int a=0;
        do {
            a=scan.nextInt();
            switch (a){
                case 1:
                    ArrayList<String> nombres=new ArrayList<String>();
                    for (int i =0;i<15;i++){
                        nombres.add("elemento "+i);
                    }
                    arrayList hola=new arrayList(nombres);
                    hola.imprimeLista(nombres);
                    break;
                case 2:
                    Integer numero = null;
                    set numeros=new set();
                    numeros.imprimirset();
                    System.out.println("dame el numero a agregar");
                    numero=scan.nextInt();
                    numeros.addset(numero);
                    System.out.println("dame el numero a eliminar");
                    numero=scan.nextInt();
                    numeros.removeset(numero);

                    break;
                case 3:
                mapp mapa=new mapp();
                mapa.crearMapa();
                mapa.llaves();

            }

        }while(a!=5);

    }


}
