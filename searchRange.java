class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans={-1,-1};
        if(nums.length ==0){
            return ans;
        }

        ans[0] = firstOccure(nums,target);
        ans[1] = lastOccure(nums,target);

        return ans;
        
    }

    public int firstOccure(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;
        int ans=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid] == target){
                ans= mid;
                right=mid-1;
            }else if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans; 
    }

    public int lastOccure(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;
        int ans=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid] == target){
                ans= mid;
                left=mid+1;
            }else if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans; 
    }
}
