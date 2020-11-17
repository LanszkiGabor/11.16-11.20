package org.progmatic.nov17.intelligens;

import java.util.Scanner;

public class IntelligentMain {
    public static void main(String[] args) {
        LazyTherapist lazyTherapist = new LazyTherapist();
        speak(lazyTherapist);

    }

    public static void speak(Intelligent robot) {
        System.out.println("Turing tesz");
        Scanner sc = new Scanner(System.in);
        String question;
        do {
            System.out.print("Mondat: ");
            question = sc.nextLine().toLowerCase();
            robot.answer(question);
        } while (!question.equals("vége"));
    }
}
