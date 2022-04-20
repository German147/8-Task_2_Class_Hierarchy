package Homework_Reflection_And_Threads;

import java.lang.reflect.Constructor;

public class Example2 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("constructor1");

            Constructor[] ctorlist = cls.getDeclaredConstructors();
            for (int i = 0; i < ctorlist.length; i++) {
                Constructor ct = ctorlist[i];
                System.out.println("name = " + ct.getName());
                System.out.println("decl class = " +
                        ct.getDeclaringClass());
                Class[] pvec = ct.getParameterTypes();
                for (int j = 0; j < pvec.length; j++)
                    System.out.println("param #"
                            + j + " " + pvec[j]);
                Class[] evec = ct.getExceptionTypes();
                for (int j = 0; j < evec.length; j++)
                    System.out.println(
                            "exc #" + j + " " + evec[j]);
                System.out.println("-----");
            }
        } catch (Throwable e) {
            System.err.println(e);
        }
    }

    public static class constructor1 {

        public constructor1() {
        }

        protected constructor1(int i, double d) {
        }
    }
}
