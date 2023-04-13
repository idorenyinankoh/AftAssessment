package assessmentAnswers;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question2 {
    //Create a function that calculates the power of a number.
    // Then write a unit test to check the correctness of the function.

    // The power calculator method
    public static double powerCalculator(int number, int power){
        return Math.pow(number,power);
    }


    // Unit Test for the method
    @Test
    public void powerCalcTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(27.0, powerCalculator(3,3));
        softAssert.assertEquals(1.0, powerCalculator(3,0));
        softAssert.assertEquals(0.1111111111111111, powerCalculator(3,-2));
        softAssert.assertEquals(0.1111111111111111, powerCalculator(-3,-2));
        softAssert.assertEquals(9.0, powerCalculator(-3,2));
        softAssert.assertAll();
    }

}
