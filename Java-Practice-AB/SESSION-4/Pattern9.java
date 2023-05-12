import java.lang.*;
import java.util.*;

public class Pattern9{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int count = 1;

        System.out.print("\n\t Enter Pattern Limit Number : ");
        int no = sc.nextInt();

        // PART 1
        for(int i=1; i<=no; i++){
        
            for(int j=1; j<=i; j++){
                
                if(j == 1 || j == i || i == no){
                    System.out.print("\t* ");
                }
                else{
                    System.out.print("\t  ");
                }
            }
            System.out.println("\n ");
        }
    }
    
}
