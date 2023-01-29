class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        int k=0;
        int i=0;
        while(i+1<len){
            if(nums[i]==nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
                i=i+1;
            }
            else{
                i=i+1;
            }
        }
        for(int j=0;j<len;j++){
            if(nums[j]!=0){
                nums[k]=nums[j];
                k=k+1;
            }
        }
        while(k<len){
            nums[k]=0;
            k=k+1;
        }
        return nums;
    }
}
