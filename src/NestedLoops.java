//Bruce 12.4  This is the procedure required by some teachers.

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    }


    public static String xSquare(){
        String fiber = "";
        for (int n1 = 1; n1<6; n1++){
            for (int n2 = 1; n2<6; n2++){
                fiber +="X";
            }
            fiber += "\n";
        }
        return fiber;
    }


    public static String xSquare2(int n){
        String fiber = "";
        for (int n1 = 1; n1<= n; n1++){
            for (int n2 = 1; n2<= n; n2++){
                fiber +="X";
            }
            fiber += "\n";
        }
        return fiber;
    }


    public static String flippedTriangle(int n){
        String fiber = "";
        for (int n1 = 1; n1 <= n; n1++){
            for (int n2 = n-n1+1; n2 >= 1; n2--){
                fiber += "*";
            }
            fiber += "\n";
        }
        return fiber;
    }


    public static String multiplicationTable(){
        String fiber = "";
        for (int n1 = 1; n1 <= 9; n1 ++){
            for (int n2 = 1; n2 <= 9; n2++){
                if (n2*n1 >= 10)
                    fiber += " "+n2*n1;
                else
                    fiber += "  "+n2*n1;
            }
            fiber += "\n";
        }
        return fiber;
    }


}