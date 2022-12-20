/*

Subset – II | Print all the Unique Subsets
Problem Statement: Given an array of 
                   integers that may contain duplicates the task is to return all possible subsets. 
                   Return only unique subsets and they can be in any order.
Example 1:

Input: array[] = [1,2,2]

Output: [ [ ],[1],[1,2],[1,2,2],[2],[2,2] ]

Explanation: We can have subsets ranging from  length 0 to 3. which are listed above. Also the subset [1,2] appears 
			 twice but is printed only once as we require only unique subsets.

Input: array[] = [1]

Output: [ [ ], [1] ]

Explanation: Only two unique subsets are available

Solution 1: Brute Force

Approach:

At every index, we make a decision whether to pick or not pick the element at that index. This will help us in generating 
all possible combinations but does not take care of the duplicates. Hence we will use a set to store all the combinations 
that will discard the duplicates.
Time Complexity: O( 2^n *(k log (x) )). 2^n  
				 for generating every subset and k* log( x)  to insert every combination of average length k in a set of size x.
				 After this, we have to convert the set of combinations back into a list of list /vector of vectors which takes more time.

Space Complexity:  O(2^n * k)
				   to store every subset of average length k. Since we are initially using a set to store the answer another
				   O(2^n *k) is also used.


//Solution 2: Optimal

1)Sort the input array.Make a recursive function that takes the input array ,the current subset,
 the current index and  a list of list/ vector of vectors to contain the answer.
2)Try to make a subset of size n during the nth recursion call and consider elements from every 
  index while generating the combinations. Only pick up elements that are appearing for the first time during a recursion call to avoid duplicates.
3)Once an element is picked up, move to the next index.The recursion will terminate when the 
  end of array is reached.While returning backtrack by removing the last element that was inserted.

Time Complexity: O(2^n) 
                for generating every subset and O(k)  to insert every subset in another data structure if the average length of every subset is k. 
                Overall O(k * 2^n).

Space Complexity: O(2^n * k) 
                  to store every subset of average length k. Auxiliary space is O(n) 
                  if n is the depth of the recursion tree.

*/

import java.util.*;

class subsetII{

	static void printAns(List <List<Integer>>  ans) {
    System.out.println("The unique subsets are ");
    System.out.println(ans.toString().replace(","," "));
  }
 public static void findSubsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds)); 
        for(int i = ind;i<nums.length;i++) {
            if(i!=ind && nums[i] == nums[i-1]) continue; 
            ds.add(nums[i]); 
            findSubsets(i+1, nums, ds, ansList); 
            ds.remove(ds.size() - 1);
        }
        
    }

  public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> ansList = new ArrayList<>(); 
        findSubsets(0, nums, new ArrayList<>(), ansList); 
        return ansList; 
    }

public static void main(String args[]) {
   int nums[]={1,2,2,2,3,3};
   
   List < List<Integer>> ans = subsetsWithDup(nums);
   printAns(ans);
   
}


}


