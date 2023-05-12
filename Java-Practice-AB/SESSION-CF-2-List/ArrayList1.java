import java.lang.*;
import java.util.*;


public class ArrayList1 {
    

    public static void main(String args[]){

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new LinkedList<>();
        List<Integer> c = new Vector<>();
        List<Integer> d = new Stack<>();

        for(int i=0; i<10; i++){

            a.add(0,i);
            b.add(i);
            c.add(i);
            d.add(i);
        }

        System.out.println("\n\t ArrayList Elements are : "+a+" \n\n");
        System.out.println("\n\t LinkedList Elements are : "+b+" \n\n");
        System.out.println("\n\t Vector Elements are : "+c+" \n\n");
        System.out.println("\n\t Stack Elements are : "+d+" \n\n");
    }
}
