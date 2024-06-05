package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args){
        Car car =new Car("Model Y");
        Dog dog1 = new Dog("누렁이",3);
        Dog dog2 = new Dog("로이",1);

        System.out.println(car.toString());
        System.out.println(dog1);
        System.out.println(dog2+"사랑해");
        //toString  하나 안하나 같다



        //dog에 있는 객체의 참조값을 얻고싶을때는 아래 것을 사용하면 된다.
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
    }
}
