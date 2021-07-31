import java.sql.SQLOutput;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Shely!");
        int myFirstNumber = 5 * 8;
        int mySecondNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber;
        int myLastOne = 1000 - myTotal;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myLastOne);
        System.out.println("My Minimum Value = " + myMinIntValue);
        System.out.println("My Maximum Value = " + myMaxIntValue);

        byte myByVariable = 19;
        short myShVariable = 20;
        int myIntVariable = 2;
        //long myLngVariable();
        long myLngVariable = 50000L + 10L * (myByVariable + myShVariable + myIntVariable);
        System.out.println(myLngVariable);


    }
}
