import greenfoot.*;

/**
 * Write a description of class BossTwoStage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossTwoStage extends World
{
    Timer time;
    Counter score;
    Lives lives;
    BossHealth bossHealth;
    Ghostboss boss;
    int x;
    int shottype;
    int totalCount;
    /**
     * Constructor for objects of class BossTwoStage.
     * 
     */
    public BossTwoStage(int totalCount, Lives l, Timer t, int y)
    {    

        super(1000, 600, 1);  
        time = t;
       // score = s;
        shottype = y;
        score = new Counter(totalCount);
        prepare();
        x = totalCount;
        lives = l;
        bossHealth = new BossHealth();
        addObject(l, 925, 25);
        addObject(t, 40, 30);
        addObject(bossHealth, 930, 80);
        
        boss = new Ghostboss(bossHealth, score);
        addObject(boss, 500, 0);

    }

    private void prepare()
    {
        addObject(score, 36, 12);
        addObject(new TopDownPlayer(new Lives(), shottype), 500, 800);
        System.out.println("Start of boss two shot number: " + shottype);
    }

    public void goToShop()
    {
        totalCount = score.returnValue();
        Shop shop = new Shop(totalCount, lives, time, shottype, 2);
        Greenfoot.setWorld(shop);
    }
}
