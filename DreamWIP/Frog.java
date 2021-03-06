import greenfoot.*;

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    
    private int vSpeed = 0;//fall speed
    private int accel = 1; //gravity acceleration
    
    private boolean inAir;
    private int jumpHeight = 18;
    private int coinEaten = 0;
    public int scrolled = 0;
    
    private int speedX = 1;
    private static final int SPEED = 5;
    private static final int BOUNDARY = 150;
    
    private int timer = 0;
    
    Counter counter;
    
    public Frog(Counter counter)
    {
        GreenfootImage myImage = getImage();
        //int myNewHeight = (int)myImage.getHeight()/3;
        //int myNewWidth = (int)myImage.getWidth()/3;
        //myImage.scale(myNewWidth, myNewHeight);
        this.counter = counter;
    }
    
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        KeyPress(); 
        //boundedMove();
      
        checkFall();
        edgeCheck();
        eatCoin();
        
    }

    private void KeyPress() 
    {
        if (Greenfoot.isKeyDown("a"))
        {
            move(-SPEED);
           
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(SPEED);
        }
        //handleArrowKey("a", -SPEED);
        //handleArrowKey("d", SPEED);
        if(Greenfoot.isKeyDown("w"))
        {
            jump();
        }

    }
    private void handleArrowKey(String k, int sX) {
        if(Greenfoot.isKeyDown(k))
        {
            speedX = sX;
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
          setImage(new GreenfootImage("Allistar.png"));
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
            setImage(new GreenfootImage("AllistarJump.png"));
            inAir = true;
            fall();
            
        }
            
            
            
       }
    
  
    
    public void eatCoin()
    {
        Actor coin;
        coin = getOneObjectAtOffset(0,0,Coin.class);
        // ScrollingWorld scrollingWorld = (ScrollingWorld)getWorld();
        // Counter counter = scrollingWorld.getCounter();
        if (coin!=null)
        {
            World world;
            world = getWorld();
            world.removeObject(coin);
            coinEaten++;
            Greenfoot.playSound("Beep.mp3");
            counter.bumpCounter();
       }

    }
    
    

    public void edgeCheck()
    {
        if(getY()>600)
        {
           setLocation(100,30);
        }
    }

}
