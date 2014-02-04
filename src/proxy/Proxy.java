package proxy;

public class Proxy implements Operation {
    private static final int LIMIT = 3;
    private static int counter = 0;

    private final OperationImpl realSubject;
    private int order;

    public Proxy() {
        this.order = ++counter;
        this.realSubject = new OperationImpl();
    }

    @Override
    public void doOneThing() {
        if (order <= LIMIT) {
            realSubject.doOneThing();
        } else {
            System.out.println("Concurrent limit reached. Try later!");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        --counter;
    }
}
