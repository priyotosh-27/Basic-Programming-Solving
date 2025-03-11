//https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Chocolate_Distribution {
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        if (m == 0 || arr.size() < m) return 0; 
        
        Collections.sort(arr); 
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.size() - m; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        int m = 5;
        System.out.println(findMinDiff(arr, m));
    }
}

