package algorithm.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Boj4344 {
    public static  void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int S = 0;
            int P[] = new int[N];
            for (int j = 0; j < N; j++) {
                P[j] = Integer.parseInt(st.nextToken());
                S += P[j];
            }
                Double Avg = S/(double)N;
                int over_avg  = 0;
                for (int j = 0; j < N; j++) {
                    if(Avg < P[j]) over_avg ++;
                }
        }

    }
}
