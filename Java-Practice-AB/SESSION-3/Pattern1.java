import java.lang.*;
import java.util.*;

public class Pattern1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t Enter Pattern Limit Number : ");
        int no = sc.nextInt();

        for(int i=0; i<no; i++){

            for(int j=0; j<no; j++){

                System.out.print("\t* ");
            }
            System.out.println("\n");
        }
    }
    
}
