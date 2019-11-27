package week5;

/**
 * Advanced Exercises - Week 5 - DoublyList
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
public class DoublyNode
{
    String data;
    DoublyNode previous;
    DoublyNode next;

    public DoublyNode(){
        this(null,null,null);
    }

    public DoublyNode(String data){
        this(data,null,null);
    }

    public DoublyNode(String data,DoublyNode previous,DoublyNode next){
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
}
