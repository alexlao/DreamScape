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
    private int shottype;
    GreenfootSound music;

    public BossThreeStage(Counter s, Lives l, Timer t, int x)
    {    
        super(1000, 600, 1); 
        setPaintOrder(Shot3.class,Shot2.class, Shot.class, BossHealth.class, Lives.class, FighterPlane.class, TopDownPlayer.class, Missile.class, Cloud.class, 
            FloorTile.class, NoTile.class);
        shottype = x;
        time = t;
        score = s;
        
        lives = l;
         addObject(lives, 925, 25);
        bossHealth = new BossHealth();
        addObject(bossHealth, 930, 80);
        fighter = new FighterPlane(bossHealth);
        addObject(fighter, 500, 222);
        music = new GreenfootSound("DangerZone.mp3");
        //https://www.youtube.com/watch?v=TiPdrAUaSss
        music.playLoop();
        prepare();
    }
 
        public void stopMusic()
    {
        music.stop();
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
       
        addObject(new TopDownPlayer(lives, shottype), 300, 500);
        
    }
    public void nextWorld()
    {
        music.stop();
        Greenfoot.setWorld(new FinalCutscene(time));
    }

}
