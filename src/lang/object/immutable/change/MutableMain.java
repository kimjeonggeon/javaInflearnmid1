package lang.object.immutable.change;

public class MutableMain {
    public static void main(String[] args){
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        System.out.println("반환값 받기전에는"+obj1.getValue());
        /*위에 값은 그대로 10이나오고 */
        /*불변객체로 반환 할경우에는  add 가 아니라 새로운 것을 참조하는 것이므로  꼭 반환 값을 받아야한다. */
        ImmutableObj add = obj1.add(20);
        System.out.println("반환값 받은 후"+add.getValue());
        /*아래와 같이해야한다.*/
    }
}
