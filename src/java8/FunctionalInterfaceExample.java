package java8;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {


        A a = new A();
        a.log();

        B b = new B();
        b.log();

        C c = new C();
        c.log();

    }

    public static class A implements Functional1 {

        @Override
        public void method1() {

        }
    }

    public static class B implements  Functional2 {

        @Override
        public void method2() {

        }
    }

    public static class C implements Functional1,Functional2 {

        @Override
        public void method1() {

        }

        @Override
        public void log() {

            System.out.println("Message from class c");
        }

        @Override
        public void method2() {

        }
    }

    @FunctionalInterface
    public static interface Functional1 {

        void method1();

        default void log()
        {
            System.out.println("Message from Functional1");
        }

    }

    @FunctionalInterface
    public static interface Functional2 {

        void method2();

        default void log()
        {
            System.out.println("Message from Functional2");
        }
    }
}
