package assessmentAnswers;

public class Question3Dog extends Question3Animal{

    // Overiding the animal sound method
    public void sound() {
        System.out.println("This is the dog sound");
        //return "This is the dog sound";
    }

    // Using the sound method
    public static void main(String[] args) {
        Question3Dog obj = new Question3Dog();
        obj.sound();
    }
}
