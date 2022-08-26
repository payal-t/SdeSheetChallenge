package Arrays;

//You are given an integer N. Your task is to return a 2-D ArrayList
// containing the pascal’s triangle till the row N.
//A Pascal's triangle is a triangular array constructed by
// summing adjacent elements in preceding rows. Pascal's triangle contains the values of the
// binomial coefficient. For example in the figure below.


import java.util.ArrayList;

public class pascaltriangle {


//    public pascaltriangle(int n) {
//
//    }

//    public static void printPascal(int n)
//
       public static ArrayList<ArrayList<Long>> printPascal(int n){
        // Write your code here.
        ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> cur = null;
        ArrayList<Long> prev = null;
        for(int i=0;i<n;++i){
            cur = new ArrayList<Long>();
            for(int j=0;j<=i;++j){
                if(j==0 || j==i)
                    cur.add( (long) 1);
                else
                    cur.add(prev.get(j) + prev.get(j-1));

            }
            prev = cur;
            ans.add(cur);
        }
        return ans;

    }

//        for (int line = 1; line <= n; line++) {
//            for (int j = 0; j <= n - line; j++) {
//
//                // for left spacing
//                System.out.print(" ");
//            }
//
//            // used to represent C(line, i)
//            int C = 1;
//            for (int i = 1; i <= line; i++) {
//
//                // The first value in a line is always 1
//                System.out.print(C + " ");
//                C = C * (line - i) / i;
//            }
//            System.out.println();
//        }

    public static void main(String[] args) {

          //int n=6;
   //     int n = 4;
        //new pascaltriangle(n);
      //  System.out.println("Pascal triangle is:" + new pascaltriangle(5));
        int n=5;
        printPascal(n);
    }
}
