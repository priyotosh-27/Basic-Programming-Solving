import java.util.Arrays;
class Median_Of_Matrix {
    static int median(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int k = 0;
        int[] arr = new int[n*m];
        for(int i = 0 ;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k] = mat[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        return arr[(n*m)/2];
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println(median(mat));
    }
}