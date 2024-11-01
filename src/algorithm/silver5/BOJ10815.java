package algorithm.silver5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*시간 복잡도 생각하면 50만 50만이라 너무 많기때문에 nlogn 방식 사용한다 .-> 정렬을 이용한다.*/
public class BOJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
        A[i] =Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        ArrayList<NewArr> B = new ArrayList();
        for(int i=0; i<M; i++){
            int index = i;
            int value = Integer.parseInt(st.nextToken());
            B.add(new NewArr(index,value));
        }


    }
}

 class NewArr{
    int index;
    int value;
    NewArr(int index,int value){
        this.index = index;
        this.value = value;
    }
 }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//            int A[] =new int[N];
//            StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0; i<N; i++){
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(A);
//
//
//        /*arraylist 에 담는 이유는 인덱스를 담기 위함. */
//        int M = Integer.parseInt(br.readLine());
//        ArrayList<MyArr>B= new ArrayList<>();
//        for(int i=0; i<M; i++){
//            int index =i;
//            int value = Integer.parseInt(st.nextToken());
//            B.add(new MyArr(index,value));
//        }
//
//        B.sort(Comparator.comparingInt(o-> o.value));
//
//
//        int answer[] =new int[M];
//        int start_index = 0;
//        for(int i=0; i<B.size(); i++ ){
//            if(A[start_index] > B.get(i).value){
//                answer[B.get(i).index] = 0;
//                i++;
//            } else if (A[start_index] == B.get(i).value) {
//                answer[B.get(i).index] = 1;
//                i++;
//                start_index++;
//            }else{
//                start_index++;
//            }
//
//        }
//
//
//
//    }
//}
//class MyArr{
//    public MyArr(int value, int index) {
//        this.value = value;
//        this.index = index;
//    }
//
//    int index;
//    int value;
//}