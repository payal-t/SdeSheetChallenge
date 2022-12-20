/*   
Print All Permutations of a String/Array
Problem Statement: Given an array arr of distinct integers, print all permutations of String/Array.

Examples:
Example 1: 

Input: arr = [1, 2, 3]

Output: 
[
  [1, 2, 3],
  [1, 3, 2],
  [2, 1, 3],
  [2, 3, 1],
  [3, 1, 2],
  [3, 2, 1]
]

Explanation: Given an array, return all the possible permutations.

Example 2:

Input: arr = [0, 1]

Output:
[
  [0, 1],
  [1, 0]
]

Explanation: Given an array, return all the possible permutations.
Solution 1: Recursive

Approach: We have given the nums array, 
          so we will declare an ans vector of vector that will store all the permutations also declare a data structure.

Declare a map and initialize it to zero and call the recursive function

Base condition:

When the data structure’s size is equal to n(size of nums array)  then it is a permutation and stores that permutation in our ans, then returns it.

Recursion:

Run a for loop starting from 0 to nums.size() – 1. Check if the frequency of i is unmarked, if it is unmarked then it 
means it has not been picked and then we pick. And make sure it is marked as picked.

Call the recursion with the parameters to pick the other elements when we come back from the recursion make sure you throw 
that element out. And unmark that element in the map.

 */

