import greenfoot.*;

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet3 extends Enemy
{
    private Enemy2 myEnemy2;
    private Enemy3 myEnemy3;
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() - 6);
        checkRemove();
    }    
    
    public Bullet3(Enemy2 myEnemy2)
    {
        this.myEnemy2 = myEnemy2;
    }
    
    public Bullet3(Enemy3 myEnemy3)
    {
        this.myEnemy3 = myEnemy3;
    }
    
        private void checkRemove()
    {
        World w = getWorld();
        if (getY() > w.getHeight() + 30)
        {
            w.removeObject(this);
        }
    }
}
