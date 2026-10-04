package Leetcode_Stack_Queues;

import java.util.Stack;

public class SumOfSubArrayRanges {


        public long subArrayRanges(int[] nums) {
            return sumOfMaximums(nums) - sumOfMinimums(nums);
        }

        private long sumOfMaximums(int[] nums) {
            int n = nums.length;
            long sum = 0;

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i <= n; i++) {

                int current = (i == n) ? Integer.MAX_VALUE : nums[i];

                while (!stack.isEmpty() && nums[stack.peek()] < current) {

                    int mid = stack.pop();

                    int left = stack.isEmpty() ? -1 : stack.peek();
                    int right = i;

                    long leftCount = mid - left;
                    long rightCount = right - mid;

                    sum += (long) nums[mid] * leftCount * rightCount;
                }

                if (i < n) {
                    stack.push(i);
                }
            }

            return sum;
        }

        private long sumOfMinimums(int[] nums) {
            int n = nums.length;
            long sum = 0;

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i <= n; i++) {

                int current = (i == n) ? Integer.MIN_VALUE : nums[i];

                while (!stack.isEmpty() && nums[stack.peek()] > current) {

                    int mid = stack.pop();

                    int left = stack.isEmpty() ? -1 : stack.peek();
                    int right = i;

                    long leftCount = mid - left;
                    long rightCount = right - mid;

                    sum += (long) nums[mid] * leftCount * rightCount;
                }

                if (i < n) {
                    stack.push(i);
                }
            }

            return sum;
        }
    }

