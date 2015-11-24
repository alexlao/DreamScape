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
    Counter score = new Counter(0);
    
    public TopDownWorld()
    {    
        
        super(800, 800, 1); 
        TopDownPlayer player = new TopDownPlayer(new Lives(), true);
        p = player;
        //Counter score = new Counter(0);
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
        spawnPerk();
        if (score.returnValue() >= 0)
        {
            spawnBasic();
        }
        if(score.returnValue() > 10)
        {
            spawnBat();
        }
 
}

    public void spawnBasic()
    {
        if(this.numberOfObjects() < 20)
        {
    if(Greenfoot.getRandomNumber(2) == 0)
           {
               if(Greenfoot.getRandomNumber(1000) < 5)
        {
            //Counter s = score;
            BasicEnemy e = new BasicEnemy(p,score);
            addObject(e, p.getX() + Greenfoot.getRandomNumber(100) + 100, p.getY() + Greenfoot.getRandomNumber(100) + 100);
            //maxSpawn++;
            
        }
    }
    else
     {
         if(Greenfoot.getRandomNumber(1000) < 5)
        {
            // Counter s = score;
            BasicEnemy e = new BasicEnemy(p,score);
            addObject(e, p.getX() - Greenfoot.getRandomNumber(200) - 100, p.getY() - Greenfoot.getRandomNumber(200) - 100);
            //maxSpawn++;
            
        }
    }
}
}
    public void spawnBat()
    {
        if(this.numberOfObjects() < 20)
        {
    if(Greenfoot.getRandomNumber(2) == 0)
           {
               if(Greenfoot.getRandomNumber(1000) < 3)
        {
            //Counter s = score;
            BatEnemy e = new BatEnemy(p,score);
            addObject(e, p.getX() + Greenfoot.getRandomNumber(200) + 100, p.getY() + Greenfoot.getRandomNumber(200) + 100);
            //maxSpawn++;
            
        }
    }
    else
     {
         if(Greenfoot.getRandomNumber(1000) < 3)
        {
            // Counter s = score;
            BatEnemy e = new BatEnemy(p,score);
            addObject(e, p.getX() - Greenfoot.getRandomNumber(200) - 100, p.getY() - Greenfoot.getRandomNumber(200) - 100);
            //maxSpawn++;
            
        }
    }
}
}

public void spawnPerk()
{
    if(this.numberOfObjects() < 20)
    {
        if(Greenfoot.getRandomNumber(1000) == 1)
        {
           addObject(new QuickShotBox(), Greenfoot.getRandomNumber(getWidth()) - 10, Greenfoot.getRandomNumber(getHeight())- 10);
            
        }
        if(Greenfoot.getRandomNumber(1000) == 1)
        {
            addObject(new RapidShotBox(), Greenfoot.getRandomNumber(getWidth()) - 10, Greenfoot.getRandomNumber(getHeight())- 10);
        }
    }
}

public Counter getScore()
{
    return score;
}
}
