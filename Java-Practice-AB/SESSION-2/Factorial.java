import java.lang.*;
import java.util.*;

public class Factorial {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Number :");
        int no = sc.nextInt();

        int fact = 1 ;

        for(int i = 1;i<=no; i++){
            fact = fact * i;
        }

        System.out.println("\n Factorial of "+no+" is : "+fact+"\n");
    }
    
}
