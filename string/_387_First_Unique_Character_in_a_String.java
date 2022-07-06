
public class _387_First_Unique_Character_in_a_String {
    // Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
    static public int firstUniqChar(String s) {
        int result = -1;
        // init new array
        int[] counterArray = new int[125];

        // alogrithm array count
        for(int i = 0; i < s.length(); i++){
            counterArray[s.charAt(i)]++;
        }

        // loop old array, get counter of element, if = 1 return ... else countinue loop
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i);
            if(counterArray[index] == 1){
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
