import greenfoot.*;

public class FighterPlane extends Actor
{
    int hitCount;
    int direction;
    int imageLoopCount;
    BossHealth bH;
    
    
    public FighterPlane(BossHealth b)
    {
        turn(180);
        hitCount = 0;
        direction = 1;
        imageLoopCount = 50;
        bH = b;
    }
    
    public void act() 
    {
        fireMissle();
        move();
        checkForHit();
        switchImage();
    }    

    public void fireMissle()
    {
        if(Greenfoot.getRandomNumber(1000) < 30)
        {
            getWorld().addObject(new Missile(Greenfoot.getRandomNumber(1000), 
                Greenfoot.getRandomNumber(150) + 390), getX(), getY());
        }
    }
    
    public void move()
    {
        setLocation(getX() + 3 * direction, getY());
        if(getX() > 940 || getX() < 60)
        {
            direction = -direction;
        }
    }
    
    public void checkForHit()
    {
        if(getOneIntersectingObject(Shot.class) != null)
        {
            hitCount++;
            getWorld().removeObject(getOneIntersectingObject(Shot.class));
            imageLoopCount = 0;
            health();
        }
         if(getOneIntersectingObject(Shot2.class) != null)
        {
            hitCount++;
            getWorld().removeObject(getOneIntersectingObject(Shot2.class));
            imageLoopCount = 0;
            health();
        }
    }
    
    public void switchImage()
    {
        if(imageLoopCount < 10)
        {
            setImage("FighterPlaneDamaged.png");
            imageLoopCount++;
        }
        else
        {
            setImage("FighterPlane.png");
        }
    }
    public void health()
    {
        
            removeTouching(Shot.class);
            bH.damage++;
            bH.damageHit();
    }
    public void endGame()
    {
    }
}
