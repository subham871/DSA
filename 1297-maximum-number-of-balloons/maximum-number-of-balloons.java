class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] frq=new int[126];
        int len=text.length();
        int result=Integer.MAX_VALUE;
        String a="balloon";

        for(int i=0;i<len;i++)
        {
            char c=text.charAt(i);
            frq[c]+=1;
        }

        if(frq['l']>=2)
        {
            frq['l']=frq['l']/2;
        }
        else
        {
             frq['l']=0;
        }
         if(frq['o']>=2)
        {
            frq['o']=frq['o']/2;
        }
        else
        {
             frq['o']=0;
        }
        for(char c:a.toCharArray())
        {
            result=Math.min(result,frq[c]);
        }
        return result;


        

        
    }
}