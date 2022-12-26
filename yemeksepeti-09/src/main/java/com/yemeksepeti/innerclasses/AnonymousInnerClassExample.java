package com.yemeksepeti.innerclasses;

public class AnonymousInnerClassExample {

    @FunctionalInterface
    public interface IHello {
        void sayHello(String name);

        default void sayHello2(String name) {
        }

        ;

        static void sayHello3(String name) {
        }

        ;
    }

    public void greetSomeone(String name, IHello innerInterface) {
        innerInterface.sayHello(name);
    }

    public static void main(String[] args) {
        AnonymousInnerClassExample example = new AnonymousInnerClassExample();

        // example.greetSomeone("Koray", new IHello() {
        //     @Override
        //     public void sayHello(String name) {
        //         System.out.println("Merhaba " + name);
        //     }
        // });

        //  example.greetSomeone("Koray", (String name) -> System.out.println("Merhaba " + name));
        example.greetSomeone("Koray", (name) -> System.out.println("Merhaba " + name));
        example.greetSomeone("Ali", n -> System.out.println("Hello " + n));
        HelloImpl hello = new HelloImpl();
        example.greetSomeone("Ayşe", hello);
    }

    private static class HelloImpl implements IHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hola " + name);
        }
    }

}
