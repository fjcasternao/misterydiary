/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mistery_diary;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Tejeringo
 */
public class MisteryLogica {
    
      Timer countdownTimer;
      long remainingTime;
      int aciertos;

    public MisteryLogica(){
        this.countdownTimer = new Timer();
    }

    public Timer getCountdownTimer() {
        return countdownTimer;
    }

    public long getRemainingTime() {
        return remainingTime;
    }

    public void setCountdownTimer(Timer countdownTimer) {
        this.countdownTimer = countdownTimer;
    }
    
    public void startTimer(int delay,int period,final int interval,final long initialTime){
            countdownTimer.scheduleAtFixedRate(new TimerTask() {
         
            public void run() {
                remainingTime =(interval-( System.currentTimeMillis() - initialTime))/1000;
                if (remainingTime <= 0)
                {
                    System.out.println("Se acabo el tiempo");
                    countdownTimer.cancel();
                }
                System.out.println(remainingTime);
               
            }
        }, delay, period);
        
    }
 
}
    

