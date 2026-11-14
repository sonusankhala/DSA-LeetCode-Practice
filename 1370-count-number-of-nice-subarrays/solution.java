class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        return countSubLess(nums,goal)-countSubLess(nums,goal-1);
    }

    int countSubLess(int nums[],int goal){
        int c=0;
        int l=0,r=0,sum=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(sum>goal && l<=r){
                sum-=nums[l]%2;
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}
