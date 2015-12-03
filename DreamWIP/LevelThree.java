import greenfoot.*;

/**
 * Write a description of class LevelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelThree extends ScrollWorld
{
    Counter s;
    Lives lives;
    Timer time;
    int shottype;
    /**
     * Constructor for objects of class LevelThree.
     * 
     */
    public LevelThree(Counter score, Lives hp, Timer t, int x, int e)
    {    
       super(1000,600,1,4000,600);
        s = score;
        time = t;
        lives = hp;
       addObject(s, 36, 12);
       addObject(time, 40, 30);
       addObject(lives, 920, 25);
       shottype = x;
       Allistar allistar = new Allistar(s, lives);
       addObject(allistar, 250, 100);

        prepare();
    }
    public LevelThree()
    {
       super(1000,600,1,4000,600);
       Allistar allistar = new Allistar(new Counter(5), new Lives());
       addObject(allistar, 250, 100);
       prepare();
    }
    

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(poop.class, Level3Enemy1.class, Allistar.class, Platform.class, ScrollingCloud.class);
        Platform platform = new Platform();
        addObject(platform, 261, 144);
        platform.setLocation(250, 136);
        BrokenPlatform brokenplatform = new BrokenPlatform();
        addObject(brokenplatform, 352, 142);
        brokenplatform.setLocation(348, 136);
        Platform platform2 = new Platform();
        addObject(platform2, 363, 597);
        platform2.setLocation(355, 589);
        platform2.setLocation(346, 589);
        Level3Enemy1 level3enemy1 = new Level3Enemy1();
        addObject(level3enemy1, 525, 78);
        ScrollingCloud ScrollingCloud = new ScrollingCloud();
        addObject(ScrollingCloud, 98, 58);
        ScrollingCloud ScrollingCloud2 = new ScrollingCloud();
        addObject(ScrollingCloud2, 327, 208);
        ScrollingCloud ScrollingCloud3 = new ScrollingCloud();
        addObject(ScrollingCloud3, 749, 60);
        ScrollingCloud ScrollingCloud4 = new ScrollingCloud();
        addObject(ScrollingCloud4, 422, 58);
        ScrollingCloud ScrollingCloud5 = new ScrollingCloud();
        addObject(ScrollingCloud5, 674, 246);
        ScrollingCloud ScrollingCloud6 = new ScrollingCloud();
        addObject(ScrollingCloud6, 959, 58);
        ScrollingCloud ScrollingCloud7 = new ScrollingCloud();
        addObject(ScrollingCloud7, 1013, 236);
        ScrollingCloud7.setLocation(1028, 195);
        ScrollingCloud6.setLocation(995, 69);
        ScrollingCloud7.setLocation(892, 197);
        ScrollingCloud5.setLocation(648, 246);
        ScrollingCloud3.setLocation(715, 73);
        ScrollingCloud5.setLocation(616, 248);
        ScrollingCloud3.setLocation(674, 92);
        ScrollingCloud ScrollingCloud8 = new ScrollingCloud();
        addObject(ScrollingCloud8, 90, 192);
        ScrollingCloud.setLocation(107, 48);
        ScrollingCloud2.setLocation(386, 246);
        ScrollingCloud4.setLocation(417, 83);
        ScrollingCloud8.setLocation(87, 180);
        ScrollingCloud.setLocation(121, 48);
        ScrollingCloud8.setLocation(118, 182);
        ScrollingCloud8.setLocation(151, 186);
        ScrollingCloud4.setLocation(373, 78);
        ScrollingCloud2.setLocation(428, 202);
        ScrollingCloud ScrollingCloud9 = new ScrollingCloud();
        addObject(ScrollingCloud9, 426, 105);
        ScrollingCloud ScrollingCloud10 = new ScrollingCloud();
        addObject(ScrollingCloud10, 468, 203);
        ScrollingCloud10.setLocation(465, 232);
        ScrollingCloud9.setLocation(193, 81);
        ScrollingCloud9.setLocation(162, 74);
        ScrollingCloud5.setLocation(674, 226);
        ScrollingCloud ScrollingCloud11 = new ScrollingCloud();
        addObject(ScrollingCloud11, 1185, 216);
        ScrollingCloud ScrollingCloud12 = new ScrollingCloud();
        addObject(ScrollingCloud12, 1456, 71);
        ScrollingCloud ScrollingCloud13 = new ScrollingCloud();
        addObject(ScrollingCloud13, 1999, 96);
        ScrollingCloud ScrollingCloud14 = new ScrollingCloud();
        addObject(ScrollingCloud14, 1627, 194);
        ScrollingCloud ScrollingCloud15 = new ScrollingCloud();
        addObject(ScrollingCloud15, 1681, 49);
        ScrollingCloud ScrollingCloud16 = new ScrollingCloud();
        addObject(ScrollingCloud16, 1230, 81);
        ScrollingCloud16.setLocation(2188, 151);
        ScrollingCloud ScrollingCloud17 = new ScrollingCloud();
        addObject(ScrollingCloud17, 3893, 138);
        ScrollingCloud ScrollingCloud18 = new ScrollingCloud();
        addObject(ScrollingCloud18, 3697, 58);
        ScrollingCloud ScrollingCloud19 = new ScrollingCloud();
        addObject(ScrollingCloud19, 3473, 205);
        ScrollingCloud ScrollingCloud20 = new ScrollingCloud();
        addObject(ScrollingCloud20, 3311, 93);
        ScrollingCloud ScrollingCloud21 = new ScrollingCloud();
        addObject(ScrollingCloud21, 3150, 159);
        ScrollingCloud ScrollingCloud22 = new ScrollingCloud();
        addObject(ScrollingCloud22, 2974, 87);
        ScrollingCloud ScrollingCloud23 = new ScrollingCloud();
        addObject(ScrollingCloud23, 2857, 151);
        ScrollingCloud ScrollingCloud24 = new ScrollingCloud();
        addObject(ScrollingCloud24, 2596, 103);
        ScrollingCloud ScrollingCloud25 = new ScrollingCloud();
        addObject(ScrollingCloud25, 2471, 215);
        ScrollingCloud ScrollingCloud26 = new ScrollingCloud();
        addObject(ScrollingCloud26, 2027, 253);
        ScrollingCloud ScrollingCloud27 = new ScrollingCloud();
        addObject(ScrollingCloud27, 2380, 31);
        ScrollingCloud27.setLocation(2366, 62);
        ScrollingCloud9.setLocation(1432, 264);
        ScrollingCloud10.setLocation(1226, 27);
        ScrollingCloud2.setLocation(428, 252);
        ScrollingCloud10.setLocation(1141, 82);
        ScrollingCloud6.setLocation(954, 69);
        ScrollingCloud3.setLocation(672, 85);
        ScrollingCloud4.setLocation(347, 86);
        ScrollingCloud.setLocation(137, 64);
        ScrollingCloud11.setLocation(1175, 236);
        ScrollingCloud10.setLocation(1195, 119);
        ScrollingCloud ScrollingCloud28 = new ScrollingCloud();
        addObject(ScrollingCloud28, 3671, 237);
        ScrollingCloud ScrollingCloud29 = new ScrollingCloud();
        addObject(ScrollingCloud29, 3488, 38);
        ScrollingCloud29.setLocation(3488, 55);
        ScrollingCloud ScrollingCloud30 = new ScrollingCloud();
        addObject(ScrollingCloud30, 2756, 281);
        ScrollingCloud30.setLocation(2726, 223);
        ScrollingCloud24.setLocation(2596, 94);
        ScrollingCloud2.setLocation(425, 209);
        ScrollingCloud2.setLocation(419, 225);
        ScrollingCloud8.setLocation(144, 186);
        ScrollingCloud5.setLocation(671, 257);
        ScrollingCloud4.setLocation(349, 62);
        ScrollingCloud.setLocation(120, 63);
        ScrollingCloud13.setLocation(1908, 114);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1681, 49);
        ScrollingCloud15.setLocation(1702, 59);
        ScrollingCloud13.setLocation(1974, 82);
        ScrollingCloud26.setLocation(1901, 226);
        ScrollingCloud18.setLocation(3699, 75);
        BrokenPlatform brokenplatform2 = new BrokenPlatform();
        addObject(brokenplatform2, 514, 526);
        BrokenPlatform brokenplatform3 = new BrokenPlatform();
        addObject(brokenplatform3, 693, 465);
        BrokenPlatform brokenplatform4 = new BrokenPlatform();
        addObject(brokenplatform4, 865, 408);
        removeObject(brokenplatform3);
        Platform platform3 = new Platform();
        addObject(platform3, 687, 476);
        platform3.setLocation(687, 469);
        platform3.setLocation(683, 474);
        BrokenPlatform brokenplatform5 = new BrokenPlatform();
        addObject(brokenplatform5, 1035, 360);
        brokenplatform5.setLocation(1087, 346);
        Platform platform4 = new Platform();
        addObject(platform4, 1284, 227);
        BrokenPlatform brokenplatform6 = new BrokenPlatform();
        addObject(brokenplatform6, 1416, 588);
        BrokenPlatform brokenplatform7 = new BrokenPlatform();
        addObject(brokenplatform7, 1591, 481);
        BrokenPlatform brokenplatform8 = new BrokenPlatform();
        addObject(brokenplatform8, 1775, 388);
        Platform platform5 = new Platform();
        addObject(platform5, 2063, 582);
        BrokenPlatform brokenplatform9 = new BrokenPlatform();
        addObject(brokenplatform9, 2261, 518);
        BrokenPlatform brokenplatform10 = new BrokenPlatform();
        addObject(brokenplatform10, 2441, 451);
        BrokenPlatform brokenplatform11 = new BrokenPlatform();
        addObject(brokenplatform11, 2269, 359);
        BrokenPlatform brokenplatform12 = new BrokenPlatform();
        addObject(brokenplatform12, 2446, 258);
        BrokenPlatform brokenplatform13 = new BrokenPlatform();
        addObject(brokenplatform13, 2276, 172);
        BrokenPlatform brokenplatform14 = new BrokenPlatform();
        addObject(brokenplatform14, 2482, 140);
        BrokenPlatform brokenplatform15 = new BrokenPlatform();
        addObject(brokenplatform15, 2664, 139);
        BrokenPlatform brokenplatform16 = new BrokenPlatform();
        addObject(brokenplatform16, 2822, 144);
        Level3Enemy1 level3enemy12 = new Level3Enemy1();
        addObject(level3enemy12, 909, 87);
        Level3Enemy1 level3enemy13 = new Level3Enemy1();
        addObject(level3enemy13, 1254, 87);
        Level3Enemy1 level3enemy14 = new Level3Enemy1();
        addObject(level3enemy14, 1575, 90);
        Level3Enemy1 level3enemy15 = new Level3Enemy1();
        addObject(level3enemy15, 1800, 92);
        brokenplatform16.setLocation(2822, 156);
        removeObject(brokenplatform16);
        Platform platform6 = new Platform();
        addObject(platform6, 2853, 146);
        BrokenPlatform brokenplatform17 = new BrokenPlatform();
        addObject(brokenplatform17, 2985, 554);
        BrokenPlatform brokenplatform18 = new BrokenPlatform();
        addObject(brokenplatform18, 3224, 558);
        BrokenPlatform brokenplatform19 = new BrokenPlatform();
        addObject(brokenplatform19, 3410, 496);
        BrokenPlatform brokenplatform20 = new BrokenPlatform();
        addObject(brokenplatform20, 3588, 420);
        BrokenPlatform brokenplatform21 = new BrokenPlatform();
        addObject(brokenplatform21, 3725, 342);
        Portal portal = new Portal();
        addObject(portal, 3893, 217);
        Level3Enemy1 level3enemy16 = new Level3Enemy1();
        addObject(level3enemy16, 2978, 85);
        Level3Enemy1 level3enemy17 = new Level3Enemy1();
        addObject(level3enemy17, 3164, 95);
        Level3Enemy1 level3enemy18 = new Level3Enemy1();
        addObject(level3enemy18, 3380, 99);
        Level3Enemy1 level3enemy19 = new Level3Enemy1();
        addObject(level3enemy19, 3559, 100);
        Level3Enemy1 level3enemy110 = new Level3Enemy1();
        addObject(level3enemy110, 3695, 98);

    }


    public void nextWorld()
    {
        System.out.println("Shottype value at the completion of level3" + shottype);
        Greenfoot.setWorld(new BossThreeStage(s, lives, time, shottype));
    }
}
