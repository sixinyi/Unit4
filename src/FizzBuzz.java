// Bruce 12/5  this program is about +++++something and then println.

import java.util.Scanner;

public class FizzBuzz {
    public static String fizzBuzz(int num){
        String returnS = "";


        for (int v = 1; v <= num; v++){

            if ((v % 3 == 0)&&(v % 5 == 0)) {
                returnS += "FizzBuzz ";
            }

            else if (v % 3 == 0){
                returnS += "Fizz ";
            }

            else if (v % 5 == 0){
                returnS += "Buzz ";
            }

            else{
                returnS += v+" ";
            }

            if (v % 20 == 0)
                returnS += "\n";
        }
        return returnS;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Max value? ");
        int value = input.nextInt();
        System.out.print(fizzBuzz(value));
}