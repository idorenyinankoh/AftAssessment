package assessmentAnswers;

public class Question6 {
    public static String duplicateExterminator(String str) {
        String finalWord = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (finalWord.indexOf(currentChar) == -1) {
                finalWord += currentChar;
            }
        }
        return finalWord;
    }

    public static void main(String[] args) {
        System.out.println( duplicateExterminator("Concatenate"));
        System.out.println( duplicateExterminator("Hello"));
    }
}
