package ch.l0r5.exercises.instanceofTutorial;

import java.util.ArrayList;
import java.util.Scanner;

import static ch.l0r5.exercises.instanceofTutorial.InstanceOFTutorial.count;

public class IOTRunner {
    public static void start() {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))mylist.add(new Student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}
