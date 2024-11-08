package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExeceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
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
        catch (NetworkClientExeceptionV3 e) {
            //연결 오류를 가장 중요하다고 가정하고 나머지는 네트워크 오류로 퉁 친다.
            System.out.println("네트워크 오류");
            return;
        }
        catch (Exception e){
            System.out.println("알수없는 오류"+e.getMessage());
        }
        finally{
            client.disconnect();
        }
        //실수로 에러를 놓칠 수 있음 그럴 경우를 위하여 finally 사용
        //정상흐름, 예외 catch 예외 던짐 어떠한 경우에도 finally를 사용한다,.
        //catch에 runtimeexception을 주지 않는 이상 에러를 못잡음 그럴경우를 위해 해제
    }
}