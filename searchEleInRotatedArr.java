/*  Search Element in a Rotated Sorted Array 
Problem Statement: There is an integer array nums sorted in ascending order
 (with distinct values). Given the array nums after the possible clockwise rotation and 
 an integer target, return the index of target if it is in nums, or -1 
if it is not in nums. We need to search a given element in a rotated sorted array.

Example 1:

Input: nums = [4,5,6,7,0,1,2,3], target = 0
Output: 4


Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1 

Solution 1: Using Linear Search

Approach :

We will iterate through the array completely. While iterating, we have to check if we have found the
 target element in the array. If we find it, we will return its index. If we iterate completely and 
 still do not find an element in the array.This indicates the target is not present and
 hence we return -1 as mentioned in the question.

import java.util.*;
public class Main {
    static int search(int arr[],int target) {
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==target)
            return i;
    }
    return -1;
}
    public static void main(String args[]) {
    int arr[] = {4,5,6,7,0,1,2,3};
    int target = 3;
    System.out.println("The index in which the number is present is "+search(arr,target));
    }
}


TC: O(n)
SC : O(1)


Algorithm:
Consider start index to be at 0 and last index to be n-1th index at starting      //n->length 
Find middle index(mid) of the array
If key is found to be less than mid index element then update last index of the array to mid -1
Else if key is found to be greater than mid index element then update start index of the array to mid +1
Else check for mid index element with key if not match repeat the above steps till start index is less than end index

It is mentioned that the array given is sorted but in a rotated manner.
 So, we can divide a given array into two parts that are sorted. This gives us 
 hints to use binary search. We can visualize a given array to be composed of two sorted arrays.


Approach :

We divide the array into parts. It is done using two pointers, low and high, and dividing the range
 between them by 2. This gives the midpoint of the range. Check if the target is present in the midpoint, 
 calculated before, of the array. If not present, check if the left half of the array is sorted. This
  implies that binary search can be applied in the left half of the array provided the target lies between
   the value range. Else check into the right half of the array. Repeat the above steps until low <= high. 
   If low > high, indicates we have searched array and target is not present hence return -1. Thus, it makes search 
   operations less as we check range first then perform searching in possible ranges which may have target value.

*/

import java.util.*;

class searchEleInRotatedArr {

	static int searchEleinRotaedarray(int arr[], int target)
	{
		int low = 0, high = arr.length - 1; //<---step 1

        while (low <= high) 
        { //<--- step 2
            int mid = (low + high) >> 1; //<----step 3
            if (arr[mid] == target)
                return mid; // <---step 4

            if (arr[low] <= arr[mid]) { //<---step 5
                if (arr[low] <= target && arr[mid] >= target)
                    high = mid - 1; //<---step 6 
                else
                    low = mid + 1; //<---step 7
            } else { //<---step 7
                if (arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1; //<---step 8
	}

public static void main(String[] args)
{
	int arr[] = {4,5,6,7,0,1,2,3};
        int target = 8;
        System.out.println("The index in which the number is present is " + searchEleinRotaedarray(arr,target));
}

}









