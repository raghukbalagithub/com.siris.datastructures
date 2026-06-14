package datastructures.array;

/**
 * Problem Statement
 * Given a one-dimensional array of integers, create a new array that represents the running sum of the original array.
 *
 * The running sum at position i in the new array is calculated as the sum of all the numbers in the original array from
 * the 0th index up to the i-th index (inclusive).
 * Formally, the resulting array should be computed as follows: result[i] = sum(nums[0] + nums[1] + ... + nums[i])
 * for each i from 0 to the length of the array minus one.
 *
 * Examples
 * Example 1
 *
 * Input: [2, 3, 5, 1, 6]
 * Expected Output: [2, 5, 10, 11, 17]
 * Justification:
 * For i=0: 2
 * For i=1: 2 + 3 = 5
 * For i=2: 2 + 3 + 5 = 10
 * For i=3: 2 + 3 + 5 + 1 = 11
 * For i=4: 2 + 3 + 5 + 1 + 6 = 17
 *
 * Example 2
 *
 * Input: [1, 1, 1, 1, 1]
 * Expected Output: [1, 2, 3, 4, 5]
 * Justification: Each element is simply the sum of all preceding elements plus the current element.
 *
 * Example 3
 *
 * Input: [-1, 2, -3, 4, -5]
 * Expected Output: [-1, 1, -2, 2, -3]
 * Justification: Negative numbers are also summed up in the same manner as positive ones.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 */
public class DG_RunningSum_1DArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        if (nums.length == 0 || nums == null) {
            return new int[0];
        }

        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }

    public static void main(String args[]) {
        DG_RunningSum_1DArray obj = new DG_RunningSum_1DArray();
        //int[] input1 = {2, 3, 5, 1, 6}; //normal array
        int[] input1 = {2}; //single element
        //int[] input1 = {}; //empty array

        System.out.print("Input array input1: ");
        for (int num : input1) {
            System.out.print(num + " ");
        }

        System.out.println();
        int[] output1 = obj.runningSum(input1);
        System.out.print("Output array output1: ");
        for (int num : output1) {
            System.out.print(num + " ");
        }
    }
}

/**
 * Complexity Analysis
 * Time Complexity:
 * Single pass through the array: The algorithm uses a single loop to traverse the input array nums.
 * For each element, it calculates the running sum by adding the current element to the sum of the previous elements.
 * This loop runs for each element in the array, so it takes O(N) time, where N is the length of the input array.
 *
 * Overall time complexity: O(N), where N is the number of elements in the input array.
 *
 * Space Complexity:
 * Output array: The algorithm creates a new array result to store the running sum.
 * This array has the same length as the input array, so the space complexity for the result array is O(N),
 * where N is the number of elements in the input array.
 *
 * Additional variables: The algorithm uses a few extra variables (i), which take constant space, O(1).
 *
 * Overall space complexity: O(N), where N is the number of elements in the input array.
 */