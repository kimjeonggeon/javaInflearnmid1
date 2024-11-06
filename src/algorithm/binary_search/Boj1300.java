package algorithm.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj1300 {
    /*세준이는 크기가 N*N인 배열 A를 만들었다
    * 배열에 들어있는 A[i][j] = i*j이다 1차원 배열 B에 넣으면
    * B 크기는 N*N이 된다.
    * B를 오르차순 정렬했ㅇ르때 B[k]를 구해라
    * ex) 입력 3 7  출력 6
    *  */
    public static void main(String[] args[]) throws IOException {
        /*n*n배열 만들기*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][N+1];

        for(int i =0; i<N; i++){
            for(int j=0; i<N; j++){
                arr[i][j] = i*j;
            }
        }




    }
}
