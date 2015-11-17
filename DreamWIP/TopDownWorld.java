import greenfoot.*;

/**
 * Write a description of class TopDownWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopDownWorld extends World
{

    TopDownPlayer p;
    
    
    public TopDownWorld()
    {    
        
        super(800, 800, 1); 
        TopDownPlayer player = new TopDownPlayer(new Lives());
        p = player;
        prepare();
    }
    
    public void prepare()
    {
        addObject(p, 400,400);
        Lives hp = new Lives();
        addObject(hp, 720, 25);
        
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(1000) < 20)
        {
            BasicEnemy e = new BasicEnemy(p);
            addObject(e, p.getX() + Greenfoot.getRandomNumber(100) + 100, p.getY() + Greenfoot.getRandomNumber(100) + 100);
            //maxSpawn++;
        }
    }
}
