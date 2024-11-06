package exception.basic.unchecked;


/*uncheck예외는 throws를 안해도된다.
* 예외를 잡거나 처리할 필요없다
* 잡지않으면 자도응로 던져진다.
* */

public class Service {
    Client client = new Client();
    /*필요한 경우 예외를 잡아서 처리할수 있다.*/
    public void callCatch(){
        try {
            client.call();
        } catch (MyUncheckedException e){
            System.out.println("예외처리"+ e.getMessage());
        }
    }

    /*예외를 잡지 않아도 된다. 자연스럽게 상위로 넘어간다. throws 선언을 안해도 된다. 폭탄은 넘어간다.*/
    public void callThrow(){
        client.call();
    }
}
