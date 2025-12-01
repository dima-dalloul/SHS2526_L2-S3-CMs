package mvc.v1;

public class MainProgram {
    public static void main(String[] args) {
        BoundedInteger model = new BoundedInteger(1,0,10);
        BasicBIObserver anObserver = new BasicBIObserver(model,"Observer 1");
        model.increment();
        model.decrement();
        model.setLowerBound(20);
    }
}