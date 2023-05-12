import java.lang.*;
import java.util.*;

public class Set1 {
    

    public static void main(String args[]){

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);


        b.add(10);
        b.add(60);
        b.add(30);
        b.add(80);
        b.add(50);

        System.out.println("\n\n\t Hashset A Elements : "+a+" \n\n");
        System.out.println("\n\n\t Hashset B Elements : "+b+" \n\n");
        System.out.println("\n\n\t Hashset A UNION B Elements : "+a.addAll(b)+" \n\n");
        System.out.println("\n\n\t Hashset A INTERSECTION B Elements : "+a.retainAll(b)+" \n\n");
        System.out.println("\n\n\t Hashset A SEUBSET B Elements : "+a.containsAll(b)+" \n\n");
    }
}
