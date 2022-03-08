public class ScoreScope {
    public static void main(String[] args) {
        boolean oldGameOver = true;
        int oldScore = 1000;
        int oldLevelCompleted = 5;
        int oldBonus = 100;

        if (oldGameOver == true) {
            int oldFinalScore = oldScore + (oldBonus * oldLevelCompleted);

            System.out.println("Old final score = " + oldFinalScore);
        }
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver == true) {
            int finalScore = score + (bonus * levelCompleted);

            System.out.println("finalScore = " + finalScore);
        }
    }
}
