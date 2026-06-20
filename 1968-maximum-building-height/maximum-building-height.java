import java.util.Arrays;
class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        int m=restrictions.length;

        if(m==0)
        {
            return n-1;
        }

        Arrays.sort(restrictions,(a,b)->Integer.compare(a[0],b[0]));
        boolean isLast=restrictions[m-1][0]==n;
        int len=isLast?m+1:m+2;

        int[][] h=new int[len][2];

        h[0][0]=1;
        h[0][1]=0;

        for(int i=0;i<m;i++)
        {
            int diff=restrictions[i][0]-h[i][0];
            int ht=h[i][1]+diff;

            h[i+1][0]=restrictions[i][0];
            h[i+1][1]=Math.min(restrictions[i][1],ht);


        }

        if(!isLast)
        {
            int diff=n-h[m][0];
            int ht=h[m][1]+diff;

            h[len-1][0]=n;
            h[len-1][1]=ht;
        }

        for(int i=len-2;i>=0;i--)
        {
            int diff=h[i+1][0]-h[i][0];
            int ht=h[i+1][1]+diff;

            h[i][1]=Math.min(h[i][1],ht);
        }

        int ans=0;
        for(int i=1;i<len;i++)
        {
            int leftId=h[i-1][0];
            int rightId=h[i][0];

            int h1=h[i-1][1];
            int h2=h[i][1];

            int maxHeight=Math.max(h1, h2) + ((rightId - leftId) - Math.abs(h1 - h2)) / 2;
            ans=Math.max(ans,maxHeight);
        }

        return ans;

    }
}