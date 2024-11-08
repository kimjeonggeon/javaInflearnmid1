package exception.ex4;



public class NetworkServiceV4 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);


        try {
            client.connect();
            client.send(data);
        }
        finally{
            client.disconnect();
        }
        //실수로 에러를 놓칠 수 있음 그럴 경우를 위하여 finally 사용
        //정상흐름, 예외 catch 예외 던짐 어떠한 경우에도 finally를 사용한다,.
        //catch에 runtimeexception을 주지 않는 이상 에러를 못잡음 그럴경우를 위해 해제
    }
}