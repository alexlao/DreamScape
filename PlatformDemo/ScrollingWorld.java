import greenfoot.*;
import java.awt.Color;
import java.util.List;//
import java.util.ArrayList;


/**
 * Write a description of class ScrollingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollingWorld extends World
{
    private GreenfootImage scrollingImage;
    private int x;
    private int y;
     
   
    
    /**
     * Constructor for objects of class ScrollingWorld.
     * 
     */
    public ScrollingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700,600 , 1); 
        Builder builder = new Builder();
        scrollingImage = new GreenfootImage(builder.getBackground());
        x= 0;
        //y= getHeight() - scrollingImage.getHeight();

        renderBackground();

        prepare();
        
    }
   
    
    /**
     * Scrolls the backgroud if possible
     * @param dx change in x
     * @param dy change in y
     */
    public void scroll (int dx, int dy)
    {
        int newX = x - dx;
        
        //int newY = y - dy;
        if (getWidth() - scrollingImage.getWidth() <= newX && newX <= 0)// new x must be less than 0, but not too big negative that it's off the screen
        {
            x = newX;
            
        }
        //if (getHeight() - scrollingImage.getHeight() <= newY && newY <= 0)// new y must be less than 0, but not too big negative that it's off the screen
        {
           // y = newY;
        }
        
        

        renderBackground(); ///the new x is in range set it
    }
    

    /**
     * Draws the background at coordinates
     */
    public void renderBackground()
    {
        getBackground().drawImage(scrollingImage, x, y);
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
    }
}
