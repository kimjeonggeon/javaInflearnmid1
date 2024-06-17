package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        String result = "";
        for(int i=0; i<100000; i++){
         sb.append( "Hello JAVA");

        }
        long endTime =System.currentTimeMillis();
        System.out.println("result"+(endTime-startTime)+"ms"  );


    }
    /*최적화가 안되는 경우가 있다 자바는 자동으로 최적화 해준다
    * 루프의 경우 오래걸린다.
    * 문자열 경우 +는 최적화 되어서 괜찮지만
    * 반복문에서 반복 문자 연결
    * 복잡한 문자열의 특정 부분 바꿀때
    * 조건문 통해 동적 문자 조합할때
    * 매우 긴 대용량 문자 다룰떄 stringbuilder사용한느 것이 좋다.
    * stringbuilder와 stringbuffer은 비슷하다 그러나 builder는 멀티 쓰레드 상황에서 안전하지 않다. 대신 속도가 더 빠르다
    * */
}
