package com.dong.springtaskdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduledService {
    @Scheduled(cron = "0/5 * * * * *")
    public void scheduled() {
        log.info("哇磊哥好帅啊", System.currentTimeMillis());

    }

    @Scheduled(fixedRate = 5000)
    public void scheduled1() {
        log.info("夜夜夜夜", System.currentTimeMillis());

    }


}
