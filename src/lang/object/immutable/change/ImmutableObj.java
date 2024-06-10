package lang.object.immutable.change;

public class ImmutableObj {
    private int value;

    public ImmutableObj(int value) {
        this.value = value;
    }
    public ImmutableObj add (int addValue){
        int result = value + addValue;
        return new ImmutableObj(result);
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }

}
