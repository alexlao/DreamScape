import greenfoot.*;

/**
 * Write a description of class bone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bone extends Enemy
{
    int b = 0;
    GreenfootImage b0 = new GreenfootImage("bone.png");
    GreenfootImage b1 = new GreenfootImage("bone2.png");
    GreenfootImage b2 = new GreenfootImage("bone3.png");
    GreenfootImage b3 = new GreenfootImage("bone4.png");
    GreenfootImage b4 = new GreenfootImage("bone5.png");
    GreenfootImage b5 = new GreenfootImage("bone6.png");
    /**
     * Act - do whatever the bone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(8);
        Animate();
        b++;
    }    
    public void Animate()
    {
        if (b == 2)
        {
            setImage(b0);
        }else if (b == 4)
        {
                 setImage(b1);       
        } else if (b == 6)
        {
                        setImage(b2);
        } else if (b == 8)
        {
                        setImage(b3);
        }else if (b == 10)
        {
                        setImage(b4);
        } else if (b == 12)
        {
                        setImage(b5);
                        b = 0;
        } 
    }
}
