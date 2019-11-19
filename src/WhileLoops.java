// 11.15 Bruce this is about a lot of program in one
import java.util.Scanner;

public class WhileLoops {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static String fromHereToThere(int nums, int nume){
        int num = nums;
        String result = "";

        if (nums > nume)
            return "Invalid input";
        else
            while (num <= nume) {
                result += num + " ";
                num++;
            }
        return result;
    }
    public static String factors(int num) {
        int begin = 1;
        String output = "";

        while (begin <= num) {
            if (num % begin == 0)
                output += begin + " ";
            begin ++;
        }
        return "The factors of "+num+" are: "+output;
    }
    public static String countPosAndNeg(){
        int number = 1, p = 0, n = 0;
        if (number > 0)
        while ((number > 0)||(number < 0)) {
            System.out.print("Enter a positive or negative number or 0 to quit: ");
            number = input.nextInt();
            if (number > 0)
                p ++ ;
            if (number < 0)
                n ++ ;
            }
       return "There were "+p+" positive and "+n+" negative numbers.";
    }
    public static String findMinAndMax(){
        int count = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        while (count < 5){
            System.out.print("Number: ");
            int number  = input.nextInt();
            if (number  > max)
                max = number ;
            if (number  < min)
                min = number ;
            count++;
        }
        return "Max value is: "+max+"\nMin value is: "+min;
    }
    public static double gradePoint(){
        int loop = 0;
        String score = "";
        double Score = 0.0;
        double grade = 0;
        System.out.println("Enter seven letter grades (A, B, C, D, or F)");

        while (loop < 7){
            score = input.next();
            if (score.equals("A"))
                Score = 4.0;
            else if (score.equals("B"))
                Score = 3.0;
            else if (score.equals("C"))
                Score = 2.0;
            else if (score.equals("D"))
                Score = 1.0;
            else if (score.equals("F"))
                Score = 0.0;
            grade += Score  ;

            loop ++;
        }
        double mean = (int)(grade*100/7+0.5);
        double GPA = mean/100;
        return GPA;
    }
}