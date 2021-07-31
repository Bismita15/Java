import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        int StudentAge = 28;
        double StudentGPA = 3.7;
        boolean hasPerfectAttendance = true;
        String StudentName = "Shely Bismita Behera";
        char StudentFirstInitial = StudentName.charAt(3);
        char StudentLastInitial = StudentName.charAt(7);
        String StudentFirstName = "Shely Bismita";
        String StudentLastName = "Behera";

        System.out.println(StudentAge);
        System.out.println(StudentGPA);
        System.out.println(StudentFirstInitial);
        System.out.println(StudentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(StudentName);
        System.out.println(StudentFirstName + " " + StudentLastName + " has a GPA of " + StudentGPA);
        System.out.println("What do you want to update it to?");

                Scanner input = new Scanner(System.in);
                StudentGPA = input.nextDouble();

                System.out.println(StudentFirstName + " " + StudentLastName + " has a updated GPA of " + StudentGPA);
                System.out.println("Pick a number between 1 and 10");
                Scanner scanner = new Scanner(System.in);

                int inputtedNum = scanner.nextInt();

                if (inputtedNum < 5) {
                        System.out.println("Its a chocolate");
                } else {
                        System.out.println("Its an icecream");
                }


    }
}