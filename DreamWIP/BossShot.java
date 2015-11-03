import greenfoot.*;

public class BossShot extends Actor
{
    private TopDownPlayer player;
    private Boss boss;
    private int healthCount = 0;
    GifImage acidShotImage = new GifImage("acidShot.gif");

    public BossShot(Boss boss)
    {
        this.boss = boss;

    }

    public void health(int amount)
    {
        this.healthCount += amount;
    }

    public void kill()
    {
        //         Actor Boss;
        //         Boss = getOneObjectAtOffset(0,0, Boss.class);
        if(isTouching(TopDownPlayer.class))
        {
            health(1);

            getWorld().removeObject(player);
            //getWorld().addObject (new Test(), 20, 20);

        }
        //         if(healthCount >= 1)
        //         {
        //             World world;
        //             world = getWorld();
        //             getWorld().removeObject(player);
        // 
        //             getWorld().addObject (new Test(), 20, 20);
        //         }
    }


    public void act() 
    {
        setLocation(getX(), getY() + 3);
        kill();
        setImage(acidShotImage.getCurrentImage());
        if (!isAtEdge())
        {
            //move(5);

        }
        else
        {
            // I reached the top of the screen
            getWorld().removeObject(this);
        }
    }    
}
