package algorithm.day17;

import java.util.Scanner;

public class BOJ2576 {
    /*7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최솟값을 찾는 프로그램을 작성하시오.

예를 들어, 7개의 자연수 12, 77, 38, 41, 53, 92, 85가 주어지면 이들 중 홀수는 77, 41, 53, 85이므로 그 합은

77 + 41 + 53 + 85 = 256

이 되고,

41 < 53 < 77 < 85

이므로 홀수들 중 최솟값은 41이 된다
홀수가 존재하지 않는 경우에는 첫째 줄에 -1을 출력한다. 홀수가 존재하는 경우 첫째 줄에 홀수들의 합을 출력하고, 둘째 줄에 홀수들 중 최솟값을 출력한다.
입력
12
77
38
41                                      
53
92
85


출력
256
41
*/

    /*for문과 조건문을 이용하여 홀수 짝수를 판단 그중 홀수가 0일경우 -1 하고 break 홀수가 있는경우 홀수만의 합을 구하고 min 값을 구한다.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[7];
        boolean flag = false;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if (num % 2 == 1) {
                list[i]= num;
                flag = true;
                sum += num;
                if(min > num) min = num;
            }
        }
        if(!flag){
            System.out.println("-1");
        } else{
            System.out.println(sum+" " + min);
        }
    }


}
