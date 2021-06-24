package dev.rcarrillo.devz.arraysstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Dado un arreglo de números y un valor deseado, regresa los índices de los dos
 * números en el arreglo que sumen ese valor.
 *
 * Puedes asumir que siempre hay una sola solución. No puedes usar el mismo elemento
 * dos veces.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3, -1, 0, 1} ,0);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] values, int expected) {
        if(values == null) {
            return new int [0];
        }
        if(values.length == 0 && expected!=0){
            return new int [0];
        }

        Map<Integer, Integer> memory = new HashMap<>();
        for(int i=0; i<values.length;i++){
            int tmp = expected - values[i];
            if(memory.containsKey(values[i])){
                return new int[]{i,memory.get(values[i])};
            }
            memory.put(tmp, i);
        }
        return new int[0];
    }
}
