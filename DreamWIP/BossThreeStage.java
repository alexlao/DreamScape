import greenfoot.*;

/**
 * Write a description of class BossThreeStage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossThreeStage extends World
{   
    BossHealth bossHealth;
    FighterPlane fighter;
    Timer time;
    Counter score;
    Lives lives;
    int shottype;
    /**
     * Constructor for objects of class BossThreeStage.
     * 
     */
    public BossThreeStage(Counter s, Lives l, Timer t, int x)
    {    
        super(1000, 600, 1); 
        setPaintOrder(Shot2.class, BossHealth.class, Shot.class, FighterPlane.class, TopDownPlayer.class, Missile.class, Cloud.class, 
            FloorTile.class, NoTile.class);
        prepare();
        time = t;
        score = s;
        shottype = x;
        lives = l;
        bossHealth = new BossHealth();
        addObject(bossHealth, 930, 80);
        fighter = new FighterPlane(bossHealth);
        addObject(fighter, 500, 222);
        
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        for(int i = 0; i < 20; i++)
        {
            int xValue = 25 + i * 50;
            for(int j = 0; j < 8;  j++)
            {
                int yValue = 25 + j  * 50;
                addObject(new NoTile(), xValue, yValue);
            }
        }
        for(int i = 0; i < 20;  i++)
        {
            int xValue = 25 + i * 50;
            for(int j  = 0;  j < 4; j++)
            {
                int yValue = 425 + 50 * j;
                addObject(new FloorTile(),  xValue,  yValue);
            }
        }
        Cloud cloud = new Cloud();
        addObject(cloud, 86, 66);
        Cloud cloud2 = new Cloud();
        addObject(cloud2, 311, 143);
        Cloud cloud3 = new Cloud();
        addObject(cloud3, 923, 69);
        Cloud cloud4 = new Cloud();
        addObject(cloud4, 850, 121);
        Cloud cloud5 = new Cloud();
        addObject(cloud5, 575, 52);
        Cloud cloud6 = new Cloud();
        addObject(cloud6, 462, 63);
        removeObject(cloud6);
        Cloud cloud7 = new Cloud();
        addObject(cloud7, 374, 58);
       
        addObject(new TopDownPlayer(new Lives(), shottype), 300, 500);
        
    }
    public void nextWorld()
    {
        Greenfoot.setWorld(new FinalCutscene(time));
    }
    
}
