import java.util.Arrays;
class Longest_Consecutive_SubArr {
    public static int longestConsecutive(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int maxcount = 1;
        int count = 1;
        int i = 1;
        while (i < n) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else if (arr[i] != arr[i - 1]) {
                count = 1;
            }
            maxcount = Math.max(count, maxcount);
            i++;
        }
        return maxcount;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        int result = longestConsecutive(arr);
        System.out.println(result);
    }
}