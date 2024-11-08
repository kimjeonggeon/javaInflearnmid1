package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);


        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            //catch는 runttime Excetion
            System.out.println("[연결 오류]" + e.getAddress()+"에러메시지"+e.getMessage());
            return;
        }
        catch (SendExceptionV3 e) {
            //catch는 runttime Excetion
            System.out.println("[전송 오류]" + e.getSendData()+"에러메시지"+e.getMessage());
            return;
        } finally{
            client.disconnect();
        }
        //실수로 에러를 놓칠 수 있음 그럴 경우를 위하여 finally 사용
        //정상흐름, 예외 catch 예외 던짐 어떠한 경우에도 finally를 사용한다,.
        //catch에 runtimeexception을 주지 않는 이상 에러를 못잡음 그럴경우를 위해 해제
        //catch 실행 할 때 디테일한거 먼저해야한다.

    }
}