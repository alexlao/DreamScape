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
    
    public void nextWorld()
    {
        Greenfoot.setWorld(new TutorialPart2());
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
        addObject(platform11, 185, 520);
        Platform platform12 = new Platform();
        addObject(platform12, 285, 520);
        Platform platform13 = new Platform();
        addObject(platform13, 385, 520);
        Platform platform14 = new Platform();
        addObject(platform14, 485, 520);
        Platform platform15 = new Platform();
        addObject(platform15, 585, 520);
        Platform platform16 = new Platform();
        addObject(platform16, 685, 520);
        Platform platform17 = new Platform();
        addObject(platform17, 785, 520);
        Platform platform18 = new Platform();
        addObject(platform18, 885, 520);
        Platform platform19 = new Platform();
        addObject(platform19, 985, 520);
        Platform platform20 = new Platform();
        addObject(platform20, 1097, 450);
        Platform platform21 = new Platform();
        addObject(platform21, 1191, 381);
        Platform platform22 = new Platform();
        addObject(platform22, 1308, 348);
        Platform platform23 = new Platform();
        addObject(platform23, 1400, 348);
        Platform platform24 = new Platform();
        addObject(platform24, 1494, 407);
        Platform platform25 = new Platform();
        addObject(platform25, 1545, 480);
        Platform platform26 = new Platform();
        addObject(platform26, 1655, 520);
        Platform platform27 = new Platform();
        addObject(platform27, 1750, 520);
        Platform platform28 = new Platform();
        addObject(platform28, 1850, 520);
        Platform platform29 = new Platform();
        addObject(platform29, 1950,520);
        Portal portal2 = new Portal();
        addObject(portal2, 1941, 481);
        FirstBubble firstbubble = new FirstBubble();
        addObject(firstbubble, 199, 186);
        firstbubble.setLocation(196, 183);
        firstbubble.setLocation(317, 183);
        firstbubble.setLocation(348, 183);

>>>>>>> refs/remotes/DreamScape/milestone3
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
