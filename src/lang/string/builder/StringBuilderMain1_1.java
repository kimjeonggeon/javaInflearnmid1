package lang.string.builder;


public class StringBuilderMain1_1 {
    public static void main(String[] args){
        /*가변 string인 stringbuilder  불변 객체인 string의 단점을 보완하기 위해 존재하는 가변 stringbuilder 그러나 사이드이펙트 조심
        * 메모리를 새로 만들지 않아서 메모리 사용을 절약핤 수 있다.
        * */
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println("sb=" + sb);
        sb.insert(4,"JAVA");

        sb.delete(4,8);
        System.out.println("delete="+sb);

        sb.reverse();
        System.out.println("reverse" +sb);

        String string = sb.toString();
        /*마지막으로 불변으로 바꾸는 투스트링 사용하면도ㅣㅁ*/



        }
}
