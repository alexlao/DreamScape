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

    public void prepare(){

        Platform platform = new Platform();
        addObject(platform, 74, 532);
        Platform platform2 = new Platform();
        addObject(platform2, 169, 532);
        Platform platform3 = new Platform();
        addObject(platform3, 273, 532);
        Platform platform4 = new Platform();
        addObject(platform4, 381, 536);
        Platform platform5 = new Platform();
        addObject(platform5, 461, 535);
        Platform platform6 = new Platform();
        addObject(platform6, 543, 533);
        Platform platform7 = new Platform();
        addObject(platform7, 603, 512);
        Platform platform8 = new Platform();
        addObject(platform8, 686, 470);
        Platform platform9 = new Platform();
        addObject(platform9, 805, 469);
        Platform platform10 = new Platform();
        addObject(platform10, 903, 467);
        Platform platform11 = new Platform();
        addObject(platform11, 1003, 469);
        Platform platform12 = new Platform();
        addObject(platform12, 1091, 466);
        Platform platform13 = new Platform();
        addObject(platform13, 1157, 466);
        Platform platform14 = new Platform();
        addObject(platform14, 1211, 467);
        Platform platform15 = new Platform();
        addObject(platform15, 1273, 468);
        Platform platform16 = new Platform();
        addObject(platform16, 1376, 511);
        Platform platform17 = new Platform();
        addObject(platform17, 1490, 514);
        Platform platform18 = new Platform();
        addObject(platform18, 1584, 515);
        Platform platform19 = new Platform();
        addObject(platform19, 1671, 516);
        Platform platform20 = new Platform();
        addObject(platform20, 1747, 521);
        Portal portal = new Portal();
        addObject(portal, 1767, 489);
    }

        public Counter getCounter()
    {
        return score;
    }
}
