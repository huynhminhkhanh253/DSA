package DoubleLinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node pre;
        public Node(int value){
            this.value = value;
        }
    }
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;  
    }
    public void getHead(){
        System.out.println("Head= " + head.value);
    }
    public void getTail(){
        System.out.println("Tail= " + tail.value);
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.pre = tail;
            tail.next = newNode;
            tail = newNode; 
            length++;
        }     
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public Node removeLast(){
        if(length == 0) return null; 
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.pre;
            tail.next = null;
            temp.pre = null;
        }
        length--; 
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        if(length == 1){
            head = null;
            temp = null;
        }else{
            head = head.next;
            temp.next = null;
            head.pre = null;
        }
        length--;
        return temp;
    }
    public Node get(int index){
        if(index < 0 || index >= length) return null;
        if(index < length/2){
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;
        }
        else{
            Node temp = tail;
            for(int i = length - 1; i > index ; i--){
                temp = temp.pre;
            }
            return temp;
        }
    }   
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp == null) return false;
        temp.value = value;
        return true;
    }
    public boolean insert(int index, int value){
        if(index < 0 || index >= length) return false;
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        if(index == 0){
            prepend(value);
            length++;
            return true;
        }
        if(index == length-1){
            append(value);
            length++;
            return true;
        }
        before.next = newNode;
        newNode.next = after;
        newNode.pre = before;
        after.pre = newNode;
        return true;
    }
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();
            
        
        Node temp = get(index);
        Node before = temp.pre;
        Node after = temp.next;
        
        before.next = after;
        after.pre = before;
        temp.next = null;
        temp.pre = null;

        length--;
        return temp;
    }
}
