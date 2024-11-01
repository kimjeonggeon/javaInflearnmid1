package algorithm.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*집합*/
public class BOJ11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S[] = new int[21];
        int N= Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String  command = st.nextToken();
            int x = -1;
            switch (command){
                case "add":
                 x = Integer.parseInt(st.nextToken());
                 S[x] = 1;
                 break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    S[x] = 0;
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    System.out.println(S[x]);
                    break;
                    case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    S[x] = (S[x]+1)%2;
                    break;
                case "all":
                    Arrays.fill(S,1);
                    break;
                case "empty":
                    Arrays.fill(S,0);
                    break;
            }


        }

    }
}
