package week4;
/**
 * Advanced Exercises - Week 4 - No.5 - QueueFullException
 * 
 * Programming, Algorithms and Data Structures
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
 * I hereby declare that the work submitted for the “ITP4510 Data Structures & Algorithms” is 
 * authentic record of my own work.
 */
public class QueueFullException extends RuntimeException
{
    public QueueFullException()
    {
        super("Queue is full");
    }
}