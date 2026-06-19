class Solution {
    public int largestAltitude(int[] gain) {
        int mov=0;
        int res=0;
        
        for(int i:gain)
        {
           mov+=i;
           res=Math.max(res,mov);

        }
        return res;
        
    }
}