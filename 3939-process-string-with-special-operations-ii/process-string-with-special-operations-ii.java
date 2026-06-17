class Solution {
    public char processStr(String s, long k) {
        int n=s.length();
        long[] lens=new long[n];
        long currlen=0;
         int i=0;

        for(char c:s.toCharArray())
        {
            if(c=='*')
            {
               currlen=Math.max(0,currlen-1); 
            }
            else if(c=='#')
            {
                currlen*=2;
            }
            else if(c=='%')
            {
                
            }
            else
            {
                currlen+=1;
            }
            lens[i]=currlen;
            i+=1;
        }

        if (k >= lens[n - 1]) {
            return '.';
        }
        
        for(int j=n-1;j>=0;j--)
        {
            char c=s.charAt(j);
            long currl=lens[j];
            long prevl;
            if(j==0)
            {
               prevl=0;
            }
            else
            {
               prevl=lens[j-1];
            }

            if(c=='*')
            {
                continue;
            }
            else if(c=='#')
            {
                if(k>=prevl)
                {
                    k-=prevl;
                }
            }
            else if(c=='%')
            {
                k=currl-1-k;
            }
            else
            {
                if(k==currl-1)
                {
                    return c;
                }
            }
        }

        return '.';

    }
}