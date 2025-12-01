package mvc.v2;

public class PCMainProg {
    public static void main(String[] args) {
        PCModel model = new PCModel();
        PCListener listener = new PCListener();
        model.addPropertyChangeListener("prop1", listener);
        model.setProp1(3);
    }
}