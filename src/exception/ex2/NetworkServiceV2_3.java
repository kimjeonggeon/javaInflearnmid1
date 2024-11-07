package exception.ex2;


public class NetworkServiceV2_3 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);


        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류]" + e.getErrorCode()+"에러메시지"+e.getMessage());
            return;
        }
//try catch 한번으로 잡음 그러나 disconnect 이전에 에러가 터지면 예외가 터져서 catch로 바로감.
    }
}