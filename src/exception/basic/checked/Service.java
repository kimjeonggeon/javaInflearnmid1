package exception.basic.checked;

public class Service {
    Client client = new Client();

    /*client.call이라는 폭탄을 처리하는 방법
    *
    * 1. try catch로 잡는다.
    * 2. 예외를 밖으로 던진다.
    * */


    //예외 잡아서 처리 하는 코드
    //예외 처리로 못잡은 예외는 밖으로 던진다.
    public void callCatch(){
        try{
            client.call();
            //throw new MyCheckedException("ex") client call하면 나오는 것
        }catch (MyCheckedException e){
            //예외를 이곳에서 처리
            System.out.println("예외처리" + e.getMessage());
        }
        //main에서 서비스를 실행시키면 예외를 처리해주면 정상흐름으로 잘 도달
        System.out.println("정상 흐름");
    }

    //체크 예외를 잡지 않고 던짐
    //체크예외는 예외를 잡지 않고 던지려면 throws 예외를 메서드에 필수로 선언
    public void catchThrow() throws MyCheckedException{
        client.call();
    }

}

