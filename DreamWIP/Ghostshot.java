import greenfoot.*;

/**
 * Write a description of class Ghostshot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghostshot extends Actor
{
    private Ghostboss ghostboss;
    GifImage ghostshotImage = new GifImage("Ghostshot.gif");
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(ghostshotImage.getCurrentImage());
        setLocation (getX(), getY() + 1);
        remove();
    } 

    public Ghostshot(Ghostboss ghostboss)
    {
        this.ghostboss = ghostboss;
        setRotation(ghostboss.getRotation());
    }

    public void remove()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}

