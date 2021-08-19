package com.company;

class Solution {
    public int findDuplicate(int[] nums) {
        int low=1,high=nums.length-1;
        int dupli=-1;

        while(low<=high){
            int cur = (low+high)/2;

            int count=0;
            for(int num : nums){
                if(num <= cur) count++;
            }

            if(count>cur){
                dupli = cur;
                high=cur-1;
            } else {
                low=cur+1;
            }

        }

        return dupli;
    }
}