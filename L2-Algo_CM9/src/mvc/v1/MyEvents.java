package mvc.v1;

public class MyEvents {
    public static final MyEvents LOWER_BOUND_CHANGE=new MyEvents();
    public static final MyEvents UPPER_BOUND_CHANGE=new MyEvents();
    public static final MyEvents CURRENT_VALUE_CHANGE=new MyEvents();
    private MyEvents(){}
}