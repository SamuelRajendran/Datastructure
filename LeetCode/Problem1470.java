package LeetCode;

public class Problem1470 {
    /*

    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    */
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] arr=new int[nums.length];
            for(int i=0;i<n;i++){
                arr[2*i]=nums[i];
                arr[2*i+1]=nums[i+n];
            }
            return arr;
        }
    }
}
