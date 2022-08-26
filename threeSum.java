package Arrays;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

    public List<List<Integer>> threeSumPLeetCode(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];

                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                        while (lo < hi && nums[lo] == nums[lo + 1])
                            lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1])
                            hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum)
                        lo++;
                    else
                        hi--;
                }
            }
        }
        return res;
    }

//    public static void main(String[] args) {
//
//        int[] nums ={-1 ,-2 ,-2, -1, -1, 2, 0, 2, 0, 0, 2 };
//
//        int n=nums.length;
//
//        int sum=-2;
//        threeSum(nums,sum,n);

//        int n1=a1.length;

        //long max_sum1=maxSubarraySum(a1,n1);
//        System.out.println("Maximum contiguous sum is "
//                + threeSum);



//    }
}