public class sampleRecursion{
    public static void printF(){
        System.out.println("F");
        printF(); 
    }
    // Tinh giai thuathuaa
   public static int giaiThua(int n){
    if(n == 0)  return 1;
    return n * giaiThua(n - 1);
   }

   // Fibonacci
   public static int fibo(int n){
    if(n == 0 || n == 1) return 1;
    return fibo(n - 1) + fibo(n - 2);
   }
    public static void main(String[] args) {
        // printF();
        // System.out.println(giaiThua(1));
        // System.out.println(giaiThua(2));
        // System.out.println(giaiThua(3));
        // System.out.println(giaiThua(4));
        // System.out.println(giaiThua(5));
        System.out.println(fibo(1));
        System.out.println(fibo(2));
        System.out.println(fibo(3));
        System.out.println(fibo(4));
        System.out.println(fibo(5));
    }
}