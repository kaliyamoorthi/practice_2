package ssearchingsorting;

import java.util.Arrays;

public class RecBinarySearch{
   static int rec_bin_search(int my_arr[], int left, int right, int x){
      if (right >= left){
         int mid = left + (right - left) / 2;
         if (my_arr[mid] == x)
         return mid;
         else
         if (my_arr[mid] > x)
         return rec_bin_search(my_arr, left, mid - 1, x);
         else
         return rec_bin_search(my_arr, mid + 1, right, x);
      }
      return -1;
   }
   public static void main(String args[]){
      
      int my_arr[] = { 56, 78, 90, 32, 45, 99, 104};
      Arrays.sort(my_arr);
      int len = my_arr.length;
      int x = 90;
      int result = rec_bin_search(my_arr, 0, len - 1, x); //left=6, right=6, 104
      if (result == -1)
         System.out.println("The element is not present in the array");
      else
         System.out.println("The element has been found at index " + result);
   }
}

/*
rec(arr, 0,6, 104)
*/