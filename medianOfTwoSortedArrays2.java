import java.util.Arrays;

public class medianOfTwoSortedArrays2 {
    public static void main(String[] args) {
        int[] nums1 = { 2, 0, 1 };
        int[] nums2 = { 10, 5, 0, 8, 4, 9, -1 };
        System.out.println(solution(nums1, nums2));
    }

    static double solution(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        if (merged.length == 0) {
            return 0;
        }
        
        int j = 0;
        
        for (int i = 1; i < merged.length; i++) {
            
            if (merged[i] != merged[j]) {
                j++;
                merged[j] = merged[i];
            }
        }
        
        System.out.println(Arrays.toString(Arrays.copyOf(merged, j+1)));
        
        if ((j+1) % 2 == 0) {

            return (double)(merged[(j+1) / 2 - 1] + merged[(j+1) / 2]) / 2;
        }
        return (double)merged[(j+1) / 2];
    }
}
