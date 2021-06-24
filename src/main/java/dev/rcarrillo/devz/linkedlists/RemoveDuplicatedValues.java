package dev.rcarrillo.devz.linkedlists;

import java.util.HashSet;
import java.util.Set;

/**
 * Escribe un programa borre elementos duplicados de un Linked List.
 */
public class RemoveDuplicatedValues {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.addAll(new int[]{4,5,9,0,5,1,2}); // expected:1,2,3,4,5,9,8
        removeDups(list);
        list.printList();
    }

    private static void removeDups(IntLinkedList list) {
        Set<Integer> memory = new HashSet<>();
        IntNode currentNode = list.head;
        IntNode prevNode = list.head;
        while(currentNode!=null){
            if(memory.contains(currentNode.getValue())){
                prevNode.setNext(currentNode.getNext());
                currentNode = currentNode.getNext();
                continue;
            }
            memory.add(currentNode.getValue());
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }
}
