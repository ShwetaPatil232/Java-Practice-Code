import java.lang.*;
import java.util.*;

public class Pair< X, Y> {

    X x;
    Y y;

    public Pair(X x, Y y){

        this.x = x;
        this.y = y;
    }

    public void printPair(){

        System.out.println("\n 1) 1st Value of Pair is : "+x);
        System.out.println("\n 2) 2nd Value of Pair is : "+y);
    }
    

}
