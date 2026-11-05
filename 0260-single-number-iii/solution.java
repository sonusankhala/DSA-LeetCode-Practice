class Solution {
    public int[] singleNumber(int[] nums) {
        int x=0;
        for(int i:nums){
            x^=i;
        }
        int lsb=x&(x-1)^x;
        int a=0,b=0;
        for(int n:nums){
            if((n&lsb)!=0){
                a^=n;
            }else{
                b^=n;
            }
        }
        return new int[] {a,b};
        
    }
}
