import java.util.*;

public class TwoInputsLC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input array with keeping space between two numbers: ");

        // Step 1: Read and split input
        String[] inputStr = sc.nextLine().trim().split("\\s+");

        // Step 2: Convert String[] to int[]
        int[] input = new int[inputStr.length];
        for (int i = 0; i < inputStr.length; i++) {
            input[i] = Integer.parseInt(inputStr[i]);
        }

        // Step 3: Print the input array
        System.out.println("Input array will be: " + Arrays.toString(input));

        // Step 4: Take the target value
        System.out.print("What is your target value: ");
        int target = sc.nextInt();

        // Step 5: Call the twoSum function
        Solution nm = new Solution();
        int[] output = nm.twoSum(input, target);

        // Step 6: Print the result
        if (output.length == 2) {
            System.out.println("Indices found: " + Arrays.toString(output));
        } else {
            System.out.println("No two sum solution found.");
        }

        sc.close();
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int diff=0;
        

        for(int i=0; i<nums.length; i++){
            diff = target - nums[i];

            if(hm.containsKey(diff)){
                return new int[] {hm.get(diff),i};
            }
            else{
                hm.put(nums[i],i);
            }
        }

        return new int[]{};
    }
}