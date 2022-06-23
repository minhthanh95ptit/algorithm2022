public class _88_Merge_Sorted_Array {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2,n);
    }

    private static void chen(int ai, int nums1[], int m) {
        boolean isChecked = false;
        for(int k = 0; k < m; k++) {
            if(ai < nums1[k]) {
                isChecked = true;
                for(int i = m - 1; i >= k; i--) {
                    nums1[i+1] = nums1[i];
                }
                nums1[k] = ai;
                break;
            }
        }

        if(!isChecked){
            nums1[m] = ai;
        }
        
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int ai : nums2) {
            chen(ai, nums1, m);
            m++;
       }
    }
}