class Solution {
    public boolean isValid(String s) {

        if(s.length()==0){
            return true;
        }
        String next=s.replace("()","").replace("{}","").replace("[]","");
        if(s.equals(next)){
            return false;
        }

        return isValid(next);
        
    }
}
