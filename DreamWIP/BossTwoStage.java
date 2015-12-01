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
    /**
     * Constructor for objects of class BossTwoStage.
     * 
     */
    public BossTwoStage(int totalCount, Lives l, Timer t)
    {    

        super(1000, 600, 1);  
        time = t;
       // score = s;
        lives = l;
        bossHealth = new BossHealth();
        addObject(l, 925, 25);
        addObject(t, 40, 30);
        addObject(bossHealth, 930, 80);
        score = new Counter(totalCount);
        boss = new Ghostboss(bossHealth, score);
        addObject(boss, 500, 0);
        prepare();
    }

    private void prepare()
    {
        addObject(score, 36, 12);
        addObject(new TopDownPlayer(0), 500, 800);
    }

    public void goToShop()
    {
        int totalCount = score.returnValue();
        Shop shop = new Shop(totalCount, lives, time);
        Greenfoot.setWorld(shop);
    }
}
