import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {
        int result = 3 + 1; // 3 + 1 = 4
        System.out.println("3 + 1 = " + result);
        int previousResult = result + 2; // 4 + 2 = 6
        System.out.println("4 + 2 = " + previousResult);
        result = previousResult - 1; // 6 - 1 = 5
        System.out.println("6 - 1 = " + result);
        result++; // 5 + 1 = 6
        System.out.println("5 + 1 = " + result);
        result += 2; // 6 + 2 = 8
        System.out.println("6 + 2 = " + result);
        result *= 10; // 8 * 10 = 80
        System.out.println("8 * 10 = " + result);
        result--; // 80 - 1 = 79
        System.out.println(result);
        result += 11; // 79 + 11 = 90
        System.out.println("79 + 11 = " + result);
        result /= 10; // 90 / 10 = 9
        System.out.println("90 / 10 = " + result);
        boolean isAlien = false;
        if (isAlien == true) {
            // if (isAlien) {
            System.out.println("It is not an Alien!");
            System.out.println("I am scared of Aliens!");
        }

        int topScore = 100;
        if (topScore < 102)
        {
            System.out.println("I am the topper!");
        }

        int secondTopScore = 87;
        if ((topScore > secondTopScore) && (topScore < 102)) {
            // before && and after && the value should match and should be true
            System.out.println("Greater than top score and less than 100");
        }

        int thirdTopScore = 94;
        if ((topScore > thirdTopScore) || (secondTopScore < 102)) {
            // before || (Logical OR) and after || the value should match and should be true
            System.out.println("Code will print else it will not.");
        }
        int randomValue = 50;
        if (randomValue == 50) {
            // Always use double == in the if condition else it will give error or will not print anything in the code block.
            System.out.println("This will print!");
        }

        boolean car = false;
        if (!car) {
            //the boolean value should match with the if statement
            System.out.println("This will not print!");
        }
    }
}
