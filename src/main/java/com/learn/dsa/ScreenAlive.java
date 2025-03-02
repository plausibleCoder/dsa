package com.learn.dsa;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class ScreenAlive {

    public static void main(String[] args) {
        try {
            // Create a Robot instance
            Robot robot = new Robot();

            // Create a Timer instance
            Timer timer = new Timer();

            // Schedule a TimerTask to run every minute (60000 milliseconds)
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    // Simulate pressing and releasing the SHIFT key
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                   // System.out.println("Keeping screen alive...");
                }
            }, 0, 60000);

            // Keep the main thread alive
            while (true) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
