public class _1295_Find_Numbers_with_Even {
    public static int demKiTu(int number){
        int soPhanTu = 0;
        int kq = number;
        while(number != 0){
            kq = number / 10;
            number = kq;
            soPhanTu++;
        }

        return soPhanTu;
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int a : nums){
            int soLuong = demKiTu(a);
            if(soLuong % 2 == 0) count++;
        }
        return count;
    }
    
    
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
