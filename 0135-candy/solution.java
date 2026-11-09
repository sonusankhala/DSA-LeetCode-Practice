class Solution {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) return 0;
        int sum=1; int i=1;
        int n=ratings.length;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum++;
                i++;
                continue;
            }
            int peek=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peek++;
                sum+=peek;
                //peek++;
                i++;
            }
            int down=0;
            while(i<n && ratings[i]<ratings[i-1]){
                down++;
                sum+=down;
                //down++;
                i++;
            }
            down++;
            if(down>peek){
                sum+=down-peek;
            }
        }
        return sum;
        
    }
}
