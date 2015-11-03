import greenfoot.*;

/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends ScrollWorld
{
    private GreenfootSound bkgMusic; 
    /**
     * Constructor for objects of class LevelOne.
     * 
     */
    Counter score = new Counter(0);
    public LevelOne()
    {
        super(1000, 600, 1, 2000, 600);
        bkgMusic = new GreenfootSound("sounds/Cavemusic.mp3");
        //bkgMusic.playLoop();
        addObject(score, 36, 12);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform, 95, 509);
        Platform platform2 = new Platform();
        addObject(platform2, 256, 451);
        Platform platform3 = new Platform();
        addObject(platform3, 431, 385);
        Platform platform4 = new Platform();
        addObject(platform4, 607, 450);
        Platform platform5 = new Platform();
        addObject(platform5, 750, 349);
        Platform platform6 = new Platform();
        addObject(platform6, 884, 287);
        Platform platform7 = new Platform();
        addObject(platform7, 1002, 211);
        Platform platform8 = new Platform();
        addObject(platform8, 1171, 465);
        Allistar allistar = new Allistar(score);
        addObject(allistar, 81, 410);
        Coin coin = new Coin();
        addObject(coin, 273, 390);
        Coin coin2 = new Coin();
        addObject(coin2, 444, 335);
        Platform platform9 = new Platform();
        addObject(platform9, 1325, 410);
        Platform platform10 = new Platform();
        addObject(platform10, 1510, 343);
        Platform platform11 = new Platform();
        addObject(platform11, 1678, 269);
        Coin coin3 = new Coin();
        addObject(coin3, 1183, 414);
        Coin coin4 = new Coin();
        addObject(coin4, 1522, 298);
        Coin coin5 = new Coin();
        addObject(coin5, 1694, 217);

        platform3.setLocation(350, 450);
        platform4.setLocation(443, 451);
        platform5.setLocation(537, 451);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1, 272, 434);
        enemy1.setLocation(261, 427);
        platform6.setLocation(671, 373);
        platform7.setLocation(524, 283);
        platform2.setLocation(260, 507);
        platform3.setLocation(353, 507);
        platform4.setLocation(447, 509);
        platform5.setLocation(540, 508);
        platform6.setLocation(673, 418);
        platform7.setLocation(517, 317);
        coin2.setLocation(671, 372);
        coin.setLocation(782, 161);
        enemy1.setLocation(259, 479);
        platform7.setLocation(635, 509);
        enemy1.setLocation(252, 482);
        coin2.setLocation(689, 309);
        platform6.setLocation(795, 425);
        coin2.setLocation(801, 385);
        Platform platform12 = new Platform();
        addObject(platform12, 627, 316);
        Platform platform13 = new Platform();
        addObject(platform13, 510, 314);
        Platform platform14 = new Platform();
        addObject(platform14, 386, 294);
        Platform platform15 = new Platform();
        addObject(platform15, 263, 307);
        Platform platform16 = new Platform();
        addObject(platform16, 158, 299);
        platform12.setLocation(630, 314);
        platform13.setLocation(535, 315);
        platform14.setLocation(439, 316);
        platform15.setLocation(345, 318);
        platform16.setLocation(252, 319);
        Platform platform17 = new Platform();
        addObject(platform17, 101, 224);
        Enemy3 enemy3 = new Enemy3();
        addObject(enemy3, 445, 198);
        enemy3.setLocation(442, 278);
        platform16.setLocation(254, 247);
        platform15.setLocation(346, 245);
        platform14.setLocation(441, 246);
        platform13.setLocation(534, 246);
        platform12.setLocation(628, 247);
        removeObject(enemy3);
        platform17.setLocation(138, 219);
        coin.setLocation(144, 183);
        coin2.setLocation(798, 338);
        platform6.setLocation(796, 387);
        Platform platform18 = new Platform();
        addObject(platform18, 922, 142);
        Platform platform19 = new Platform();
        addObject(platform19, 802, 211);
        enemy1.setLocation(328, 383);
        removeObject(enemy1);
        removeObject(coin);
    }

    public Counter getCounter()
    {
        return score;
    }

    public void act()
    {
        if(getObjects(Coin.class).isEmpty() == true)
        {
            LevelOneB world2 = new LevelOneB(score);
            Greenfoot.setWorld(world2);
        }
    }
}
