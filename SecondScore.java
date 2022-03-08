public class SecondScore {
            public static void main(String[] args) {
                boolean gameOver = true;
                int score = 800;
                int levelCompleted = 5;
                int bonus = 200;
                //System.out.println(score);

                if (gameOver == true) {
                    int finalScore = score + (levelCompleted * bonus);
                    System.out.println("Your final score was " + finalScore);
                }
                boolean newGameOver = true;
                int newScore = 10000;
                int newLevelCompleted = 8;
                int newBonus = 200;
                if (newGameOver == true) {
                    int newFinalScore = newScore + (newLevelCompleted * newBonus);
                    System.out.println("Your new final score was " + newFinalScore);
                }

            }

    }
