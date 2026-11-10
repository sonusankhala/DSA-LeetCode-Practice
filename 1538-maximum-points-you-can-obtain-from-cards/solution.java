class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0, n=cardPoints.length;
        int r=n-1, max=0, sum=0, count=0;
        while(l<=r && count<k){
            while(l<n && count<k){
                sum+=cardPoints[l];
                l++;
                count++;
                max=Math.max(max,sum);
            }
            l--;
            while(l>=0 && r>=0 && count==k){
                sum-=cardPoints[l];
                sum+=cardPoints[r];
                l--;
                r--;
                max=Math.max(max,sum);
            }
            if(count>=k){
                break;
            }
        }
        return max;
        
    }
}
