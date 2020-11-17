package org.progmatic.nov17.timeserver;

import java.time.LocalDateTime;

public interface TimeAware {

    void timeTell(LocalDateTime currentTime);
}
