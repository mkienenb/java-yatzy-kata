package org.codingdojo;

import org.codingdojo.yatzy1.Yatzy1;

public class YatzyExplorer {
    public static void main(String[] args) {
        int d1 = 2;
        int d2 = 4;
        int d3 = 1;
        int d4 = 6;
        int d5 = 6;

        Yatzy1 a = new Yatzy1(1, 1, 1, 2, 2);
        Yatzy1 b = new Yatzy1(2, 4, 5, 1, 1);
        Yatzy1 c = new YatzyScorer(d1, d2, d3, d4, d5);

        int onesScore = YatzyScorer.ones(d1, d2, d3, d4, d5);
        int twosScore = Yatzy1.twos(d1, d2, d3, d4, d5);
        int threesScore = Yatzy1.threes(d1, d2, d3, d4, d5);

        int fourScore = c.fours();
        int fiveScore = d.fives();
    }

}