package xyz.shiqihao.thinking.in.java.chap14_typeinfo;

public class SimpleProxyDemo {
    private static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("apple");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
