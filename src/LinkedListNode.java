
public class LinkedListNode {
    int data;
    LinkedListNode next;
    LinkedListNode(){
    	next = null;
    }
    LinkedListNode(int v){
    	data = v;
    	next = null;
    }
    LinkedListNode(int v , LinkedListNode n){
    	data = v;
    	next = n;
    }
}
