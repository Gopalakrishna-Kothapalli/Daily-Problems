class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int k =0;
        double r1=0;
        for(int i =0;i<nums1.length;i++) {
            arr[k++] =nums1[i];
        }
        for(int i =0;i<nums2.length;i++) {
            arr[k++] =nums2[i];
        }
        Arrays.sort(arr);
        int mid = arr.length/2;
        if(arr.length%2==0) {
           return (double) (arr[mid-1] + arr[mid])/2;
        } 
        return arr[mid];
    }
}
