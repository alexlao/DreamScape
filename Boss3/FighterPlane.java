import greenfoot.*;

public class FighterPlane extends Actor
{
    public void act() 
    {
        if(Greenfoot.getRandomNumber(10) < 3)
        {
            fireMissle();
        }
    }    

    public void fireMissle()
    {
        getWorld().addObject(new Missle(Greenfoot.getRandomNumber(1000), 
            Greenfoot.getRandomNumber(300) + 300), getX(), getY());
    }
}
