package Arrays;

public class maximum_subarray_sum {

    static long maxSubarraySum(int arr[],int n)
    {
//     // int n=arr.length;
//      int max_so_far=arr[0];
//      int curr_max=arr[0];
//
//      for (int i=1;i<n;i++)
//      {
//          curr_max=Math.max(arr[i],curr_max+arr[i]);
//          max_so_far=Math.max(max_so_far,curr_max);
//      }
//      return max_so_far;
        long maxsum=0;
        long currsum=0;
        for(int i=0;i<n;i++)
        {
            currsum=currsum+arr[i];
            if(currsum>maxsum)
            {
                maxsum=currsum;
            }
            if(currsum<0)
            {
                currsum=0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
       int[] a ={-7 ,-8 ,-16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10 };
     //   int a[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
//int a[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n=a.length;
//        int n1=a1.length;
        int max_sum= (int) maxSubarraySum(a,n);
        //long max_sum1=maxSubarraySum(a1,n1);
        System.out.println("Maximum contiguous sum is "
                + max_sum);


    }





}
