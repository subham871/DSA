class Solution {
    public double angleClock(int hour, int minutes) {
        double a=Math.abs((30*hour)-(5.5*minutes));
        double b=360-Math.abs((30*hour)-(5.5*minutes));
        double angle=Math.min(a,b);

        return angle;
        
    }
}