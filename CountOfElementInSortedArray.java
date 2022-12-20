/*Given a sorted array of integers and a target element. 
Find the number of occurrences of the target in the array. You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: a[] = {1, 1, 2, 2, 2, 2, 3},  target = 2
Output: 4 (2 appears four times in the array)

Example 2:

Input: a[] = {1, 1, 2, 2, 2, 2, 3},  target = 1
Output: 2 (1 appears twice in the array)
*/

import java.util.Scanner;

class CountOfElementInSortedArray
{
	private static int bsFirstPosition(int[] a,int target)
	{
		int start=0;
		int end=a.length-1;

		int firstPosition =-1;

		while(start<=end)
		{
			//int mid=start-(end-start)/2;
			int mid = (start + end)/2;
			if(target == a[mid])
			{
				firstPosition=mid;
				end=mid-1;
			}else if(target < a[mid])
			{
				end =mid-1;
			}else{
				start=mid+1;
			}
		}
		return firstPosition;
	}

	private static int bsLastPosition(int[] a,int target)
	{
		int start=0;
		int end=a.length-1;

		int lastPosition=-1;
		while(start<=end)
		{
			//int mid=start-(end-start)/2;
			int mid = (start + end)/2;
			if(target==a[mid])
			{
				lastPosition=mid;
				start=mid+1;
			}else if(target < a[mid])
			{
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		return lastPosition;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		sc.close();

		int firstPosition=bsFirstPosition(a,target);
		int lastPosition =bsLastPosition(a,target);

		if(firstPosition!= -1 && lastPosition!=-1)
		{
			System.out.printf("Count(%d) = %d%n", target, lastPosition-firstPosition+1);
		}else {
			System.out.printf("Count(%d) = 0%n", target);
		}
	}
}