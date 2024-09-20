package FirstProj;

public class Shopping {
    static  int numberOfOrders = 0;
public static void main(String[] args) {

}

    private static void order(Customer customer,String phoneNumber ,String productName, int price){
        numberOfOrders ++;
        System.out.println("고객이름"+customer +"전화번호"+phoneNumber);
    }
}
