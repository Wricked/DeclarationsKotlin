package academy.learnprogamming.javacode;

import java.util.Arrays;

public class DummyClass {

    public String isVacationTime(Boolean onVacation) {
        return onVacation ? "I'm on vacation." : "I'm working."; // Checks is onVacation is true : false
    }

    public void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void method1 (char[] charArray) {
        System.out.println(Arrays.toString(charArray));
    }
}
