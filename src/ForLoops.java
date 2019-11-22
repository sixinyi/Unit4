//Bruce 11/21 talk about how to use For loops multiple methods
import java.util.Scanner;

public class ForLoops {
    static Scanner input = new Scanner(System.in);

    public static String printingHashTags(int number){
        String outcome = "";

        for (int tag = 1; tag <= number; tag++){
            outcome += "#";
        }
        return outcome;
    }

    public static String countDown(int n1, int n2){
        String outcome = "";

        if (n1 == n2)
            outcome = String.valueOf(n2)+" ";

        else if (n1<n2){
            for(int number = n2; number >=n1; number--)
                outcome += number + " ";
        }

        else
            outcome = "";

        return outcome;
    }

    public static String countDown2(int n1, int n2){
        String outcome = "";
        if (n1<n2){
            for(int number = n2; number >=n1; number--){
                outcome += number + " ";
            }}
        else if (n1>n2){
            for(int number = n1; number >=n2; number--){
                outcome += number + " ";
            }}
        else
            outcome = String.valueOf(n2)+" ";
        return outcome;
    }

    public static int sumNumbers(int n1, int n2){
        int outcome = 0;

        if (n1 == n2){
            outcome = n1;
        }

        else if (n1 > n2){
            for (int number = n2; number <= n1; number++){
                outcome += number;
            }
        }
        else if (n1 < n2){
            for (int number = n1; number <= n2; number++){
                outcome += number;
            }
        }

        else
            outcome = 0;

        return outcome;
    }

    public static void main(String[] args){
    }
}