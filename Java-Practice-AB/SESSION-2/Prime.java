import java.lang.*;
import java.util.*;


public class Prime{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter NUmber : ");
        int no = sc.nextInt();
        boolean flag = true;

        for(int i = 2; i< no; i++){

            if(no %i == 0){
                flag = false;
                break;
            }
        }

        if(flag==true){
            System.out.println("\n Prime NUmber \n");
        }
        else{
            System.out.println("\n NOT Prime NUmber \n");
        }
    }
}