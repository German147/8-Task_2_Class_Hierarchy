package org.universityHierarchy.Homework_Reflection_And_Threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Her we use some java.util.concurrent package tools
 */
public class ThreadsPool {

    private static final Logger LOGGER = LogManager.getLogger(ThreadsPool.class);

    public static void main(String[] args) {

        Car c = new Car();
        Car c1 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        Car c44 = new Car();
        Car1 c5 = new Car1();
        Car1 c6 = new Car1();
        Car1 c7 = new Car1();


/**
 * ThreadPoolExecutor is an interface
 * that represents an object that executes provided tasks.
 */
        int nThreads = 5;
        ThreadPoolExecutor threadExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(nThreads);


        threadExecutor.execute(c);
        threadExecutor.execute(c5);
        threadExecutor.execute(c44);
        threadExecutor.execute(c1);
        threadExecutor.execute(c3);
        threadExecutor.execute(c4);
        threadExecutor.execute(c6);
        threadExecutor.execute(c7);
        threadExecutor.submit(() -> {
            LOGGER.info("Here I am printing this message using submit() method from the executor interface");
        });
        threadExecutor.shutdown();

    }


    public static class Car extends Thread {
        @Override
        public synchronized void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                LOGGER.debug(e);

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
                LOGGER.debug(e);
            }
            //  System.out.println("This is the run method from the Car1 Class");
            LOGGER.info("This is the run method from the Car1 Class");
        }
    }
}
