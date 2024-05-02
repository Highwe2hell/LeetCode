public class _1672 {
    // 最富有客户的资产总量
    public static int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        int ros = accounts.length;// 行
        int col = accounts[0].length;// 列
        int[] arr = new int[ros];
        for (int i = 0; i < ros; i++) {
            for (int j = 0; j < col; j++) {
                arr[i] = arr[i] + accounts[i][j];
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts));
    }
}
