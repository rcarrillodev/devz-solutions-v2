package dev.rcarrillo.devz.linkedlists;

/**
 * Implementa un algoritmo que encuentre nodo k lugares antes del último nodo.
 */
public class NodesBeforeK {

    public static int findNumberNPlacesBeforeK(IntLinkedList values, int k){
        if(k<0){
            throw new RuntimeException("Invalid k Value");
        }
        int kPointer = 0;
        IntNode kNode = values.head;
        IntNode currentNode = values.head;

        while(currentNode!=null){
            if(kPointer>=k && currentNode.getNext()!=null){
                kNode = kNode.getNext();
            }
            if(kPointer>=k && currentNode.getNext() == null) {
                return kNode.getValue();
            }
            kPointer++;
            currentNode = currentNode.getNext();
        }
        throw new RuntimeException("k value is higher than values size");
    }

    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.addAll(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(findNumberNPlacesBeforeK(list, 9));
    }
}
