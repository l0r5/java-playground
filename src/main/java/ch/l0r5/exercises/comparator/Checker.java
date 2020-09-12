package ch.l0r5.exercises.comparator;

import java.util.Comparator;


class Checker implements Comparator<Player> {

//    20
//    b 3
//    a 1
//    bb 3
//    b 8
//    bba 0
//    bb 2
//    bca 6
//    ccc 4
//    b 3
//    ab 8
//    bb 3
//    bb 7
//    ccb 8
//    bbb 2
//    aab 8
//    b 6
//    ab 8
//    cb 9
//    cbb 8
//    ba 9
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.score > p2.score) {
            return -1;
        } else if (p1.score == p2.score) {
            char[] p1Name = p1.name.toCharArray();
            char[] p2Name = p2.name.toCharArray();
            int maxChecks = Math.min(p1.name.length(), p2.name.length());
            for (int i = 0; i < maxChecks; i++) {
                if (p1Name[i] > p2Name[i]) return 1;
                if (p1Name[i] < p2Name[i]) return -1;
            }
            if (p1.name.length() < p2.name.length()) {
                return -1;
            } else if(p1.name.length() > p2.name.length())
                return 1;
            return 0;
        } else {
            return 1;
        }
    }
}
