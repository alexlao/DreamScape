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
    GreenfootImage one = new GreenfootImage("h1.png");
    GreenfootImage two = new GreenfootImage("h2.png");
    GreenfootImage three = new GreenfootImage("h3.png");
    GreenfootImage four = new GreenfootImage("h4.png");
    GreenfootImage five = new GreenfootImage("h5.png");
    GreenfootImage six = new GreenfootImage("h6.png");
    GreenfootImage seven = new GreenfootImage("h7.png");
    GreenfootImage eight = new GreenfootImage("h8.png");
    GreenfootImage nine = new GreenfootImage("h10.png");
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
           time = 30;
           scrib.play();
        }
        if (time == 27)
        {
            setImage(one);
        }
        if (time == 24)
        {
            setImage(two);
        }
        if (time == 21)
        {
            setImage(three);
           
        }
        if (time == 18)
        {
            setImage(four);
        }
        if (time == 15)
        {
          setImage(five);
        }
        if (time == 12)
        {
            setImage(six);
                        
        }
        if (time == 9)
        {
            setImage(seven);
                      
        }
        if (time == 6)
        {
            setImage(eight);

        }
        if (time == 3)
        {
         setImage(nine);    
        } // Add your action code here.
        if (time == 1)
        {
            scrib.stop();
        }
        time--;
    }    
}
