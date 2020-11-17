package org.progmatic.nov17.intelligens;

public class Parrot implements Intelligent{

    @Override
    public void answer(String question) {
        System.out.println(question);
    }
}
