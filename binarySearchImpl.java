/* binary search algo implementation....  */
/* Binary seach is always done on sorted array...:It states that when the array is sorted it will return an element
position where its been located or else it will return the null value if not present.

eg: searching the names in the phone book which are in sorted alphabetical order.


Binary Search Functionality: Sorted Order
							 Arrays present hona chahiye

Assuming that the array is present and is in sorted form,then lets take the front element as "low" and the last element as "high"

   low= 0,
   high= len(list) -1
	
Each time you need to check the mid element :
					            mid=(low + high)/2;
				   	x(need to find)= list[mid]
			If the 'x' value is too low then update the x accordingliny
			if(x < item)
				low=mid+1;

 */
import java.io.*;
import java.util.*;
class binarSearchImpl{

	public int binarySearch(int[] nums,int x)
	{
		int low =0;
		int high=nums.length-1;
		//checking for the condition and finding the mid element

		while(low <= high)
		{
			int mid =(high+low)/2;
			if(nums[mid] == x)
				return mid;

			if(x<nums[mid])
			{
				high=mid-1;

			}else{
				low=mid+1;
		}
	   }
	   return -1;
	}

		public static void main(String[] args)
	{
		binarSearchImpl bs = new binarSearchImpl();
		int[] nums ={1,10,20,47,59,65,75,88,99};
		System.out.println(bs.binarySearch(nums, 47));

	}

}