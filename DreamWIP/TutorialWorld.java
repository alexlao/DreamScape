import greenfoot.*;

/**
 * Write a description of class TutorialWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialWorld extends ScrollWorld
{
    Counter score = new Counter(0);
    private GreenfootSound bkgMusic; 
    /**
     * Constructor for objects of class TutorialWorld.
     * 
     */
    public TutorialWorld()
    {
        super(1000,600,1, 2000, 600);
        addObject(score, 36, 12);
        bkgMusic = new GreenfootSound("sounds/Walking.mp3");
        prepare();
    }
    public void act(){
    bkgMusic.play();    
    }
    
    public void prepare()
    {
        Allistar allistar = new Allistar(score);
        addObject(allistar, 81, 410);
        Platform platform10 = new Platform();
        addObject(platform10, 85, 520);
        Platform platform11 = new Platform();
        addObject(platform11, 223, 505);
        Platform platform12 = new Platform();
        addObject(platform12, 364, 508);
        Platform platform13 = new Platform();
        addObject(platform13, 496, 499);
        Platform platform14 = new Platform();
        addObject(platform14, 593, 474);
        Platform platform15 = new Platform();
        addObject(platform15, 727, 474);
        Platform platform16 = new Platform();
        addObject(platform16, 837, 476);
        Platform platform17 = new Platform();
        addObject(platform17, 917, 512);
        Platform platform18 = new Platform();
        addObject(platform18, 1027, 513);
        Platform platform19 = new Platform();
        addObject(platform19, 1118, 519);
        Platform platform20 = new Platform();
        addObject(platform20, 1196, 480);
        platform20.setLocation(1183, 437);
        Platform platform21 = new Platform();
        addObject(platform21, 1241, 382);
        Platform platform22 = new Platform();
        addObject(platform22, 1305, 365);
        platform22.setLocation(1415, 369);
        platform21.setLocation(1260, 374);
        platform22.setLocation(1418, 369);
        platform22.setLocation(1416, 369);
        Platform platform23 = new Platform();
        addObject(platform23, 1497, 453);
        Platform platform24 = new Platform();
        addObject(platform24, 1600, 522);
        Platform platform25 = new Platform();
        addObject(platform25, 1726, 525);
        Platform platform26 = new Platform();
        addObject(platform26, 1838, 530);
        Platform platform27 = new Platform();
        addObject(platform27, 1943, 528);
        Portal portal2 = new Portal();
        addObject(portal2, 1941, 481);
    }

        public Counter getCounter()
    {
        return score;
    }
}
