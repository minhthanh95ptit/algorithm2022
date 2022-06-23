public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len;) {
            if(nums[i] == val){
                for(int k = i + 1; k < len; k++) {
                    nums[k - 1] = nums[k];
                }
                 len--;
            } else {
                i++;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3; 
        removeElement(nums, val);
    }
}
