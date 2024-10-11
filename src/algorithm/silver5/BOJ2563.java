package algorithm.silver5;


import java.util.Scanner;

/*가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
 첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다.
  색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
   색종이의 수는 100 이하이며,
 색종이가 도화지 밖으로 나가는 경우는 없다

 해결방법 ---> 배열로 해결 1로 따진다.
  면적에 1을 넣어서 그 1을 다 더한게 결국 넓이이다.
 */
public class BOJ2563 {
    public static void main(String[] args) {
        int D[][] = new int[101][101];
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j < x+10; j++){
                for(int k=y; k< y+10; k++){
                    D[j][k] = 1;
                }
            }
        }
        int sum = 0;
        for(int j=0; j<100; j++){
            for(int k=0; k<100; k++){
                if(D[j][k] == 1){
                    sum++;
                }
            }
        }




    }
}
