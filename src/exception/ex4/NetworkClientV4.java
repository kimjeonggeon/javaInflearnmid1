package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
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
}
