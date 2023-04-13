package assessmentAnswers;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question5 {

    public  boolean isPalindromeCheck(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        //System.out.println(reversed);
        return str.equalsIgnoreCase(reversed);
    }

    @Test
    public void isPalindromeTest() {
        SoftAssert softAssert = new SoftAssert();
        Question5 obj = new Question5();
        String str1 = "Madam";
        String str2 = "Yekini";

        boolean str1result = true;
        boolean str2result = false;

        softAssert.assertEquals(str1result, obj.isPalindromeCheck(str1));
        softAssert.assertEquals(str2result, obj.isPalindromeCheck(str2));
        softAssert.assertAll();
    }
}
