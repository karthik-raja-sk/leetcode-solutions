class Solution {
    public int mostWordsFound(String[] sen) {
        int mx=0;
        for(String cs:sen){
            int cl=cs.split(" ").length;
            if(mx<cl){
                mx=cl;
            }
        }
        return mx;
    }
}