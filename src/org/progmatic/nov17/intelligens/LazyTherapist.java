package org.progmatic.nov17.intelligens;

public class LazyTherapist implements Intelligent{

    @Override
    public void answer(String question) {
        char[] last = question.toCharArray();
        if (last[last.length-1] == '?') {
            int random = (int) (Math.random() * 5);
            switch (random) {
                case 0 :
                    System.out.println("Biztos ön ebben?");
                    break;
                case 1 :
                    System.out.println("Miért gondolja ezt?");
                    break;
                case 2 :
                    System.out.println("El tudja képzelni ennek az ellenkezőjét is?");
                    break;
                case 3 :
                    System.out.println("Nem tudom. Talán így van. Ön mit gondol erről?");
                    break;
            }
        } else if (last[last.length-1] == '!') {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0 :
                    System.out.println("Most dühös lett?");
                    break;
                case 1 :
                    System.out.println("Mit érez miközben ezt mondja?");
                    break;
                case 2 :
                    System.out.println("Feszült lett attól, amiről beszélünk?");
            }
        } else {
            int random = (int) (Math.random() * 5);
            switch (random) {
                case 0 :
                    System.out.println("Kérem, folytassa");
                    break;
                case 1 :
                    System.out.println("Biztos ebben?");
                    break;
                case 2 :
                    System.out.println("Csakugyan?");
                    break;
                case 3 :
                    System.out.println("Hmm. Ez érdekes. Kérem fejtse ki bővebben!");
                    break;
            }
        }
    }
}
