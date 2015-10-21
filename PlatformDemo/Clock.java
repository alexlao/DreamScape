import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Clock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clock extends Actor
{
    private int startingTime;
    private int seconds = 180;
    private int clockType = 0;
   
    private long lastCurrentSecond;
    private long timeSaved = 0;
   
    
    private boolean count = false;
    private boolean displayTime;
    private boolean countDown;
    
    private String text;
    
    
    /**
     * Create a new Clock with your own text or other values.
     * 
     * @param countDown
     *      Set the kind of the clock. If true the clock will cound down from the given starting time. Otherwise it'll count up from 0.
     * 
     * @param displayTime
     *      Set the clock's visibility. If true the clock is visible.
     * 
     * @param startingTime
     *      The starting time for countdown clocks. If you restart the clock it'll start from this value.
     * 
     * @param text
     *      The text above the clock. If text is null the clock will be centered and there is no text.
     */
    public Clock (boolean countDown, boolean displayTime, int startingTime, String text)
    {
        this.countDown = countDown;
        this.displayTime = displayTime;
        this.startingTime = startingTime;
        this.text = text;
        
        seconds = startingTime;
        getImage().clear();
        if (!countDown) {
            seconds = 0;
        }
        if (displayTime) {
            getImage().scale(130, 70);
        }
        this.startClock();   
    }
    /**
     * Act - do whatever the Clock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *Let the clock count the time. Changes the image of the clock as it counts.
     */
    public void act() 
    {
       if (count)
       {
           if (System.currentTimeMillis() - lastCurrentSecond >= 1000)
           {
               lastCurrentSecond +=1000;
               seconds++;
               if(displayTime)
               {
                   drawTime();
                }
            }
        }
    }    
     /**
     * The drawing method of the clock.
     * This method draws the current value of your clock onto the clock object.
     */
    private void drawTime() {
        int min = (int) (seconds / 60);
        int sec = seconds % 60;
        String remainingTime;
        if (sec < 10) {
            remainingTime = min + ":0" + sec;
        }
        else {
            remainingTime = min + ":" + sec;
        }
        getImage().setColor(Color.blue);
        getImage().fill();
        GreenfootImage text = new GreenfootImage((this.text == null ? "" : this.text), 25, Color.white, new Color(0, 0, 0, 0));
        GreenfootImage time = new GreenfootImage(remainingTime, 25, Color.white, new Color(0, 0, 0, 0));
        if (text.getWidth() > getImage().getWidth()) {
            getImage().clear();
            getImage().scale(text.getWidth() + 10, 70);
            getImage().setColor(Color.blue);
            getImage().fill();
        }
        getImage().drawImage(text, (getImage().getWidth()/2)-(text.getWidth()/3), 5);
        getImage().drawImage(time, (getImage().getWidth()/2)-(time.getWidth()/3), (this.text == null ? (getImage().getHeight()/3)-(time.getHeight()/3) : 30));
    }
     /**
     * Start the clock.
     */
    public void startClock() {
        lastCurrentSecond = System.currentTimeMillis() - timeSaved;
        count = true;
    }
}
