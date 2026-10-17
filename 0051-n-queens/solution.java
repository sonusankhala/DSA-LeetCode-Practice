class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans=new ArrayList<>();
        char [][] board=new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        boolean [] left=new boolean [n];
        boolean [] leftup=new boolean [2*n-1];
        boolean [] leftbot=new boolean [2*n-1];
        solveup(0,n,board,left,leftup,leftbot,ans);
        return ans;
        
    }

    public void solveup(int row, int n,char [][] board,boolean [] left,boolean [] leftup,boolean [] leftbot,List<List<String>> ans ){

        if(row==n){
            List<String> str=new ArrayList<>();
            for(int j=0;j<n;j++){
                str.add(new String(board[j]));
            }
            ans.add(str);
            return;
        }

        for(int col=0;col<n;col++){
            int d1=row-col+n-1;
            int d2=row+col;
            if(!left[col] && !leftup[d1] && !leftbot[d2]){
                left[col] =leftup[d1] =leftbot[d2]=true;
                board[row][col]='Q';
                solveup(row+1,n,board,left,leftup,leftbot,ans);
                left[col] =leftup[d1] =leftbot[d2]=false;
                board[row][col]='.';

            }
        }
    }
}
