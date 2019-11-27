package week3; 
/**
 * Advanced Exercises - Week 3 - ListNode
 * 
 * Programming, Algorithms and Data Structures
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
public class ListNode {
    Object data;
    ListNode next;
    ListNode(Object o) { data = o; next = null; }

    ListNode(Object o, ListNode nextNode) 
    { data = o; next = nextNode; }

    Object getData() { return data; }

    ListNode getNext() { return next; }
} // class ListNode