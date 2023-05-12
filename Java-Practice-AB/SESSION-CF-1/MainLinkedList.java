import java.lang.*;
import java.util.*;

public class MainLinkedList {
    
    public static void main(String args[]){

        List<Integer> a = new LinkedList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new LinkedList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println("\n\t Linked List is : "+a+" \n\n");

        getTimeDiff(b);
        getTimeDiff(c);
 
    }

    static void getTimeDiff(List<Integer> list){

        long start = System.currentTimeMillis();

        for(int i=0; i<1000; i++){

            // list.add(i);
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(list.getClass().getName()+" -----> "+(end - start)+"\n");
    }
}
