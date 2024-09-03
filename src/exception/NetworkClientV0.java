package exception;

public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect(){
        System.out.println("서버 연결 성공" + address);
        return "success";
    }

    public String send(String data){
        return "sucess" + data;
    }
    public void disconnect(){
        System.out.println("서버연결 해제");
    }
}
