import greenfoot.*;

/**
 * Write a description of class Clicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clicker extends StartMenuButtons
{
    String type;
    /**
     * Act - do whatever the Clicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        type = getWorld().getClass().getName();
        
        if( type == "StartMenu")
        {
            setImage("pencil (2).png");
        }
        //setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
    }    
}
