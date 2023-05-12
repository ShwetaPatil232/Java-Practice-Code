import java.lang.*;
import java.util.*;

public class Pattern6 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t Enter Pattern Limit Number : ");
        int no = sc.nextInt();

        for(int i=1; i<=no; i++){

            // Print Spaces 
            for(int k = 0; k< (no - i);k++){
                System.out.print("\t ");
            }

            //Print *
            for(int j=1; j<=i; j++){

                System.out.print("* \t\t");
            }
            System.out.println("\n");
        }
    }
    
}
