import greenfoot.*;

/**
 * Write a description of class LevelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelThree extends World
{

    /**
     * Constructor for objects of class LevelThree.
     * 
     */
    public LevelThree()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 4000, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Portal portal = new Portal();
        addObject(portal, 294, 387);
        portal.setLocation(292, 387);
        portal.setLocation(293, 394);
        Platform platform = new Platform();
        addObject(platform, 464, 3886);
        Platform platform2 = new Platform();
        addObject(platform2, 321, 3836);
        Platform platform3 = new Platform();
        addObject(platform3, 206, 3775);
        Platform platform4 = new Platform();
        addObject(platform4, 92, 3706);
        platform2.setLocation(123, 3850);
        removeObject(platform2);
        removeObject(platform);
        platform3.setLocation(405, 3706);
        platform3.setLocation(350, 3708);
        platform3.setLocation(211, 3723);
        platform3.setLocation(172, 3799);
        platform3.setLocation(150, 3820);
        Platform platform5 = new Platform();
        addObject(platform5, 149, 3633);
        platform5.setLocation(149, 3622);
        Platform platform6 = new Platform();
        addObject(platform6, 392, 3775);
        platform6.setLocation(394, 3774);
        BrokenPlatform brokenplatform = new BrokenPlatform();
        addObject(brokenplatform, 405, 3639);
        removeObject(platform6);
        BrokenPlatform brokenplatform2 = new BrokenPlatform();
        addObject(brokenplatform2, 390, 3780);
        platform3.setLocation(202, 3778);
        removeObject(platform3);
        brokenplatform2.setLocation(289, 3773);
        removeObject(brokenplatform2);
        removeObject(platform4);
        platform5.setLocation(150, 3797);
        removeObject(platform5);
        removeObject(brokenplatform);
        Platform platform7 = new Platform();
        addObject(platform7, 148, 3802);
        Platform platform8 = new Platform();
        addObject(platform8, 385, 3808);
        platform8.setLocation(385, 3802);
        Platform platform9 = new Platform();
        addObject(platform9, 227, 3704);
        Platform platform10 = new Platform();
        addObject(platform10, 359, 3639);
        BrokenPlatform brokenplatform3 = new BrokenPlatform();
        addObject(brokenplatform3, 304, 3572);
        brokenplatform3.setLocation(304, 3566);
        BrokenPlatform brokenplatform4 = new BrokenPlatform();
        addObject(brokenplatform4, 124, 3577);
        brokenplatform4.setLocation(124, 3572);
        brokenplatform4.setLocation(124, 3575);
        Platform platform11 = new Platform();
        addObject(platform11, 62, 3489);
        Platform platform12 = new Platform();
        addObject(platform12, 520, 3491);
        BrokenPlatform brokenplatform5 = new BrokenPlatform();
        addObject(brokenplatform5, 166, 3407);
        brokenplatform5.setLocation(166, 3415);
        Platform platform13 = new Platform();
        addObject(platform13, 371, 3291);
        Platform platform14 = new Platform();
        addObject(platform14, 479, 3299);
        platform14.setLocation(471, 3291);
        removeObject(platform14);
        Platform platform15 = new Platform();
        addObject(platform15, 477, 3295);
        removeObject(platform15);
        Platform platform16 = new Platform();
        addObject(platform16, 471, 3288);
        removeObject(platform16);
        Platform platform17 = new Platform();
        addObject(platform17, 472, 3294);
        platform17.setLocation(473, 3291);
        platform17.setLocation(463, 3291);
        platform17.setLocation(472, 3288);
        removeObject(platform17);
        Platform platform18 = new Platform();
        addObject(platform18, 475, 3295);
        removeObject(platform18);
        Platform platform19 = new Platform();
        addObject(platform19, 460, 3296);
        removeObject(platform19);
        Platform platform20 = new Platform();
        addObject(platform20, 474, 3294);
        removeObject(platform20);
        Platform platform21 = new Platform();
        addObject(platform21, 476, 3295);
        platform21.setLocation(470, 3289);
        platform13.setLocation(367, 3309);
        platform13.setLocation(378, 3289);
        platform21.setLocation(467, 3286);
        platform21.setLocation(470, 3289);
        platform13.setLocation(384, 3295);
        platform13.setLocation(372, 3308);
        platform21.setLocation(471, 3287);
        removeObject(platform21);
        Platform platform22 = new Platform();
        addObject(platform22, 476, 3298);
        removeObject(platform22);
        Platform platform23 = new Platform();
        addObject(platform23, 473, 3295);
        removeObject(platform23);
        Platform platform24 = new Platform();
        addObject(platform24, 475, 3297);
        removeObject(platform24);
        Platform platform25 = new Platform();
        addObject(platform25, 474, 3298);
        removeObject(platform25);
        Platform platform26 = new Platform();
        addObject(platform26, 466, 3293);
        platform26.setLocation(466, 3290);
        platform26.setLocation(466, 3283);
    }
}
