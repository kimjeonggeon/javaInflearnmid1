package lang.object.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args){
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;



        System.out.println("date1+"+date1);
        System.out.println("date2+"+date2);


        System.out.println("date1 ---> 2025");
        date1 = date1.withYear(2025); /* 무조건 불변객체는 반환하는 값을 해줘야지 값이 변한다.*/
        System.out.println(date1+"1");
        System.out.println(date2+"2");

    }
}
