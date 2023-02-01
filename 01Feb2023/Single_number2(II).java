class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int sum=0;
        int resultsum=0;
        for(int i=0;i<len;i++){
            sum=sum+nums[i];
        }
        for(int j=0;j<len-1;j++){
            if(nums[j]==nums[j+1]){
                resultsum=resultsum+nums[j];
            }
        }
        return sum-(3*(resultsum/2));
    }
}
