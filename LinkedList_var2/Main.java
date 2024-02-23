package LinkedList_var2;

public class Main {
    public static void main(String[] args) {
        LinkedList myNewLinkedList = new LinkedList(1);
        myNewLinkedList.append(2);
        myNewLinkedList.append(3);
        myNewLinkedList.append(4);
        myNewLinkedList.append(5);

        myNewLinkedList.PrintList(); 
        
        System.out.println("after reverse: ");
        myNewLinkedList.PrintList();
        
        //System.out.println("Middle node = " + myNewLinkedList.findMiddleNode().value);
        int ascii = 'k';
        System.out.println(ascii);
        
    }
}
