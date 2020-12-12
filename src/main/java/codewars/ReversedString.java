package codewars;

public class ReversedString {
    public static void main(String[] args) {
        String result = solution("world");
        System.out.println(result);
    }

    public static String solution(String str) {
        int strLength = str.length();
        String stringInversat = "";

        for (int i = strLength-1; i >=0; i--) {
            stringInversat += str.charAt(i);
        }
        // Your code here...
        return stringInversat;
    }

}

