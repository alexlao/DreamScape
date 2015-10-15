import greenfoot.*;

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    ScrollingWorld world;
    ScrollingWorld2 world2;
    private int vSpeed = 0;//fall speed
    private int accel = 2; //gravity acceleration
    
    private boolean inAir;
    private int jumpHeight = 18;
    private int coinEaten = 0;
    public int scrolled = 0;
    
    /**
     * When added, it is saved to scrolling world
     */
    protected void addedToWorld(World world)
    {
        this.world = (ScrollingWorld)world;
       
    }
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Keypress(); 
        checkFall();
        eatCoin();
        
    }
    public Frog()
    {
    
         GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    
    }
   
    public void Keypress()
    {
      
        if (Greenfoot.isKeyDown("left"))
       {
           world.scroll(-4,0);
          
           move(-4);
        
       }  
       if (Greenfoot.isKeyDown("right"))
       {
          world.scroll(4,0);
          scrolled++;
          move(4);
       }
       if (Greenfoot.isKeyDown("up"))
       {
           jump();
           
        }
       if (Greenfoot.isKeyDown("down"))
       {
           
           setLocation(getX(),getY()+4);
        }
       if ("space".equals(Greenfoot.getKey()))//get space key once instead of multiple times//
        {
            fire();
        }
       
    }
    private void fire()
    {
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet,getX(),getY());  
        Greenfoot.playSound("gun shot.wav");
    }
      //Method for falling
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if (vSpeed <= 9)
        {
        vSpeed = vSpeed + accel; //fall speed gets larger by accel every tick
    }
    
        inAir = true;
    }
    
    //checks to see if player is on ground
    public boolean checkGround()
    {
       int pHeight = getImage().getHeight();
       int onGround = (int)(pHeight/2);
       
       Actor ground = getOneObjectAtOffset(0, onGround, Platform.class);
       
       //if pjlayer is on nothing, return false, else return true
       if(ground == null)
       {
           inAir = true;
           return false;
        }
        else
        {
            inAir = false;
            return true;
        }
    }
    
    //if the player is on the ground, "turn off" gravity. Otherwise fall
    public void checkFall()
    {
        if(checkGround() == true)
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
        
    }
    
    //Method for jumping. If you are not in the air, you will essentially have "negative" gravity, then fall
    public void jump()
    {
        if (inAir == false)
        {
        vSpeed = vSpeed - jumpHeight;
        inAir = true;
        fall();
    }
    }
    public void eatCoin()
    {
        Actor coin;
        coin = getOneObjectAtOffset(0,0,Coin.class);
        if (coin!=null)
        {
            World world;
            world = getWorld();
            world.removeObject(coin);
            coinEaten++;
            Greenfoot.playSound("Beep.mp3");
    
        
       }
        if (coinEaten == 1)
         {
             ScrollingWorld2 world2 = new ScrollingWorld2();
             Greenfoot.setWorld(world2);

             
        }
    }
      
    }
