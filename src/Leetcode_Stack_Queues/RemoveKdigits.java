package Leetcode_Stack_Queues;

public class RemoveKdigits {

    public String removeKdigits(String num, int k) {
        String current = num;

        for (int removal = 0; removal < k; removal++) {
            int removeIndex = current.length() - 1;

            for (int index = 0; index + 1 < current.length(); index++) {
                if (current.charAt(index) > current.charAt(index + 1)) {
                    removeIndex = index;
                    break;
                }
            }

            current = current.substring(0, removeIndex)
                    + current.substring(removeIndex + 1);
        }

        int start = 0;
        while (start < current.length() && current.charAt(start) == '0') {
            start++;
        }

        if (start == current.length()) {
            return "0";
        }

        return current.substring(start);
    }
}
