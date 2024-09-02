package com.hitesha.assigment5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void scheduleTask(Task task, int interval, int i) {
        Runnable taskWrapper = task::execute;
        scheduler.scheduleAtFixedRate(taskWrapper, 0, interval, TimeUnit.SECONDS);
    }

    public void shutdown() {
        scheduler.shutdown();
    }
}
