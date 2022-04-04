package LambdasPractice;

public class Lmabda {
    public static void main(String[] args) {
        myFirstLambda();

    }

    private static void myFirstLambda() {
        Runnable myFirstLambda = () -> System.out.println("Hello World");
    }


}
