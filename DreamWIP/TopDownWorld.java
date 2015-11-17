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
    Lives hp = new Lives();
    Counter score;
    
    public TopDownWorld()
    {    
        
        super(800, 800, 1); 
        TopDownPlayer player = new TopDownPlayer(new Lives());
        p = player;
        Counter score = new Counter(0);
        addObject(score, 36, 12);
        prepare();
    }
    
    public void prepare()
    {
        addObject(p, 400,400);
        
        //addObject(hp, 720, 25);
        
    }
    
    public void act()
    {
        
        if(Greenfoot.getRandomNumber(1000) < 20)
        {
            Counter s = score;
            BasicEnemy e = new BasicEnemy(p,s);
            addObject(e, p.getX() + Greenfoot.getRandomNumber(100) + 100, p.getY() + Greenfoot.getRandomNumber(100) + 100);
            //maxSpawn++;
            
        }
    }
}
