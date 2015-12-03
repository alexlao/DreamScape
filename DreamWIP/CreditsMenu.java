import greenfoot.*;

/**
 * Write a description of class CreditsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsMenu extends World
{

    /**
     * Constructor for objects of class CreditsMenu.
     * 
     */
    public CreditsMenu()
    {    
         super(1000, 600, 1); 
         setBackground("CreditsMenuPic.png");
         showText("Press SPACE to return to Menu",getWidth()/2, getHeight()-50);
    }
    public void act()
    {
       
       if (Greenfoot.isKeyDown("space"))
       {
           Greenfoot.setWorld(new StartMenu());
        }

    }
}
