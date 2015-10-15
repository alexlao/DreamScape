import greenfoot.*;

/**
 * Write a description of class ScrollingWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollingWorld2 extends World
{
    private GreenfootImage scrollingImage2;
    private int x2;
    private int y2;
     
    /**
     * Constructor for objects of class ScrollingWorld2.
     * 
     */
    public ScrollingWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1,false); 
        scrollingImage2 = new GreenfootImage("ScrollWorld2.jpg");
        x2= 0;
        //y= getHeight() - scrollingImage.getHeight();

        renderBackground2();
        prepare();
    }
    
    private void prepare()
    {

        Platform platform = new Platform();
        addObject(platform, 68, 475);
        platform.setLocation(68, 443);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1, 218, 152);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2, 237, 234);
        enemy2.setLocation(347, 235);
        Player player = new Player();
        addObject(player,100,100);

        enemy1.setLocation(38, 160);
        enemy2.setLocation(32, 232);
        Enemy3 enemy3 = new Enemy3();
        addObject(enemy3, 349, 517);
    }

      /**
     * Scrolls the backgroud if possible
     * @param dx change in x
     * @param dy change in y
     */
    public void scroll2 (int dx2, int dy2)
    {
        int newX2 = x2 - dx2;
        //int newY = y - dy;
        if (getWidth() - scrollingImage2.getWidth() <= newX2 && newX2 <= 0)// new x must be less than 0, but not too big negative that it's off the screen
        {
            x2 = newX2;
            
        }
        //if (getHeight() - scrollingImage.getHeight() <= newY && newY <= 0)// new y must be less than 0, but not too big negative that it's off the screen
        {
           // y = newY;
        }
        
        

        renderBackground2(); ///the new x is in range set it
    }
    

    /**
     * Draws the background at coordinates
     */
    public void renderBackground2()
    {
        getBackground().drawImage(scrollingImage2, x2, y2);
    }
}
