import greenfoot.*;

/**
 * Write a description of class Frog2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    

    ScrollingWorld2 world2;
    private int vSpeed = 0;//fall speed
    private int accel = 2; //gravity acceleration
    
    private boolean inAir;
    private int jumpHeight = 18;
    
    public Player()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    /**
     * When added, it is saved to scrolling world
     */
    protected void addedToWorld(World world2)
    {
        this.world2 = (ScrollingWorld2)world2;
    }
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Keypress2(); 
       
        checkFall();
        
    }
    
    
    public void Keypress2()
    {
      
        if (Greenfoot.isKeyDown("left"))
       {
           world2.scroll2(-4,0);
          
           move(-4);
        
       }  
       if (Greenfoot.isKeyDown("right"))
       {
          world2.scroll2(4,0);
          
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
    

}
