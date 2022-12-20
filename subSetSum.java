/*
Subset Sum : Sum of all Subsets
Problem Statement: Given an array print all the sum of the subset generated from it, in the increasing order.

Example 1:

Input: N = 3, arr[] = {5,2,1}

Output: 0,1,2,3,5,6,7,8

Explanation: We have to find all the subset’s sum and print them.in this case the 
generated subsets are [ [], [1], [2], [2,1], [5], [5,1], [5,2]. [5,2,1],so the sums we get will be  0,1,2,3,5,6,7,8

Input: N=3,arr[]= {3,1,2}

Output: 0,1,2,3,3,4,5,6

Explanation: We have to find all the subset’s sum and print them.in this case the 
generated subsets are [ [], [1], [2], [2,1], [3], [3,1], [3,2]. [3,2,1],so the sums we get will be  0,1,2,3,3,4,5,6

Solution 1: Using recursion

Intuition: The main idea is that on every index you have two options either to select the element to add it to your subset(pick) or
           not select the element at that index and move to the next index(non-pick).

Approach: Traverse through the array and for each index solve for two arrays, one where you pick the element,i.e 
          add the element to the sum or don’t pick and move to the next element, recursively, until the base condition. 
          Here when you reach the end of the array is the base condition.

Time Complexity: O(2^n)+O(2^n log(2^n)). Each index has two ways. 
				You can either pick it up or not pick it. So for n index time complexity 
				for O(2^n) and for sorting it will take (2^n log(2^n)).

Space Complexity: O(2^n) for storing subset sums, since 2^n subsets can be generated for an array of size n.


*/

import java.util.*;

class subSetSum{

	static void subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset)
	{

		//base condition
		if(ind == N)
		{
			sumSubset.add(sum);
			return;
		}
		//for picking the element
		subsetSumsHelper(ind+1,sum+arr.get(ind),arr,N,sumSubset);

		//for not picking up the element
		subsetSumsHelper(ind+1,sum,arr,N,sumSubset);

	}
	static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {

        ArrayList < Integer > sumSubset = new ArrayList < > ();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }



    public static void main(String[] args)
    {
    	  ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }
}


























