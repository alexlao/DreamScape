import greenfoot.*;
import java.util.List;
public class ScrollingWorld extends World 
{
    private int xOffset = 0;
    private final static int SWIDTH = 600;
    private final static int SHEIGHT = 600;
    private final static int WWIDTH = 1000;
    private GreenfootImage bimg;
    Clock c = new Clock(false, true, 0, "Time:");
    public ScrollingWorld() 
    {
        super(SWIDTH, SHEIGHT, 1, false);
        bimg = new GreenfootImage("pic.png");
        shiftWorld(0);
        prepare();
    }
    public void shiftWorld(int dx) {

        if( (xOffset + dx) <= 0 && (xOffset + dx) >= SWIDTH - WWIDTH) {
            xOffset = xOffset + dx;
            shiftWorldBackground(dx);
            shiftWorldActors(dx);
        }
    }
    private void shiftWorldBackground(int dx) {
        GreenfootImage bkgd = new GreenfootImage(SWIDTH, SHEIGHT);
        bkgd.drawImage(bimg, xOffset, 0);
        setBackground(bkgd);
    }
    private void shiftWorldActors(int dx) {
        List<ScrollingActor> saList =
        getObjects(ScrollingActor.class);
        for( ScrollingActor a : saList ) {
            a.setAbsoluteLocation(dx);
        }
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Frog frog = new Frog();
        addObject(frog, 85, 301);

        Platform platform = new Platform();
        addObject(platform, 106, 504);
        Platform platform2 = new Platform();
        addObject(platform2, 204, 436);
        Platform platform3 = new Platform();
        addObject(platform3, 281, 521);
        Platform platform4 = new Platform();
        addObject(platform4, 293, 360);
        Platform platform5 = new Platform();
        addObject(platform5, 389, 581);
        Platform platform6 = new Platform();
        addObject(platform6, 384, 459);
        Platform platform7 = new Platform();
        addObject(platform7, 475, 382);
        Coin coin = new Coin();
        addObject(coin, 319, 316);
        Coin coin2 = new Coin();
        addObject(coin2, 501, 347);
        Coin coin3 = new Coin();
        addObject(coin3, 414, 550);
        Platform platform8 = new Platform();
        addObject(platform8, 434, 278);
        Platform platform9 = new Platform();
        addObject(platform9, 529, 208);
        platform8.setLocation(412, 304);
        coin.setLocation(311, 321);
        coin2.setLocation(498, 347);
        removeObject(coin);
        removeObject(coin3);
        removeObject(coin2);
        Coin coin4 = new Coin();
        addObject(coin4, 405, 554);
        Coin coin5 = new Coin();
        addObject(coin5, 426, 279);
        Coin coin6 = new Coin();
        addObject(coin6, 304, 335);
        Coin coin7 = new Coin();
        addObject(coin7, 217, 409);
        coin7.setLocation(205, 409);
        Platform platform10 = new Platform();
        addObject(platform10, 576, 466);
        coin6.setLocation(584, 429);
        Platform platform11 = new Platform();
        addObject(platform11, 651, 352);
        Platform platform12 = new Platform();
        addObject(platform12, 728, 458);
        Platform platform13 = new Platform();
        addObject(platform13, 570, 571);
        Platform platform14 = new Platform();
        addObject(platform14, 691, 550);
        Platform platform15 = new Platform();
        addObject(platform15, 758, 412);
        platform15.setLocation(782, 392);
        Platform platform16 = new Platform();
        addObject(platform16, 822, 528);
        platform16.setLocation(823, 504);
        platform13.setLocation(539, 536);
        platform14.setLocation(646, 582);
        platform12.setLocation(726, 450);
        platform15.setLocation(807, 391);
        platform12.setLocation(730, 434);
        platform15.setLocation(799, 377);
        platform16.setLocation(813, 493);
        Platform platform17 = new Platform();
        addObject(platform17, 899, 578);
        platform17.setLocation(902, 553);
        platform17.setLocation(902, 551);
        coin6.setLocation(926, 518);
        coin4.setLocation(572, 506);
        Platform platform18 = new Platform();
        addObject(platform18, 999, 422);
        platform12.setLocation(666, 416);
        platform18.setLocation(895, 437);
        coin5.setLocation(422, 275);
        coin5.setLocation(443, 259);
        platform8.setLocation(389, 319);
        platform4.setLocation(292, 385);
        platform8.setLocation(376, 335);
        coin5.setLocation(400, 296);
        platform9.setLocation(480, 274);
        platform6.setLocation(375, 436);
        platform3.setLocation(282, 494);
        platform5.setLocation(398, 547);
        addObject(new Clock(false, true, 0, "Time:"), 60, 40);
    }
   

}
