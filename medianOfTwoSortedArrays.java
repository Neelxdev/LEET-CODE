public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        int nums1[] = { 1, 2};
        int nums2[] = { 3, 4 };
        
        System.out.println((solution(nums1, nums2)));
    }
    
    static double solution(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int merged[] = new int[nums1.length+nums2.length];
        while (i < nums1.length || j < nums2.length) {
            int val1 = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
            int val2 = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;

            if (val1 < val2) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        if (merged.length % 2 == 0) {
            return (double)(merged[merged.length / 2 - 1] + merged[merged.length / 2]) / 2;
        }
        return (double)merged[merged.length / 2];

    }
}