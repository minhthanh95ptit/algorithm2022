public class _27_Remove_Element_2 {
    public static int removeElement(int[] arr, int val) {
        int k = 0;
      for(int i = 0; i < arr.length; i++) {
        if(arr[i] != val){
            arr[k] = arr[i];
            k++;
        }
      }
      return k;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3; 
        removeElement(nums, val);
        System.out.println("Done!");
    }
}
