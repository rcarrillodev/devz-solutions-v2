package dev.rcarrillo.devz.arraysstrings;

import java.util.Arrays;

/**
 * Dado un arreglo de números y un valor deseado, regresa los índices de los dos
 * números en el arreglo que sumen ese valor.
 *
 * Puedes asumir que siempre hay una sola solución. No puedes usar el mismo elemento
 * dos veces.
 */
public class SumThis {

    public static void main(String[] args) {
        int[] result = sumThis(new int[]{3, -1, 0, 1} ,4);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sumThis(int[] values, int expected) {
        if(values == null) {
            return new int [0];
        }
        if(values.length == 0 && expected!=0){
            return new int [0];
        }

        for(int i=0; i<values.length;i++){
           int current = values[i];
           for(int j = i+1; j<values.length;j++){
               if(current + values[j]==expected){
                   return new int[]{i, j};
               }
           }
        }
        return new int[0];
    }
}
