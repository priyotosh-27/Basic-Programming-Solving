import java.util.Arrays;
public class MergeSortCode {
    public static void Merge(int[] arr, int i, int mid, int j){
        int l = i;
        int r = mid + 1;
        int nums[] = new int[arr.length];
        int k = l;
        while(l <= mid && r <= j){
            if(arr[l] <= arr[r]){
                nums[k++] = arr[l++];
            }
            else{
                nums[k++] = arr[r++];
            }
        }
        while(l <= mid){
            nums[k++] = arr[l++];
        }
        while(r <= j){
            nums[k++] = arr[r++];
        }

        for(int left = i; left <= j; left++){
            arr[left] = nums[left];
        }

    }
    public static void MergeSort(int[] arr, int i, int j){
        if(i < j){
            int mid = i + (j - i) / 2;
            MergeSort(arr, i, mid);
            MergeSort(arr, mid + 1, j);
            Merge(arr, i, mid, j);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 10, 15, 4, 6, 8};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        MergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
