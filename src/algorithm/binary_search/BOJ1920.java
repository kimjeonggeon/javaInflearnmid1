package algorithm.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[n];
        for(int i=0; i<n; i++){
          A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for(int i=0; i<m;i++){
            boolean find = false;
            int target = sc.nextInt();
            int start = 0;
            int end = n-1;
            while(start <= end){
                int mid = (start+ end)/ 2;
                int midV = A[mid];
                if(midV > target){
                    end = mid -1;
                }else if (midV<target){
                    end = mid +1;
                }else{
                    find = true;
                    break;
                }
            }

            if(find){
                System.out.println("1");
            }else {
                System.out.println("0");
            }




        }




    }
}
