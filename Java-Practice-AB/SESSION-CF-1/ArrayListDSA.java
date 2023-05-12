import java.lang.*;
import java.util.*;


public class ArrayListDSA{


    public static void main(String args[]){

        ArrayList<String> fruits = new ArrayList();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("\n Fruits ArrayList Elements : "+fruits+"\n");
        System.out.println("\n Fruits ArrayList Size : "+fruits.size()+"\n");
        System.out.println("\n Fruits ArrayList Contains Banana or not  : "+fruits.contains("Banana")+"\n");
        System.out.println("\n Fruits ArrayList isEmply or not   : "+fruits.isEmpty()+"\n");

    }
}