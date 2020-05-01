package animal;

import acciones.AccionesGeneral;

public class Animal implements AccionesGeneral {


     public Animal() {

     }

     public String alimentarse() {
          String mensaje;
          return mensaje = "estoy comiendo";

     }

     public String desplazarse(int pasox, int pasoy) {
          String[][] array = new String[5][5];
          String mensaje = null;
          for (int i = 0; i < 5; i++) {
               for (int j = 0; j < 5; j++) {
                    if (i == pasox && j == pasoy) {
                        mensaje= array[i][j] = "estoy aqui; " + i + " " + j;
                         System.out.println(array[i][j]);

                    }
               }
          }
          return mensaje;
     }




     public String dormir() {
          String mensaje = "Zzzzzz";

          return mensaje;
     }
}


