import greenfoot.*;

/**
 * Write a description of class Ghostshot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghostshot2 extends Actor
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
        //setLocation (getX(), getY() + 1);
        move(3);
        remove();
        strafe();
    } 

    public Ghostshot2(Ghostboss ghostboss)
    {
        this.ghostboss = ghostboss;
        setRotation(ghostboss.getRotation());
    }

    public void strafe()
    {
//         if(getY() > 500)
//         {
//             TopDownPlayer player = (TopDownPlayer) getWorld().getObjects(TopDownPlayer.class).get(0);  
//             turnTowards(player.getX(), player.getY());
//             
//         }
    }

    public void remove()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }

}

