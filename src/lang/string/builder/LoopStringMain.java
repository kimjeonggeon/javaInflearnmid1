package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        String result = "";
        for(int i=0; i<100000; i++){
         result += "Hello JAVA";

        }
        long endTime =System.currentTimeMillis();
        System.out.println("result"+(endTime-startTime)+"ms"  );


    }
    /*최적화가 안되는 경우가 있다 자바는 자동으로 최적화 해준다
    * 루프의 경우 오래걸린다.
    * */
}
