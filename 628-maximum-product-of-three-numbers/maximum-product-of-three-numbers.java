class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=0;

        int prod=nums[n-1]*nums[n-2]*nums[n-3];
        int prod1= nums[0]*nums[1]*nums[n-1];
        max=Math.max(prod,prod1);

        return max;
        


        
    }
}