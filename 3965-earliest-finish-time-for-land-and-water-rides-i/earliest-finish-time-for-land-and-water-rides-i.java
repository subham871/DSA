class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int earliest=Integer.MAX_VALUE;
        int lf1,ws1,wf1,wf2,ls2,lf2;

        for(int i=0;i<=landStartTime.length-1;i++)
        {
            for(int j=0;j<=waterStartTime.length-1;j++)
            {
                //1. land to water
                lf1=landStartTime[i]+landDuration[i];
                ws1=Math.max(lf1,waterStartTime[j]);
                wf1=ws1+waterDuration[j];

                //2. water to land
                wf2=waterStartTime[j]+waterDuration[j];
                ls2=Math.max(wf2,landStartTime[i]);
                lf2=ls2+landDuration[i];

                earliest=Math.min(earliest,Math.min(wf1,lf2));

                
            }
        }


        return earliest;


    }
}