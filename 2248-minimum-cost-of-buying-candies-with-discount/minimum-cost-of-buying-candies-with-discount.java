class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        
        int i=0;
        int total=0;

        for(int j=cost.length-1;j>=0;j--)
        {
            i++;
            if(i%3!=0)
            {
                total+=cost[j];
            }
        }
        return total;
        
        
    }
}