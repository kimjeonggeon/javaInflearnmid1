package lang.string.method;

public class StringInfoMAin {
    public static void main(String[] args){
        String str = "Hello, Java";
        System.out.println("문자열의 길이" +str.length());
        System.out.println("문자열이 비어있는지"+str.isEmpty());
        System.out.println("문자열이 비어있거나 공백인지"+ str.isBlank());
        System.out.println("문자열이 비어있거나 공백인지"+ "     ".isBlank()); /*띄어쓰기 혹은 "" 만있는것을 공백으로 여김*/




    }
}
