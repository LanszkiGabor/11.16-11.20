package org.progmatic.nov17.timeserver;

import java.time.LocalDateTime;

public class LazyGuy implements TimeAware{

    @Override
    public void timeTell(LocalDateTime currentTime) {
        if (currentTime.getHour() >= 20 || currentTime.getHour() < 11) {
            System.out.println("Hagyj aludni!");
        } else {
            System.out.println("Kösz, hogy szoltál");
        }
    }
}
