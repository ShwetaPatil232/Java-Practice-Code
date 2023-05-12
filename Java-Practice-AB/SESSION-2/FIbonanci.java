import java.lang.*;
import java.util.*;


public class FIbonanci {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Total Number : ");
        int no = sc.nextInt();

        int a= 0, b= 1, c;
        System.out.print("\t "+a);
        System.out.print("\t "+b);

        for(int i = 1; i <= no-2; i++){
                c = a+b;
                a = b;
                b = c;
                System.out.print("\t "+c);
        }

        System.out.println("\n\n");
    }
}
