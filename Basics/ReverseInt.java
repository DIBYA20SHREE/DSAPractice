import java.util.*;  // Correct import

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");  // Ask user
        int number = sc.nextInt(); // Input the integer

        Solution rv = new Solution(); // Create object of Solution class
        int reversed = rv.reverse(number); // Call the reverse method and pass the number

        //System.out.println(reversed); // Print the result
        System.out.println(String.valueOf(reversed));


        sc.close();
    }
}

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before multiplying
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
        }
        return rev;
    }
}
