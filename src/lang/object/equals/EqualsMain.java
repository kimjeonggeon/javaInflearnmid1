package lang.object.equals;

public class EqualsMain {
    public static void main(String[] args){
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-200");
        System.out.println("identity"+(user1 == user2));
    }
}
