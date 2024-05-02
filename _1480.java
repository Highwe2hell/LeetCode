public class _1480 {
    // 一维数组的动态和
    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i] = arr[i] + nums[j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] arr = runningSum(nums);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
