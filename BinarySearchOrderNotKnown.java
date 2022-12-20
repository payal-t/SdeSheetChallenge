/*  Given a sorted array of numbers, find if a given number key is present in the array.
    Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order.

Example 1:

Input: [2, 8, 11, 19], key = 11
Output: 2

Example 2:

Input: [32, 28, 17, 9, 3], key = 9
Output: 3


*/

/*Here,we need to identify whether the array is sorted in ascending order or descending order to make the 
  decision about whether to continue the search in the lower half of the array or the upper half of the array.
	Just like binary search,we initialize two variables start and end that define
	our search space. Initially start=0 and end=n-1.

1)We first compare the key with the middle element
2)If the array is sorted in ascending order and the key is less than the middle element OR the array is sorted in descending order and the key is greater then the middle element then we continue the search in the lower half of the array by setting end=mid-1.
3)Otherwise, we perform the search in the upper half of the array by setting low=mid+1
We can easily figure out the sorting order by comparing a[start] and a[end] .

  */

import java.util.Scanner;

class BinarySearchOrderNotKnown{

	private static int binarySearch(int[] a, int key) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == a[mid]) {
                return mid;
            } else if ((a[start] < a[end] && key < a[mid]) || (a[start] > a[end] && key > a[mid])) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
              }

        return -1;
    }
	public static void main(String[] args) {
       /* Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }
        int key = keyboard.nextInt();
        keyboard.close();

        //System.out.printf("BinarySearch(%d) = n", key,binarySearch(a, key));
        binarySearch(a, key);*/

         int[] arr = {1,2,3,4,5};
         // System.out.println("The array " + Arrays.toString(arr) + " " + (isSortedArray(arr, arr.length)?"is":"is not") + " sorted.");
          //System.out.println("--------");
          int n=5;
          binarySearch(arr,n);

      }
}