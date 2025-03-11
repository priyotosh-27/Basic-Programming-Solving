import java.util.Arrays;
class Triplet_Sum_In_Arr {
    public static boolean hasTripletSum(int arr[], int target) {
        int sum;
        int j, k;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            j = i + 1;
            k = arr.length - 1;
            while(j < k){
                sum =arr[i] + arr[j] + arr[k];
                if(sum == target){
                    return true;
                }
                else if(sum > target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(hasTripletSum(arr, target));
    }
}
