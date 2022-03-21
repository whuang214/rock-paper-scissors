import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Let's play rock, paper, scissors!");

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What are you throwing? (rock, paper, or scissors");
        String myThrow = myScanner.nextLine();

        System.out.println("Hi will!");

        System.out.println("You're throwing " + myThrow);
    }

}
