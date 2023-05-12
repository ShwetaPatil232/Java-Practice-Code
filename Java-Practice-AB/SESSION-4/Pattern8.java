import java.lang.*;
import java.util.*;

public class Pattern8 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int count = 1;

        System.out.print("\n\t Enter Pattern Limit Number : ");
        int no = sc.nextInt();

        // PART 1
        for(int i=1; i<=no; i++){
        
            for(int j=1; j<=i; j++){
                System.out.print("\t* ");
            }
            System.out.println("\n ");
        }
        // PART 2
        for(int i=(no-1); i>=1; i--){
        
            for(int j=1; j<=i; j++){
                System.out.print("\t* ");
            }
            System.out.println("\n ");
        }
    }
    
}
