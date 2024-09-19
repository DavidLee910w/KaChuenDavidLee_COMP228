package WeekThree;

//importing classes or libraries
import java.util.Scanner;

public class LearningMethods {
    String hello = "hello";
    /**
     * This method takes two integer values and returns the addition of both values
     * @param num1
     * @param num2
     * @return num1 + num2
     */
    public static int addNums(int num1, int num2) {
        return num1 + num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return num1*num2 in String
     */
    public static String addNums(String num1, String num2)
    {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        return Integer.toString(x * y);
    }

    public static int addNums(long num1, long num2) {
        return (int)(num1 + num2);
    }

    public static void main(String[] args) {
        //Scenario 1: Add numbers together.
        Scanner scanner = new Scanner(System.in); //utilizing scanner to take user input
    double x = Math.round(scanner.nextDouble()); //First user input: type double
    double y = Math.round(scanner.nextDouble()); //Second user input: type double

    System.out.println("The method addnums ran and gave: " + addNums((int)x,(int)y));
    String xx = "354"; //First value: type string
    String yy = "225"; //Second value: type string

        //Formatted output
    System.out.printf("The multiplication of %s and %s is: %s ",xx,yy,addNums(xx,yy));
    scanner.close();

    //Scenario 2: take 2 string numbers, convert them, multiply them, convert them back, return them.
    }
}
