import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    int count = 0;
    int timeStamp = 0;
    int loopCount = 0;
    boolean running = false;
    private static final Color transparent = new Color (0,0,0,0);

    public Timer()
    {
        setImage(new GreenfootImage("Time: " + count, 20, Color.WHITE, 
            transparent));
    }
    
    public void act()
    {
        int currentSeconds = 
            (int)Math.round(System.currentTimeMillis ()/ 1000.0);
        if(running)
        {
            if(loopCount > 0)
            {
                count += currentSeconds - timeStamp;
            }
            loopCount++;
        }
        else
        {
            loopCount = 0;
        }
        timeStamp = currentSeconds;
        setImage(new GreenfootImage("Time: " + count, 20, Color.WHITE, 
            transparent));
    }
    
    public void start()
    {
       running = true; 
    }
    
    public void stop()
    {
       running = false; 
    }
    
    public void add(int added)
    {
       count += added;
    }
    
    public void reset()
    {
       count = 0; 
    }

    public void getElapsedTime()
    {
        return count;
    }
}
