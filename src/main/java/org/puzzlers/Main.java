package org.puzzlers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Main {

    @Scheduled(fixedDelay = 1000)
    public void init() {
        JokerConfService jokerConfService = new JokerConfServiceImpl();
        jokerConfService.pay();
    }
}
