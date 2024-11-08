package exception.ex4.exception;

import exception.ex3.exception.NetworkClientExeceptionV3;

public class ConnectExceptionV4 extends RuntimeException {

    private final String address;
    //어느 주소에서 에러 났는지 확인하기 위한
    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }


    public String getAddress() {
        return address;
    }
}
