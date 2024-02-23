package DoubleLinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList mynew = new DoublyLinkedList(2); 
        mynew.append(3);
        mynew.append(4);
        mynew.append(5);
        mynew.append(6);
        
        mynew.remove(4);
        
        //mynew.getHead();
        //mynew.getTail();
        mynew.printList();
        
        
    }
}
