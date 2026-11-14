class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        return countSubLess(nums,goal)-countSubLess(nums,goal-1);
    }

        
        /*
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal){
                    c++;
                }

            }
        }
        */
    int countSubLess(int nums[],int goal){
        int c=0;
        int l=0,r=0,sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal && l<=r){
                sum-=nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}
