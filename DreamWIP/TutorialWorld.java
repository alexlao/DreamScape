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
    Lives lives;
    
    private GreenfootSound bkgMusic; 
    /**
     * Constructor for objects of class TutorialWorld.
     * 
     */
    public TutorialWorld(Lives l)
    {
        super(1000,600,1, 2000, 600);
        addObject(score, 36, 12);
        lives = l;
        addObject(lives, 920, 25);
        bkgMusic = new GreenfootSound("sounds/Walking.mp3");
        
        prepare();
    }
    
    public void nextWorld()
    {
        if (lives.life < -1)
        {
            Greenfoot.setWorld(new TutorialPart2(bkgMusic, lives));
        }
        if (lives.life <= 5 && lives.life >= 0)
        {
            
            Greenfoot.setWorld(new TutorialPart2(bkgMusic, new Lives()));     
            
        }

    }
    
        public void stopMusic()
    {
        //music.stop();
    }
    
    public void act(){
        bkgMusic.play();    
    }
    
    public void prepare()
    {
        Allistar allistar = new Allistar(score, lives, 0);
        addObject(allistar, 81, 410);

        Portal portal2 = new Portal();
        addObject(portal2, 1941, 481);
        FirstBubble firstbubble = new FirstBubble();
        addObject(firstbubble, 199, 186);
        firstbubble.setLocation(196, 183);
        firstbubble.setLocation(317, 183);
        firstbubble.setLocation(348, 183);

        Platform platform = new Platform();
        addObject(platform, 77, 525);
        Platform platform2 = new Platform();
        addObject(platform2, 176, 525);
        Platform platform3 = new Platform();
        addObject(platform3, 271, 525);
        Platform platform4 = new Platform();
        addObject(platform4, 370, 525);
        Platform platform5 = new Platform();
        addObject(platform5, 474, 525);
        Platform platform6 = new Platform();
        addObject(platform6, 570, 525);
        Platform platform7 = new Platform();
        addObject(platform7, 670, 525);
        Platform platform8 = new Platform();
        addObject(platform8, 770, 525);
        Platform platform9 = new Platform();
        addObject(platform9, 868, 525);
        Platform platform10 = new Platform();
        addObject(platform10, 968, 525);
        Platform platform11 = new Platform();
        addObject(platform11, 1071, 525);
        Platform platform12 = new Platform();
        addObject(platform12, 1165, 463);
        Platform platform13 = new Platform();
        addObject(platform13, 1311, 405);
        Platform platform14 = new Platform();
        addObject(platform14, 1411, 405);
        Platform platform15 = new Platform();
        addObject(platform15, 1528, 466);
        Platform platform16 = new Platform();
        addObject(platform16, 1680, 525);
        Platform platform17 = new Platform();
        addObject(platform17, 1778, 525);
        Platform platform18 = new Platform();
        addObject(platform18, 1861, 525);
        Platform platform19 = new Platform();
        addObject(platform19, 1935, 525);
        platform4.setLocation(374, 525);
        platform3.setLocation(274, 525);
        platform11.setLocation(1067, 525);
        platform15.setLocation(1543, 466);
        EndBubble endbubble = new EndBubble();
        addObject(endbubble, 1852, 293);
        addObject(score, 36, 12);

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
