class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;//it return true if count=1 or [ count<1 means 0 ]
                        // example 1 =[3,4,5,1,2] me 5 and 1 par count 0 se 1 hua  then uske baad 
                        //last tak count = 1 raha
    }
}