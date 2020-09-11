package ch.l0r5.exercises;

import java.util.*;

public class Exercise {


    public static void someExercise() {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            StringBuilder resultString = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if(j == n-1) {
                    resultString.append(a + calcPairs(b, j));
                } else {
                    resultString.append(a + calcPairs(b, j)).append(" ");
                }
            }
            System.out.println(resultString);
        }
        in.close();
    }

    private static int calcPairs(int b, int j) {
        int pairResult = 0;
        for (int i = 0; i <= j ; i++) {
            pairResult  += (int) Math.pow(2, i) * b;
        }
        return pairResult;
    }

}
