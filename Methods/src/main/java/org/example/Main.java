package org.example;

public class Main {
    public static void main(String[] args) {


        int result1 = calculateScore(true, 800, 5, 100);
        int result2 = calculateScore(true, 10000, 8, 200);

        // use results
       int finalResult = result1 + result2;
        System.out.println(finalResult);
    }
    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus ) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static int calculateScore2 (boolean gameOver, int score, int levelCompleted, int bonus ) {
        if (!gameOver) {
            return -1;
        }

        int finalScore = score + (levelCompleted * bonus);
        finalScore += 2000;
        System.out.println("Your final score was " + finalScore);
        return finalScore;

    }
}