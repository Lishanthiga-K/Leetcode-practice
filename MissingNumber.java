class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,sum=0,sum1=0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        for(int i=0;i<n;i++){
            sum1 += nums[i];
        }
         return sum-sum1;
    }
}
