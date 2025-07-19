// import java.util.*;
class binarySearchUsingRecurrsion {
  public static  int BinarySearch(int[] arr, int target, int i, int j){
    if(i > j){
      return -1;
    }
    int mid = (i + j)/2;
    if(arr[mid] == target){
      return mid;
    }
    else if(arr[mid] > target){
      return BinarySearch(arr, target, i , mid - 1);
    }
    else{
      return BinarySearch(arr, target, mid + 1 , j);
    }
  }
  public static void main(String[] args) {
    int[] arr = {2,6,7,8,9,11,14,19,25,28};
    int target = 6;
    int i = 0;
    int j = arr.length - 1;
    int result = BinarySearch(arr, target, i , j);
    if (result != -1)
      System.out.println("Index of the target value is " + result);
    else
      System.out.println("Target not found in the array.");
  }
}
