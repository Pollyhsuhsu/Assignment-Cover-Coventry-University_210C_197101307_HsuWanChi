package week4;
/**
 * Advanced Exercises - Week 4 - No.5 - ArrayQueue
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
public class ArrayQueue{
    private Object array[]; // Element array
    private int max;
    private int front;      // The index of the first item in the queue
    private int rear;       // The index where the next new item will go

    // Create a queue with the given initail capacity
    public ArrayQueue(int size){
        max = size;
        array = new Object[size];
        front = 0;
        rear = 0;
    }

    public ArrayQueue(){
        //Use default capacity of 100
        this(100);
    }

    /* Return true if the queue is empty */
    public boolean isEmpty(){
        return (front == rear);
    }

    public boolean isFull(){
        return(size() == max-1);
    }

    /* Returns the number of elements in collection */
    public int size(){
        if(front > rear){
            return rear + max - front;
        }
        else{
            return rear - front; 
        }
    }

    /* Return the front elements of queue */
    public Object front(){
        if(isEmpty()){
            throw new QueueEmptyException();
        }
        return array[front];
    }

    public void enQueue(Object item) throws QueueFullException{
        if(isFull()){
            throw new QueueFullException();
        }
        array[rear] = item;
        rear = (rear+1) % max;
    }

    public Object deQueue() throws QueueEmptyException{
        Object item = null;
        if(isEmpty()){
            throw new QueueEmptyException();
        }
        item =array[front];
        front = (front+1)%max;
        return item;
    }

    // Helpful for debugging
    public String toString(){
        String s = "[";
        for(int i = 0; i < size(); i++){
            s +=array[(front + i) % max] + " ";
        }
        return s + "]";
    }
}