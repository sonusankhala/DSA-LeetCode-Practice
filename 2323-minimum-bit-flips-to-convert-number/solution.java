class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        return countSetBit(ans);
    }

    int countSetBit(int n){
       int c=0;
       while(n!=0){
        c+=n&1;
        n=n>>1;
       }
       return c;
    }
}
