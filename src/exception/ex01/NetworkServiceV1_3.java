package exception.ex01;

public class NetworkServiceV1_3 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)){
            System.out.println("네트워크 오류"+connectResult);
        }else {

            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("전송오류" + sendResult);
            }
        }
        client.disconnect();
    }



    public static boolean isError(String connectResult){
        return !connectResult.equals("success");
    }

}
