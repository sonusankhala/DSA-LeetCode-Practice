class Solution {
    public int jump(int[] nums) {
        int l=0, r=0, n=nums.length;
        int jump=0;
        while(r<n-1){
            int far=0;
            for(int i=l;i<=r;i++){
                far=Math.max(i+nums[i],far);
            }
            l=r+1;
            r=far;
            jump++;
        }
        return jump;
        
    }
}
