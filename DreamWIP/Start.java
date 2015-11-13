import greenfoot.*;

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends StartMenuButtons
{
    int time = 0;
    GreenfootImage one = new GreenfootImage("start1.png");
    GreenfootImage two = new GreenfootImage("start2.png");
    GreenfootImage three = new GreenfootImage("start3.png");
    GreenfootImage four = new GreenfootImage("start4.png");
    GreenfootImage five = new GreenfootImage("start5.png");
    GreenfootImage six = new GreenfootImage("start7.png");
    GreenfootSound scrib = new GreenfootSound("scribble.wav");
    
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
           time = 24;
           scrib.play();
        }
        if (time == 21)
        {
            setImage(one);
        }
        if (time == 18)
        {
                        setImage(two);
        }
        if (time == 15)
        {
                        setImage(three);
        }
        if (time == 12)
        {
                        setImage(four);
        }
        if (time == 9)
        {
                        setImage(five);
        }
        if (time == 6)
        {
                        setImage(six);
        }
        if (time == 3)
        {
             Greenfoot.setWorld(new TutorialWorld());
             scrib.stop();
        }
        time--;
    }    
}
