package exception.ex01;

import exception.NetworkClientV0;

public class NetworkServiceV1_1 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
