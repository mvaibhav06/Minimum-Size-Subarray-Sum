class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int out = Integer.MAX_VALUE;

        while(i<=j && j< nums.length){
            sum += nums[j++];

            if(sum >= target){
                while(sum >= target){
                    out = Math.min(out, j-i);
                    sum -= nums[i];
                    i++;
                }
            }
        }
        if (sum >= target){
            out = Math.min(out,j-i);
        }
        return out==Integer.MAX_VALUE ? 0 : out;
    }
}
