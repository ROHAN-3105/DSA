class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int n=nums.length;
        int prod1=(nums[n-1]-1)*(nums[n-2]-1);
        int prod2= (nums[0]-1)*(nums[1]-1);
        max=Math.max(prod1,prod2);
        return max;

        
    }
}