public class IfElseMoreIfElse {
    public static void main(String[] args) {

        int myScore = 98;
        int totalScore = 100;

        if (myScore > 100) {
            System.out.println("I scored full marks.");
        }
        else if (myScore == 98 && myScore > totalScore) {
            System.out.println("I scored more than full marks.");
        }
        else {
            System.out.println("I scored NINETY EIGHT!");
        }
    }
}
