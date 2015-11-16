import greenfoot.*;

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends StartMenuButtons
{
    int time = 0;
    GreenfootImage one = new GreenfootImage("c1.png");
    GreenfootImage two = new GreenfootImage("c2.png");
    GreenfootImage three = new GreenfootImage("c3.png");
    GreenfootImage four = new GreenfootImage("c4.png");
    GreenfootImage five = new GreenfootImage("c5.png");
    GreenfootImage six = new GreenfootImage("c6.png");
    GreenfootSound scrib = new GreenfootSound("scribble.wav");
    
    public Credits()
    {
        setImage("CRE.png");
    }
    /**
     * Act - do whatever the Credits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {

            time = 21;
           
        }
        if (time == 18)
        {
                        scrib.play();
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
           //scrib.stop();
        }
        time--;
    }    
}
