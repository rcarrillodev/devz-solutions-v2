package dev.rcarrillo.devz.linkedlists;

/**
 * Tienes dos números representados por dos linked lists donde el valor de cada nodo
 * representa un dígito. Los dígitos están guardados de manera inversa, de manera que
 * las unidades está en el primer nodo (head), las decenas en el segundo nodo, etc.
 * Escribe un programa que dado dos linked lists, sume los dos números que
 * representan y regrese esa suma representada también en un linked list.
 */
public class SumLinkedLists {

    public static void main(String[] args) {
        IntLinkedList list1 = new IntLinkedList();
        list1.addAll(new int[]{9,9,9});
        IntLinkedList list2 = new IntLinkedList();
        list2.addAll(new int[]{1});
        IntLinkedList result = sumLists(list1, list2);
        result.printList();

        IntLinkedList list3 = new IntLinkedList();
        list3.addAll(new int[]{2,3,1});
        IntLinkedList list4 = new IntLinkedList();
        list4.addAll(new int[]{6,0,3});
        IntLinkedList resultb = sumLists(list3, list4);
        resultb.printList();
    }

    private static IntLinkedList sumLists(IntLinkedList list1, IntLinkedList list2) {
        IntNode currentNodeA = list1.head;
        IntNode currentNodeB = list2.head;
        int currentIteration = 0;
        IntLinkedList result = new IntLinkedList();
        int carryValue = 0;
        while(currentNodeA!=null || currentNodeB!=null){
            int total = 0;
            if(currentNodeA!=null) {
                total += currentNodeA.getValue() * (Math.pow(10, currentIteration));
                currentNodeA=currentNodeA.getNext();
            }
            if(currentNodeB !=null){
                total += currentNodeB.getValue()*(Math.pow(10, currentIteration));
                currentNodeB = currentNodeB.getNext();
            }
            int intResult = Double.valueOf(total/(Math.pow(10,currentIteration))).intValue()+carryValue;
            if (intResult/10>0){
                carryValue = intResult/10;
            }
            result.add(intResult%10);
            currentIteration++;
        }
        if(carryValue>0){
            result.add(carryValue);
        }
        return result;
    }

}
