import java.lang.*;
import java.util.*;

public class Pattern2 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t Enter Pattern Limit Number : ");
        int no = sc.nextInt();

        for(int i=1; i<=no; i++){

            for(int j=1; j<=i; j++){

                System.out.print("\t* ");
            }
            System.out.println("\n");
        }
    }
    
}
