import greenfoot.*;

/**
 * Write a description of class HaungsMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HaungsMode extends StartMenuButtons
{
    int time = 0;
    GreenfootSound scrib = new GreenfootSound("scribble.wav");
    GreenfootImage one = new GreenfootImage("m1.png");
    GreenfootImage two = new GreenfootImage("m2.png");
    GreenfootImage three = new GreenfootImage("m3.png");
    GreenfootImage four = new GreenfootImage("m4.png");
    GreenfootImage five = new GreenfootImage("m5.png");
    GreenfootImage six = new GreenfootImage("m6.png");
    GreenfootImage seven = new GreenfootImage("m7.png");
    GreenfootImage eight = new GreenfootImage("m8.png");
    GreenfootImage nine = new GreenfootImage("m9.png");
    GreenfootImage ten = new GreenfootImage("m10.png");
    GreenfootImage eleven = new GreenfootImage("m11.png");
    public HaungsMode()
    {
        setImage("haungs mode.png");
    }
    /**
     * Act - do whatever the HaungsMode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
           time = 36;
           scrib.play();
        }
        if (time == 33)
        {
            setImage(one);
        }
        if (time == 30)
        {
            setImage(two);
        }
        if (time == 27)
        {
            setImage(three);
           
        }
        if (time == 24)
        {
            setImage(four);
        }
        if (time == 21)
        {
          setImage(five);
        }
        if (time == 18)
        {
            setImage(six);
                        
        }
        if (time == 15)
        {
            setImage(seven);
                      
        }
        if (time == 12)
        {
            setImage(eight);

        }
        if (time == 9)
        {
         setImage(nine);    
        } // Add your action code here.
        if (time == 6)
        {
            setImage(ten);
        }
        if (time == 3)
        {
            setImage(eleven);
        }
        if (time == 1)
        {
            scrib.stop();
        }
        time--;
    }    
}
