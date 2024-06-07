package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args){
        Car car =new Car("Model Y");
        Dog dog1 = new Dog("누렁이",3);
        Dog dog2 = new Dog("로이",1);
        print(car);
        System.out.println(car.toString());
        System.out.println(dog1);
        System.out.println(dog2+"사랑해");
        //toString  하나 안하나 같다



        //dog에 있는 객체의 참조값을 얻고싶을때는 아래 것을 사용하면 된다.

        String refValue = Integer.toHexString(System.identityHashCode(dog1));
    }
/*동적 의존관계는 runtime에 어떤 인스턴스 실행시킩지 알고 정적인건 그냥 안다*/


    public static void print(Object obj){
        String str = "객체정보 출력" + obj.toString();
        System.out.println(str);
    }
}
