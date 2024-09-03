package exception.basic.checked;

public class Client {
    public void call() throws  MyCheckedException {

        /*문제상황*/
// throw와  throws의 차이는 throws는 문제를 터뜨리는것이고 throws는 해결 못해하고 던지는 것         
        throw new MyCheckedException("ex");

    }
}
