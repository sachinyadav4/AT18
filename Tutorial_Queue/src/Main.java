import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Queue<Integer> q = new ArrayBlockingQueue<Integer>(3);

       q.add(10);
       q.add(20);
       q.add(30);

       try {
           q.add(40);
       } catch(IllegalStateException e) {
           System.out.println("Tried to add to many items in the queue");
       }

       for(Integer i:q)
           System.out.println(i);
        System.out.println("Queue: " + q);
       int removedValue = q.remove();
        System.out.println("Removed value: " + removedValue);
        System.out.println(q);


    }
}