import java.util.LinkedList;
public class lList {
    public static void main(String[] args) {
        
        LinkedList<String> myLinkedList = new LinkedList<String>();
        /* 
        myLinkedList.push("A");
        myLinkedList.push("B");
        myLinkedList.push("C");
        myLinkedList.push("D");
        myLinkedList.push("F");
        myLinkedList.pop(); //will pop F
        */
        //linkedlist as queue
        myLinkedList.offer("A");
        myLinkedList.offer("B");
        myLinkedList.offer("C");
        myLinkedList.offer("D");
        myLinkedList.offer("E");

        myLinkedList.add(5, "F");
        myLinkedList.remove("E");

        //System.out.println(myLinkedList.indexOf("C"));
        System.out.println(myLinkedList.peekFirst());
        System.out.println(myLinkedList.peekLast());
        myLinkedList.addFirst("0");
        System.out.println(myLinkedList);
        }
}
/*
 * LinkedList = Stores Nodes in 2 parts (data + address)
 * nodes are in non-consecutive memory locations
 * elements are linked using pointer
 * Singly linked List
 *       Node                Node                Node
 * [data | address] -> [data | address] -> [data | address]
 * 
 * doubly linked list
 *       Node                Node                Node
 * [address | data | address] -> [address | data | address] -> [address | data | address]
 * 
 * advantages?
 * 1. dynamic DS (allocates needed memory while running)
 * 2. Insertion and deletion of nodes is easy O(1)
 * 3. no/low memory waste
 * 
 * disadvantages?
 * 1. Greater memory usage (additional pointer)
 * 2. No random access of elements(no index[i])
 * 3. accessing/searching elements is more time consuming O(n)
 * 
 * uses?
 * 1. implements stacks/queue
 * 2. gps navigation
 * 3. music playlist
 */