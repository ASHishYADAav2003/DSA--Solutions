class Solution {
    public int singleNumber(int[] nums) {

        int result=0;
        for(int i=0; i < nums.length; i++){
            result = result ^ nums[i];
        }

        return result;

    }      //XOR removes all duplicate numbers because a ^ a = 0; therefore the only number left after XORing the entire array is the element that appears once.
}