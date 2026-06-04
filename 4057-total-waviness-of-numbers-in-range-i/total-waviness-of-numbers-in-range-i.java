class Solution {
    public int totalWaviness(int num1, int num2) {
        int total_waviness=0;

        for(int n=num1;n<=num2;n++)
        {
            if(n>99){
            String numstr=Integer.toString(n);
            
            for(int i=0;i<=numstr.length()-3;i++)
            {
                if(i<numstr.length()){
                char numchr1=numstr.charAt(i);
                char numchr2=numstr.charAt(i+1);
                char numchr3=numstr.charAt(i+2);
                if((numchr1<numchr2 && numchr2>numchr3) || (numchr1>numchr2 && numchr2<numchr3))
                {
                    total_waviness+=1;
                }
                }
            }
            }
        }

        return total_waviness;
    }
}