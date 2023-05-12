import java.lang.*;
import java.util.*;


public class ArrayDequeue1 {

    public static void main(String args[]){

        ArrayDeque<Integer> a = new ArrayDeque<>();


        a.addFirst(30);
        a.addFirst(20);
        a.addFirst(10);

        System.out.println("\n\n 1) ArrayDequeue AddFirst : "+a);

        a.addLast(40);
        a.addLast(50);
        a.addLast(60);

        System.out.println("\n\n 1) ArrayDequeue AddFirst : "+a);

        a.push(70);
        a.push(80);
        a.push(90);

        System.out.println("\n\n 1) ArrayDequeue AddFirst : "+a);
    }
}
