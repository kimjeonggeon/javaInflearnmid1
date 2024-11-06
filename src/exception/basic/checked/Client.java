package exception.basic.checked;

public class Client {
    public void call() throws  MyCheckedException {
        //throws는 해결 못해서 밖으로 던질거야
        /*문제상황*/
        // throw는 새로운 예외를 만드는 것 예외도 객체이기 때문에 new로 생성하고 예외 발생
        // 예외를 던지면 해결을 못해서 throws로 밖으로 던진다.
        //이 아래로 실행안되고 밖으로 던진다.
        throw new MyCheckedException("ex");

    }
}
