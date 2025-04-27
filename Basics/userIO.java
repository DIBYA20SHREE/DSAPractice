import java.util.*;

public class userIO{
    public static void main(String arg [] ){

        //int sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);  // Create scanner object

        System.out.print("Enter a number: ");  // Ask user
        int number = sc.nextInt();  // Read user input

        //System.out.print("the inserted number:",sc);
        System.out.print("the inserted number:"+ number);

        sc.close();
    }
    
}