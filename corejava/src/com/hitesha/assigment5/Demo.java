package com.hitesha.assigment5;

public class Demo {
	    public static void main(String[] args) {
	        TaskScheduler scheduler = new TaskScheduler();

	        // Schedule three different tasks
	        scheduler.scheduleTask(() -> System.out.println("Task 1 executed!"), 0, 2); // Executes every 2 seconds
	        scheduler.scheduleTask(() -> System.out.println("Task 2 executed!"), 1, 4); // Executes every 4 seconds
	        scheduler.scheduleTask(() -> System.out.println("Task 3 executed!"), 2, 6); // Executes every 6 seconds

	        // Let the scheduler run for some time before shutting it down
	        try {
	            Thread.sleep(20000); // Run the scheduler for 20 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            scheduler.shutdown();
	        }
	    }
	}

