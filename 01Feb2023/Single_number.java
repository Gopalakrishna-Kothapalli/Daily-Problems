class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int result  =0;
        int sum=0;
        int resultsum=0;
        for(int k=0;k<len;k++){
            sum=sum+nums[k];
        }
            for(int i=0;i<nums.length-1;i++){
                   if(nums[i]==nums[i+1]){
                       resultsum=resultsum+nums[i];
                    }
                }
     return sum-(2*resultsum);
    }
}
