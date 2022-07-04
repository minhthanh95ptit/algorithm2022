public class _1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int [][]accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int result = maximumWealth(accounts);
        System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts) {
       int maxWealth = 0;
        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
