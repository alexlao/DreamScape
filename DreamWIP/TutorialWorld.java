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
    Lives lives = new Lives();
    private GreenfootSound bkgMusic; 
    /**
     * Constructor for objects of class TutorialWorld.
     * 
     */
    public TutorialWorld()
    {
        super(1000,600,1, 2000, 600);
        addObject(score, 36, 12);
        addObject(lives, 920, 25);
        //bkgMusic = new GreenfootSound("sounds/Walking.mp3");
        prepare();
    }
    public void act(){
    //bkgMusic.play();    
    }
    
    public void prepare()
    {
        Allistar allistar = new Allistar(score, lives);
        addObject(allistar, 81, 410);

        Platform platform = new Platform();
        addObject(platform, 93, 529);
        Platform platform2 = new Platform();
        addObject(platform2, 199, 536);
        platform2.setLocation(193, 531);
        platform2.setLocation(193, 529);
        Platform platform3 = new Platform();
        addObject(platform3, 299, 536);
        platform3.setLocation(289, 530);
        platform3.setLocation(290, 530);
        Platform platform4 = new Platform();
        addObject(platform4, 398, 537);
        platform4.setLocation(388, 531);
        platform4.setLocation(388, 530);
        Platform platform5 = new Platform();
        addObject(platform5, 518, 483);
        platform5.setLocation(507, 473);
        Platform platform6 = new Platform();
        addObject(platform6, 664, 478);
        platform6.setLocation(664, 473);
        Platform platform7 = new Platform();
        addObject(platform7, 811, 528);
        Platform platform8 = new Platform();
        addObject(platform8, 918, 535);
        platform8.setLocation(911, 528);
        Platform platform9 = new Platform();
        addObject(platform9, 1016, 530);
        platform9.setLocation(1010, 528);
        platform9.setLocation(1010, 527);
        platform7.setLocation(797, 527);
        platform8.setLocation(897, 527);
        platform9.setLocation(996, 527);
        Platform platform10 = new Platform();
        addObject(platform10, 1111, 480);
        Platform platform11 = new Platform();
        addObject(platform11, 1196, 434);
        Platform platform12 = new Platform();
        addObject(platform12, 1276, 385);
        platform11.setLocation(1178, 434);
        platform10.setLocation(1093, 480);
        platform11.setLocation(1172, 433);
        platform12.setLocation(1320, 431);
        Platform platform13 = new Platform();
        addObject(platform13, 1406, 484);
        Platform platform14 = new Platform();
        addObject(platform14, 1515, 529);
        Platform platform15 = new Platform();
        addObject(platform15, 1621, 536);
        platform15.setLocation(1614, 530);
        platform15.setLocation(1614, 530);
        platform15.setLocation(1614, 529);
        Platform platform16 = new Platform();
        addObject(platform16, 1719, 536);
        platform16.setLocation(1711, 527);
        Platform platform17 = new Platform();
        addObject(platform17, 1803, 527);
        platform17.setLocation(1843, 523);
        platform16.setLocation(1711, 529);
        platform17.setLocation(1811, 529);
        Platform platform18 = new Platform();
        addObject(platform18, 1919, 535);
        platform18.setLocation(1911, 529);
        Portal portal = new Portal();
        addObject(portal, 1946, 496);
        portal.setLocation(1939, 489);
    }

        public Counter getCounter()
    {
        return score;
    }
    public Lives getLives()
    {
        return lives;
    }
}
