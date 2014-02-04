package proxy;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void firstThreeUsersShouldBeAbleToExecute() {
        Operation operation1 = new Proxy();
        Operation operation2 = new Proxy();
        Operation operation3 = new Proxy();

        operation1.doOneThing();
        operation2.doOneThing();
        operation3.doOneThing();

        Operation operation4 = new Proxy();
        operation4.doOneThing();
        operation4 = null;

        System.out.println("Free one slot!");
        operation1 = null;
        //Simulate GC
        System.gc();
        System.runFinalization();

        System.out.println("Retrying...!");
        operation4 = new Proxy();
        operation4.doOneThing();
    }
}
