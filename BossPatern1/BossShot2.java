import greenfoot.*;

public class BossShot2 extends Actor
{
    private TopDownPlayer player;
    private Boss boss;
    private int healthCount = 0;

    public BossShot2(Boss boss)
    {
        this.boss = boss;
        setRotation(boss.getRotation() + 90);
    }

    public void health(int amount)
    {
        this.healthCount += amount;
    }




    public void act() 
    {
        
        kill();
        if (!isAtEdge())
        {
            move(5);

        }
        else
        {
            // I reached the edge of the screen
            getWorld().removeObject(this);
        }
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

    }
}
