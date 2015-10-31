import greenfoot.*;

/**
 * Write a description of class Allistar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Allistar extends ScrollingActor
{
    private int vSpeed = 0;//fall speed
    private int accel = 1; //gravity acceleration
    
    private boolean inAir;
    private int jumpHeight = 18;
    
    private Counter score;
    private boolean stand = true;
    
    public void act() 
    {
        keyPress();
        checkFall();
        eatCoin();
        checkDeath();
        checkPortal();
    }    

    public Allistar(Counter s)
    {
        score = s;
    }
    public void keyPress()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
            getWorld().moveCamera(5);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
            getWorld().moveCamera(-5);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            jump();
        }
    }
    
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

    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if (vSpeed <= 9)
        {
            vSpeed = vSpeed + accel; //fall speed gets larger by accel every tick
        } 
        inAir = true;
    }
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
            Greenfoot.playSound("Beep.mp3");
            //LevelOne w = (LevelOne)getWorld();
           // w.getCounter().bumpCounter();
           score.bumpCounter();
       }

    }
    
    public void checkDeath()
    {
        if (getY() > getWorld().getHeight())
        {
            World Game = new GameOver();
            Greenfoot.setWorld(Game);
            
        }
    }
        public void checkPortal()
    {
        Actor portal = getOneIntersectingObject(Portal.class);
        if(portal != null)
        {
            
            World topDown = new Stage(score, score.returnValue());
            Greenfoot.setWorld(topDown);
        }
    }
   
    
}
