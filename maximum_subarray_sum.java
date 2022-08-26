package Arrays;

public class maximum_subarray_sum {

    static long maxSubarraySum(int arr[],int n)
    {
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

        int n=a.length;
//        int n1=a1.length;
        int max_sum= (int) maxSubarraySum(a,n);
        //long max_sum1=maxSubarraySum(a1,n1);
        System.out.println("Maximum contiguous sum is "
                + max_sum);


    }





}
