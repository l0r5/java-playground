package ch.l0r5.exercises;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {


    public static void someExercise() {

//        File file = new File("src/main/resources/ReadFromInput_DummyText.txt");

//            Hello world
//            I am a file
//            Read me until end-of-file.

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(count + " " + line);
            count++;
        }


    }
}

