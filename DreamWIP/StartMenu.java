import greenfoot.*;

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{
    GifImage Image = new GifImage("StartMenu.gif");
    public StartMenu()
    {
        super (1000,600, 1);
    }
    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public void act()
    {    
                   setBackground(Image.getCurrentImage());
    }
}
