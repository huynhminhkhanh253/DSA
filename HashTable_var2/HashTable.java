package HashTable_var2;

import java.util.ArrayList;

public class HashTable {
    int size = 7;
    Node[] dataMap;
    public class Node{
        Node next;
        int value;
        String key;
        Node(String key, int value){
            this.key = key;
            this.value = value;
        }  
    }
    
    
    public HashTable(){
        dataMap = new Node[size];
    }
    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i = 0; i < keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + (asciiValue * 23)) % dataMap.length;
        }
        return hash;
    }
    public void print(){
        for(int i = 0; i < dataMap.length; i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println("    {" + temp.key + "," + temp.value +"}");
                temp = temp.next;
            }
        }
    }
    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key,value);
        Node temp = dataMap[index];
        if(dataMap[index] == null) dataMap[index] = newNode;
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        } 
    }

    public ArrayList allKeys(){
        ArrayList<String> keyList = new ArrayList<String>();
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                keyList.add(temp.key);
                temp = temp.next;
            }
        }
        return keyList;
    }
    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null){
            if(temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }
}
