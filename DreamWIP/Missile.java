import greenfoot.*;

public class Missile extends SmoothMover
{
    double targetX, targetY;
    double origX, origY;
    double duration;
    int counter;
    int explodedTimer;
    boolean isFirstLoop;
    boolean removed;
    
    GreenfootSound sound;

    Missile(int targetX, int targetY)
    {
        this.targetX = targetX;
        this.targetY = targetY;
        counter = 0;
        duration = 100;
        explodedTimer = 0;
        isFirstLoop = true;
        removed = false;
        sound = new GreenfootSound("missile.wav"); //http://soundbible.com/1794-Missle-Launch.html
        sound.play();
    }

    public void act()
    {
        if(isFirstLoop)
        {
            origX = getX();
            origY = getY();
            isFirstLoop = false;
            turnTowards((int)targetX, (int)targetY);
            turn(90);
        }
        checkExplode();
        easing();
    }
 
    public void easing()
    {
        double fX = ++counter/duration;
        double fY = counter/duration;
            setLocation((origX * (1-fX)) + (targetX * fX), 
                (origY * (1-fY)) + (targetY * fY));
    }

    public void checkExplode()
    {
        if(((getX() == targetX && getY() == targetY) || isAtEdge()) 
            && getOneIntersectingObject(FloorTile.class)  != null)
        {
            int x = getOneIntersectingObject(FloorTile.class).getX();
            int y = getOneIntersectingObject(FloorTile.class).getY();
            getWorld().removeObject(getOneIntersectingObject(FloorTile.class));
            getWorld().addObject(new Explosion(), x, y);
            getWorld().removeObject(this);
            removed = true;
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
