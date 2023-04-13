package assessmentAnswers;

public class Question3Cat extends Question3Animal{
    // Overiding the animal sound method
    public void sound() {
        System.out.println("This is the cat sound");
    }

    // Using the sound method
    public static void main(String[] args) {
        Question3Cat obj = new Question3Cat();
        obj.sound();
    }
}
