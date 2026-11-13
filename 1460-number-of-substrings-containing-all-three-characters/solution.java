class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        /*
        for(int i=0;i<s.length();i++){
            ArrayList<Character> arr=new ArrayList<>();
            for(int j=i;j<s.length();j++){
                arr.add(s.charAt(j));
                if(arr.contains('a')
                && arr.contains('b')
                && arr.contains('c')){
                    c++;
                }
            }
        }
        */
        int [] arr={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                c=c+(1+Math.min(arr[0],Math.min(arr[1],arr[2])));
            }
        }
        return c;

        
    }
}
