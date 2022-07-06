public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    static public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String s: word1){
            sb1.append(s);
        }

        for(String s: word2){
            sb2.append(s);
        }

        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
