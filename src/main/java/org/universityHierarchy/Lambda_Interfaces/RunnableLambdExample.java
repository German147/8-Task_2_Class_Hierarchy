package org.universityHierarchy.Lambda_Interfaces;

/**
 * create a practice for the Runnable class, it is a Functional interface witn only one
 * method run();
 */
class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("The run method is called...");
    }
}

/**
 * Here is an example on how we create a thread and run a lambda expression inside it...//or with it..
 */
public class RunnableLambdExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = () -> System.out.println("Run method using Lambda...from the thread");

        Thread threadLambda = new Thread(runnable);
        threadLambda.start();

    }
}
