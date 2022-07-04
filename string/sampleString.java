public class sampleString {
        public static void main(String[] args) {
            String s1 = "Hello world123";
            String s2 = new String("Hello world!1");

            System.out.println(s1);
            System.out.println(s2);

            for(int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if(Character.isUpperCase(c)) {
                    System.out.println(c + " ");
                }
                if(Character.isLowerCase(c)) {
                    System.out.print(c + " ");
                }
                if(Character.isDigit(c)) {
                    System.out.print(c + " ");
                }
            }
        }
}
