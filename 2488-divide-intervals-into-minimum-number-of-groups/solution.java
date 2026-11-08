class Solution {
    public int minGroups(int[][] intervals) {
        int[] at=new int[intervals.length];
        int[] dt=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            at[i]=intervals[i][0];
            dt[i]=intervals[i][1];
        }
        Arrays.sort(at);
        Arrays.sort(dt);
        int i=0, j=0;
        int c=0, mc=0;
        while(i<intervals.length){
            if(at[i]<=dt[j]){
                c++;
                i++;
            }else{
                c--;
                j++;
            }
            mc=Math.max(mc,c);
        }
        return mc;
    }
}
