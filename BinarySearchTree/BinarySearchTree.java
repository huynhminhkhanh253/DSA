package BinarySearchTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Queue;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.util.LinkedList;


public class BinarySearchTree {
    Node root;
    class Node{
      
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }
    public boolean insert(int value){
        //create new Node
        Node newNode = new Node(value);

        // if root == null -> root = newnode
        if(root == null){
            root = newNode;
            return true;
        } 
        //create ponter
        Node temp = root;
        //while loop
            // newNode == temp return false
            //if < left, > right
            //if null insert newNode move to next
        while (true){
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }else {
               if(temp.right == null){
                  temp.right = newNode;
                  return true;
               }
               temp = temp.right;
            }          
        }  
    } 
    public boolean contain(int value){
        //if root == null return false
        //while
        //if number<root -> temp = temp.left
            //if temp == value return true
            //if temp == null return false
        //if number>root -> temp = temp.right
            //if temp == value return true
            //if temp == null return false
        
        Node temp = root;
        if(root == null) return false;
        while (temp != null){
            if(value < temp.value){
                temp = temp.left;
            }
            else if(value > temp.value){
                temp = temp.right;
            }
            else return true;
        }
        return false;
    } 
    private boolean rContains(Node currentNode, int value){
       if(currentNode == null) return false;
       if(value == currentNode.value) return true;
       if(value < currentNode.value){
            return rContains(currentNode.left, value);
        }
       else{
            return rContains(currentNode.right, value);
       } 
       // if value == currentNode.value return true; 
       // else if value < currentNode -> currNode.left
       // else currentNode.right  
    }
    public boolean rContains(int value){
        return rContains(root, value);
    }
    
    private Node rInsert(Node currentNode, int value){
        if(currentNode == null) return new Node(value);
        if(value < currentNode.value){
            currentNode.left = rInsert(currentNode.left, value);                              
        }else if(value > currentNode.value){
            currentNode.right = rInsert(currentNode.right,value);
        }            
        return currentNode;
    }

    public void rInsert(int value){
        if(root == null) root = new Node(value);
        rInsert(root, value);
    }
    private Node deleteNode(Node currentNode, int value){
        if(currentNode == null) return null;
        if(value < currentNode.value){
            currentNode.left = deleteNode(currentNode.left, value);}
        else{
            if(currentNode.left == null && currentNode.right == null){
                return null;
            }
            else if(currentNode.left == null){
                return currentNode.right;
            }
            else if(currentNode.right == null){
                return currentNode.left;
            }else{
                int minSubTree = minimunValue(currentNode);
                currentNode.value = minSubTree;
                currentNode.right = deleteNode(currentNode.right, value);
            }
        }
        return currentNode;
    }
    
    public void deleteNode(int value){
        deleteNode(root, value);
    }
    public int minimunValue(Node currentNode){
        while(currentNode.left != null){ 
           currentNode = currentNode.left;
        }
        return currentNode.value;
    }
    public ArrayList<Integer> BFS() {
        // create current node = root
        // create queue <Node> 
        // create array list <Interger> results
        //while(queue.szie() > 0)
            // current Noode = queue.romve
            // if(currentNode.left != null) results.add
            // if()...
        //return results;
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);
        // currentNode = root 
        // current node = queue.remove
        // -> result.add current node value
        // queue add current node left
        // quue add current node right
        // curr = quee.remove
        // -> result.add curr node value ( left)
        // -
        while(queue.size() > 0){
            currentNode = queue.remove();
            results.add(currentNode.value);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return results;
    }
    public ArrayList<Integer> DFSPreOder(){
        // create new Linkedlist result;
        // create class traverse
            // construtor(currentNode)
            // result.add(currentNode);
            // if(currNode.left != null)
            // travers(cuurentNode.left)
            // if(currNode.right != null)
            // travers(currentNode.right)
        // new traverse(root)
        // returen results;
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                results.add(currentNode.value);
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }
    
    public ArrayList<Integer> DFSPostOder(){
        // create array list results;
        // class traverse (mehthod);
            // traverse(Node currentNode)
            // if(currentNode.left != null)
                // new Traverse(currentNode.left)
            // if(currentNode.right != null)
                // new Traverse(currentNode.right)
            // else{}
                // result.add(currentNode)
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Traverse(root);
        return results;
    }
    public ArrayList<Integer> DFSInOder(){
        // create new arraay
        // class traverse
            // traver(currentnoded)

            // if(currentNode.left != null)
                // new traverse(currentNode.left)
            // result.add(currentNdode)
            // newTraver(currentNode.right)
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }
}
   
