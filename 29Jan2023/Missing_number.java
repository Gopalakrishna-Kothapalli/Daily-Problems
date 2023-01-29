class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        int l=nums.length+1;
        int h=l*(l-1);
        int g=h/2;


            for(int i=0;i<nums.length;i++){
               k=k+nums[i];

                
            }
        return g-k;
    }
}
Console
