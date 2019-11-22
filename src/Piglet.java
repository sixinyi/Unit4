// Bruce 11/22 piglet. User is expected to type in "y" or "n".
import java.util.Scanner;

public class Piglet {

    public static String game() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");
        int out = 0;
        String userAnswer = "y";

        while (userAnswer.equals("y")) {
            int Ro = (int) (Math.random() * 6) + 1;

            if (Ro == 1) {
                out = 0;
                System.out.println("You rolled a 1!");
                userAnswer = "n";
                return "You got 0 points.";
            }

            else {
                out += Ro;
                System.out.println("You rolled a " + Ro  + "!");
                System.out.println("Roll again?");
                userAnswer = input.next();
            }
        }

        return "You got " + out + " points.";

    }
    public static void main(String[] args){
        System.out.println(game());
    }


}
