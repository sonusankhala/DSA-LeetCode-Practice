class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(x,y)-> Integer.compare(x[1],y[1]));
        
        int c=1;
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=end){
                c++;
                end=intervals[i][1];
            }
        }
        return intervals.length-c;
        
    }
}
