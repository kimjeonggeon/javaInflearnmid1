package exception.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        //예외를 처리 안해줘서 정상종료는 안나옴 던져서 
        //runtimeexcepion 상속받으면 throws를 안해도 되는거지 해결은 안됨 밖으로 던짐
        //단점 에러를 누락할수 있음
        //체크예외와 언체크예외의 차이는 필수로 선언 해야하는가 아닌가의 차이이다.
        System.out.println("정상종료");
    }
}
