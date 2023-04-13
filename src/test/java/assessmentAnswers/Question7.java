package assessmentAnswers;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question7 {
    public static void oddNumberCatcher(int[] array) {
        int[] arr = array;
        System.out.println("The odd numbers are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(+ arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        oddNumberCatcher(new int[]{1, 2, 3, 4, 5, 6});
        oddNumberCatcher(new int[]{34, 2, 9, 91, 19, 401, 0});

    }
}
