package subArrays;

public class PositiveProduct {

//    public static void main(String[] args) {
//
//        int arr[]={0,1,-2,-3,-4};
//        getMaxLen(arr[]);
//
//
//    }

    public static int getMaxLen(int[] nums) {

        int max = 0;

        int firstNegativeIndex = -1;
        int negativeCount = 0;

        int zeroIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            //{-1,-2,-3,0,1};
            if (nums[i] < 0) {
                negativeCount++;
                //update firstNegativeIndex for first time
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                } else {
                    //if its a negative number and count becomes even
                    if (negativeCount % 2 == 0) {
                        max = Math.max(max, i - zeroIndex);
                    }
                }
            } else if (nums[i] == 0) {
                //reset everything
                firstNegativeIndex = -1;
                negativeCount = 0;
                zeroIndex = i;
            } else {
                if (negativeCount % 2 == 0) {
                    max = Math.max(max, i - zeroIndex);
                } else {
                    max = Math.max(max, i - firstNegativeIndex);
                }
            }
        }

        return max;
    }
}