class Solution {
    public boolean increasingTriplet(int[] nums) {

        int first=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        int third=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int ele=nums[i];
            if(first>=ele)
            {
                first=ele;
            }else if(sec>=ele){
                sec= ele;
            }else{
                third=ele;
                return true;
            }
        }
        return false;
        
    }
}
