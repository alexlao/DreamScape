import greenfoot.*;

/**
 * Write a description of class TutorialPart2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialPart2 extends ScrollWorld
{
    Counter score = new Counter(0);
    Lives lives = new Lives();
    /**
     * Constructor for objects of class TutorialWorld.
     * 
     */
    public TutorialPart2()
    {
        super(1000,600,1, 2000, 600);
        //addObject(score, 36, 12);
        Allistar allistar = new Allistar(score, lives);
        addObject(allistar, 66, 394);
        
        addObject(lives, 925,25);
        prepare();
    }
    
    public void nextWorld()
    {
        Greenfoot.setWorld(new LastTut());
    }

    public void prepare(){

        Portal portal = new Portal();
        addObject(portal, 1767, 489);
        Platform platform = new Platform();
        addObject(platform, 77, 524);
        Platform platform2 = new Platform();
        addObject(platform2, 202, 518);
        Platform platform3 = new Platform();
        addObject(platform3, 320, 517);
        Platform platform4 = new Platform();
        addObject(platform4, 442, 517);
        Platform platform5 = new Platform();
        addObject(platform5, 553, 521);
        Platform platform6 = new Platform();
        addObject(platform6, 652, 518);
        platform2.setLocation(176, 524);
        platform3.setLocation(275, 524);
        platform4.setLocation(375, 524);
        platform5.setLocation(475, 524);
        platform6.setLocation(575, 524);
        Platform platform7 = new Platform();
        addObject(platform7, 698, 483);
        platform7.setLocation(698, 478);
        Platform platform8 = new Platform();
        addObject(platform8, 806, 485);
        platform8.setLocation(798, 475);
        platform7.setLocation(699, 475);
        Platform platform9 = new Platform();
        addObject(platform9, 905, 482);
        platform9.setLocation(897, 475);
        Platform platform10 = new Platform();
        addObject(platform10, 1004, 482);
        Platform platform11 = new Platform();
        addObject(platform11, 1117, 486);
        Platform platform12 = new Platform();
        addObject(platform12, 1241, 485);
        platform10.setLocation(997, 475);
        platform11.setLocation(1097, 475);
        platform12.setLocation(1197, 475);
        Platform platform13 = new Platform();
        addObject(platform13, 1304, 482);
        platform13.setLocation(1297, 475);
        Platform platform14 = new Platform();
        addObject(platform14, 1434, 530);
        platform14.setLocation(1431, 524);
        Platform platform15 = new Platform();
        addObject(platform15, 1536, 531);
        platform15.setLocation(1529, 524);
        Platform platform16 = new Platform();
        addObject(platform16, 1634, 531);
        platform16.setLocation(1627, 524);
        Platform platform17 = new Platform();
        addObject(platform17, 1738, 530);
        platform17.setLocation(1727, 524);
        portal.setLocation(1728, 488);
    }

        public Counter getCounter()
    {
        return score;
    }
}
