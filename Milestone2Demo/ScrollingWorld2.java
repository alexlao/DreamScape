import greenfoot.*;
import java.util.List;
public class ScrollingWorld2 extends World 
{
    private int xOffset = 0;
    private final static int SWIDTH = 600;
    private final static int SHEIGHT = 600;
    private final static int WWIDTH = 1100;
    private GreenfootImage bimg;
    Counter counter;
    int z;
    
    public ScrollingWorld2(Counter count, int totalCount) 
    {
        super(SWIDTH, SHEIGHT, 1, false);
        bimg = new GreenfootImage("ScrollWorld2.jpg");
        shiftWorld(0);
        counter = new Counter(totalCount);
        prepare();
        
    }
   
    public void shiftWorld(int dx)
    {
        if( (xOffset + dx) <= 0 && (xOffset + dx) >= SWIDTH - WWIDTH)
        {
            xOffset = xOffset + dx;
            shiftWorldBackground(dx);
            shiftWorldActors(dx);
        }
    }
    
    private void shiftWorldBackground(int dx)
    {
        GreenfootImage bkgd = new GreenfootImage(SWIDTH, SHEIGHT);
        bkgd.drawImage(bimg, xOffset, 0);
        setBackground(bkgd);
    }
    
    private void shiftWorldActors(int dx)
    {
        List<ScrollingActor> saList = getObjects(ScrollingActor.class);
        for( ScrollingActor a : saList )
        {
            a.setAbsoluteLocation(dx);
        }
    }
    
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,100,550);
        Platform platform2 = new Platform();
        addObject(platform2,200,500);
        Platform platform3 = new Platform();
        addObject(platform3,300,550);

        Frog frog = new Frog(counter);
        addObject(frog,70,500);
        Platform platform19 = new Platform();
        addObject(platform19, 557, 529);
        Platform platform20 = new Platform();
        addObject(platform20, 433, 524);
        Portal portal = new Portal();
        addObject(portal, 559, 490);
        
        addObject(counter, 100, 200);
    }

    public void bossBattle()
    {
        int totalCount = counter.returnValue();
        Stage stage = new Stage(counter, totalCount);
        Greenfoot.setWorld(stage);
    }
    
    public void act()
    {
        
    }
}
