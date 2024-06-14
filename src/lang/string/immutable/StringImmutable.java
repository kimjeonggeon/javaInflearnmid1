package lang.string.immutable;

public class StringImmutable {
    public static void main(String[] args){
        String str = "hello";
        str.concat("java");
        System.out.println(str);
        /* 불변객체로 반환값을 주지 않으면 나오지 않는다 str.concat은 새로운 객체를 만든다.*/
        String str2 = str.concat("java");
        System.out.println(str2);


    }
}
