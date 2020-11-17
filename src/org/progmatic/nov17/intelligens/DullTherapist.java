package org.progmatic.nov17.intelligens;

public class DullTherapist implements Intelligent{

    @Override
    public void answer(String question) {
        int random = (int) (Math.random()*5);
        switch (random) {
            case 0:
                System.out.println("Kérem, folytassa");
                break;
            case 1:
                System.out.println("Biztos ebben?");
                break;
            case 3:
                System.out.println("Csakugyan?");
                break;
            case 4:
                System.out.println("Nem tudom. Talán így van. Ön mit gondol erről?");
                break;
        }
    }
}
