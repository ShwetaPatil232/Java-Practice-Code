import java.lang.*;
import java.util.*;

public class PalindromeNUmber{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int count = 1;

        System.out.print("\n\t Enter Number : ");
        int no = sc.nextInt();
        int temp = no;

        int lastDigit = 0;
        int reverseNo = 0;

        while(no!=0){
            lastDigit = no %10;
            reverseNo = lastDigit + (reverseNo * 10);
            no = no / 10;
        }

        if(temp == reverseNo){
            System.out.println("\n Palindrome Number. \n");
        }
        else{
            System.out.println("\n NOT Palindrome Number. \n");

        }
    }
      
}
