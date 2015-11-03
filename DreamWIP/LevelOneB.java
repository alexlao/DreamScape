import greenfoot.*;

/**
 * Write a description of class LevelOneB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOneB extends ScrollWorld
{
    
    /**
     * Constructor for objects of class LevelOneB.
     * 
     */
    public LevelOneB(Counter score)
    {
        super(1000,600,1, 2000, 600);
        
        addObject(score, 36, 12);
        Allistar allistar = new Allistar(score);
        addObject(allistar, 66, 394);
        allistar.setLocation(99, 264);
        prepare();
        
    }



    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform, 74, 479);
        Platform platform2 = new Platform();
        addObject(platform2, 226, 424);
        Platform platform3 = new Platform();
        addObject(platform3, 409, 493);
        Platform platform4 = new Platform();
        addObject(platform4, 573, 432);
        Platform platform5 = new Platform();
        addObject(platform5, 764, 477);
        Platform platform6 = new Platform();
        addObject(platform6, 894, 395);
        Platform platform7 = new Platform();
        addObject(platform7, 1020, 323);
        Platform platform8 = new Platform();
        addObject(platform8, 1151, 250);
        Platform platform9 = new Platform();
        addObject(platform9, 1304, 163);
        Platform platform10 = new Platform();
        addObject(platform10, 1487, 118);
        Platform platform11 = new Platform();
        addObject(platform11, 1584, 104);
        platform11.setLocation(1569, 87);
        platform11.setLocation(1583, 118);
        Platform platform12 = new Platform();
        addObject(platform12, 1671, 118);
        Platform platform13 = new Platform();
        addObject(platform13, 1773, 114);
        platform13.setLocation(1766, 118);

        Portal portal = new Portal();
        addObject(portal, 1785, 77);
        portal.setLocation(1781, 67);
        platform.setLocation(104, 325);

        platform3.setLocation(392, 357);
        platform4.setLocation(529, 507);
        platform5.setLocation(625, 507);
        Platform platform14 = new Platform();
        addObject(platform14, 727, 514);
        Platform platform15 = new Platform();
        addObject(platform15, 816, 466);
        platform14.setLocation(719, 508);
        platform15.setLocation(833, 460);
        platform6.setLocation(937, 395);
        platform7.setLocation(1045, 325);
        platform8.setLocation(1161, 270);
        platform9.setLocation(1297, 202);
    }
}
