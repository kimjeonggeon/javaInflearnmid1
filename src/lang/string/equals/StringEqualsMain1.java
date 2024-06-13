package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args){
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String()  == 비교" +(str1 == str2));

    }
    private static boolean isSame(String x, String y){
        return  x == y;
        /*문자열 비교는 절대 == 을 쓰면 안된다 서로 문자열이 들어온다는 보장이 없다 .equals를 통해 동등성 비교를 하자*/
    }
}
