package org.universityHierarchy.Homework_Reflection_And_Threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadsExample {

    private static final Logger LOGGER = LogManager.getLogger(ThreadsExample.class);

    public static void main(String[] args) {

        Car c = new Car();
        Car c1 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        Car1 c5 = new Car1();
        Car1 c6 = new Car1();
        Car1 c7 = new Car1();

        ThreadPoolExecutor tp = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        tp.execute(c);
        tp.execute(c1);
        tp.execute(c3);
        tp.execute(c4);
        tp.execute(c5);
        tp.execute(c6);
        tp.execute(c7);
        tp.shutdown();

    }

    public static class Car extends Thread {
        @Override
        public synchronized void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LOGGER.info("this is the run called from the Car Class");
            //   System.out.println("this is the run called from the Car Class");
        }
    }

    public static class Car1 implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //  System.out.println("This is the run method from the Car1 Class");
            LOGGER.info("This is the run method from the Car1 Class");
        }
    }
}
