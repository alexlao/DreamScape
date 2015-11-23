import greenfoot.*;

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    GreenfootSound explosion;
    int loops;
    
    Explosion()
    {
        explosion = new GreenfootSound("explosion.wav");//http://soundbible.com/483-Explosion.html
        explosion.play();
        loops = 0;
    }
    
    public void act() 
    {
        if(loops == 65)
        {
            getWorld().addObject(new NoTile(), getX(), getY());
            getWorld().removeObject(this);
        }
        loops++;
    }    
}
