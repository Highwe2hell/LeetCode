public class _1342 {
    // 将数字变成 0 的操作次数
    public static int numberOfSteps(int num) {
        int n = 0;
        for (int i = 1; ; i++) {
            if (num % 2 != 0) {
                num = num - 1;
            } else if (num == 0) {
                break;
            } else {
                num = num / 2;
            }
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        int num = 8;
        int res = numberOfSteps(num);
        System.out.println(res);
    }
}
