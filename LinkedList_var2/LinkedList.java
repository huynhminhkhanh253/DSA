package LinkedList_var2;



public class LinkedList {
    Node tail;
    Node head;
    int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void PrintList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head = " + head.value);
    }
    public void getTail(){
        System.out.println("Tail = " + tail.value);
    }
    public void getLength(){
        System.out.println("Length = " + length);
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        } 
        length++;
    }
    public Node removeLast(){
        Node temp = head;
        Node pre = head;
        if(length == 0){
            return null;
        }
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        Node temp = head;
        if(length == 0) return null;
        else{
            head = head.next;
            temp.next = null;
        }
        length--;
        if(length == 0){
            tail = null;
        }
        return temp; 
    }
    public Node get(int index){
        if (index < 0 || index > length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            return false;
        }
        if(index == length){
            append(value);
            return false;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++; 
        return true;
    }
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0){
            return removeFirst();
        }
        if(index == length -1) return removeLast();
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;     
        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        } 
    }
    public Node findMiddleNode(){
        return get(length/2);
    }

}
