package lang.object.poly;

public class ObjectPolyExample1 {





    public static void main(String[] args){
        Dog dog = new Dog();
        Car car = new Car();
        action(dog);
        action(car);
    }



    public static void action(Object obj){
        /*Object는 모든 인자의 부모라서 모든 객체를 이자로 전달 가능하다
        *
        * 1. 단점은 다른 객체의 메서드가 정의가 되어있지 않아서 메서드 오버라이딩 불가능하고 무조건 다운캐스팅을 해줘야지 사용가능하다
        * */

        /*객체에 맞게 다운캐스팅이 필요하다 obj를 다 받고 있긴하지만  obj 에는 dogd와 car이 없다*/
        if(obj instanceof Dog dog){

            /*위에 instanceof 랑 (Dog)obj.sound와 같다.*/
            dog.sound();
        }
    }
}
