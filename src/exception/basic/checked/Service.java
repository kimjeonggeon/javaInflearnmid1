package exception.basic.checked;

public class Service {
    Client client  = new Client();


    /*예외를 잡아서 처리하는 코드*/
    public void callCatch(){
        try{
            client.call();
        } catch(MyCheckedException e){
            System.out.println("예외처리"+ e.getMessage());
        }
        System.out.println("정상흐름");
    }


    /*체크예외를 밖으로 던지는 코드
    * 체크예외는 예외를 잡지않고 throws 예외를 메서드에 필수로 선언*/
    public void cathcThrow() throws MyCheckedException{
        client.call();
    }
}
