package ch.l0r5.exercises;

import java.lang.reflect.Method;

public class GenericMethods {

    static class Printer {

        public <T> void printArray(T[] anyArray) {
            for(T ele : anyArray) {
                System.out.println(ele.toString());
            }
        }
    }


    public static void print() {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");
    }
}


