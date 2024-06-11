package lang.object.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

/*불변객체 만든다 set안됨  불변객체는  주로  set이 아니라 with라고 메서드 명을 지음*/



    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) {
       return new ImmutableMyDate(newYear,month,day);
    }


    @Override
    public String toString(){
    return year + "-" +month + "-"+day;
    }
}
