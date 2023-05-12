import java.lang.*;

public class Program3 {
    
    public static void main(String args[]){

        // 1) Automatic type casting (int ----> float ) (small size data type to ------> large size data type)
        byte a = 15;
        short b = a; 

        // 2) Manual type casting (float ---> int)   (large size data type to ------> small size data type)
        float c =  45.23f;
        int d = (int ) c;

        System.out.println("\n 1) BYTE "+a+"\n");
        System.out.println("\n 1) SHORT "+b+"\n");
        System.out.println("\n 1) FLOAT "+c+"\n");
        System.out.println("\n 1) INTEGER "+d+"\n");

    }
}
