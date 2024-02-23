package HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("screw",100);
        myHashTable.set("screw2",200);
        myHashTable.set("screw3",300);
        myHashTable.set("screw4",500);
        myHashTable.set("screw4",600);
        myHashTable.printTable();
        System.out.println(myHashTable.keys());
        
        
    }
}
