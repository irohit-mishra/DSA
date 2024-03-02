import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class pQueue{
    public static void main(String[] args) {
        //Priority queue doesn't follow FIFO instead it serves element
        //based on their priorities
        Queue<Double> myQueue = new PriorityQueue<>(/*Collections.reverseOrder()*/);
        //here collection.reverseorder will reverse the order of element

        myQueue.add(3.0);
        myQueue.add(1.4);
        myQueue.add(2.5);
        myQueue.add(5.0);
        myQueue.add(1.0);

        while(!myQueue.isEmpty()){
            System.out.println(myQueue.poll());
        }

    }
}