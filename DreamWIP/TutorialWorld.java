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
        Platform platform10 = new Platform();
        addObject(platform10, 85, 520);
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
