package assessmentAnswers;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question10 {
    public String textToSentence(String str ){

        String s = new String(String.valueOf(str.charAt(0)));
        s.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char chars= str.charAt(i);
            if (chars == '.') {
                while(str.charAt(i) != ' '){
                    s=String.valueOf(chars);
                    s.toUpperCase();
                }
            }
        }
        return str;
    }
    @Test
    public void testingSentence() {
        System.out.println( textToSentence("me and my guys. and after that"));
        String expected = "Me and my guys. And after that";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expected, textToSentence("me and my guys. and after that"));
        softAssert.assertAll();

    }
}
