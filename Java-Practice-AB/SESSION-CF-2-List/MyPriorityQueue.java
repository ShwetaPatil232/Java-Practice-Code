import java.lang.*;
import java.util.*;


public class MyPriorityQueue {
    
    public static void main(String args[]){

        PriorityQueue<String> a = new PriorityQueue<>();

        a.add("Apple");
        a.add("Mango");
        a.add("Kiwi");
        a.add("Banana");

        System.out.println("\n\n\t Priority Queue Elements are : "+a);

        System.out.println("\n\t Priority Queue Elements are : "+a.remove());
        System.out.println("\n\t Priority Queue Elements are : "+a.remove());
        System.out.println("\n\t Priority Queue Elements are : "+a.remove());
        System.out.println("\n\t Priority Queue Elements are : "+a.remove());

        System.out.println("\n\n");
    }
}
