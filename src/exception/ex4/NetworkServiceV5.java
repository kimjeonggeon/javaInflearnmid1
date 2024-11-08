package exception.ex4;



public class NetworkServiceV5 {
    public void sendMessage(String data){
        String address = "http://example.com";

        try(NetworkClientV5 client = new NetworkClientV5(address)) {
            //try 안에 사용할 자원을 명시해줘야한다 try resources는
            // resources는 자동으로 안에 있는 것 홏추
            // 순서가 중요하다 catch를 가기전에 오류가 생기면 먼저 disconnect 됨 resource 에 있는 autoclose\
            // 사용시 장점은 코드간결 그리고 finally에서 해제하는 등과 같은 코드 누락을 피할 수 있따.
            // 봐야할 스코프가 적어진다 . try문 안에섬나 client관한 코드를 보면 됨 디버깅 편해진다.
            client.initError(data);
            client.connect();
            client.send(data);
        }  catch (Exception e) {
            System.out.println("[예외확인]" + e.getMessage());
            throw e;
        }
    }
}