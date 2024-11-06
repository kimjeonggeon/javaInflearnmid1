package algorithm.binary_search;

import java.util.Scanner;

public class P2343 {
/*N개의 레슨이 들어가는데 블루레이를 녹화할 때 레슨의 순서가 바뀌면 안된다.
* i,j 번 레슨을 같은 블루레이에 녹화하려면  i와 j 사이의 모든 레슨도  같은 블루레이에 녹화해야한다.
* 블루레이의 크기는 최소 모두 같은 크기로 만드려한다.
* 레슨의 길이가 분 단위로 주어질 때 가능한 블루레이 크기 중 최솟값을 구하느 프로그램 작성해라
*입력 9 3     /1 2 3 4 5 6 7 8 9
*     출력 17
*
* 생각 --> 일단 최소값은 블루레이에 담기 위해서 제시된 숫자 중 최대 크기 보다 커야한다. 최대값은 모든 숫자를 더한 것이어야한다.
*         중앙 값은 최소 + 최대 / 2
* */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(start<arr[i]) start = arr[i];
            end = end + arr[i];
        }
        while (start <= end){
            int mid = (start + end) / 2;
            int sum = 0;
            int count = 0;
            for(int i=0; i<n; i++){
                if(sum + arr[i] > mid){
                    /*sum이 중앙 값을 넘기면 블루레이 다음걸로 넘어간다. */
                    count ++;
                    sum = 0;
                }
                sum = sum + arr[i];
            }
            //count가 m인 블루레이 갯수보다 넘으면 블루레이 갯수로 못담은거니까 블루레이 크기를 늘려야한다.
            // 그러려면 시작값을 중앙값보다 1 크게 해야한다
            if(count > m){
                start = mid + 1;
            }
            //블루레이가 여유가 있으면 끝을 중앙값 보다 작게해서 범위내에서 한다.
            else end = mid - 1;
            //count가 m인 블루레이 갯수보다 적으면 mid -1
        }
        System.out.println(start );
    }
}
