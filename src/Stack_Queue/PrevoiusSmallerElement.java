package Stack_Queue;

import java.util.*;

public class PrevoiusSmallerElement {

    public int[] previousSmallers(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 2, 10, 8};

        PrevoiusSmallerElement obj = new PrevoiusSmallerElement();

        int[] result = obj.previousSmallers(nums);

        System.out.println(Arrays.toString(result));
    }
}

