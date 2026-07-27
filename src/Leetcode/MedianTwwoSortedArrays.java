package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MedianTwwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int num:nums1){
            ans.add(num);
        }
        for(int num:nums2){
            ans.add(num);
        }
        int n=ans.size();
        Collections.sort(ans);
        if(n%2 ==1){
            return ans.get(n/2);
        }
        else {
            return (ans.get(n/2-1)+ans.get(n/2))/2.0;
        }
    }
}