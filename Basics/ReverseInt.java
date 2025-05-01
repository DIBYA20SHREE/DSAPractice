import java.util.*;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Solution rv = new Solution();
        int reversed = rv.reverse(number);

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

            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
        }
        return rev;
    }
}
