import java.util.*;

public class TwoInputsLC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input array with keeping space between two numbers: ");

        // Properly split input by whitespace
        String[] input = sc.nextLine().trim().split("\\s+");

        // Correct way to print the array
        System.out.println(Arrays.toString(input));

        sc.close();
    }
}
