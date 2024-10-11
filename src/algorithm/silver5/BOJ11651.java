package algorithm.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ11651 {
    public static void main(String[] args) throws IOException {
        ArrayList<Point> points = new ArrayList<Point>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y=  Integer.parseInt(st.nextToken());
            points.add(new Point(x,y));
        }
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.y == o2.y){
                    return o1.x - o2.x;
                }
                return o2.x - o1.x;
            }
        });
    }
}
class Point{
    int x;
    int y;

    public Point(int x, int y) {
    }
}