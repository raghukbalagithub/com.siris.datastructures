package datastructures.array;

/**
 * Problem Statement
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * Examples
 * Example 1:
 *
 * Input: nums= [1, 2, 3, 4]
 * Output: false
 * Explanation: There are no duplicates in the given array.
 *
 * Example 2:
 *
 * Input: nums= [1, 2, 3, 1]
 * Output: true
 * Explanation: '1' is repeating.
 *
 * Example 3:
 *
 * Input: nums= [3, 2, 6, -1, 2, 1]
 * Output: true
 * Explanation: '2' is repeating.
 *
 * Constraints:
 *
 * 1 <= nums.length <=
 * -10^9 <= nums[i] <= 10^9
 */

import java.util.HashSet;
import java.util.Set;

public class DG_CheckDuplicates_1DArray {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique_set = new HashSet<>(); // Use HashSet to store unique elements
        for (int x : nums) {
            if (!unique_set.add(x)) // If the set already contains the current element, return true
                return true;
        }
        return false; // Return false if no duplicates found
    }

    public static void main(String[] args) {
        DG_CheckDuplicates_1DArray solution = new DG_CheckDuplicates_1DArray();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums1)); // Expected output: false

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums2)); // Expected output: true

        int[] nums3 = {};
        System.out.println(solution.containsDuplicate(nums3)); // Expected output: false

        int[] nums4 = {3, 2, 6, -1, 2, 1};
        System.out.println(solution.containsDuplicate(nums4)); // Expected output: true
    }
}

/**
 * Complexity Analysis
 *
 * Time Complexity:
 * Loop through the array: The algorithm iterates over the array nums once. This gives a time complexity of O(N),
 * where N is the number of elements in the array.
 *
 * HashSet operations: For each element, the algorithm performs a HashSet.add() operation.
 * On average, adding or checking elements in a HashSet has a time complexity of O(1) due to its underlying hash table structure.
 *
 * Overall time complexity: O(N), where N is the number of elements in the array.
 *
 *
 * Space Complexity:
 * HashSet storage: The algorithm uses a HashSet to store unique elements. In the worst case, when all elements are unique, the HashSet will contain N elements.
 * This results in a space complexity of , where N is the number of unique elements in the array.
 * Overall space complexity: O(N)
 */