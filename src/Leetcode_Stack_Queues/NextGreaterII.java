package Leetcode_Stack_Queues;

import java.util.Stack;

public class NextGreaterII {

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[index] = stack.peek();
            }

            stack.push(nums[index]);
        }

        return result;
    }
}