
package week5;
/**
 * Advanced Exercises - Week 5 - DoublyList
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
public class DoublyList
{
    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    public DoublyList(){
        head = null;
        tail = null;
        size = 0;
    }

    /* Method      : headIsEmpty
     * Input       : no parameters
     * Output      : boolean
     * Description : check if the head node is empty
     */
    public boolean headIsEmpty(){
        return (head == null);      //if the head node is empty, return true.
    }

    /* Method      : tailIsEmpty
     * Input       : no parameters
     * Output      : boolean
     * Description : check if the tail node is empty
     */
    public boolean tailIsEmpty(){
        return (tail == null);      //if the tail node is empty, return true.
    }

    public int size(){  return size; }

    /* Method      : addToHead
     * Input       : String
     * Output      : void
     * Description : add a new node to first spot (head variable)
     */
    public void addToHead(String item){
        if(headIsEmpty()){
            head = tail = new DoublyNode(item);
        }
        else{
            head.previous = new DoublyNode(item, null, head);//data,previous,next
            head = head.previous;
        }
        size++;
    }

    /* Method      : addToTail
     * Input       : String
     * Output      : void
     * Description : add a new node to last spot (tail variable)
     */
    public void addToTail(String item){
        DoublyNode newNode = new DoublyNode(item);
        if(tailIsEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    /* Method      : insertAtPosition
     * Input       : String
     * Output      : void
     * Description : Insert a node at aspecific position ln the doubly Linked list
     */
    public void insertAtPosition(String item, int position){
        DoublyNode newNode = new DoublyNode(item);////data,previous,next
        if(headIsEmpty()){
            // if head is null and position is zero then exit.
            if(position != 0){
                return;
            }else{
                // new node set to the head
                head = newNode;
            }
        }

        if(head != null && position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        DoublyNode current = head;
        DoublyNode previous = null;

        int i = 0;

        while(i < position){
            previous = current;
            current = current.next;

            if(current == null){
                break;
            }
            i++;
        }

        newNode.next = current;
        previous.next = newNode;
        size++;
    }

    /* Method      : insertAtRightSpot
     * Input       : String
     * Output      : void
     * Description : Insert a node to the right spot in the doubly Linked list
     */
    public void insertAtRightSpot(String s){
        String s1 = null,s2 = null;
        if(!headIsEmpty()){
            s1= head.data; 
            s2 = tail.data; 
        }

        if (s1 == null) { 
            addToHead(s); 
        } else if (compare(s1,s) >= 0) {
            DoublyNode current = head;
            int index = 0;
            int positionIndex = 0;

            if(compareCase(current.data,s) < 0){
                while(current != null){
                    index++;
                    while (current.data.length() == s.length() ){
                        if(compareCase(current.data,s) > 0){
                            positionIndex = index-1;
                            break;
                        }
                        positionIndex = index;
                        break;
                    }
                    current = current.next;
                }
                insertAtPosition(s,positionIndex);
            }else{
                addToHead(s);
            }

        } else if (compare(s2,s) <= 0) { 
            addToTail(s);
        } else {
            DoublyNode current = head;
            int index = 0;
            int positionIndex = 0;
            while(current != null){
                index++;
                while (current.data.length() == s.length() ){
                    if(compareCase(current.data,s) > 0){
                        positionIndex = index-1;
                        break;
                    }
                    positionIndex = index;
                    break;
                }
                while(current.data.length() < s.length()){
                    positionIndex = index;
                    break;
                }
                current = current.next;
            }
            insertAtPosition(s,positionIndex);
        }

    }

    /* Method      : compare
     * Input       : String
     * Output      : int
     * Description : compare String by their length
     */
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }

    /* Method      : compareCase
     * Input       : String
     * Output      : int
     * Description : compare two Strings, ignoring lower case and upper case differences
     */
    public int compareCase(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
    
    /* Method      : getAtIndex
     * Input       : int
     * Output      : String
     * Description : get the linked list data by index
     */
    public String getAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            DoublyNode current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            return current.data;
        }
    }

    /* Method      : removeFromHead
     * Input       : no parameter
     * Output      : Object
     * Description : remove the first node in the linked list
     */
    public Object removeFromHead(){
        if(headIsEmpty()){
            throw new EmptyListException();
        }
        String item = head.data;
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
            head.previous = null;
        }
        size--;
        return item;
    }

    /* Method      : removeFromTail
     * Input       : no parameter
     * Output      : Object
     * Description : remove the last node in the linked list
     */
    public Object removeFromTail(){
        if(tailIsEmpty()){
            throw new EmptyListException();
        }
        String item = tail.data;
        if(head == tail){
            head = tail = null;
        }
        else{
            tail = tail.previous;
            tail.next = null;
        }
        size--;
        return item;
    }

    public void print(){      
        DoublyNode current = head;
        int currLength = -1;
        while(current != null){ 
            if(currLength == current.data.length()){
                // if currLength is equal to current word length just append a comma and this word
                System.out.print(", "+current.data);
            }
            else{
                // if not update currLength, jump to a new line and print new length with the current word
                currLength = current.data.length();
                System.out.println();
                System.out.print(currLength+ " - "+current.data);                
            }
            current = current.next;
        }
    }

    /* Method      : addToTail
     * Input       : Object
     * Output      : void
     * Description : add a new node to last spot (tail variable)
     */
    public String toString(){
        String node = "[";
        DoublyNode current = head;
        while(current != null){
            node += current.data;
            node += " ";
            current = current.next;
        }
        return node + "]";
    }
}
