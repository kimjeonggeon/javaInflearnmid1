package exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUncheckedException("오류가 발생했습니다. 해결해 주십시오");
    }
}
