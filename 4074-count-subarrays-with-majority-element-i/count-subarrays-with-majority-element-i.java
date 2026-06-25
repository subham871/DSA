class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int targetCount=0;
        int totalValid=0;
        int currlen;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {   
            targetCount=0;
            for(int j=i;j<n;j++)
            {
                if(nums[j]==target)
                {
                    targetCount+=1;
                }  
                currlen=j-i+1;
                  if(2*targetCount>currlen)
                {
                    totalValid+=1; 
                } 

            }
            
        }

        return totalValid;
        
    }
}