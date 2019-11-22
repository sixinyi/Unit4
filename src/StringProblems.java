// Bruce 11/22 StringProblems
public class StringProblems {
    public static String printTheLetters(String words) {
        String answer = "";

        int length = words.length();
        for (int num = 0; num < length; num++) {
            answer += words.substring(num, num + 1) + "\n";
        }

        return answer;
    }

    public static String everyOtherLetter(String words) {
        String answer = "";

        int length = words.length();
        for (int num = 0; num < length; num++) {
            if (num % 2 == 0) {
                answer += words.substring(num, num + 1);
            }
        }

        return answer;
    }
    public static int countTheVowels(String words){
        int answer = 0;

        String rawData = words.toLowerCase();
        int length = words.length();

        for (int value = 0; value < length; value ++){
            String w = words.substring(value,value+1);
            if ((w.equals("a"))||(w.equals("e"))||(w.equals("i"))||(w.equals("o"))
                    ||(w.equals("u"))||(w.equals("A"))||(w.equals("E"))
                    ||(w.equals("I"))||(w.equals("O"))||(w.equals("U")))
                answer++; }

        return answer;
    }
    public static String differentStrings(String s1, String s2){
        int answer = 0;
        String result = "";
        if (s1.length() > s2.length()) {
            for (int value = 0; value < s2.length(); value++) {
                if (s2.substring(value, value + 1).equals(s1.substring(value, value + 1))) {
                    answer = value + 2;
                } else {
                    answer = value + 1;
                    break;
                }
            }
            result = s1+" and "+s2+ "are not the same. They differ at letter number "+answer+".";
        }
        else if (s1.length() < s2.length()){
            for (int value = 0; value < s1.length(); value++) {
                if (s1.substring(value, value + 1).equals(s2.substring(value, value + 1))) {
                    answer = value + 2;
                } else {
                    answer = value + 1;
                    break;
                }
            }
            result = s1+" and "+s2+ " are not the same. They differ at letter number "+answer;
        }

        else
            result = s1+" and "+s2+" are the same";

        return result;
    }
    public static boolean isPalindrome(String s){
        boolean answer = false;
        for (int value = 0; value < s.length(); value++) {
            if (s.substring(value, value + 1).equals(s.substring((s.length() - value-1), s.length() - value)))
                answer = true;
        }
        return answer;
    }
}
