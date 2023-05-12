import java.lang.*;
import java.util.Scanner;
import java.util.Scanner.*;

public class SimpleInterest {
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Priciple Amount : ");
        int p = sc.nextInt();
        System.out.print("\n Enter Rate of Interest : ");
        int r = sc.nextInt();
        System.out.print("\n Enter Time Duration : ");
        int t = sc.nextInt();

        double si = (p*r*t)/100;

        System.out.println("\n\n Simple Interet is : "+si+"\n");
        
    }
}
