package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();


        //toString() 반환값 출력   return getClass().getName() + "@" + Integer.toHexString(hashCode()); hashcode는 객체의 참조값으로 생각
        System.out.println(string);
        System.out.println(object);
        // 위에 두개는 같다 println은 결국  toString을 포함시키고 있다.
        //toString으로는 객체의 정보를 제대로 알지 못하므로 재정의 오버라이딩해서사용한다
        //



    }
}