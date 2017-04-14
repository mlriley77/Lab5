import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Casino");


        System.out.println("How many sides should each die have: ");
        int userInput = scan.nextInt();



        System.out.println("Roll 1: ");
        System.out.println(randomInt(userInput));
        System.out.println(randomInt(userInput));
    }
    public static int randomInt (int numDice) {
        Random rand = new Random();

        return rand.nextInt(numDice) + 1;



    }
}

