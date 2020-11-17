package org.progmatic.nov17.timeserver;

import java.time.LocalDateTime;

public class HungryGuy implements TimeAware{

    @Override
    public void timeTell(LocalDateTime currentTime) {
        if (currentTime.getHour() == 8) {
            System.out.println("Juhhuuu reggeli idő!");
        } else if (currentTime.getHour() == 12) {
            System.out.println("Juhhuuu ebéd idő!");
        } else if (currentTime.getHour() == 18) {
            System.out.println("Juhhuuu vacsora idő!");
        } else {
            System.out.println("Juj de éhes vagyok...");
        }
    }
}
