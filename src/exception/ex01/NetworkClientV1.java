package exception.ex01;

public class NetworkClientV1 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect(){
        if(connectError){
            System.out.println("데이터 전송 실패"+address);
        }
        System.out.println("서버 연결 성공" + address);
        return "success";
    }

    public String send(String data){
        return "sucess" + data;
    }
    public void disconnect(){
        System.out.println("서버연결 해제");
    }
    public void initError(String data){
        if(data.contains("error1")){
            connectError =true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }

}
