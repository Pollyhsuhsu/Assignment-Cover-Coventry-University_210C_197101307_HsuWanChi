package week4;

/**
 * Advanced Exercises - Week 4 - No.6 - SimBusStop
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

public class SimBusStop {

    public static void main(String[] args) {
        //    ListQueue t = new ListQueue();
        ArrayQueue t = new ArrayQueue(50);
        int code, time, count;  
        Integer item;  
        int totalPeople = 0;  
        int totalBus = 0;  
        int totalVacantSeat = 0;  
        int outstandingWait = 0;  
        int people = 0;  
        int wait = 0;

        do {
            code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
        } while (code < -1 || code > 1);

        int lastTime = 0;

        while (code!=-1) {
            do {
                time = SimpleInput.getInteger("Arrival time (>="+Integer.toString(lastTime)+"): ");
            } while (lastTime > time);

            lastTime = time;

            do {
                count = SimpleInput.getInteger("Arrival count (> 0): ");
            } while (count <= 0);

            // output the triplet (for checking)  
            System.out.println(code + "  " + time + "  " + count);
            
            if (code==0) {
                totalPeople += count;
                while (count-- > 0)
                    t.enQueue (new Integer(time));
            }
            else if (code==1) {
                totalBus ++;
                while ( (count-- > 0) && !t.isEmpty ()){
                    item = (Integer) t.deQueue ();
                    wait += time - item.intValue();
                    people++;
                    count--;
                }
                totalVacantSeat += count;  
            }

            do {
                code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
            } while (code < -1 || code > 1);
        }
        // check # of people got on a bue
        if (people!=0){// some people got on the bus
            System.out.println (people + " people waited for " +
                wait + " minutes, average waiting time = " +
                (float) wait/people + " minutes.");
        }else {  // no one got on the bus  
            System.out.println ("0 people go on the bus.");  
        } 
        
        // check # o buses passed the bus stop
        if (totalBus != 0) {    // some buses did pass the bus stop  
            System.out.println ("Number of buses passed the bus stop = " + totalBus);  
            System.out.println ("Average number of people got on a bus = " +  
                (float) people/totalBus);  
            System.out.println ("Average number of vacant seats for a bus = " +  
                (float) totalVacantSeat / totalBus );  
        } else {  // no bus passed the bus stop  
            System.out.println("0 bus passed the bus stop.");  
        }  
        
        // check # of people still waiting at the bus stop  
        System.out.print ("Number of people still waiting = " +  
            (totalPeople - people)  );  
        if (!t.isEmpty()) {  
            while (!t.isEmpty ()) {  
                item = (Integer) t.deQueue ();  
                outstandingWait += lastTime - item.intValue();  
            }  
            System.out.println(" with average waiting time = " +  
                (float) outstandingWait / (totalPeople - people) + " minutes");  
        }  
        else {  
            System.out.println(" with average waiting time = 0.0 minute");  
        }  

        System.exit(0);  

    } // main

} // class SimBusStop