import greenfoot.*;

public class Missle extends SmoothMover
{
    double targetX, targetY;
    double origX, origY;
    double duration;
    int counter;
    int explodedTimer;
    boolean isExploded;
    boolean isFirstLoop;

    Missle(int targetX, int targetY)
    {
        this.targetX = targetX;
        this.targetY = targetY;
        counter = 0;
        duration = 100;
        explodedTimer = 0;
        isExploded = false;
        isFirstLoop = true;
    }

    public void act()
    {
        if(isFirstLoop)
        {
            origX = getX();
            origY = getY();
            isFirstLoop = false;
        }
        checkExplode();
        checkRemove();
        easing();
    }

    public void checkRemove()
    {
        if(isExploded && explodedTimer > 50)
        {
            getWorld().removeObject(this);
        }
        else if(isExploded)
        {
            explodedTimer++;
        }
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
        if(getX() == targetX && getY() == targetY)
        {
            isExploded = true;
            //changeimage
        }
    }
}
