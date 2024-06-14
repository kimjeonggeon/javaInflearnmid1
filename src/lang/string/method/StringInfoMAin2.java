package lang.string.method;

public class StringInfoMAin2 {
    public static void main(String[] args){
        String str = "Hello, Java";
        String str2 = "hello, java";
        System.out.println("str1 equals str2" +str.equals(str2));
        System.out.println("str1 대소문자 무시하고 같은지 "+str.equalsIgnoreCase(str2));
        System.out.println("사전적으로 얼마나 차이나는지 몇번째"+ str.compareTo(str2));
        System.out.println("사전적으로 얼마나 차이나는지 몇번째 대소문자 무시하고"+ str.compareToIgnoreCase(str2));
        System.out.println("시작하는 단어가 맞는지"+ str.startsWith("Hello")); /*띄어쓰기 혹은 "" 만있는것을 공백으로 여김*/
        System.out.println("자바의 인데긋"+str.indexOf("Java"));




    }
}
