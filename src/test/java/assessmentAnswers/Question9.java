package assessmentAnswers;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question9 {
    public String textToUpperCase(String str ){
        if(str == null){
            System.out.println("Please pass a valid string");
        }else {
            return str.toUpperCase();
        }
        return str;
    }
    @Test
    public void testing() {
        String expected = "ANKOH WAMBISAKA LAMANGO";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expected, textToUpperCase("Ankoh Wambisaka Lamango"));
        softAssert.assertAll();

    }

}
