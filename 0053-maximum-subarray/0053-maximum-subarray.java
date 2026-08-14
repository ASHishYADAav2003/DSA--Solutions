class Solution {
    public static int maxSubArray(int[] nums) {
      int maxsum=Integer.MIN_VALUE;
      int currentsum=0;

      for(int i=0;i<nums.length;i++)  {
        
         if(currentsum<0){
            currentsum=0;
        }

        currentsum = currentsum + nums[i];
        maxsum = Math.max(maxsum, currentsum);

       
        
      }
         
       return maxsum;// KADANE ALGORITHM

     }


}