import greenfoot.*;
import java.util.*;
/**
 * Write a description of class TopDownWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopDownWorld extends World
{
    //Background image from: http://pre03.deviantart.net/5a6c/th/pre/f/2010/235/2/4/090611_moon___texture_by_avmorgan.jpg
    TopDownPlayer p;
    Lives hp = new Lives();
    Counter score = new Counter(0);
    int basicSpawnRate = 5;
    int batSpawnRate = 3;
    int skelSpawnRate = 2;
    int birdSpawnRate = 2;
    Counter perkCount = new Counter(0);
    GreenfootSound music;
    
    public TopDownWorld()
    {    
        
        super(800, 800, 1); 
        TopDownPlayer player = new TopDownPlayer(new Lives(), true);
        p = player;
        //Counter score = new Counter(0);
        addObject(score, 36, 12);
        prepare();
        music = new GreenfootSound("SomebodyToldMe.mp3");
        music.playLoop();
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
        if(score.returnValue() > 50)
        {
            spawnSkel();
            
        }
        if(score.returnValue() > 100)
        {
            spawnBird();
            
        }

        if(score.returnValue() == 200)
        {
            birdSpawnRate++;
            basicSpawnRate++;
            batSpawnRate++;
            skelSpawnRate++;
        }

        if(score.returnValue() == 500)
        {
            birdSpawnRate++;
            basicSpawnRate++;
            batSpawnRate++;
            skelSpawnRate++;
        }
         if(score.returnValue() == 1000)
        {
            birdSpawnRate++;
            basicSpawnRate++;
            batSpawnRate++;
            skelSpawnRate++;
        }
        
}

    public void spawnBasic()
    {
        if(this.numberOfObjects() < 25)
        {
    if(Greenfoot.getRandomNumber(2) == 0)
           {
               if(Greenfoot.getRandomNumber(1000) < basicSpawnRate)
        {
            //Counter s = score;
            BasicEnemy e = new BasicEnemy(p,score);
            addObject(e, p.getX() + Greenfoot.getRandomNumber(100) + 100, p.getY() + Greenfoot.getRandomNumber(100) + 100);
            //maxSpawn++;
            
        }
    }
    else
     {
         if(Greenfoot.getRandomNumber(1000) < basicSpawnRate)
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
        if(this.numberOfObjects() < 25)
        {
    if(Greenfoot.getRandomNumber(2) == 0)
           {
               if(Greenfoot.getRandomNumber(1000) < batSpawnRate)
        {
            //Counter s = score;
            BatEnemy e = new BatEnemy(p,score);
            addObject(e, p.getX() + Greenfoot.getRandomNumber(200) + 100, p.getY() + Greenfoot.getRandomNumber(200) + 100);
            //maxSpawn++;
            
        }
    }
    else
     {
         if(Greenfoot.getRandomNumber(1000) < batSpawnRate)
        {
            // Counter s = score;
            BatEnemy e = new BatEnemy(p,score);
            addObject(e, p.getX() - Greenfoot.getRandomNumber(200) - 100, p.getY() - Greenfoot.getRandomNumber(200) - 100);
            //maxSpawn++;
            
        }
    }
}
}
    public void spawnSkel()
    {
        if(this.numberOfObjects() < 25)
        {
    if(Greenfoot.getRandomNumber(2) == 0)
           {
               if(Greenfoot.getRandomNumber(1000) < skelSpawnRate)
        {
            //Counter s = score;
            SkelEnemy e = new SkelEnemy(p,score);
            addObject(e, p.getX() + Greenfoot.getRandomNumber(200) + 100, p.getY() + Greenfoot.getRandomNumber(200) + 100);
            //maxSpawn++;
            
        }
    }
    else
     {
         if(Greenfoot.getRandomNumber(1000) < skelSpawnRate)
        {
            // Counter s = score;
            SkelEnemy e = new SkelEnemy(p,score);
            addObject(e, p.getX() - Greenfoot.getRandomNumber(200) - 100, p.getY() - Greenfoot.getRandomNumber(200) - 100);
            //maxSpawn++;
            
        }
    }
}
}
public void spawnBird()
{
    if(this.numberOfObjects() < 25)
        {
    if(Greenfoot.getRandomNumber(2) == 0)
           {
               if(Greenfoot.getRandomNumber(1000) < birdSpawnRate)
        {
            //Counter s = score;
            BirdEnemy e = new BirdEnemy(p,score);
            addObject(e, p.getX() + Greenfoot.getRandomNumber(200) + 200, p.getY() + Greenfoot.getRandomNumber(200) + 200);
            //maxSpawn++;
            
        }
    }
    else
     {
         if(Greenfoot.getRandomNumber(1000) < birdSpawnRate)
        {
            // Counter s = score;
            BirdEnemy e = new BirdEnemy(p,score);
            addObject(e, p.getX() - Greenfoot.getRandomNumber(200) - 200, p.getY() - Greenfoot.getRandomNumber(200) - 200);
            //maxSpawn++;
            
        }
    }
}
}
public void spawnPerk()
{

    if(perkCount.returnValue() < 2)
    {
        if(Greenfoot.getRandomNumber(3000) == 1)
        {
           addObject(new QuickShotBox(perkCount), Greenfoot.getRandomNumber(getWidth()) - 10, Greenfoot.getRandomNumber(getHeight())- 10);
           perkCount.add();
        }
        if(Greenfoot.getRandomNumber(3000) == 1)
        {
            addObject(new RapidShotBox(perkCount), Greenfoot.getRandomNumber(getWidth()) - 10, Greenfoot.getRandomNumber(getHeight())- 10);
            perkCount.add();
        }
        if(Greenfoot.getRandomNumber(2000) == 1)
        {
            addObject(new HpBox(perkCount), Greenfoot.getRandomNumber(getWidth()) - 10, Greenfoot.getRandomNumber(getHeight())- 10);
            perkCount.add();
            
        }
    }
}
    public void stopMusic()
    {
        music.stop();
    }
public Counter getScore()
{
    return score;
}

public Counter getPerks()
{
    return perkCount;
}

}
