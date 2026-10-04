package Leetcode_Stack_Queues;

import java.util.Stack;

public class SumOfSubArrayMin {

    public int sumSubarrayMins(int[] arr) {
        long mod = 1_000_000_007L;
        long answer = 0;

        int n = arr.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {

            int current = (i == n) ? Integer.MIN_VALUE : arr[i];

            while (!stack.isEmpty() && arr[stack.peek()] > current) {

                int mid = stack.pop();

                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long leftCount = mid - left;
                long rightCount = right - mid;

                answer = (answer
                        + (long) arr[mid] * leftCount * rightCount) % mod;
            }

            stack.push(i);
        }

        return (int) answer;
    }
}