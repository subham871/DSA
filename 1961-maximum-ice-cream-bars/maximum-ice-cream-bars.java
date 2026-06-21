class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum=0;
        int count=0;
        Arrays.sort(costs);
        for(int i:costs)
        {
            sum+=i;
            if(sum<=coins)
            {
                count+=1;
            }
            else
            {
                break;
            }
        }

        return count;
    }
}