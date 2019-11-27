 package week3; 
/**
 * Advanced Exercises - Week 3 - circularLinkedList
 * 210CT - Programming, Algorithms and Data Structures
 * 2019-20 Year 1
 * 
 * @Name       : Hsu Wan Chi
 * @Class      : BSc(Hons) Computer
 * @Student ID : 197101307
 * @Date       : 24-Oct-2019
 * 
 * DECLARATION
 * I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement 
 * and collusion. I am aware of the consequences if found to be involved in these misconducts. 
 * I hereby declare that the work submitted for the “210CT - Programming, Algorithms and Data Structures” is 
 * authentic record of my own work.
 */

public class circularLinkedList {
    private ListNode head;
    private ListNode tail;
    public circularLinkedList() { head = tail = null; }

    public boolean isEmpty() { return head == null; }

    public ListNode getLastNode(){
        ListNode current = head;
        while(current != null && current.getNext() != head){
            current = current.getNext();
        }
        return current;
    }

    public void addToHead(Object item) {
        //Create new node  
        ListNode newNode = new ListNode(item);
        // Get the last node
        ListNode lastNode = getLastNode();
        //Checks if the list is empty.  
        if(isEmpty()) {  
            //If list is empty, make the new Node as Head 
            head = tail = newNode;   
            newNode.next = head;  
        }  
        else {
            newNode.next = head;
            // get the Last Node and make its next point to new Node
            lastNode.next = newNode;
            // also make the head point to the new first Node;
            head = newNode;
        }
    }

    public void addToTail(Object item) {
        // Create new node 
        ListNode newNode = new ListNode(item);
        // Get the last node
        ListNode lastNode = getLastNode();
        // Checks if the list is empty. 
        if(isEmpty()){
            head = tail = newNode;
            newNode.next = null;
        }else{
            // tail will point to new node.  
            // New node will become new tail.   
            // Since, it is circular linked list tail will point to head.
            lastNode.next = newNode;
            // Make the next pointer of new node point to head
            newNode.next = head;
        }

    }

    public Object removeFromHead() throws EmptyListException {
        Object item = null;
        ListNode lastNode = getLastNode();
        if(isEmpty())
            throw new EmptyListException();
        item = head.data;
        if(head == tail){
            head = tail = null;
        }else{
            lastNode.next = head.next;
            head = head.next;
        }
        return item;
    }

    public Object removeFromTail() throws EmptyListException {
        Object item = null;
        ListNode lastNode = getLastNode();
        if(isEmpty())
            throw new EmptyListException();
        item = tail.data;
        if(head == tail){
            head = lastNode = null;
        }else{
            ListNode current = head;
            System.out.println(lastNode.data);
            while(current.next != lastNode){
                current = current.next;
            }
            tail = current; 
            tail.next = head;
        }
        return item;
    }

    public boolean isCircular() throws EmptyListException {
        if(isEmpty()){
            throw new EmptyListException();
        }
        ListNode current = head.next;
        while(current != null & current!= head){
            current = current.next;
        }
        return (current == head);
    }

    public String toString () {
        int length = 0;
        String s = "[ ";
        ListNode current = head;
        if(head != null && current.getNext() != null){
            do{  
                //Prints each node by incrementing pointer.  
                s += current.data + "-->";
                current = current.next; 
            }while(current != head);
            length = s.length();          
            //  Point to the head
            if(true){
                s += head.data + "(head)";
                int space = length - 4;
                s += " ]\n[ |";
                for(int i = 0; i < space;i++){ 
                    s += " "; 
                }
                s +="| ]\n[ ^-";
                for(int i = 0; i < space;i++){ 
                    s += "-"; 
                }

            }

        }
        return s + " ]";
    }
} // class LinkedList
