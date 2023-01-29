class Solution {
    public int[] moveZeroes(int[] nums) {
        int k=0;
        int x=nums.length;
        for(int i=0;i<x;i++){
            if(nums[i]!= 0){
                nums[k]=nums[i];
                k=k+1;

            }
        }
        while(k<x){
            nums[k]=0;
            k=k+1;
        }
        return nums;

    }
}
