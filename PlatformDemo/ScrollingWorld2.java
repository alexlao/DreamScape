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
        super(700, 600, 1); 
        scrollingImage2 = new GreenfootImage("ScrollWorld2.jpg");
        x2= 0;
        //y= getHeight() - scrollingImage.getHeight();

        renderBackground2();
        prepare();
    }
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,100,550);
        Platform platform2 = new Platform();
        addObject(platform2,200,500);
        Platform platform3 = new Platform();
        addObject(platform3,300,550);
      
        Frog2 frog2 = new Frog2();
        addObject(frog2,70,500);
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
