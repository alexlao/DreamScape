import greenfoot.*;

/**
 * Write a description of class EndlessTD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndlessTD extends StartMenuButtons
{
    int time = 0;
    GreenfootImage one = new GreenfootImage("e1.png");
    GreenfootImage two = new GreenfootImage("e2.png");
    GreenfootImage three = new GreenfootImage("e3.png");
    GreenfootImage four = new GreenfootImage("e4.png");
    GreenfootImage five = new GreenfootImage("e5.png");
    GreenfootImage six = new GreenfootImage("e6.png");
    GreenfootImage seven = new GreenfootImage("e7.png");
    GreenfootImage eight = new GreenfootImage("e8.png");
    GreenfootImage nine = new GreenfootImage("e9.png");
    GreenfootImage ten = new GreenfootImage("e10.png");
    GreenfootImage eleven = new GreenfootImage("e11.png");
    GreenfootImage twelve = new GreenfootImage("e12.png");
    GreenfootImage thirteen = new GreenfootImage("e13.png");
    GreenfootSound scrib = new GreenfootSound("scribble.wav");
    
    public EndlessTD()
    {
        setImage("endlessmode.png");
    }
    
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this) )
        {
           time = 39;
           scrib.play();
        }
        if (time == 36)
        {
            setImage(one);
        }
        if (time == 33)
        {
                        setImage(two);
        }
        if (time == 30)
        {
                        setImage(three);
        }
        if (time == 27)
        {
                        setImage(four);
        }
        if (time == 24)
        {
                        setImage(five);
        }
        if (time == 21)
        {
                        setImage(six);
        }
        if (time == 18)
        {
                        setImage(seven);
        }
        if (time == 15)
        {
                        setImage(eight);
        }
        
        if (time == 12)
        {
                        setImage(nine);
        }
        if (time == 9)
        {
                        setImage(ten);
        }
        if (time == 6)
        {
                        setImage(eleven);
        }
        if (time == 5)
        {
            setImage (twelve);
        }
        if (time == 4)
        {
            setImage (thirteen);
        }
        if (time == 2)
        {
             Greenfoot.setWorld(new TopDownWorld());
             scrib.stop();
        }
        time--;
    }    
}
 
