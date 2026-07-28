package Leetcode;

import java.util.ArrayList;

public class FirstLastOfTarget {

    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }

        if (ans.size() == 0) {
            return new int[]{-1, -1};
        }

        int first = ans.get(0);
        int last = ans.get(ans.size() - 1);

        return new int[]{first, last};
    }
}