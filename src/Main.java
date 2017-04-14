import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userAnswer;

        System.out.println("Welcome to the Casino");

        do {


            System.out.println("How many sides should each die have: ");
            int userInput = scan.nextInt();
            scan.nextLine();


            System.out.println("Roll 1: ");
            System.out.println(randomInt(userInput));
            System.out.println(randomInt(userInput));

            System.out.println("Do you want to continue?(y/n) ");
            userAnswer = scan.nextLine();


        } while (userAnswer.equalsIgnoreCase("y"));


    }


    public static int randomInt(int numDice) {
        Random rand = new Random();

        return rand.nextInt(numDice) + 1;


    }
}

