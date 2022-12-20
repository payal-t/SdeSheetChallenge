/*
 * You have to paint N boards of length {A0, A1, A2, A3 … AN-1}. There are K painters available and you are also given how much time a painter takes to paint 1 unit of board. You have to get this job done as soon as possible under the constraints that any painter will only paint continuous sections of board.
 * 
 2 painters cannot share a board to paint. That is to say, a board
 cannot be painted partially by one painter, and partially by another.
 A painter will only paint continuous boards. Which means a
 configuration where painter 1 paints board 1 and 3 but not 2 is
 invalid.
 Return the ans % 10000003
 
 Input :
 K : Number of painters
 T : Time taken by painter to paint 1 unit of board
 L : A List which will represent length of each board
 
 Output:
 return minimum time to paint all boards % 10000003
 Example
 
 Input : 
 K : 2
 T : 5
 L : [1, 10]
 Output : 50
 
 */
// Java Program for The painter's partition problem
import java.util.*;
import java.io.*;
            
class partitionPainters{
    static long minTime(int[] arr,int n,int k){
        //code here
        long sum = getSum(arr);
        long max = getMax(arr);
        return binarySearch(arr, max, sum, k);
    }

    static long binarySearch(int [] arr, long low, long high, int k) {
        while (low < high) {
            long middle = low + (high - low) / 2;
            int painters = findPainters(arr, middle);
            if (painters <= k) {
                high = middle;
            }
            else {
                low = middle + 1;
            }
        }
        return low;
    }

    static int findPainters(int [] arr, long maxTime) {
        int painter = 1;
        long sum = 0;
        int length = arr.length;
        for (int i=0; i<length; i++) {
            sum += arr[i];
            if (sum > maxTime) {
                painter ++;
                sum = arr[i];
            }
        }
        return painter;
    } 

    static long getSum(int [] arr) {
        long total = 0;
        for (int number : arr) {
            total += number;
        }
        return total;
    }

    static long getMax(int [] arr) {
        long max = Integer.MIN_VALUE;
        for (int number : arr) {
            max = Math.max(max, number);
        }
        return max;
   }
}