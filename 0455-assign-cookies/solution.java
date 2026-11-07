class Solution {
    public int findContentChildren(int[] g, int[] s) {
       // Arrays.sort(g);
       // Arrays.sort(s);
        Thread t1 = new Thread(() -> Arrays.sort(g));
        Thread t2 = new Thread(() -> Arrays.sort(s));
        // Arrays.sort(g);
        // Arrays.sort(s);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){}
        int l=0;
        int m=g.length;
        int n=s.length;
        int r=0;
        while(r<m && l<n){
            if(g[r]<=s[l]){
                r++;
            }
            l++;
        }
        return r;
        
    }
}
