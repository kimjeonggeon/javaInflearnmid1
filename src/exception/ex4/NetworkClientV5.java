package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;

public class NetworkClientV5 implements AutoCloseable {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public String connect() {
        if(connectError){
            throw new ConnectExceptionV4("connectError",address+"서버연결실패");
        }
        System.out.println("서버 연결 성공" + address);
        return "success";
    }

    public String send(String data){
        if(sendError){
//            throw new SendExceptionV3("sendError",address+"서버 데이터 전송 실패");
            throw new RuntimeException("sendError");

        }
        return "success" + data;
    }

    public void disconnect(){
        System.out.println("서버연결 해제"+address);
    }

    public void initError(String data){

        if(data.contains("error1")){
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }

    }

    public void close() {
        //try가 종료되면 자동 호출 됨
        //예외를 안던져서 exception이 필요없음
        System.out.println("NetworkClients close");
        disconnect();
    }


}
