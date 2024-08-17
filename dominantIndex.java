class Solution {
    public int dominantIndex(int[] nums) {

        int max= -1;
        int smax= -1;
        int maxidx=0;

        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                smax=max;
                max=nums[i];
                maxidx=i;
            }else if(smax < nums[i]){
                smax=nums[i];
            }
        }

        if(smax *2 <= max){
            return maxidx;
        }else{
            return -1;
        }
    }
}
