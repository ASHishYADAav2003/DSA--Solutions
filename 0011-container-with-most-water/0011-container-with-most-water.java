
class Solution {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length - 1;

        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int currentWater = ht * width;

            maxWater = Math.max(maxWater, currentWater);

            // update pointer
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    
    
}
