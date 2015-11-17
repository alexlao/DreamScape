import greenfoot.*;

/**
 * Write a description of class TDEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TDEnemy extends Actor
{
    private TopDownPlayer Hero;
    private int s;
    private int delaytimer = 0;
    //public TDEnemy(TopDownPlayer p)
    //{
    //    Hero = p;
    //}
    
    public void act() 
    {
        movement(Hero, 3);
        checkForCollisions();
    }   
    public void movement(TopDownPlayer Hero, int speed)
    {
        
        if(this.getX() < Hero.getX())
        {
            setLocation(getX() + speed, getY());
        }
        else if(this.getX() > Hero.getX())
        {
            setLocation(getX() - speed, getY());
        }
        
        if(this.getY() < Hero.getY())
        {
            setLocation(getX(), getY() + speed);
        }
        else if(this.getY() > Hero.getY())
        {
            setLocation(getX(), getY() - speed);
        }
        
    }
        public void checkForCollisions()
    {
        try{
        if(isTouching(Shot.class))
        {
            //delaytimer = 7;
            getWorld().removeObject(this);
        }
    }
        catch(Exception e)
        {
            getWorld().removeObject(this);
    }
    }
     public void timercountdown()
     {
        {
            if(delaytimer > 0)
            {
                delaytimer--;
            }

            if(delaytimer == 6)
            {
                //GreenfootSound splat = new GreenfootSound("Splat.mp3");
                //splat.play();
                //setImage(dead);
                
            }
            if(delaytimer == 1)
            {
               getWorld().removeObject(this);
               //score.add(1);
            }
            
        }
    }
}
