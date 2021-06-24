package dev.rcarrillo.devz.linkedlists;

import java.util.Arrays;

public class IntLinkedList {
    public IntNode head;

    public IntLinkedList(){
    }

    public void addAll(int[]values){
        if(values!=null) {
            Arrays.stream(values).forEach(this::add);
        }
    }
    public void add(int value){
        if(head == null){
            head = new IntNode(value);
            return;
        }
        IntNode currentNode = head;
        while(currentNode.getNext()!=null){
           currentNode = currentNode.getNext();
        }
        currentNode.setNext(new IntNode(value));
    }

    public void printList(){
        IntNode currentNode = head;
        StringBuilder sb = new StringBuilder();
        while(currentNode != null){
            sb.append(currentNode.getValue());
            if(currentNode.getNext()!=null){
                sb.append(",");
            }
            currentNode = currentNode.getNext();
        }
        System.out.println(sb);
    }
}
