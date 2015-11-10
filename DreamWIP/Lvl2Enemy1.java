import greenfoot.*;

/**
 * Write a description of class Lvl2Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2Enemy1 extends Enemy
{
    int turnAmount = 0;
    GifImage batImage = new GifImage("bat.gif");
    GifImage bat2Image = new GifImage("bat2.gif");
    /**
     * Act - do whatever the Lvl2Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (turnAmount >= 0 &&  turnAmount <= 200)
        {
            setImage(bat2Image.getCurrentImage());
            
        }  
        if (turnAmount > 200)
        {
            setImage(batImage.getCurrentImage());
        }
        pattern();
        turnAmount++;
    }
    public void pattern()
    {
        if (turnAmount >= 0 && turnAmount <= 200)
        {
            setLocation(getX() + 2 , getY());
            
        }
       
        
        if(turnAmount > 200)
        {
            setLocation(getX() - 2  , getY());
            
            if(turnAmount == 400)
            {
                turnAmount = 0;
            }
        }

    }   
}
