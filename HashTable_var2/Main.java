package HashTable_var2;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("new",12);
        myHashTable.set("new",13);
        myHashTable.set("screw",100);
        //myHashTable.print();
        System.out.println(myHashTable.get("new"));
        //System.out.println(myHashTable.allKeys());
        
    }
    
}
