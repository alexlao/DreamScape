import greenfoot.*;

public class Shot extends Actor
{
   private TopDownPlayer player;
   private Boss boss;
   private int healthCount = 0;
   private int bossTime = 0;
   private GreenfootImage bossHit;
   private GreenfootImage n;
  
    public Shot(TopDownPlayer player)
    {
        this.player = player;
        setRotation(player.getRotation());
    }
    
    public Shot()
    {
    }

    public Shot(Boss boss)
    {
        this.boss = boss;
        n = new GreenfootImage(boss.getImage());
        bossHit= new GreenfootImage("HitBoss.png");
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
        World world = getWorld();
        if (!isAtEdge())
        {
            move(5);
        }
        else
        {
            world.removeObject(this);
         }
        //juice();//animates the spider when hit; I added this code here because the shot class seems to be better at detecting the spider than the spider detecting the shot
        
   }
   
   public void juice()
   {

       World w = getWorld();
       Actor b1;
       b1 = getOneIntersectingObject(Boss.class);
       if (b1 !=null && bossTime == 1)//this part works alone; changes to the HitBoss pic
        {
            
            b1.setImage(bossHit);
            
        }
        else if( getX() >= w.getWidth() - 20 || getY() >= w.getHeight() - 20|| getX() <= 20 || getY() <= 20|| getX() >= w.getWidth()-20 && getY() >= w.getHeight() - 20|| getX() <= 20 && getY() <= 20 || getX() >= w.getWidth() && getY() <= 20|| getX() <= 20 && getY() >= w.getHeight())
        {
            w.removeObject(this);// avoids the "Actor not in world problem" ; I tried isAtEdge(), didn't work at all
            
        }
       
         else if(bossTime == 15)//supposedly returns to the original image
        {
            b1.setImage(n);// error always points to the this line
            bossTime = 0;
            
            }
        bossTime++;
    }
 
    }

