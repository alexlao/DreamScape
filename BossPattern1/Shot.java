import greenfoot.*;

public class Shot extends Actor
{
    private TopDownPlayer player;
    private Boss boss;
    private int healthCount = 0;

    public Shot(TopDownPlayer player)
    {
        this.player = player;
        setRotation(player.getRotation());
    }

    public Shot(Boss boss)
    {
        this.boss = boss;
        
    }

    public void health(int amount)
    {
        this.healthCount += amount;
    }


    public void kill()
    {
        Actor Boss;
        Boss = getOneObjectAtOffset(0,0, Boss.class);
        if(Boss != null)
        {
            health(10);

        }
        if(healthCount >= 1)
        {
            World world;
            world = getWorld();
            getWorld().removeObject(Boss);
            //Greenfoot.playSound("slurp.wav");
            //getWorld().removeObjects(getWorld().getObjects(Boss.class));
            getWorld().addObject (new Test(), 20, 20);
        }
    }

    public void act() 
    {
        //kill();

        if (!isAtEdge())
        {
            move(5);

        }
        else
        {
            // I reached the top of the screen
            getWorld().removeObject(this);
        }
    }    
}
