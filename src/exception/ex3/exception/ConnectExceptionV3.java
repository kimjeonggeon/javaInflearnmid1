package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExeceptionV3{

    private final String address;
    //어느 주소에서 에러 났는지 확인하기 위한
    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }


    public String getAddress() {
        return address;
    }
}