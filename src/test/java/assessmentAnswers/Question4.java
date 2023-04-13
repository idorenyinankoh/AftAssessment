package assessmentAnswers;

public class Question4 {

    // The simple interest calculator
    public static String simpleIntCalc(float principal, int time, float rate){
        Float si = (principal*time*rate)/100;
        String result =  "The simple interest on "+ principal+" for "+time+"year(s), at the rate of" +
                " " +rate+ " is "+si;

        return result;

    }

// Runing the code
    public static void main(String[] args) {
        System.out.println( simpleIntCalc(100F,1,10F));
    }
}
