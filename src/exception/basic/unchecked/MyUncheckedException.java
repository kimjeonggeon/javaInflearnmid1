package exception.basic.unchecked;


//언체크 예외는 runtimeException 을 상속받음
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}
