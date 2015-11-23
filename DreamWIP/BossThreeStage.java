import greenfoot.*;

/**
 * Write a description of class BossThreeStage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossThreeStage extends World
{

    /**
     * Constructor for objects of class BossThreeStage.
     * 
     */
    public BossThreeStage()
    {    
        super(1000, 600, 1); 
        setPaintOrder(Shot.class, FighterPlane.class, TopDownPlayer.class, Missile.class, Cloud.class, 
            FloorTile.class, NoTile.class);
        prepare();
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
        FighterPlane fighterplane = new FighterPlane();
        addObject(fighterplane, 500, 222);
        addObject(new TopDownPlayer(new Lives()), 300, 500);
    }
}
