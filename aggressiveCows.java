/*Aggressive Cows : Detailed Solution

Problem Statement: There is a new barn with N stalls and C cows. The stalls are located 
                   on a straight line at positions x1,….,xN (0 <= xi <= 1,000,000,000). We want to assign the cows to the 
                   stalls,such that the minimum distance between any two of them is as large as possible. 
                   What is the largest minimum distance?

Examples:

Input: No of stalls = 5 
       Array: {1,2,8,4,9}
       And number of cows: 3

Output: One integer, the largest minimum distance 3

Explanation:
Here we need to fit the cows in 5 stalls.Each stall can accumulate only 1 cow.Our task is to maximize the minimum 
distance between two stalls.Lets look at some arrangements.

Here,in the first case, the cows were arranged in the first three consiqutive stalls,which is not advisable becoz they require 
max distance btw them.so we make sure that there is some min dis btw them so they do not fight.We have to maximize 
that difference so as to accommodate three cows.  
This is done in the second and third examples. 
It’s not possible to get a minimum distance of more than 3 in any arrangement, so we output 3.
Sol 1: Brute Force Approach
	
It’s required that we put all the C cows into our stalls. So for a start, let’s say we set the minimum distance = 1 
and put them consecutively. These cows fit perfectly.

This is too close, so let’s increase our minimum distance a bit. Let’s increase the distance further to 2.
 We can again check that the cows can be accommodated. 

But we want to reduce the possibility of collision/fighting as much as possible, so we keep on increasing the
minimum distance.

Approach:

After sorting the array, we set a minimum distance, then we keep on increasing until accommodation of all cows is 
not possible. We stop just before that to get our answer, which in this example is 3. 

For checking if the cows can fit or not, we are simply iterating over our n stalls, and for every stall with the 
said minimum distance, we place our cow. After we are done, if all cows have been accommodated, we return true, 
otherwise false. Let’s observe the time complexity of our brute force algorithm here, we are increasing distance in 
each step (which in the worst case of two cows gets as high as m = array[n-1]-array[0]), 
and in that step, we are checking if our cows can “fit”, so we are iterating again for each step to check.

Here, the TC: O(n*n)
		  SC: O(1)
		  which is not prefered hence we just need to see the another approach 

Sol 2: Optimized Approach: 
	By going with the concept of binary search

	MAke sure that the array given is sorted ,as for appling binary search we need it.
	for appling bs we set 
	low=1,
	high=array[n-1]-array[0];
	as its the max possible dist between the two stalls.

	mid=(low+high)/2;

	Then we check if the minimum distance(mid-value) is possible by the same 
	method defined in brute force, and if it is not possible, this means we 
	can set our upper bound as high-1, and if it is possible, we store 
	it in an answer variable and set our lower bound as mid+1. 
	We keep on doing this until high and low pointers are equal.

	After appling the bs the required 
	TC: O(nlog(n))
	SC: O(1) 

*/

import java.util.*;

class aggressiveCow
{

	public static void main(String[] args)
	{
		int n = 5, cows = 3;
        int a[]={1,2,8,4,9};
        Arrays.sort(a);

        int low = 1, high = a[n - 1] - a[0];

        while (low <= high) {
            int mid = (low + high) >> 1;

            if (canPlaceCows(a, n, cows, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }       
        }
        System.out.println("The largest minimum distance is " + high);


	}

	static boolean canPlaceCows(int a[],int n,int cows, int minDist)
	{
		int cntCows = 1;
        int lastPlacedCow = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] - lastPlacedCow >= minDist) {
                cntCows++;
                lastPlacedCow = a[i];
            }
        }
        if (cntCows >= cows) return true;
        return false;
	}
}

