import java.lang.*;
import java.util.*;

public class SumOfDigits{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int count = 1;

        System.out.print("\n\t Enter Number : ");
        int no = sc.nextInt();
        int temp = no;

        int sum = 0, lastDigit = 0;

        while(no!=0){
            lastDigit = no %10;
            sum = sum + (lastDigit);
            no = no / 10;
        }

        System.out.println("\n Sum of Digit of "+temp +" is : "+sum+"\n");
    }
    
}