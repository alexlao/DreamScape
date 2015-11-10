import greenfoot.*;

/**
 * Write a description of class LevelTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwo extends ScrollWorld
{

    /**
     * Constructor for objects of class LevelTwo.
     * 
     */
    public LevelTwo(Counter score, Lives hp)
    {
        super(1000,600,1,4000,600);
        addObject(score, 36, 12);
        addObject(hp, 920, 25);
        Allistar allistar = new Allistar(score, hp);
        addObject(allistar, 250, 450);
        prepare();
    }

    public LevelTwo()//for level building purposes
    {
        super(1000,600,1,4000,600);
        Allistar allistar = new Allistar(new Counter(5), new Lives());
        addObject(allistar, 250, 450);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Platform platform = new Platform();
        addObject(platform, 75, 537);
        Platform platform2 = new Platform();
        addObject(platform2, 227, 502);
        Platform platform3 = new Platform();
        addObject(platform3, 394, 436);
        Platform platform4 = new Platform();
        addObject(platform4, 220, 322);
        Platform platform5 = new Platform();
        addObject(platform5, 122, 303);
        platform4.setLocation(222, 305);
        platform4.setLocation(223, 303);
        platform4.setLocation(222, 285);
        platform5.setLocation(122, 286);
        Coin coin = new Coin();
        addObject(coin, 134, 239);
        Coin coin2 = new Coin();
        addObject(coin2, 229, 246);
        coin2.setLocation(229, 239);
        Platform platform6 = new Platform();
        addObject(platform6, 629, 438);
        Platform platform7 = new Platform();
        addObject(platform7, 849, 368);
        Platform platform8 = new Platform();
        addObject(platform8, 1221, 509);
        platform8.setLocation(1169, 503);
        MovingPlatform movingplatform = new MovingPlatform();
        addObject(movingplatform, 1348, 509);
        Platform platform9 = new Platform();
        addObject(platform9, 1774, 424);
        Platform platform10 = new Platform();
        addObject(platform10, 1620, 298);
        Platform platform11 = new Platform();
        addObject(platform11, 1917, 188);
        Platform platform12 = new Platform();
        addObject(platform12, 2026, 191);
        Platform platform13 = new Platform();
        addObject(platform13, 2157, 182);
        platform13.setLocation(2114, 187);
        platform12.setLocation(2016, 184);
        platform11.setLocation(1866, 209);
        platform12.setLocation(1967, 209);
        platform13.setLocation(2068, 209);
        MovingPlatform movingplatform2 = new MovingPlatform();
        addObject(movingplatform2, 2176, 216);
        movingplatform2.setLocation(2168, 210);
        Platform platform14 = new Platform();
        addObject(platform14, 2388, 373);
        platform14.setLocation(2501, 375);
        platform14.setLocation(2399, 376);
        platform14.setLocation(2300, 376);
        platform14.setLocation(2174, 483);
        platform14.setLocation(2178, 517);
        Platform platform15 = new Platform();
        addObject(platform15, 2284, 524);
        Platform platform16 = new Platform();
        addObject(platform16, 2402, 521);
        Platform platform17 = new Platform();
        addObject(platform17, 2529, 513);
        platform15.setLocation(2277, 517);
        platform16.setLocation(2376, 517);
        platform17.setLocation(2474, 517);
        Platform platform18 = new Platform();
        addObject(platform18, 2602, 461);
        Platform platform19 = new Platform();
        addObject(platform19, 2503, 301);
        Platform platform20 = new Platform();
        addObject(platform20, 2774, 374);
        platform20.setLocation(2605, 302);
        platform20.setLocation(2657, 300);
        Platform platform21 = new Platform();
        addObject(platform21, 1994, 460);
        platform18.setLocation(2443, 408);
        removeObject(platform18);
        Coin coin3 = new Coin();
        addObject(coin3, 2286, 469);
        Coin coin4 = new Coin();
        addObject(coin4, 2379, 473);
        Coin coin5 = new Coin();
        addObject(coin5, 2481, 475);
        Coin coin6 = new Coin();
        addObject(coin6, 2197, 473);
        Platform platform22 = new Platform();
        addObject(platform22, 2857, 246);
        Platform platform23 = new Platform();
        addObject(platform23, 3200, 252);
        Platform platform24 = new Platform();
        addObject(platform24, 3646, 293);
        Platform platform25 = new Platform();
        addObject(platform25, 3477, 467);
        Platform platform26 = new Platform();
        addObject(platform26, 3584, 474);
        Platform platform27 = new Platform();
        addObject(platform27, 3688, 470);
        Platform platform28 = new Platform();
        addObject(platform28, 3795, 458);
        Platform platform29 = new Platform();
        addObject(platform29, 3909, 447);
        platform26.setLocation(3576, 467);
        platform27.setLocation(3677, 466);
        platform28.setLocation(3777, 466);
        platform29.setLocation(3876, 467);
        Coin coin7 = new Coin();
        addObject(coin7, 3649, 257);
        Coin coin8 = new Coin();
        addObject(coin8, 3653, 210);
        Coin coin9 = new Coin();
        addObject(coin9, 3650, 166);
        Coin coin10 = new Coin();
        addObject(coin10, 3657, 122);
        platform23.setLocation(3175, 273);
        platform25.setLocation(3426, 461);
        platform26.setLocation(3525, 460);
        platform27.setLocation(3626, 460);
        platform28.setLocation(3725, 459);
        platform29.setLocation(3825, 457);
        platform24.setLocation(3552, 268);
        coin7.setLocation(3552, 221);
        coin8.setLocation(3512, 185);
        coin9.setLocation(3596, 178);
        coin10.setLocation(3556, 138);
        Portal portal = new Portal();
        addObject(portal, 3833, 401);
        platform23.setLocation(3116, 327);
        platform25.setLocation(3340, 459);
        platform26.setLocation(3468, 460);
        platform25.setLocation(3342, 457);
        platform26.setLocation(3441, 457);
        platform27.setLocation(3539, 454);
        platform28.setLocation(3641, 455);
        platform24.setLocation(3419, 268);
        coin7.setLocation(3418, 224);
        coin8.setLocation(3368, 179);
        coin10.setLocation(3476, 178);
        coin9.setLocation(3422, 135);
        platform24.setLocation(3420, 247);
        coin7.setLocation(3645, 151);
        platform24.setLocation(3427, 232);
        coin9.setLocation(3421, 91);
        coin8.setLocation(3367, 158);
        coin10.setLocation(3479, 156);
        coin7.setLocation(3425, 198);
        platform27.setLocation(3539, 456);
        platform28.setLocation(3639, 456);
        platform5.setLocation(122, 285);
        Platform platform30 = new Platform();
        addObject(platform30, 457, 548);
        Platform platform31 = new Platform();
        addObject(platform31, 564, 554);
        Platform platform32 = new Platform();
        addObject(platform32, 675, 558);
        Platform platform33 = new Platform();
        addObject(platform33, 502, 443);
        platform3.setLocation(391, 435);
        platform33.setLocation(491, 435);
        platform6.setLocation(591, 436);
        platform6.setLocation(591, 435);
        platform31.setLocation(557, 547);
        platform30.setLocation(387, 546);
        platform31.setLocation(487, 546);
        platform31.setLocation(493, 546);
        platform30.setLocation(393, 545);
        platform30.setLocation(393, 546);
        platform32.setLocation(593, 546);
        Lvl2Enemy2 lvl2enemy2 = new Lvl2Enemy2();
        addObject(lvl2enemy2, 367, 479);
        lvl2enemy2.setLocation(366, 473);
        Platform platform34 = new Platform();
        addObject(platform34, 698, 553);
        platform34.setLocation(693, 546);
        Platform platform35 = new Platform();
        addObject(platform35, 799, 554);
        platform35.setLocation(792, 546);
        Platform platform36 = new Platform();
        addObject(platform36, 901, 552);
        platform36.setLocation(890, 546);
        lvl2enemy2.setLocation(357, 473);
        Lvl2Enemy1 lvl2enemy1 = new Lvl2Enemy1();
        addObject(lvl2enemy1, 858, 323);
        Lvl2Enemy2 lvl2enemy22 = new Lvl2Enemy2();
        addObject(lvl2enemy22, 1824, 139);
        lvl2enemy22.setLocation(1822, 135);
        Platform platform37 = new Platform();
        addObject(platform37, 2269, 216);
        platform37.setLocation(2268, 210);
        Lvl2Enemy1 lvl2enemy12 = new Lvl2Enemy1();
        addObject(lvl2enemy12, 3313, 424);
        lvl2enemy12.setLocation(3314, 415);
        Platform platform38 = new Platform();
        addObject(platform38, 994, 552);
        platform38.setLocation(990, 545);
        lvl2enemy2.setLocation(528, 473);
        platform8.setLocation(1209, 402);
        movingplatform.setLocation(1089, 545);
        platform8.setLocation(1315, 412);
        platform8.setLocation(1384, 420);
        platform8.setLocation(1339, 425);
        Platform platform39 = new Platform();
        addObject(platform39, 1494, 364);
        platform8.setLocation(1346, 425);
        platform10.setLocation(1662, 254);
        platform39.setLocation(1506, 341);
        removeObject(platform37);
    }
}
