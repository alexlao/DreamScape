import greenfoot.*;

/**
 * Write a description of class Filter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Filter extends Actor
{
    Actor target;
    String currentImage;
    
    public Filter(Actor target)
    {
        this.target = target;
        currentImage = "DarknessFilter1.png";
        setImage(currentImage);
    }
        
    public void act() 
    {
        setLocation(target.getX(), target.getY());
        if(Greenfoot.isKeyDown("up"))
        {
            nextFilter();
        }
    }    
    
    public void reset()
    {
        setImage("DarknessFilter1.png");
    }
    
    public void nextFilter()
    {
        if(currentImage.equals("DarknessFilter1.png"))
        {
            currentImage =  "DarknessFilter2.png";
            setImage(currentImage);
        }
        else if(currentImage.equals("DarknessFilter2.png"))
        {
            currentImage = "DarknessFilter3.png";
            setImage(currentImage);
        }
    }
}
